package com.example.food_app_v03;

import java.util.ArrayList;

public class Data {
    private ArrayList<Restaurant> restaurantList;
    private ArrayList<Food> foodList;

    public Data() {
        restaurantList = new ArrayList<>();
        foodList = new ArrayList<>();

    }

    public ArrayList<Restaurant> makeRestaurantList(){
        restaurantList.add(new Restaurant("001", "Feast Lounge", R.drawable.r01, "508 Cranford Rd \nSmithfield, Virginia."));
        restaurantList.add(new Restaurant("002", "Cuisine Wave", R.drawable.r02, "3853 N Mill Rd \nDryden, Michigan."));
        restaurantList.add(new Restaurant("003", "Eatery Hotspot", R.drawable.r03, "4 Birchwood Cir \nClinton, Connecticut."));
        restaurantList.add(new Restaurant("004", "McBistro", R.drawable.r04, "6155 9th Hwy \nSilverthorne, Colorado."));
        restaurantList.add(new Restaurant("005", "Deli Divine", R.drawable.r05, "28 Acorn Rd \nDennis, Massachusetts."));
        restaurantList.add(new Restaurant("006", "Grub Chef", R.drawable.r06, "612 Gardner St \nSouth Beloit, Illinois."));
        restaurantList.add(new Restaurant("007", "Kitchen Sensation", R.drawable.r07, "2379 Upper Trent Way \nVandalia, Ohio."));
        restaurantList.add(new Restaurant("008", "Munchies", R.drawable.r08, "497 Ridge Rd \nBowdoinham, Maine."));
        restaurantList.add(new Restaurant("009", "Freddy’s Stove", R.drawable.r09, "13603 SE Jamie Ct \nClackamas, Oregon."));
        restaurantList.add(new Restaurant("010", "Paterro’s Kitchen", R.drawable.r10, "25377 Virginia Smith Dr \nCalcium, New York."));
        restaurantList.add(new Restaurant("011", "Flavoroso", R.drawable.r11, "33379 43rd Hwy \nIndependence, Louisiana."));
        restaurantList.add(new Restaurant("012", "Pies n’ Thighs", R.drawable.r12, "Po Box 476 \nLos Alamos, California."));
        return restaurantList;
    }

    public ArrayList<Food> makeFoodList(){
        foodList.add(new Food("12","Food 1", "12.00", "Hello", "001", R.drawable.fs1));
        foodList.add(new Food("13","Food 2", "14.00", "Hello", "001", R.drawable.fs1));
        foodList.add(new Food("14","Food 3", "13.00", "Hello", "007", R.drawable.fs1));
        foodList.add(new Food("15","Food 4", "22.00", "Hello", "005", R.drawable.fs1));
        foodList.add(new Food("23","Food 5", "54.00", "Hello", "003", R.drawable.fs1));
        foodList.add(new Food("44","Food 6", "33.00", "Hello", "003", R.drawable.fs1));
        foodList.add(new Food("55","Food 8", "62.00", "Hello", "002", R.drawable.fs1));
        foodList.add(new Food("14","Food 9", "13.00", "Hello", "007", R.drawable.fs1));
        foodList.add(new Food("15","Food 10", "22.00", "Hello", "005", R.drawable.fs1));
        foodList.add(new Food("23","Food 11", "54.00", "Hello", "003", R.drawable.fs1));
        foodList.add(new Food("44","Food 12", "33.00", "Hello", "003", R.drawable.fs1));
        foodList.add(new Food("55","Food 10", "62.00", "Hello", "002", R.drawable.fs1));
        return foodList;
    }
}
