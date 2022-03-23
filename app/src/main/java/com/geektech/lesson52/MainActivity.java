package com.geektech.lesson52;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NumberAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("0777-777-777");
        numbers.add("0777-777-777");
        numbers.add("0777-777-777");
        numbers.add("0777-777-777");
        numbers.add("0777-777-777");
        numbers.add("0777-777-777");
        numbers.add("0777-777-777");
        numbers.add("0777-777-777");
        numbers.add("0777-777-777");
        numbers.add("0777-777-777");
        numbers.add("0777-777-777");
        numbers.add("0777-777-777");
        numbers.add("0777-777-777");
        numbers.add("0555-555-555");
        numbers.add("0555-555-555");
        numbers.add("0555-555-555");
        numbers.add("0555-555-555");
        numbers.add("0555-555-555");
        numbers.add("0555-555-555");
        numbers.add("0555-555-555");
        numbers.add("0555-555-555");
        numbers.add("0555-555-555");
        numbers.add("0555-555-555");
        adapter = new NumberAdapter(numbers);
        recyclerView.setAdapter(adapter);
    }
}