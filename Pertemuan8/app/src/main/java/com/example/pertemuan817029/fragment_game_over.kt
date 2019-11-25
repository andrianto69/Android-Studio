package com.example.pertemuan817029

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class fragment_game_over : Fragment() {

    companion object {
        fun newInstance() = fragment_game_over()
    }

    private lateinit var viewModel: FragmentGameOverViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_game_over, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FragmentGameOverViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
