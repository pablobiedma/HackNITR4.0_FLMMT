package com.example.filmmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class Signup extends AppCompatActivity {
    private ListView lv;
    private ArrayAdapter adapter;
    private ArrayList<String> list1;
    private SearchView sv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
         //int counter = 0;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        lv = (ListView) findViewById(R.id.list);
        sv = (SearchView) findViewById(R.id.search);
        list1 = new ArrayList<String>();
        list1.add("Billy Wilder");
        list1.add("Satyajit Ray");
        list1.add("Alfred Hitchcock");
        list1.add("John Ford");
        list1.add("Akira Kurosawa");
        list1.add("William Wyler");
        list1.add("Howard Hawks");
        list1.add("Fritz Lang");
        list1.add("Martin Scorsese");
        list1.add("Steven Spielberg"); //todo add more directors manually or automatically
        list1.add("Stanley Kubrick");
        //todo add sorting by name
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list1);
        lv.setAdapter(adapter);
        sv.setIconified(false);
        //int counter = 0;

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                openActresses();

            }

        });
    }
        public void openActresses(){
            Intent intent = new Intent(this, actresses.class);
            startActivity(intent);
        }

        //todo add onItemClickListener to listView (when 3 directors clicked) "next" button appears and you can go to next screen. you can also "unclick" directors.
    }
