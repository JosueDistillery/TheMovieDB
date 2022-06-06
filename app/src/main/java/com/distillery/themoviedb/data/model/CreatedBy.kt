package com.distillery.themoviedb.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CreatedBy(
    @SerializedName("id")
    @Expose
    var id: Int? = null,
    @SerializedName("credit_id")
    @Expose
    var creditId: String? = null,
    @SerializedName("name")
    @Expose
    var name: String? = null,
    @SerializedName("gender")
    @Expose
    var gender: Int? = null,
    @SerializedName("profile_path")
    @Expose
    var profilePath: String? = null,
)