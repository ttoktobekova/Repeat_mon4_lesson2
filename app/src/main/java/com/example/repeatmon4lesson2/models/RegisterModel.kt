package com.example.repeatmon4lesson2.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RegisterModel(
    val email: String,
    val password: String,
) : Parcelable
