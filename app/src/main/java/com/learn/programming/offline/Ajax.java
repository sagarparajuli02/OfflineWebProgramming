package com.learn.programming.offline;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Ajax extends AppCompatActivity {
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<GetterSetter> getterSetterList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajax);
        setTitle("Learn Ajax");
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);;
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        recyclerView = (RecyclerView) findViewById(R.id.recycleViewContainer);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        getterSetterList = new ArrayList<>();

        //Adding Data into ArrayList
        getterSetterList.add(new GetterSetter("What is AJAX?","file:///android_asset/ajax/ajax.html"));
        getterSetterList.add(new GetterSetter("AJAX - Technologies","file:///android_asset/ajax/techno.html"));
        getterSetterList.add(new GetterSetter("AJAX - Examples","file:///android_asset/ajax/test.html"));
        getterSetterList.add(new GetterSetter("Browser Support","file:///android_asset/ajax/support.html"));
        getterSetterList.add(new GetterSetter("Action","file:///android_asset/ajax/action.html"));
        getterSetterList.add(new GetterSetter("XMLHttpRequest","file:///android_asset/ajax/xml.html"));
        getterSetterList.add(new GetterSetter("Database Operations","file:///android_asset/ajax/database.html"));
        getterSetterList.add(new GetterSetter("Security","file:///android_asset/ajax/security.html"));
        getterSetterList.add(new GetterSetter("Current Issues","file:///android_asset/ajax/issues.html"));

        mAdapter = new CustomRecyclerAdapter(this, getterSetterList);
        recyclerView.setAdapter(mAdapter);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home);
        finish();
        return super.onOptionsItemSelected(item);
    }
}