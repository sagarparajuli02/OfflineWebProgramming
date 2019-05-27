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
        getterSetterList.add(new GetterSetter("Introduction","file:///android_asset/html/intro.html"));
        getterSetterList.add(new GetterSetter("Basics","file:///android_asset/html/basics.html"));
        getterSetterList.add(new GetterSetter("Selectors","file:///android_asset/html/selectors.html"));
        getterSetterList.add(new GetterSetter("Attributes","file:///android_asset/html/attributes`.html"));
        getterSetterList.add(new GetterSetter("CSS","file:///android_asset/html/css.html"));
        getterSetterList.add(new GetterSetter("DOM","file:///android_asset/html/dom.html"));
        getterSetterList.add(new GetterSetter("Events","file:///android_asset/html/ebvents.html"));
        getterSetterList.add(new GetterSetter("Ajax","file:///android_asset/html/ajax.html"));
        getterSetterList.add(new GetterSetter("Interaction","file:///android_asset/html/interaction.html"));
        getterSetterList.add(new GetterSetter("Widgets","file:///android_asset/html/widgets.html"));
        getterSetterList.add(new GetterSetter("Theming","file:///android_asset/html/theming.html"));
        getterSetterList.add(new GetterSetter("Utolities","file:///android_asset/html/utilities.html"));
        getterSetterList.add(new GetterSetter("Flickerplate","file:///android_asset/html/flickerplate.html"));
        getterSetterList.add(new GetterSetter("SlideShow","file:///android_asset/html/slideshow.html"));
        getterSetterList.add(new GetterSetter("Drawsvg","file:///android_asset/html/drawsvg.html"));
        getterSetterList.add(new GetterSetter("Weather","file:///android_asset/html/weather.html"));

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