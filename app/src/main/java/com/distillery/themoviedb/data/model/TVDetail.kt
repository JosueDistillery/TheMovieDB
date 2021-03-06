package com.distillery.themoviedb.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class TVDetail(
    /*@SerializedName("backdrop_path")
    @Expose
    var backdropPath: String? = null,*/
    @SerializedName("created_by")
    @Expose
    var createdBy: List<CreatedBy>? = null,
    @SerializedName("episode_run_time")
    @Expose
    var episodeRunTime: List<Int>? = null,
    /*@SerializedName("first_air_date")
    @Expose
    var firstAirDate: String? = null,*/
    @SerializedName("genres")
    @Expose
    var genres: List<Genre>? = null,
    @SerializedName("homepage")
    @Expose
    var homepage: String? = null,
    /*@SerializedName("id")
    @Expose
    var id: Int? = null,*/
    @SerializedName("in_production")
    @Expose
    var inProduction: Boolean? = null,
    @SerializedName("languages")
    @Expose
    var languages: List<String>? = null,
    @SerializedName("last_air_date")
    @Expose
    var lastAirDate: String? = null,
    @SerializedName("last_episode_to_air")
    @Expose
    var lastEpisodeToAir: Episode? = null,
    /*@SerializedName("name")
    @Expose
    var name: String? = null,*/
    @SerializedName("next_episode_to_air")
    @Expose
    var nextEpisodeToAir: Episode? = null,
    @SerializedName("networks")
    @Expose
    var TVNetworks: List<TVNetwork>? = null,
    @SerializedName("number_of_episodes")
    @Expose
    var numberOfEpisodes: Int? = null,
    @SerializedName("number_of_seasons")
    @Expose
    var numberOfSeasons: Int? = null,
    /*@SerializedName("origin_country")
    @Expose
    var originCountry: List<String>? = null,
    @SerializedName("original_language")
    @Expose
    var originalLanguage: String? = null,
    @SerializedName("original_name")
    @Expose
    var originalName: String? = null,
    @SerializedName("overview")
    @Expose
    var overview: String? = null,
    @SerializedName("popularity")
    @Expose
    var popularity: Float? = null,
    @SerializedName("poster_path")
    @Expose
    var posterPath: String? = null,*/
    @SerializedName("production_companies")
    @Expose
    var productionCompanies: List<Company>? = null,
    @SerializedName("production_countries")
    @Expose
    var productionCountries: List<ProductionCountry>? = null,
    @SerializedName("seasons")
    @Expose
    var seasons: List<Season>? = null,
    @SerializedName("spoken_languages")
    @Expose
    var spokenLanguages: List<SpokenLanguage>? = null,
    @SerializedName("status")
    @Expose
    var status: String? = null,
    @SerializedName("tagline")
    @Expose
    var tagline: String? = null,
    @SerializedName("type")
    @Expose
    var type: String? = null,
    /*@SerializedName("vote_average")
    @Expose
    var voteAverage: Float? = null,
    @SerializedName("vote_count")
    @Expose
    var voteCount: Int? = null,*/
) : TV()