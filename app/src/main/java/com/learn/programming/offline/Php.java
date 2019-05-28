package com.learn.programming.offline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Php extends AppCompatActivity {

    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<GetterSetter> getterSetterList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php);
        setTitle("Learn PHP");
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

        getterSetterList.add(new GetterSetter("Introduction","file:///android_asset/php/intro.html"));
        getterSetterList.add(new GetterSetter("Environment Setup","file:///android_asset/php/setup.html"));
        getterSetterList.add(new GetterSetter("Syntax Overview","file:///android_asset/php/syntax.html"));
        getterSetterList.add(new GetterSetter("Variables Types","file:///android_asset/php/variable.html"));
        getterSetterList.add(new GetterSetter("Operator Types","file:///android_asset/php/operator.html"));
        getterSetterList.add(new GetterSetter("Decision Making","file:///android_asset/php/decision.html"));
        getterSetterList.add(new GetterSetter("Loop Types","file:///android_asset/php/loops.html"));
        getterSetterList.add(new GetterSetter("Arrays","file:///android_asset/php/arrays.html"));
        getterSetterList.add(new GetterSetter("Web Concept","file:///android_asset/php/concepts.html"));
        getterSetterList.add(new GetterSetter("GET and POST","file:///android_asset/php/getposy.html"));
        getterSetterList.add(new GetterSetter("Cookies","file:///android_asset/php/cookies.html"));
        getterSetterList.add(new GetterSetter("Sessions","file:///android_asset/php/sessions.html"));
        getterSetterList.add(new GetterSetter("Login Example","file:///android_asset/php/loginex.html"));

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