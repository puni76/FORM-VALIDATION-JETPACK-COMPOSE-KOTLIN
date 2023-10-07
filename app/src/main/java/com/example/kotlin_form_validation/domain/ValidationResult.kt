package com.example.kotlin_form_validation.domain

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: String? = null
)