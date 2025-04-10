package com.example.woofcareapp


import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton

import androidx.appcompat.app.AppCompatActivity

class EditProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        Log.d("EditProfileActivity", "Edit Profile Page Opened")

        val backButton: ImageButton = findViewById(R.id.backButton)
        val saveButton: Button = findViewById(R.id.saveProfileButton)


        // Back Button Click
        backButton.setOnClickListener {
            finish()
        }

        // Save Button Click
        saveButton.setOnClickListener {
            finish()
        }
    }
}
