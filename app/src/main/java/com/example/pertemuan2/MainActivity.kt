package com.example.pertemuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pertemuan2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var scoreA = 0
    var scoreB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.btntambahA.setOnClickListener {
            scoreA = scoreA + 1

            binding.nilaiA.text = scoreA.toString()
        }
        binding.btnkurangA.setOnClickListener {
            scoreA = scoreA - 1
            if(scoreA<=0){
                scoreA=0
            }
            binding.nilaiA.text = scoreA.toString()
        }
        binding.btntambahB.setOnClickListener {
            scoreB = scoreB + 1
            binding.nilaiB.text = scoreB.toString()
        }
        binding.btnkurangB.setOnClickListener {
            scoreB = scoreB - 1
            if(scoreB<0){
                scoreB=0
            }
            binding.nilaiB.text = scoreB.toString()
        }
        binding.btnreset.setOnClickListener {
            scoreA=0
            scoreB=0
            binding.nilaiA.text = scoreA.toString()
            binding.nilaiB.text = scoreB.toString()

        }
        binding.btnkembali.setOnClickListener {  }
    }
}