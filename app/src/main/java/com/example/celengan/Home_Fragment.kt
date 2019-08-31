package com.example.celengan


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import java.util.zip.Inflater


class Home_Fragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container:ViewGroup,
        savedInstanceState:Bundle,
    ): View = inflater.inflate(R.layout.fragment_home,container,false)

}