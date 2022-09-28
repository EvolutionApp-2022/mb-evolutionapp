package com.example.evolutionapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton


class AnnouncementStudentFragment : Fragment(R.layout.fragment_announcement_student) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnProfile : ImageButton = view.findViewById(R.id.btnProfile)

        btnProfile.setOnClickListener(){
            val intent = Intent (activity, StudentProfileActivity::class.java)
            activity?.startActivity(intent)
        }
    }
}