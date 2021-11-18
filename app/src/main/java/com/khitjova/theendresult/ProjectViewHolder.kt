package com.khitjova.theendresult

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProjectsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(projects: Projects) {
        val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
        val priceTextView: TextView = itemView.findViewById(R.id.price_text_view)
        val addressTextView: TextView = itemView.findViewById(R.id.address_text_view)

        nameTextView.text = projects.name
        priceTextView.text = projects.price
        addressTextView.text = projects.address


    }

}