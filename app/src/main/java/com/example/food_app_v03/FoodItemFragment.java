package com.example.food_app_v03;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FoodItemFragment extends Fragment {
    View view;
    TextView foodName, restaurantName, amountLabel, plus, minus;
    Button addToCart;
    ImageView foodItemIV;
    Food newFood;
    int amount = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_food_item, container, false);
        foodName = view.findViewById(R.id.food_name2);
        amountLabel = view.findViewById(R.id.amount2);
        plus = view.findViewById(R.id.add_btn);
        minus = view.findViewById(R.id.minus_btn);
        addToCart = view.findViewById(R.id.add_to_cart_btn);
        foodItemIV = view.findViewById(R.id.food_image2);
        restaurantName = view.findViewById(R.id.res_name2);

        DBModel dbModel = new DBModel();
        dbModel.load(getContext());

        newFood = FoodItemFragmentArgs.fromBundle(getArguments()).getFood();
        foodName.setText(newFood.getFood_name());
        restaurantName.setText(dbModel.getRestaurantByID(newFood.getRe_id()).getR_name());
        foodItemIV.setImageResource(newFood.food_imagePath);
        addToCart.setText("ADD TO CART\nLKR " + String.valueOf(Double.parseDouble(newFood.getFood_price()) * amount));

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount++;
                amountLabel.setText(String.valueOf(amount));
                addToCart.setText("ADD TO CART\nLKR " + String.valueOf(Double.parseDouble(newFood.getFood_price()) * amount));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (amount > 1) {
                    amount--;
                    amountLabel.setText(String.valueOf(amount));
                    addToCart.setText("ADD TO CART\nLKR " + String.valueOf(Double.parseDouble(newFood.getFood_price()) * amount));
                }
            }
        });

        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.orderList.add(new Order(newFood.food_name, newFood.re_id, Double.parseDouble(newFood.food_price), amount, Double.parseDouble(newFood.food_price) * amount));

                amount = 1;

                Toast.makeText(getContext(), "Item added", Toast.LENGTH_SHORT).show();

                Navigation.findNavController(view).navigate(R.id.action_foodItemFragment_to_foodListFragment);

            }
        });
        return view;
    }
}