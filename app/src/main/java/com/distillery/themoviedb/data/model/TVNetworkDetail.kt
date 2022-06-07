package com.distillery.themoviedb.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class TVNetworkDetail(
    @SerializedName("headquarters")
    @Expose
    var headquarters: String? = null,
    @SerializedName("homepage")
    @Expose
    var homepage: String? = null,
) : TVNetwork()