package com.example.evolutionapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.fragment.app.Fragment


class HomeStudentFragment : Fragment(R.layout.fragment_home_student) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnProfile : ImageButton = view.findViewById(R.id.btnProfile)

        btnProfile.setOnClickListener(){
            val intent = Intent (activity, StudentProfileActivity::class.java)
            activity?.startActivity(intent)
        }
    }

}