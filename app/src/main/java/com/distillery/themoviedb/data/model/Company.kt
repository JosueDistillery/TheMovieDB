package com.distillery.themoviedb.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

sealed class Company(
    @SerializedName("name")
    @Expose
    var name: String? = null,
    @SerializedName("id")
    @Expose
    var id: Int? = null,
    @SerializedName("logo_path")
    @Expose
    var logoPath: String? = null,
    @SerializedName("origin_country")
    @Expose
    var originCountry: String? = null,
)