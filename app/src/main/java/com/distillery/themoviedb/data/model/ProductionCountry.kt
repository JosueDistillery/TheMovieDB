package com.distillery.themoviedb.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ProductionCountry(
    @SerializedName("iso_3166_1")
    @Expose
    var id: String? = null,
    @SerializedName("name")
    @Expose
    var name: String? = null,
)