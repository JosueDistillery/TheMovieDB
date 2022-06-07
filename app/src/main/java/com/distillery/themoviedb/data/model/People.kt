package com.distillery.themoviedb.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

sealed class People(
    @SerializedName("adult")
    @Expose
    var adult: Boolean? = null,
    @SerializedName("gender")
    @Expose
    var gender: Int? = null,
    @SerializedName("known_for_department")
    @Expose
    var knownForDepartment: String? = null,
    @SerializedName("original_name")
    @Expose
    var originalName: String? = null,
    @SerializedName("popularity")
    @Expose
    var popularity: Float? = null,
    @SerializedName("profile_path")
    @Expose
    var profilePath: String? = null,
    @SerializedName("credit_id")
    @Expose
    var creditId: String? = null,
) : Person()