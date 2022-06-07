package com.distillery.themoviedb.data.response

import com.distillery.themoviedb.data.model.Cast
import com.distillery.themoviedb.data.model.Crew
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CreditsResponse (
    @SerializedName("id")
    @Expose
    var id: Int? = null,
    @SerializedName("cast")
    @Expose
    var cast: List<Cast>? = null,
    @SerializedName("crew")
    @Expose
    var crew: List<Crew>? = null,
) : BaseResponse()