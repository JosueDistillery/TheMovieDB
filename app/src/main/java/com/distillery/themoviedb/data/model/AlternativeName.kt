package com.distillery.themoviedb.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AlternativeName(
    @SerializedName("name")
    @Expose
    var name: String? = null,
    @SerializedName("type")
    @Expose
    var type: String? = null,
)