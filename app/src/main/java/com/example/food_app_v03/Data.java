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
        foodList.add(new Food("12","This is Food Name", "12.00", "Hello", "001", R.drawable.ic_restaurant));
        foodList.add(new Food("13","This is Food Name", "14.00", "Hello", "001", R.drawable.ic_restaurant));
        foodList.add(new Food("14","This is Food Name", "13.00", "Hello", "007", R.drawable.ic_restaurant));
        foodList.add(new Food("15","This is Food Name", "22.00", "Hello", "005", R.drawable.ic_restaurant));
        foodList.add(new Food("23","This is Food Name", "54.00", "Hello", "003", R.drawable.ic_restaurant));
        foodList.add(new Food("44","This is Food Name", "33.00", "Hello", "003", R.drawable.ic_restaurant));
        foodList.add(new Food("55","This is Food Name", "62.00", "Hello", "002", R.drawable.ic_restaurant));
        return foodList;
    }
}
