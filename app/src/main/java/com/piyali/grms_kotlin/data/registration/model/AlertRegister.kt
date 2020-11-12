package com.piyali.grms_kotlin.data.registration.model

data class AlertRegister (
    private var enter_name: String? = null,
    private var enter_valid_name: String? = null,
    private var enter_mobile: String? = null,
    private var enter_valid_mobile: String? = null,
    private var enter_valid_email: String? = null,
    private var enter_valid_alternate_no: String? = null,
    private var enter_father_husband: String? = null,
    private var enter_district: String? = null,
    private var enter_block: String? = null,
    private var enter_gp: String? = null,
    private var enter_village_details: String? = null,
    private var enter_pincode: String? = null,
    private var enter_valid_pincode: String? = null,
    private var register_error: String? = null
)