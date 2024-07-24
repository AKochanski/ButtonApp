// app/src/main/java/com/example/buttonapp/MainActivity.kt
package com.example.buttonapp

import android.os.Bundle
import android.os.Vibrator
import android.os.VibrationEffect
import android.view.MotionEvent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var vibrator: Vibrator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        vibrator = getSystemService(VIBRATOR_SERVICE) as Vibrator

        button.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Logika Firebase do zalogowania użytkownika i uruchomienia wibracji
                    true
                }
                MotionEvent.ACTION_UP -> {
                    // Logika Firebase do zatrzymania wibracji
                    true
                }
                else -> false
            }
        }
    }
}
