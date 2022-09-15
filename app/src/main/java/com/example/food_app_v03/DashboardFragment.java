package com.example.food_app_v03;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {
    View view;
    User user;
    TextView name, email;
    Button logoutBtn;
    ArrayList<History> historyArrayList;

    public DashboardFragment() {
        historyArrayList = new ArrayList<>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        DBModel dbModel = new DBModel();
        dbModel.load(getContext());
        historyArrayList = dbModel.getUserHistory(MainActivity.loggedUser.getU_email());
        RecyclerView rv = view.findViewById(R.id.history_rcv);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        HistoryAdapter adapter = new HistoryAdapter(historyArrayList);
        rv.setAdapter(adapter);

        user = MainActivity.loggedUser;

        name = view.findViewById(R.id.user_name);
        email = view.findViewById(R.id.user_email);
        logoutBtn = view.findViewById(R.id.logout_Btn);

        name.setText(user.getU_name());
        email.setText(user.getU_email());

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
//                Intent i = new Intent(getContext(), MainActivity.class);
//                startActivity(i);
                MainActivity.loggedUser = null;
                FragmentManager fragmentManager = getParentFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.mainFragCont, new SignInFragment()).commit();
            }
        });

        return view;
    }
}