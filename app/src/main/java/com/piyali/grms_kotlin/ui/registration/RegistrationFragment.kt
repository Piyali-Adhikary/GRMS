package com.piyali.grms_kotlin.ui.registration

import android.app.Application
import android.content.Context
import android.database.DatabaseUtils
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.piyali.grms_kotlin.R
import com.piyali.grms_kotlin.data.registration.repository.local.RegistrationLocalRepository
import com.piyali.grms_kotlin.databinding.RegistrationFragmentBinding
import com.piyali.grms_kotlin.ui.dialog.LanguageDialogFragment
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.kodein
import org.kodein.di.generic.instance

class RegistrationFragment : Fragment(), KodeinAware {

    override val kodein by kodein()
    //private val factory : RegistrationViewModel by instance()
    companion object {
        fun newInstance() = RegistrationFragment()
    }

    private lateinit var binding:RegistrationFragmentBinding

    private val viewModel: RegistrationViewModel by lazy {
        val activity = requireNotNull(this.activity) {
            "You can only access the viewModel after onActivityCreated()"
        }
        val repository = RegistrationLocalRepository()
        val factory = RegistrationModelFactory(activity.application,repository)
        ViewModelProvider(this@RegistrationFragment, factory).get(RegistrationViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //DataBinding
        binding=DataBindingUtil.inflate(inflater, R.layout.registration_fragment, container, false)
        binding.regisViewModel=viewModel
        binding.lifecycleOwner=this

        LanguageDialogFragment.newInstance("Language / ভাষা").show(parentFragmentManager,"LanguageDialog")
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO: Use the ViewModel
    }



}