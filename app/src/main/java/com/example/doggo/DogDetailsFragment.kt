package com.example.doggo

import android.os.Bundle
//import android.support.v4.app.Fragment
//import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

//1
class DogDetailsFragment : Fragment() {

    //2
    companion object {

        fun newInstance(): DogDetailsFragment {
            return DogDetailsFragment()
        }
    }

    //3
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_dog_details, container, false)
    }

}
//https://www.raywenderlich.com/1364094-android-fragments-tutorial-an-introduction-with-kotlin