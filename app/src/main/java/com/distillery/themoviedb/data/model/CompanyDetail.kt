package com.distillery.themoviedb.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CompanyDetail(
    @SerializedName("description")
    @Expose
    var description: String? = null,
    @SerializedName("headquarters")
    @Expose
    var headquarters: String? = null,
    @SerializedName("homepage")
    @Expose
    var homepage: String? = null,
    @SerializedName("parent_company")
    @Expose
    var parentCompany: Company? = null,
) : Company()
