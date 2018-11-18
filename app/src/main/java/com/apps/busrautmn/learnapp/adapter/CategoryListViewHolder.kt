package com.apps.busrautmn.learnapp.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.apps.busrautmn.learnapp.R
import com.apps.busrautmn.learnapp.dto.CategoriesDTO
import com.bumptech.glide.Glide

class CategoryListViewHolder(viewGroup: ViewGroup):RecyclerView.ViewHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.adapter_item_categories_list,viewGroup,false)) {

    private val txtTitle by lazy { itemView.findViewById<TextView>(R.id.tvTitle) }
    private val imgCategoies by lazy {itemView.findViewById<ImageView>(R.id.imageView) }


    fun bindTo(categoriesDTO:CategoriesDTO,onItemClick:(view : View, categoriesDTO:CategoriesDTO)->Unit){
       Glide.with(itemView.context).load(categoriesDTO.imageLink).into(imgCategoies )
        txtTitle.text = categoriesDTO.name

    }
}