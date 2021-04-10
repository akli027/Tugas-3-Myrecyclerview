package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Dashboard extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<User> users = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        recyclerView = findViewById(R.id.rv_recycleView);
        recyclerView.setHasFixedSize(true);

        users.addAll(UserData.getListData());
        showRecycleView();
    }

    private void showRecycleView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        UserAdapter adapter = new UserAdapter(users,this);
        recyclerView.setAdapter(adapter);
    }
}