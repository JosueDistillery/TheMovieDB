package com.distillery.themoviedb.data.response

import com.distillery.themoviedb.data.model.Genre
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class GenresResponse {
    @SerializedName("genres")
    @Expose
    var genres: List<Genre>? = null
}