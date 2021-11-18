package com.khitjova.theendresult

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProjectsAdapter(private val projectsList:List<Projects>) :
    RecyclerView.Adapter<ProjectsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectsViewHolder {

        val projectsListItemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.projects_list_item, parent, false)

        return ProjectsViewHolder(projectsListItemView)

    }

    override fun onBindViewHolder(holder: ProjectsViewHolder, position: Int) {
        val projects  = projectsList[position]
        holder.bind(projects)
    }

    override fun getItemCount(): Int {
        return projectsList.size
    }
}