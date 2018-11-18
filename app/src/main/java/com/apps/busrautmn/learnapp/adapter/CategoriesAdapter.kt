package com.apps.busrautmn.learnapp.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.apps.busrautmn.learnapp.dto.CategoriesDTO

class CategoriesAdapter(private  val categoryList : List<CategoriesDTO>,
                        private val onItemClick:(view: View,categoriesDTO:CategoriesDTO)->Unit):RecyclerView.Adapter<CategoryListViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):CategoryListViewHolder = CategoryListViewHolder(parent)


    override fun getItemCount(): Int = categoryList.size

    override fun onBindViewHolder(holder: CategoryListViewHolder, position: Int) {
    holder.bindTo(categoryList[position]){view,categoriesDTO ->
        onItemClick(view, categoriesDTO)
    }
    }


}