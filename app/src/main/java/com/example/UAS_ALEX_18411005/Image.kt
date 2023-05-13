package com.example.UAS_ALEX_18411005

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Image (
        val imageSrc:Int,
        val imageTitle:String,
        val imageDesc:String,
): Parcelable