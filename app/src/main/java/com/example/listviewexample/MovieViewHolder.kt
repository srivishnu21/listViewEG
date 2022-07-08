package com.example.listviewexample

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var movieImage: ImageView
    var movieName: TextView
    var movieGenre: TextView

    init {
        movieImage = itemView.findViewById(R.id.movie_image)
        movieName = itemView.findViewById(R.id.movie_name)
        movieGenre = itemView.findViewById(R.id.movie_genre)
    }
}