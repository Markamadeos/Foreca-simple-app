package com.example.forecasimpleapp

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.forecasimpleapp.model.ForecaLocation

class LocationAdapter(private val clickListener: LocationClickListener) : RecyclerView.Adapter<LocationViewHolder>() {

    var locations = ArrayList<ForecaLocation>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationViewHolder = LocationViewHolder(parent)


    override fun onBindViewHolder(holder: LocationViewHolder, position: Int) {
        holder.bind(locations.get(position))
        holder.itemView.setOnClickListener { clickListener.onLocationClick(locations.get(position)) }
    }

    override fun getItemCount() = locations.size

    fun interface LocationClickListener {
        fun onLocationClick(location: ForecaLocation)
    }
}