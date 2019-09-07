package com.example.doggo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

import com.example.doggo.databinding.RecyclerItemDogModelBinding


class DogListFragment : Fragment() {

    private lateinit var imageResIds: IntArray
    private lateinit var names: Array<String>
    private lateinit var descriptions: Array<String>
    private lateinit var urls: Array<String>

    companion object {

        fun newInstance(): DogListFragment {
            return DogListFragment()
        }
    }

    internal inner class DogListAdapter(context: Context) : RecyclerView.Adapter<ViewHolder>() {

        private val layoutInflater = LayoutInflater.from(context)

        override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
            val recyclerDogModelBinding =
                RecyclerItemDogModelBinding.inflate(layoutInflater, viewGroup, false)
            return ViewHolder(recyclerDogModelBinding.root, recyclerDogModelBinding)
        }

        override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
            val dog = DogModel(imageResIds[position], names[position],
                descriptions[position], urls[position])
            viewHolder.setData(dog)
        }

        override fun getItemCount() = names.size
    }

    internal inner class ViewHolder constructor(itemView: View,
                                                private val recyclerItemDogListBinding:
                                                RecyclerItemDogModelBinding
    ) :
        RecyclerView.ViewHolder(itemView) {

        fun setData(dogModel: DogModel) {
            recyclerItemDogListBinding.dogModel = dogModel
        }
    }

}