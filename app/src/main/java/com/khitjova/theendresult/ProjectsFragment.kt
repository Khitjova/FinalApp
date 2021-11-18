package com.khitjova.theendresult

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProjectsFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_project, container, false)


        val projectsList: List<Projects> = listOf(
            Projects("Жк Первый", "4 331 408 Р", "Ростов-на-Дону, ул. Шеболдаева, 95"),
            Projects("Жк Сказка", "2 807 142 Р", "Ростов-на-Дону, ул. Жмайлова, 19а"),
            Projects("Жк Мы Вместе", "4 025 230 Р", "г. Ростов-на-Дону, ул. Жмайлова 19")
        )

        //инициализируем recyclerView
        recyclerView=view.findViewById(R.id.projects_recycler_view)

        recyclerView.layoutManager =
            LinearLayoutManager(context,LinearLayoutManager.VERTICAL, false)

        recyclerView.addItemDecoration(
            DividerItemDecoration(
                context,
                DividerItemDecoration.VERTICAL
            )
        )
        recyclerView.adapter = ProjectsAdapter(projectsList)




        return view


    }
}