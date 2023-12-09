package com.zareno.john.arthuro.block6.p1.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.logreg.databinding.ActivityGetStartedBinding
import java.util.zip.Inflater

class GetStarted : AppCompatActivity() {
    private val binding: ActivityGetStartedBinding by lazy {
        ActivityGetStartedBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.Start.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }
    }
}