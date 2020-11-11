package com.piyali.grms_kotlin.ui.dialog

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.piyali.grms_kotlin.R
import com.piyali.grms_kotlin.util.AppConstants

class LanguageDialogFragment : DialogFragment() {

    private var mLanguage: String = AppConstants.LANGUAGE_ENGLISH

    companion object {

        //const val TAG = "LanguageDialogFragment"

        private const val KEY_TITLE = "KEY_TITLE"
        private const val KEY_SUBTITLE = "KEY_SUBTITLE"

        fun newInstance(title: String): LanguageDialogFragment {
            val args = Bundle()
            args.putString(KEY_TITLE, title)
            val fragment = LanguageDialogFragment()
            fragment.arguments = args
            return fragment
        }

    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder= AlertDialog.Builder(requireActivity())
        builder.setTitle(KEY_TITLE)
        val items = arrayOf("English", "বাংলা")
        val checkedItem = 0
        builder.setSingleChoiceItems(items, checkedItem) { dialogInterface, which ->
            when(which) {
                0 -> mLanguage = "en"
                1 -> mLanguage = "bn"
            }
        }
        builder.setPositiveButton(AppConstants.OK){ dialogInterface, which ->
//        mRegistrationViewModel.fetchTextViewData(mLanguage, this@RegistrationActivity)
//        observeDistrictData()
            dismiss()
        }
        builder.setNegativeButton(AppConstants.CANCEL){ dialogInterface, which ->
            mLanguage = "en"
//        observeDistrictData()
//        dialog.cancel()
            dismiss()
        }

        val alertDialog: AlertDialog = builder.create()
        alertDialog.setCancelable(false)
        alertDialog.setCanceledOnTouchOutside(false)
        alertDialog.show()

        return alertDialog
    }

}