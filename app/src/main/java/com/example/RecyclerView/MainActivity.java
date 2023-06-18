package com.example.RecyclerView;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ContactAdapter contactAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("John Doe", "1234567890"));
        contacts.add(new Contact("Jane Smith", "9876543210"));
contacts.add(new Contact("John Doe", "1234567890"));
        contacts.add(new Contact("Jane Smith", "9876543210"));
contacts.add(new Contact("John Doe", "1234567890"));
        contacts.add(new Contact("Jane Smith", "9876543210"));
contacts.add(new Contact("John Doe", "1234567890"));
        contacts.add(new Contact("Jane Smith", "9876543210"));
contacts.add(new Contact("John Doe", "1234567890"));
        contacts.add(new Contact("Jane Smith", "9876543210"));
contacts.add(new Contact("John Doe", "1234567890"));
        contacts.add(new Contact("Jane Smith", "9876543210"));
contacts.add(new Contact("John Doe", "1234567890"));
        contacts.add(new Contact("Jane Smith", "9876543210"));
contacts.add(new Contact("John Doe", "1234567890"));
        contacts.add(new Contact("Jane Smith", "9876543210"));
contacts.add(new Contact("John Doe", "1234567890"));
        contacts.add(new Contact("Jane Smith", "9876543210"));
contacts.add(new Contact("John Doe", "1234567890"));
        contacts.add(new Contact("Jane Smith", "9876543210"));
contacts.add(new Contact("John Doe", "1234567890"));
        contacts.add(new Contact("Jane Smith", "9876543210"));
contacts.add(new Contact("John Doe", "1234567890"));
        contacts.add(new Contact("Jane Smith", "9876543210"));
contacts.add(new Contact("John Doe", "1234567890"));
        contacts.add(new Contact("Jane Smith", "9876543210"));
contacts.add(new Contact("John Doe", "1234567890"));
        contacts.add(new Contact("Jane Smith", "9876543210"));
contacts.add(new Contact("John Doe", "1234567890"));
        contacts.add(new Contact("Jane Smith", "9876543210"));
contacts.add(new Contact("John Doe", "1234567890"));
        contacts.add(new Contact("Jane Smith", "9876543210"));
contacts.add(new Contact("John Doe", "1234567890"));
        contacts.add(new Contact("Jane Smith", "9876543210"));

        contactAdapter = new ContactAdapter(contacts);
        recyclerView.setAdapter(contactAdapter);
    }
}
