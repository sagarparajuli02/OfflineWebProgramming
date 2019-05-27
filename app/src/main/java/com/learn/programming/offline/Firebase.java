package com.learn.programming.offline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Firebase extends AppCompatActivity {

    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<GetterSetter> getterSetterList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase);
        setTitle("Learn Firebase");
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
        getterSetterList.add(new GetterSetter("Introduction","file:///android_asset/firebase/intro.html"));
        getterSetterList.add(new GetterSetter("Environment Setup","file:///android_asset/firebase/setup.html"));
        getterSetterList.add(new GetterSetter("Data","file:///android_asset/firebase/data.html"));
        getterSetterList.add(new GetterSetter("Arrays","file:///android_asset/firebase/array.html"));
        getterSetterList.add(new GetterSetter("Write Data","file:///android_asset/firebase/writedata.html"));
        getterSetterList.add(new GetterSetter("Write List Data","file:///android_asset/firebase/writedatalist.html"));
        getterSetterList.add(new GetterSetter("WriteTransactional Data","file:///android_asset/firebase/wtd.html"));
        getterSetterList.add(new GetterSetter("Read Data","file:///android_asset/firebase/readdata.html"));
        getterSetterList.add(new GetterSetter("Event Types","file:///android_asset/firebase/eventtype.html"));
        getterSetterList.add(new GetterSetter("Detaching Callbacks","file:///android_asset/firebase/detching.html"));
        getterSetterList.add(new GetterSetter("Queries","file:///android_asset/firebase/queries.html"));
        getterSetterList.add(new GetterSetter("Filtering","file:///android_asset/firebase/filtering.html"));
        getterSetterList.add(new GetterSetter("Email Authentication","file:///android_asset/firebase/emailauth.html"));
        getterSetterList.add(new GetterSetter("Goooogle Authentication","file:///android_asset/firebase/googleauth.html"));
        getterSetterList.add(new GetterSetter("Facebook Authentication","file:///android_asset/firebase/fbauth.html"));
        getterSetterList.add(new GetterSetter("offline","file:///android_asset/firebase/offline.html"));
        getterSetterList.add(new GetterSetter("Security","file:///android_asset/firebase/security.html"));
        getterSetterList.add(new GetterSetter("Deploying","file:///android_asset/firebase/deploy.html"));

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