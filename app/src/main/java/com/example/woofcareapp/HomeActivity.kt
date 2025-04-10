package com.example.woofcareapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val feedingButton: Button = findViewById(R.id.feedingButton)
        val exerciseButton: Button = findViewById(R.id.exerciseButton)
        val medicationButton: Button = findViewById(R.id.medicationButton)
        val mentalHealthButton: Button = findViewById(R.id.mentalHealthButton)
        val dogProfile: ImageView = findViewById(R.id.profileIcon)
        val btnAddReminder: Button = findViewById(R.id.btnAddReminder)

        dogProfile.setOnClickListener {
            val intent = Intent(this, DogProfileActivity::class.java)
            startActivity(intent)
        }

        // Set click listeners for buttons
        feedingButton.setOnClickListener {
            val intent = Intent(this, FeedingReminderActivity::class.java)
            startActivity(intent)
        }

        exerciseButton.setOnClickListener {
            val intent = Intent(this, ExerciseReminderActivity::class.java)
            startActivity(intent)
        }

        medicationButton.setOnClickListener {
            val intent = Intent(this, MedicationReminderActivity::class.java)
            startActivity(intent)
        }

        mentalHealthButton.setOnClickListener {
            val intent = Intent(this, MentalHealthReminderActivity::class.java)
            startActivity(intent)
        }

        btnAddReminder.setOnClickListener {
            val intent = Intent(this, AddReminderActivity::class.java)
            startActivity(intent)
        }
    }
}
