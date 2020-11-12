package com.piyali.grms_kotlin.data.registration.model

data class LanguageType (

     var register: Register? = null,
     val otp: Otp? = null,
     val grievance: Grievance? = null,
     val home_page: HomePage? = null,
     val grievance_page: GrievanceStatusPage? = null,
     val about_page: AboutPage? = null,
     val tabs: Tabs? = null
)