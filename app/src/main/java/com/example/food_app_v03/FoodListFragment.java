package com.example.food_app_v03;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FoodListFragment extends Fragment implements ItemClick{

    View view;
    static ArrayList<Food> foodList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_food_list, container, false);
        DBModel dbModel = new DBModel();
        dbModel.load(getContext());
//        dbModel.addFoodList();
        foodList = dbModel.getRestaurantFoods(FoodActivity.restaurant);
        RecyclerView rv = view.findViewById(R.id.food_rcv);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        FoodAdapter adapter = new FoodAdapter(foodList, this);
        rv.setAdapter(adapter);

        return view;
    }

    @Override
    public void clickedItem(int position) {
        NavController navController = Navigation.findNavController(view);
        FoodListFragmentDirections.ActionFoodListFragmentToFoodItemFragment dire =
                FoodListFragmentDirections.actionFoodListFragmentToFoodItemFragment(foodList.get(position));
        navController.navigate(dire);
    }
}