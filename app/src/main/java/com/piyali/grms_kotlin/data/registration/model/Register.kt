package com.piyali.grms_kotlin.data.registration.model

data class Register(
    private var title: String? = null,
    private var main_title: String? = null,
    private var name: String? = null,
    private var mobile: String? = null,
    private var email: String? = null,
    private var alternate_mobile: String? = null,
    private var father_husband: String? = null,
    private var district: String? = null,
    private var rural: String? = null,
    private var urban: String? = null,
    private var block: String? = null,
    private var gram_panchayat: String? = null,
    private var village_landmark: String? = null,
    private var pincode: String? = null,
    private var register: String? = null,
    private var alerts: AlertRegister? = null,
)
