package com.learn.programming.offline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Jquery extends AppCompatActivity {

    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<GetterSetter> getterSetterList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jquery);
        setTitle("Learn JQuery");
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
        getterSetterList.add(new GetterSetter("Introduction","file:///android_asset/jquery/intro.html"));
        getterSetterList.add(new GetterSetter("Basics","file:///android_asset/jquery/basics.html"));
        getterSetterList.add(new GetterSetter("Selectors","file:///android_asset/jquery/selectors.html"));
        getterSetterList.add(new GetterSetter("Attributes","file:///android_asset/jquery/attributes`.html"));
        getterSetterList.add(new GetterSetter("CSS","file:///android_asset/jquery/css.html"));
        getterSetterList.add(new GetterSetter("DOM","file:///android_asset/jquery/dom.html"));
        getterSetterList.add(new GetterSetter("Events","file:///android_asset/jquery/ebvents.html"));
        getterSetterList.add(new GetterSetter("Ajax","file:///android_asset/jquery/ajax.html"));
        getterSetterList.add(new GetterSetter("Interaction","file:///android_asset/jquery/interaction.html"));
        getterSetterList.add(new GetterSetter("Widgets","file:///android_asset/jquery/widgets.html"));
        getterSetterList.add(new GetterSetter("Theming","file:///android_asset/jquery/theming.html"));
        getterSetterList.add(new GetterSetter("Utolities","file:///android_asset/jquery/utilities.html"));
        getterSetterList.add(new GetterSetter("Flickerplate","file:///android_asset/jquery/flickerplate.html"));
        getterSetterList.add(new GetterSetter("SlideShow","file:///android_asset/jquery/slideshow.html"));
        getterSetterList.add(new GetterSetter("Drawsvg","file:///android_asset/jquery/drawsvg.html"));
        getterSetterList.add(new GetterSetter("Weather","file:///android_asset/jquery/weather.html"));

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