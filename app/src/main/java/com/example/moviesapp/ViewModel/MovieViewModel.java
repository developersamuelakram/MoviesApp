package com.example.moviesapp.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.moviesapp.Favorites;
import com.example.moviesapp.Result;
import com.example.moviesapp.Repository.Repository;

import java.util.List;

public class MovieViewModel extends AndroidViewModel {


    Repository repository;



    public MovieViewModel(@NonNull Application application) {
        super(application);
        repository = new Repository(application);

    }


    public MutableLiveData<List<Result>> getMoviesfromAPI(){
        return repository.GetMutableMovies();

    }


    public void addMoviesinDb(Result result) {

        repository.addMovies(result);
    }


    public LiveData<List<Result>> getMoviesfromDB() {

        return repository.getMoviesfromDB();
    }



    public void adddFav(Favorites favorites) {

        repository.addFav(favorites);
    }


    public LiveData<List<Favorites>> getFavFromDb() {

        return repository.getFav();
    }
}
