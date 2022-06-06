package com.distillery.themoviedb.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MovieDetail(
    /*@SerializedName("adult")
    @Expose
    var adult: Boolean? = null,
    @SerializedName("backdrop_path")
    @Expose
    var backdropPath: String? = null,*/
    @SerializedName("belongs_to_collection")
    @Expose
    var belongsToCollection: String? = null,
    @SerializedName("budget")
    @Expose
    var budget: Float? = null,
    @SerializedName("genres")
    @Expose
    var genres: List<Genre>? = null,
    @SerializedName("homepage")
    @Expose
    var homepage: String? = null,
    /*@SerializedName("id")
    @Expose
    var id: Int? = null,*/
    @SerializedName("imdb_id")
    @Expose
    var imdb_id: String? = null,
    /*@SerializedName("original_language")
    @Expose
    var originalLanguage: String? = null,
    @SerializedName("original_title")
    @Expose
    var originalTitle: String? = null,
    @SerializedName("overview")
    @Expose
    var overview: String? = null,
    @SerializedName("popularity")
    @Expose
    var popularity: Int? = null,
    @SerializedName("poster_path")
    @Expose
    var posterPath: String? = null,*/
    @SerializedName("production_companies")
    @Expose
    var productionCompanies: List<ProductionCompany>? = null,
    @SerializedName("production_countries")
    @Expose
    var productionCountries: List<ProductionCountry>? = null,
    /*@SerializedName("release_date")
    @Expose
    var releaseDate: String? = null,*/
    @SerializedName("revenue")
    @Expose
    var revenue: Float? = null,
    @SerializedName("revenue")
    @Expose
    var runtime: Float? = null,
    @SerializedName("spoken_languages")
    @Expose
    var spokenLanguages: List<SpokenLanguage>? = null,
    @SerializedName("status")
    @Expose
    var status: String? = null,
    @SerializedName("tagline")
    @Expose
    var tagline: String? = null,
    /*@SerializedName("title")
    @Expose
    var title: String? = null,
    @SerializedName("video")
    @Expose
    var video: Boolean? = null,
    @SerializedName("vote_average")
    @Expose
    var voteAverage: Int? = null,
    @SerializedName("vote_count")
    @Expose
    var voteCount: Float? = null,*/
) : Movie ()