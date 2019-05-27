package com.learn.programming.offline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Javascript extends AppCompatActivity {
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<GetterSetter> getterSetterList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javascript);
        setTitle("Learn Javascript");
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
        getterSetterList.add(new GetterSetter("Intoduction","file:///android_asset/html/intro.html"));
        getterSetterList.add(new GetterSetter("Syntax","file:///android_asset/html/syntax.html"));
        getterSetterList.add(new GetterSetter("Valiables","file:///android_asset/html/variables.html"));
        getterSetterList.add(new GetterSetter("Operators","file:///android_asset/html/operator.html"));
        getterSetterList.add(new GetterSetter("If..Else","file:///android_asset/html/ifelse.html"));
        getterSetterList.add(new GetterSetter("Switch Case","file:///android_asset/html/switch.html"));
        getterSetterList.add(new GetterSetter("While  Loop","file:///android_asset/html/while.html"));
        getterSetterList.add(new GetterSetter("For Loop","file:///android_asset/html/for.html"));
        getterSetterList.add(new GetterSetter("Loop Control","file:///android_asset/html/loopcontrol.html"));
        getterSetterList.add(new GetterSetter("Functions","file:///android_asset/html/function.html"));
        getterSetterList.add(new GetterSetter("Events","file:///android_asset/html/events.html"));
        getterSetterList.add(new GetterSetter("Cookies","file:///android_asset/html/cookies.html"));
        getterSetterList.add(new GetterSetter("Html DOM","file:///android_asset/html/htmldom.html"));
        getterSetterList.add(new GetterSetter("Erroe Handling","file:///android_asset/html/errorhandeling.html"));
        getterSetterList.add(new GetterSetter("Animation","file:///android_asset/html/lanimatuons.html"));
        getterSetterList.add(new GetterSetter("Browser","file:///android_asset/html/browser.html"));


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