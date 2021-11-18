package com.khitjova.theendresult

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
private const val LAST_SELECTED_ITEM = "LAST_SELECTED_ITEM"// константа для ключа сохранения состояния
class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationMenu: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationMenu = findViewById(R.id.bottom_navigation_menu)
//клики по элементам нижней навигации
        bottomNavigationMenu.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.project -> {
                    fragment = ProjectsFragment()
                }
                R.id.info -> {
                    fragment = InfoFragment()

                }
            }
            replaceFragment(fragment!!)
            true
        }
        bottomNavigationMenu.selectedItemId=
        savedInstanceState?.getInt(LAST_SELECTED_ITEM)?:R.id.project//восстановление состояния нижней навигации
    }

    override fun onSaveInstanceState(outState: Bundle) {//ф-ция сохранения состояния последнего нажатого элемента
        outState.putInt(LAST_SELECTED_ITEM, bottomNavigationMenu.selectedItemId)
        super.onSaveInstanceState(outState)
    }

//ф-ция замены фрагментов с помощью supportFragmentManager
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}