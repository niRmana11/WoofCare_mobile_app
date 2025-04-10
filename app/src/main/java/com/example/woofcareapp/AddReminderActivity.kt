package com.example.woofcareapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class AddReminderActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_reminder)

        val spinnerCategory: Spinner = findViewById(R.id.spinnerCategory)
        val editTextReminderTitle: EditText = findViewById(R.id.editTextReminderTitle)
        val btnSaveReminder: Button = findViewById(R.id.btnSaveReminder)


        val categories = arrayOf("Feeding", "Exercise", "Medication", "Mental Health")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, categories)
        spinnerCategory.adapter = adapter

        btnSaveReminder.setOnClickListener {
            finish()
        }

        val backButton: ImageButton = findViewById(R.id.backButtonAdd)
        backButton.setOnClickListener {
            finish()
        }
    }


}
