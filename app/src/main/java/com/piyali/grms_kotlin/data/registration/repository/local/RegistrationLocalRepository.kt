package com.piyali.grms_kotlin.data.registration.repository.local

import android.R.attr.data
import android.content.Context
import android.util.Log
import com.google.gson.Gson
import com.piyali.grms_kotlin.data.registration.model.LanguagesResponse
import org.kodein.di.TypeToken
import java.io.IOException
import java.lang.reflect.Type


class RegistrationLocalRepository {

    fun fetchFromJson(context: Context): LanguagesResponse {
        val jsonFileString = getJsonDataFromAsset(context)
        Log.i("data", jsonFileString.toString())

        val gson = Gson()
        val mLanguagesResponse : LanguagesResponse = gson.fromJson(jsonFileString, LanguagesResponse::class.java)
        return mLanguagesResponse
    }

    fun getJsonDataFromAsset(context: Context): String?{
        val jsonString: String
        try {
            jsonString = context.assets.open("multilingual.json").bufferedReader().use { it.readText() }
        } catch (ioException: IOException) {
            ioException.printStackTrace()
            return null
        }
        return jsonString
    }

    fun fetchFromJson() {
        TODO("Not yet implemented")
    }

}