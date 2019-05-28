package com.learn.programming.offline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Wordpress extends AppCompatActivity {
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<GetterSetter> getterSetterList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordpress);
        setTitle("Learn Wordpress");
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
        getterSetterList.add(new GetterSetter("Introduction","file:///android_asset/wordpress/intro.html"));
        getterSetterList.add(new GetterSetter("Installation","file:///android_asset/wordpress/install.html"));
        getterSetterList.add(new GetterSetter("Dasboard","file:///android_asset/wordpress/dasboard.html"));
        getterSetterList.add(new GetterSetter("General Setting","file:///android_asset/wordpress/general.html"));
        getterSetterList.add(new GetterSetter("Writing Setting","file:///android_asset/wordpress/writing.html"));
        getterSetterList.add(new GetterSetter("Reading Setting","file:///android_asset/wordpress/deading.html"));
        getterSetterList.add(new GetterSetter("Discussion Setting","file:///android_asset/wordpress/discuss.html"));
        getterSetterList.add(new GetterSetter("Media Setting","file:///android_asset/wordpress/media.html"));
        getterSetterList.add(new GetterSetter("Add Category","file:///android_asset/wordpress/addcastegory.html"));
        getterSetterList.add(new GetterSetter("Edit Category","file:///android_asset/wordpress/editcategories.html"));
        getterSetterList.add(new GetterSetter("Delete Category","file:///android_asset/wordpress/deletecategory.html"));
        getterSetterList.add(new GetterSetter("Add Posts","file:///android_asset/wordpress/addpost.html"));
        getterSetterList.add(new GetterSetter("Edit Posts","file:///android_asset/wordpress/editpost.html"));
        getterSetterList.add(new GetterSetter("Delete Posts","file:///android_asset/wordpress/deletepost.html"));
        getterSetterList.add(new GetterSetter("Media Library","file:///android_asset/wordpress/medialibrary.html"));
        getterSetterList.add(new GetterSetter("Add Media","file:///android_asset/wordpress/addmedia.html"));
        getterSetterList.add(new GetterSetter("Add Page","file:///android_asset/wordpress/addpage.html"));
        getterSetterList.add(new GetterSetter("Publish Page","file:///android_asset/wordpress/publishpage.html"));
        getterSetterList.add(new GetterSetter("Delete Page","file:///android_asset/wordpress/deletepage.html"));
        getterSetterList.add(new GetterSetter("Add Tags","file:///android_asset/wordpress/addtags.html"));
        getterSetterList.add(new GetterSetter("Add Links","file:///android_asset/wordpress/addlinks.html"));
        getterSetterList.add(new GetterSetter("Add Coments","file:///android_asset/wordpress/addcoment.html"));
        getterSetterList.add(new GetterSetter("Install Plugins","file:///android_asset/wordpress/installplugin.html"));
        getterSetterList.add(new GetterSetter("User Role","file:///android_asset/wordpress/userrole.html"));
        getterSetterList.add(new GetterSetter("Add User","file:///android_asset/wordpress/adduser.html"));
        getterSetterList.add(new GetterSetter("Personal Profile","file:///android_asset/wordpress/personalprofile.html"));
        getterSetterList.add(new GetterSetter("Theme Management","file:///android_asset/wordpress/thememanagement.html"));
        getterSetterList.add(new GetterSetter("Customize Theme","file:///android_asset/wordpress/customizetheme.html"));
        getterSetterList.add(new GetterSetter("Widget Management","file:///android_asset/wordpress/widgetmanagement.html"));
        getterSetterList.add(new GetterSetter("Host Transfer","file:///android_asset/wordpress/hosttransfer.html"));
        getterSetterList.add(new GetterSetter("Spam Protection","file:///android_asset/wordpress/spamprotection.html"));
        getterSetterList.add(new GetterSetter("Back Up","file:///android_asset/wordpress/backup.html"));
        getterSetterList.add(new GetterSetter("Optimization","file:///android_asset/wordpress/optimization.html"));

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