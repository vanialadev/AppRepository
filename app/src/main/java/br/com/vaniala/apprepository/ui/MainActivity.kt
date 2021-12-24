package br.com.vaniala.apprepository.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.vaniala.apprepository.R
import br.com.vaniala.apprepository.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
    }


}