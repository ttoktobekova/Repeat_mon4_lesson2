package com.example.repeatmon4lesson2.UI.activity

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.repeatmon4lesson2.R
import com.example.repeatmon4lesson2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        binding.bottomNavigation.setupWithNavController(navController)
        setSupportActionBar(binding.toolbar)

    }
        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_appbar, menu)
        menu?.findItem(R.id.go_to_android)?.setOnMenuItemClickListener {
            navController.navigate(R.id.homeFragment)
            true
        }

        menu?.findItem(R.id.close_app)?.setOnMenuItemClickListener {
            finish()
            true
        }

        return true
    }



}
