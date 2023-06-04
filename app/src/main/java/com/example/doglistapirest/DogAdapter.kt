package com.example.doglistapirest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.doglistapirest.databinding.ItemDogBinding
import com.squareup.picasso.Picasso

class DogAdapter(private val images: List<String>): RecyclerView.Adapter<DogAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_dog, parent, false))
    }

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = images.get(position)
        holder.bind(item)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemDogBinding.bind(itemView)

        fun bind(image:String){
            Picasso.get().load(image).into(binding.ivDog)
        }
    }
}