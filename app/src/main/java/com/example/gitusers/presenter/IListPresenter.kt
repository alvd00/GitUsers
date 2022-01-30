package com.example.gitusers.presenter

import com.example.gitusers.view.IItemView

interface IListPresenter<V : IItemView> {
    var ItemClickListener: ((V) -> Unit)
    fun bindView(view : V)
    fun getCount() : Int

}