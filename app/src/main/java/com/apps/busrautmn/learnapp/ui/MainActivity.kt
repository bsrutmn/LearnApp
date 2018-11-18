package com.apps.busrautmn.learnapp.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.apps.busrautmn.learnapp.R
import com.apps.busrautmn.learnapp.adapter.CategoriesAdapter
import com.apps.busrautmn.learnapp.dto.CategoriesDTO
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val categoryList = ArrayList<CategoriesDTO>()
        categoryList.add(CategoriesDTO("alphabet",R.drawable.sofa))
        categoryList.add(CategoriesDTO("number",R.drawable.numbers))
        categoryList.add(CategoriesDTO("animals",R.drawable.cat))
        categoryList.add(CategoriesDTO("bus",R.drawable.bus))
        categoryList.add(CategoriesDTO("triangle",R.drawable.triangle))
        categoryList.add(CategoriesDTO("cubes",R.drawable.cubes))
        categoryList.add(CategoriesDTO("fruits",R.drawable.banana))

        rv_categories.apply {

            this.layoutManager = GridLayoutManager(this@MainActivity,2)
            this.adapter = CategoriesAdapter(categoryList) { view, CategoriesDTO ->
                Toast.makeText(this@MainActivity, CategoriesDTO.imageLink, Toast.LENGTH_SHORT).show()
            }
        }

    }
}
