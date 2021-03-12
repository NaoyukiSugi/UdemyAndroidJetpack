package com.example.sec25_230.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sec25_230.R;
import com.example.sec25_230.databinding.MovieListItemBinding;
import com.example.sec25_230.model.Movie;
import com.example.sec25_230.view.MovieActivity;

public class MovieAdapter extends PagedListAdapter<Movie, MovieAdapter.MovieViewHolder> {

    private Context context;

    public MovieAdapter(Context context) {
        super(Movie.CALLBACK);
        this.context = context;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MovieListItemBinding movieListItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.movie_list_item, parent, false);

        return new MovieViewHolder(movieListItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {

        Movie movie = getItem(position);
        String imagePath = "https://image.tmdb.org/t/p/w500" + movie.getPosterPath();
        movie.setPosterPath(imagePath);

        holder.movieListItemBinding.setMovie(movie);

    }


    public class MovieViewHolder extends RecyclerView.ViewHolder {
        private MovieListItemBinding movieListItemBinding;

        public MovieViewHolder(@NonNull MovieListItemBinding movieListItemBinding) {
            super(movieListItemBinding.getRoot());
            this.movieListItemBinding = movieListItemBinding;

            movieListItemBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int position = getAdapterPosition();

                    if (position != RecyclerView.NO_POSITION) {

                        Movie selctedMovie = getItem(position);

                        Intent intent = new Intent(context, MovieActivity.class);
                        intent.putExtra("movie", selctedMovie);
                        context.startActivity(intent);
                    }
                }
            });
        }
    }
}
