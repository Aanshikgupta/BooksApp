package com.example.booksapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     RecyclerView recyclerView;
     RecycleViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        ArrayList<Contact> contacts=new ArrayList<>();
        adapter=new RecycleViewAdapter(this,contacts);
        contacts.add(new Contact("Hamlet1","Aanshik"));
        contacts.add(new Contact("Hamlet2","Aanshik"));
        contacts.add(new Contact("Hamlet3","Aanshik"));
        contacts.add(new Contact("Hamlet4","Aanshik"));
        contacts.add(new Contact("Hamlet5","Aanshik"));
        contacts.add(new Contact("Hamlet6","Aanshik"));
        contacts.add(new Contact("Hamlet7","Aanshik"));
        contacts.add(new Contact("Hamlet8","Aanshik"));
        contacts.add(new Contact("Hamlet9","Aanshik"));
        contacts.add(new Contact("Hamlet10","Aanshik"));
        contacts.add(new Contact("Hamlet11","Aanshik"));
        contacts.add(new Contact("Hamlet12","Aanshik"));
        contacts.add(new Contact("Hamlet13","Aanshik"));
        contacts.add(new Contact("Hamlet14","Aanshik"));
        contacts.add(new Contact("Hamlet15","Aanshik"));
        contacts.add(new Contact("Hamlet16","Aanshik"));
        contacts.add(new Contact("Hamlet1","Aanshik"));
        contacts.add(new Contact("Hamlet2","Aanshik"));
        contacts.add(new Contact("Hamlet3","Aanshik"));
        contacts.add(new Contact("Hamlet4","Aanshik"));
        contacts.add(new Contact("Hamlet5","Aanshik"));
        contacts.add(new Contact("Hamlet6","Aanshik"));
        contacts.add(new Contact("Hamlet7","Aanshik"));
        contacts.add(new Contact("Hamlet8","Aanshik"));
        contacts.add(new Contact("Hamlet9","Aanshik"));
        contacts.add(new Contact("Hamlet10","Aanshik"));
        contacts.add(new Contact("Hamlet11","Aanshik"));
        contacts.add(new Contact("Hamlet12","Aanshik"));
        contacts.add(new Contact("Hamlet13","Aanshik"));
        contacts.add(new Contact("Hamlet14","Aanshik"));
        contacts.add(new Contact("Hamlet15","Aanshik"));
        contacts.add(new Contact("Hamlet16","Aanshik"));
        recyclerView.setAdapter(adapter);
    }
}