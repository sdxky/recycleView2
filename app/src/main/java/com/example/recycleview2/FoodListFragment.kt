package com.example.recycleview2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FoodListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_food_list, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val foodList = listOf(
            Food("Pizza", "A delicious cheesy pizza with toppings."),
            Food("Burger", "A juicy beef burger with lettuce and tomato."),
            Food("Pasta", "A creamy pasta with Alfredo sauce."),
            Food("Sushi", "Fresh sushi with rice and fish."),
            Food("Salad", "A healthy green salad with various vegetables.")
        )
        recyclerView.adapter = FoodAdapter(foodList)

        return view
    }
}
