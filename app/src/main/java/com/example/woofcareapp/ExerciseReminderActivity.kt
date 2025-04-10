package com.example.woofcareapp

import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ExerciseReminderActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var checkBox: CheckBox
    private lateinit var reminderContainer: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_reminder)

        editText = findViewById(R.id.editText)
        checkBox = findViewById(R.id.checkBox)
        reminderContainer = findViewById(R.id.reminderContainer)

        val backButton: ImageButton = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }




    }
}
