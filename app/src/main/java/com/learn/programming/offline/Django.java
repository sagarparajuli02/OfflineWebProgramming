package com.learn.programming.offline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Django extends AppCompatActivity {
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<GetterSetter> getterSetterList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_django);
        setTitle("Learn Djanago");
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
        getterSetterList.add(new GetterSetter("Introduction","file:///android_asset/django/intro.html"));
        getterSetterList.add(new GetterSetter("Environment","file:///android_asset/django/environment.html"));
        getterSetterList.add(new GetterSetter("Creating a Project","file:///android_asset/django/creatproject.html"));
        getterSetterList.add(new GetterSetter("App Lifecycle","file:///android_asset/django/lifecycle.html"));
        getterSetterList.add(new GetterSetter("Admin Interface","file:///android_asset/django/admin.html"));
        getterSetterList.add(new GetterSetter("Creating VIews","file:///android_asset/django/views.html"));
        getterSetterList.add(new GetterSetter("URL Mapping","file:///android_asset/django/urlmapping.html"));
        getterSetterList.add(new GetterSetter("Template System","file:///android_asset/django/templete.html"));
        getterSetterList.add(new GetterSetter("Models","file:///android_asset/django/model.html"));
        getterSetterList.add(new GetterSetter("Page Redirection","file:///android_asset/django/redirection.html"));
        getterSetterList.add(new GetterSetter("sending E mails","file:///android_asset/django/email.html"));
        getterSetterList.add(new GetterSetter("Generic Views","file:///android_asset/django/generic.html"));
        getterSetterList.add(new GetterSetter("Form Processing","file:///android_asset/django/formprocess.html"));
        getterSetterList.add(new GetterSetter("File Uploading","file:///android_asset/django/fileupload.html"));
        getterSetterList.add(new GetterSetter("Apache Setup","file:///android_asset/django/apache.html"));
        getterSetterList.add(new GetterSetter("Cookies Handeling","file:///android_asset/django/.cookieshtml"));
        getterSetterList.add(new GetterSetter("Session","file:///android_asset/django/sessions.html"));
        getterSetterList.add(new GetterSetter("Caching","file:///android_asset/django/cache.html"));
        getterSetterList.add(new GetterSetter("Comments","file:///android_asset/django/coments.html"));
        getterSetterList.add(new GetterSetter("RSS","file:///android_asset/django/rss.html"));
        getterSetterList.add(new GetterSetter("AJAX","file:///android_asset/django/ajax.html"));



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