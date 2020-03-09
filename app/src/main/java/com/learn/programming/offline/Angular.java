package com.learn.programming.offline;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Angular extends AppCompatActivity {

    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<GetterSetter> getterSetterList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angular);
        setTitle("Learn Angular");
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
        getterSetterList.add(new GetterSetter("Overview","file:///android_asset/angular/overview.html"));
        getterSetterList.add(new GetterSetter("Environment Setup","file:///android_asset/angular/setup.html"));
        getterSetterList.add(new GetterSetter(" MVC Architecture","file:///android_asset/angular/mvc.html"));
        getterSetterList.add(new GetterSetter("First Application","file:///android_asset/angular/first.html"));
        getterSetterList.add(new GetterSetter("Directives","file:///android_asset/angular/derectives.html"));
        getterSetterList.add(new GetterSetter("Expressions","file:///android_asset/angular/expression.html"));
        getterSetterList.add(new GetterSetter("Controllers","file:///android_asset/angular/controller.html"));
        getterSetterList.add(new GetterSetter("Filters","file:///android_asset/angular/filters.html"));
        getterSetterList.add(new GetterSetter("Tables","file:///android_asset/angular/tables.html"));
        getterSetterList.add(new GetterSetter("HTML DOM","file:///android_asset/angular/dom.html"));
        getterSetterList.add(new GetterSetter("Modules","file:///android_asset/angular/module.html"));
        getterSetterList.add(new GetterSetter("Forms","file:///android_asset/angular/forms.html"));
        getterSetterList.add(new GetterSetter("Includes","file:///android_asset/angular/includes.html"));
        getterSetterList.add(new GetterSetter("angular","file:///android_asset/angular/angular.html"));
        getterSetterList.add(new GetterSetter("Views","file:///android_asset/angular/views.html"));
        getterSetterList.add(new GetterSetter("Scopes","file:///android_asset/angular/scope.html"));
        getterSetterList.add(new GetterSetter("Services","file:///android_asset/angular/service.html"));
        getterSetterList.add(new GetterSetter("Dependency Injection","file:///android_asset/angular/dependency.html"));
        getterSetterList.add(new GetterSetter("Custom Directives","file:///android_asset/angular/custom.html"));
        getterSetterList.add(new GetterSetter("Internationalization","file:///android_asset/angular/international.html"));

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