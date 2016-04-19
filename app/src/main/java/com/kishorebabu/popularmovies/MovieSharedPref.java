package com.kishorebabu.popularmovies;

import android.content.SharedPreferences;
import android.text.TextUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kishorebabu.popularmovies.model.Movie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MovieSharedPref {
    private static final int PRIVATE_MODE = 0;
    private static final String PREF_NAME = "MovieSharedPref";
    private SharedPreferences pref;

    public MovieSharedPref() {
        pref = PopularMoviesApplication.getAppContext().getSharedPreferences(PREF_NAME, PRIVATE_MODE);
    }

    public void setFavorite(Movie movie) throws JsonProcessingException {
        SharedPreferences.Editor editor = pref.edit();
        ObjectMapper objectMapper = new ObjectMapper();
        String movieJson = objectMapper.writeValueAsString(movie);
        editor.putString(String.valueOf(movie.getId()), movieJson);
        editor.apply();
    }

    public boolean isFavorite(String id) {
        String movieJson = pref.getString(id, null);
        return !TextUtils.isEmpty(movieJson);
    }

    public List<Movie> getFavorites() throws IOException {
        Map<String, ?> allEntries = pref.getAll();
        ArrayList<Movie> movies = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();

        for (Map.Entry<String, ?> entry : allEntries.entrySet()) {
            String movieJson = pref.getString(entry.getKey(), null);

            if (!TextUtils.isEmpty(movieJson)) {
                Movie movie = objectMapper.readValue(movieJson, Movie.class);
                movies.add(movie);
            }
        }
        return movies;
    }

    public void unfavorite(String id) {
        SharedPreferences.Editor editor = pref.edit();
        editor.remove(id);
        editor.apply();
    }
}
