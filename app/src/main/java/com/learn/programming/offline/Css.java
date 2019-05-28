package com.learn.programming.offline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Css extends AppCompatActivity {
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<GetterSetter> getterSetterList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_css);
        setTitle("Learn Css");
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
        getterSetterList.add(new GetterSetter("Introduction","file:///android_asset/css/intro.html"));
        getterSetterList.add(new GetterSetter("Syntax","file:///android_asset/css/syntax.html"));
        getterSetterList.add(new GetterSetter("Inclusion","file:///android_asset/css/Inclusion.html"));
        getterSetterList.add(new GetterSetter("Measurement Units","file:///android_asset/css/units.html"));
        getterSetterList.add(new GetterSetter("Colors","file:///android_asset/css/colos.html"));
        getterSetterList.add(new GetterSetter("Backgrounds","file:///android_asset/css/background.html"));
        getterSetterList.add(new GetterSetter("Fonts","file:///android_asset/css/fonts.html"));
        getterSetterList.add(new GetterSetter("Text","file:///android_asset/css/text.html"));
        getterSetterList.add(new GetterSetter("Images","file:///android_asset/css/images.html"));
        getterSetterList.add(new GetterSetter("Links","file:///android_asset/css/links.html"));
        getterSetterList.add(new GetterSetter("Tables","file:///android_asset/css/tables.html"));
        getterSetterList.add(new GetterSetter("Boarders","file:///android_asset/css/boders.html"));
        getterSetterList.add(new GetterSetter("Margins","file:///android_asset/css/margins.html"));
        getterSetterList.add(new GetterSetter("Lists","file:///android_asset/css/lists.html"));
        getterSetterList.add(new GetterSetter("Padding","file:///android_asset/css/padding.html"));
        getterSetterList.add(new GetterSetter("Cursors","file:///android_asset/css/cursors.html"));
        getterSetterList.add(new GetterSetter("Pseudo Class","file:///android_asset/css/pseduclass.html"));
        getterSetterList.add(new GetterSetter("Pesudo Elements","file:///android_asset/css/pseduelements.html"));
        getterSetterList.add(new GetterSetter("Validation","file:///android_asset/css/validation.html"));
        getterSetterList.add(new GetterSetter("Rounded Corners","file:///android_asset/css/roundedcorners.html"));
        getterSetterList.add(new GetterSetter("2D Transformation","file:///android_asset/css/.2dhtml"));
        getterSetterList.add(new GetterSetter("3D Transformation","file:///android_asset/css/3d.html"));
        getterSetterList.add(new GetterSetter("Animation","file:///android_asset/css/animation.html"));


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