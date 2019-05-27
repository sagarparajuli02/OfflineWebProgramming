package com.learn.programming.offline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Joomla extends AppCompatActivity {
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<GetterSetter> getterSetterList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joomla);
        setTitle("Learn MySql");
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
        getterSetterList.add(new GetterSetter("Introduction","file:///android_asset/html/intro.html"));
        getterSetterList.add(new GetterSetter("Installation","file:///android_asset/html/install.html"));
        getterSetterList.add(new GetterSetter("Administration","file:///android_asset/html/admin.html"));
        getterSetterList.add(new GetterSetter("PHPSyntax","file:///android_asset/html/phpsyntax.html"));
        getterSetterList.add(new GetterSetter("Connection","file:///android_asset/html/connection.html"));
        getterSetterList.add(new GetterSetter("Create Database","file:///android_asset/html/createdb.html"));
        getterSetterList.add(new GetterSetter("Drop Database","file:///android_asset/html/dropdb.html"));
        getterSetterList.add(new GetterSetter("Select Database","file:///android_asset/html/selectdb.html"));
        getterSetterList.add(new GetterSetter("Data Types","file:///android_asset/html/datatypes.html"));
        getterSetterList.add(new GetterSetter("Create Table","file:///android_asset/html/createtable.html"));
        getterSetterList.add(new GetterSetter("Drop Table","file:///android_asset/html/droptable.html"));
        getterSetterList.add(new GetterSetter("Insert","file:///android_asset/html/insert.html"));
        getterSetterList.add(new GetterSetter("Select","file:///android_asset/html/select.html"));
        getterSetterList.add(new GetterSetter("Update","file:///android_asset/html/update.html"));
        getterSetterList.add(new GetterSetter("Delete","file:///android_asset/html/delete.html"));
        getterSetterList.add(new GetterSetter("SQL Injection","file:///android_asset/html/sqlinjection.html"));
        getterSetterList.add(new GetterSetter("Database Infromation","file:///android_asset/html/dbinfo.html"));

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