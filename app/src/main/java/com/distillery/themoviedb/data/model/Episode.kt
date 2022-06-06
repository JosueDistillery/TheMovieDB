package com.distillery.themoviedb.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Episode(
    @SerializedName("air_date")
    @Expose
    var airDate: String? = null,
    @SerializedName("episode_number")
    @Expose
    var episodeNumber: Int? = null,
    @SerializedName("id")
    @Expose
    var id: Int? = null,
    @SerializedName("name")
    @Expose
    var name: String? = null,
    @SerializedName("overview")
    @Expose
    var overview: String? = null,
    @SerializedName("production_code")
    @Expose
    var productionCode: String? = null,
    @SerializedName("season_number")
    @Expose
    var seasonNumber: Int? = null,
    @SerializedName("still_path")
    @Expose
    var stillPath: String? = null,
    @SerializedName("vote_average")
    @Expose
    var voteAverage: Float? = null,
    @SerializedName("vote_count")
    @Expose
    var voteCount: Int? = null,
)