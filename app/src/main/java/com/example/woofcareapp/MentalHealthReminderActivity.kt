package com.example.woofcareapp

import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MentalHealthReminderActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var checkBox: CheckBox
    private lateinit var reminderContainer: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mental_health_reminder)

        editText = findViewById(R.id.editTextMentalHealth)
        checkBox = findViewById(R.id.checkBoxMentalHealth)
        reminderContainer = findViewById(R.id.reminderContainerMentalHealth)

        val backButton: ImageButton = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }




    }
}
