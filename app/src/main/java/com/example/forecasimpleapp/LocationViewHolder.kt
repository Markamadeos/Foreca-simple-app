package com.example.forecasimpleapp

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.forecasimpleapp.model.ForecaLocation

class LocationViewHolder(parent: ViewGroup) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.item_location_layout, parent, false)
    ) {
    var name: TextView = itemView.findViewById(R.id.locationName)

    @SuppressLint("SetTextI18n")
    fun bind(location: ForecaLocation) {
        name.text = "${location.name} (${location.country})"
    }
}