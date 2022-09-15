package com.example.food_app_v03;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeVH> {

    ArrayList<Food> homeFoodList;
    ItemClick itemClick;
    DBModel dbModel;

    public HomeAdapter(ArrayList<Food> homeFoodList, ItemClick itemClick) {
        this.homeFoodList = homeFoodList;
        this.itemClick = itemClick;
    }

    public class HomeVH extends RecyclerView.ViewHolder {

        ImageView homeItemIV;
        TextView homeItem_name, homeItem_restaurant;

        public HomeVH(@NonNull View itemView, ItemClick itemClick) {
            super(itemView);
            homeItemIV = itemView.findViewById(R.id.home_imageView);
            homeItem_name = itemView.findViewById(R.id.home_item_name);
            homeItem_restaurant = itemView.findViewById(R.id.home_item_restaurant);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(itemClick != null){
                        if(getAdapterPosition() != RecyclerView.NO_POSITION){
                            itemClick.clickedItem(getAdapterPosition());
                        }
                    }
                }
            });
        }
    }
    @NonNull
    @Override
    public HomeVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.home_menu_item,parent,false);
        HomeVH homeVH = new HomeVH(view, itemClick);

        dbModel = new DBModel();
        dbModel.load(view.getContext());

        return homeVH;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeVH holder, int position) {
        holder.homeItemIV.setImageResource(homeFoodList.get(position).getFood_imagePath());
        holder.homeItem_name.setText(homeFoodList.get(position).getFood_name());
        holder.homeItem_restaurant.setText(dbModel.getRestaurantByID(homeFoodList.get(position).getRe_id()).getR_name());
    }

    @Override
    public int getItemCount() {
        return homeFoodList.size();
    }
}
