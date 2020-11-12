package com.piyali.grms_kotlin.ui.registration

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.piyali.grms_kotlin.data.registration.model.LanguageType
import com.piyali.grms_kotlin.data.registration.model.LanguagesResponse
import com.piyali.grms_kotlin.data.registration.model.Register
import com.piyali.grms_kotlin.data.registration.repository.local.RegistrationLocalRepository

class RegistrationViewModel(
    application: Application,
    private val repository: RegistrationLocalRepository
) : AndroidViewModel(application) {

    // TODO: Implement the ViewModel


    private var mRegister: Register? = null
    private val context = getApplication<Application>().applicationContext

    fun fetchTextViewData(mLanguage: String) {
        mRegister = Register()
        mRegister = fetchRegisterResponse(mLanguage)
        //notifyPropertyChanged(BR._all)
        //setRegister(mRegister)
    }

    private fun fetchRegisterResponse(mLanguage: String): Register? {
        var languagesResponse: LanguagesResponse = repository.fetchFromJson(context);
        var languageType: LanguageType
        if (mLanguage.equals("en", ignoreCase = true)) {
            languageType = languagesResponse.multiLanguage?.en!!
        } else {
            languageType = languagesResponse.multiLanguage?.bn!!
        }
        mRegister = languageType.register
        return mRegister
    }


}