package com.khitjova.theendresult

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

private lateinit var infoButton: Button
private const val KEY = "HELLO_KEY"
class InfoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_info, container, false)
        infoButton = view.findViewById(R.id.info_button)

        val link = Uri.parse("https://neometria.ru/rostov-na-donu/projects/")
        val intent = Intent(Intent.ACTION_VIEW, link)
        infoButton.setOnClickListener {
            startActivity(intent)
        }


        return view
    }



}