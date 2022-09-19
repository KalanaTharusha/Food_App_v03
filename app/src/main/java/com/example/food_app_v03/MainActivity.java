package com.example.food_app_v03;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    FloatingActionButton fab;
    static User loggedUser;
    static ArrayList<Order> orderList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNav);
        fab = findViewById(R.id.home_button);
        bottomNavigationView.setBackground(null);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFragment(new HomeFragment());
                bottomNavigationView.setSelectedItemId(R.id.home_menu);
            }
        });

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home_menu:
                        changeFragment(new HomeFragment());
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.rest_menu:
                        changeFragment(new RestaurantFragment());
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.cart_menu:
                        changeFragment(new CartFragment());
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.dash_menu:
                        if (loggedUser != null) {
                            changeFragment(new DashboardFragment());
                        } else {
                            changeFragment(new SignInFragment());
                        }
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }

    private void changeFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.mainFragCont, fragment).commit();
    }
}