package com.distillery.themoviedb.data.response

import com.distillery.themoviedb.data.model.AlternativeName
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AlternativeNameResponse(
    @SerializedName("id")
    @Expose
    var id: Int? = null,
    @SerializedName("results")
    @Expose
    var results: List<AlternativeName>? = null,
) : BaseResponse()