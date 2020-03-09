package com.learn.programming.offline;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Bootstrap extends AppCompatActivity {

    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<GetterSetter> getterSetterList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bootstrap);
        setTitle("Learn Bootstrap");
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
        getterSetterList.add(new GetterSetter("Introduction","file:///android_asset/bootstrap/intro.html"));
        getterSetterList.add(new GetterSetter("Environment Setup","file:///android_asset/bootstrap/setup.html"));
        getterSetterList.add(new GetterSetter("Layout","file:///android_asset/bootstrap/layout.html"));
        getterSetterList.add(new GetterSetter("Grid System","file:///android_asset/bootstrap/grid.html"));
        getterSetterList.add(new GetterSetter("Content","file:///android_asset/bootstrap/content.html"));
        getterSetterList.add(new GetterSetter("Components","file:///android_asset/bootstrap/component.html"));
        getterSetterList.add(new GetterSetter("Utilities","file:///android_asset/bootstrap/utils.html"));

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