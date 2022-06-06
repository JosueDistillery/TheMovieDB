package com.distillery.themoviedb.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.distillery.themoviedb.network.MovieApi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val movieApi: MovieApi
) : ViewModel() {

    fun getGenres() {
        viewModelScope.launch(Dispatchers.IO) {
            var genresResponse = movieApi.getDiscoverMovies("en-US")
            Log.d("MainViewModel", genresResponse.results.toString())
        }
    }
}