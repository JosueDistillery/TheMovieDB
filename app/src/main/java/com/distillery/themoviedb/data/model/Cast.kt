package com.distillery.themoviedb.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Cast(
    @SerializedName("cast_id")
    @Expose
    var castId: Int? = null,
    @SerializedName("character")
    @Expose
    var character: String? = null,
    @SerializedName("order")
    @Expose
    var order: Int? = null,
) : People()