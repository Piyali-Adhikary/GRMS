package com.piyali.grms_kotlin.ui.registration

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.piyali.grms_kotlin.data.registration.repository.local.RegistrationLocalRepository

class RegistrationModelFactory(val application: Application, val repository: RegistrationLocalRepository) : ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RegistrationViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return RegistrationViewModel(application, repository) as T
        }
        throw IllegalArgumentException("Unable to construct viewmodel")
    }

}