package com.example.database;

import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;

import android.os.Bundle;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //checking that I can write to the database

        Repas repas = new Repas("aa","bb","cc");
        //This does not work cause we need to serialise Data
//        DatabaseReference mDatabase;
//        mDatabase = FirebaseDatabase.getInstance().getReference();
//        mDatabase.child("Repas").child("premier").setValue(repas);
        FirebaseDatabase.getInstance().getReference().child("Repas").setValue("aa");
         //create a HashMap of repas
        HashMap<String,Object> list_of_meals = new HashMap<>();
        list_of_meals.put("First","a repas to be added");
        FirebaseDatabase.getInstance().getReference().child("Repas").updateChildren(list_of_meals);

    }

}