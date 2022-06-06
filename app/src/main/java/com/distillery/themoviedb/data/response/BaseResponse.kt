package com.distillery.themoviedb.data.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

sealed class BaseResponse(
    @SerializedName("status_message")
    @Expose
    var statusMessage: String? = null,
    @SerializedName("success")
    @Expose
    var success: Boolean? = null,
    @SerializedName("status_code")
    @Expose
    var statusCode: Int? = null
)
