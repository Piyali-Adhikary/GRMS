package com.piyali.grms_kotlin.data.registration.model

data class Grievance (
    private val title: String? = null,
    private val sub_title: String? = null,
    private val grievance_demand: String? = null,
    private val grievance_type: String? = null,
    private val service_related: String? = null,
    private val scheme: String? = null,
    private val grievance_level: String? = null,
    private val district: String? = null,
    private val block: String? = null,
    private val gram_panchayat: String? = null,
    private val details: String? = null,
    private val photo_label: String? = null,
    private val submit: String? = null,
    private val alerts: AlertGrievance? = null
)

