package com.example.food_app_v03;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CartFragment extends Fragment {
    ArrayList<Order> orders;
    Button checkout;
    static TextView totalPrice;

    public CartFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        orders = MainActivity.orderList;
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart, container, false);
        RecyclerView rv = view.findViewById(R.id.cart_rcv);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        CartAdapter adapter = new CartAdapter(orders);
        rv.setAdapter(adapter);

        checkout = view.findViewById(R.id.checkoutBtn);
        totalPrice = view.findViewById(R.id.c_total_price);

        getTotalCO();

        checkout.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                DBModel dbModel = new DBModel();
                dbModel.load(view.getContext());
                if (MainActivity.loggedUser != null) {
                    if (!MainActivity.orderList.isEmpty()) {
                        dbModel.addOrderList(MainActivity.loggedUser.u_email);
                        paymentConfirm();
                        MainActivity.orderList.removeAll(MainActivity.orderList);
                        getTotalCO();
                        adapter.notifyDataSetChanged();
                    }else {
                        Toast.makeText(getContext(), "No items", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getContext(), "Log in first", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }


    public static void getTotalCO() {
        double co_total = 0;
        for (int i = 0; i < MainActivity.orderList.size(); i++) {
            co_total = co_total + MainActivity.orderList.get(i).getTotalPrice();
        }
        totalPrice.setText(String.valueOf(co_total));
    }

    public void paymentConfirm() {
        Dialog dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.paymentconf_dialog);
        dialog.getWindow().setBackgroundDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.dialog_background));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.show();
    }

}