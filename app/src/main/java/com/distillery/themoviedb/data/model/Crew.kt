package com.distillery.themoviedb.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Crew(
    @SerializedName("department")
    @Expose
    var department: String? = null,
    @SerializedName("job")
    @Expose
    var job: String? = null,
): People()
