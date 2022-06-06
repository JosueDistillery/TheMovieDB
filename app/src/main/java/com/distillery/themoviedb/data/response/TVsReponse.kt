package com.distillery.themoviedb.data.response

import com.distillery.themoviedb.data.model.TV
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class TVsReponse(
    @SerializedName("page")
    @Expose
    var page: Int? = null,
    @SerializedName("total_results")
    @Expose
    var totalResults: Int? = null,
    @SerializedName("total_pages")
    @Expose
    var totalPages: Int? = null,
    @SerializedName("results")
    @Expose
    var results: List<TV>? = null
) : BaseResponse()