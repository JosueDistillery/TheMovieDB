package com.distillery.themoviedb.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class TV(
    @SerializedName("poster_path")
    @Expose
    var posterPath: String? = null,
    @SerializedName("popularity")
    @Expose
    var popularity: Float? = null,
    @SerializedName("id")
    @Expose
    var id: Int? = null,
    @SerializedName("backdrop_path")
    @Expose
    var backdropPath: String? = null,
    @SerializedName("vote_average")
    @Expose
    var voteAverage: Float? = null,
    @SerializedName("overview")
    @Expose
    var overview: String? = null,
    @SerializedName("first_air_date")
    @Expose
    var firstAirDate: String? = null,
    @SerializedName("origin_country")
    @Expose
    var originCountry: List<String>? = null,
    @SerializedName("genre_ids")
    @Expose
    var genreIds: List<Int>? = null,
    @SerializedName("original_language")
    @Expose
    var originalLanguage: String? = null,
    @SerializedName("vote_count")
    @Expose
    var voteCount: Int? = null,
    @SerializedName("name")
    @Expose
    var name: String? = null,
    @SerializedName("original_name")
    @Expose
    var originalName: String? = null,
)
