package com.learn.programming.offline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Asp extends AppCompatActivity {

    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<GetterSetter> getterSetterList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asp);
        setTitle("Learn ASP");
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
        getterSetterList.add(new GetterSetter("Introduction","file:///android_asset/asp/intro.html"));
        getterSetterList.add(new GetterSetter("Environment","file:///android_asset/asp/environment.html"));
        getterSetterList.add(new GetterSetter("Life Cycle","file:///android_asset/asp/life.html"));
        getterSetterList.add(new GetterSetter("First Example","file:///android_asset/asp/example.html"));
        getterSetterList.add(new GetterSetter("Event Handling","file:///android_asset/asp/event.html"));
        getterSetterList.add(new GetterSetter(" Server Side","file:///android_asset/asp/server.html"));
        getterSetterList.add(new GetterSetter("HTML Server","file:///android_asset/asp/html.html"));
        getterSetterList.add(new GetterSetter("Client Side","file:///android_asset/asp/client.html"));
        getterSetterList.add(new GetterSetter("Basic Controls","file:///android_asset/asp/basiccontrol.html"));
        getterSetterList.add(new GetterSetter("Directives","file:///android_asset/asp/directives.html"));
        getterSetterList.add(new GetterSetter("Managing State","file:///android_asset/manage/.html"));
        getterSetterList.add(new GetterSetter("Validators","file:///android_asset/asp/valid.html"));
        getterSetterList.add(new GetterSetter(" Database Access","file:///android_asset/asp/database.html"));
        getterSetterList.add(new GetterSetter("ADO.net","file:///android_asset/asp/ado.html"));
        getterSetterList.add(new GetterSetter("File Uploading","file:///android_asset/asp/file.html"));
        getterSetterList.add(new GetterSetter("Ad Rotator","file:///android_asset/asp/rotator.html"));
        getterSetterList.add(new GetterSetter("Calendars","file:///android_asset/asp/calinder.html"));
        getterSetterList.add(new GetterSetter(" Multi Views","file:///android_asset/asp/multi.html"));
        getterSetterList.add(new GetterSetter("Panel Controls","file:///android_asset/asp/panel.html"));
        getterSetterList.add(new GetterSetter("Data Sources","file:///android_asset/asp/datasource.html"));
        getterSetterList.add(new GetterSetter(" Error Handling","file:///android_asset/asp/error.html"));
        getterSetterList.add(new GetterSetter("Security","file:///android_asset/asp/security.html"));
        getterSetterList.add(new GetterSetter("Data Caching","file:///android_asset/asp/caching.html"));
        getterSetterList.add(new GetterSetter("Web Services","file:///android_asset/asp/webservice.html"));
        getterSetterList.add(new GetterSetter("Multi Threading","file:///android_asset/asp/threading.html"));
        getterSetterList.add(new GetterSetter("Configuration","file:///android_asset/asp/configuration.html"));
        getterSetterList.add(new GetterSetter("Deployment","file:///android_asset/asp/deployment.html"));

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