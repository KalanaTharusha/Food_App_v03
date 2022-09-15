package com.example.food_app_v03;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.HistoryVH> {

    ArrayList<History> histories;

    public HistoryAdapter(ArrayList<History> histories) {
        this.histories = histories;
    }

    public class HistoryVH extends RecyclerView.ViewHolder {

        TextView date, orderID, itemName, restaurant, unitPrice, amount, totalPrice;

        public HistoryVH(@NonNull View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.h_date);
            orderID = itemView.findViewById(R.id.h_orderID);
            itemName = itemView.findViewById(R.id.h_orderItem);
            restaurant = itemView.findViewById(R.id.h_restaurant);
            unitPrice = itemView.findViewById(R.id.h_unitPrice);
            amount = itemView.findViewById(R.id.h_amount);
            totalPrice = itemView.findViewById(R.id.h_total);
        }
    }

    @NonNull
    @Override
    public HistoryVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.history_item,parent,false);
        HistoryVH historyVH = new HistoryVH(view);
        return historyVH;
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryVH holder, int position) {
        holder.date.setText(histories.get(position).date);
        holder.orderID.setText(histories.get(position).orderID);
        holder.itemName.setText(histories.get(position).item);
        holder.restaurant.setText(histories.get(position).restaurant);
        holder.unitPrice.setText(histories.get(position).unitPrice);
        holder.amount.setText(histories.get(position).amount);
        holder.totalPrice.setText(histories.get(position).totalPrice);
    }

    @Override
    public int getItemCount() {
        return histories.size();
    }

}
