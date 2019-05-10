package com.sample.android.news.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.sample.android.news.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentDetailBinding.inflate(inflater, container, false).apply {
            article = DetailFragmentArgs.fromBundle(arguments!!).article
        }

        with(binding) {
            toolbar.apply {
                setNavigationOnClickListener { findNavController().navigateUp() }
            }
        }

        return binding.root
    }
}