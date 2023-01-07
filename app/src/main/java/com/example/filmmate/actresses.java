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

public class actresses extends AppCompatActivity {

    private ListView lv;
    private ArrayAdapter adapter;
    private ArrayList<String> list1;
    private SearchView sv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actresses);
        lv = (ListView)findViewById(R.id.list);
        sv = (SearchView)findViewById(R.id.search);
        list1 = new ArrayList<String>();
        list1.add("Barbara Stanwyck");
        list1.add("Bette Davis");
        list1.add("Katherine Hepburn");
        list1.add("Audrey Hepburn");
        list1.add("Rita Hayworth");
        list1.add("Marilyn Monroe");
        list1.add("Joan Crawford");
        list1.add("Deborah Kerr");
        list1.add("Gene Tierney");
        list1.add("Olivia de Havilland");  //todo add more actresses manually or automatically
        list1.add("Meryl Streep");
        //todo add sorting by name
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list1);
        lv.setAdapter(adapter);
        sv.setIconified(false);
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

                openActors();

            }

        });
    }
    public void openActors(){
        Intent intent = new Intent(this, actors.class);
        startActivity(intent);
    }
        //todo add onclick listener to listView (when 3 actresses clicked) "next" button appears and you can go to next screen. you can also "unclick" directors.
    }
