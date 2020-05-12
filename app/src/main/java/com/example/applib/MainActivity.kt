package com.example.applib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Загрузка начальной страницы

        loadFragment(HomeFragment())

        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when{
                menuItem.itemId == R.id.library->{
                    loadFragment(LibraryFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                menuItem.itemId == R.id.collection->{
                    loadFragment(CollectionFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                menuItem.itemId == R.id.home->{
                    loadFragment(HomeFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                else -> {
                    return@setOnNavigationItemSelectedListener false
                }
            }
        }

    }
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().also { fragmentTransaction ->
            fragmentTransaction.replace(R.id.fragmentContainer, fragment)
            fragmentTransaction.commit()
        }
    }
}
