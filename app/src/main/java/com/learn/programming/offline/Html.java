package com.learn.programming.offline;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Html extends AppCompatActivity {

    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<GetterSetter> getterSetterList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);
        setTitle("Learn Html");
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
        getterSetterList.add(new GetterSetter("Basic Tags","file:///android_asset/html/basictags.html"));
        getterSetterList.add(new GetterSetter("Elements","file:///android_asset/html/elements.html"));
        getterSetterList.add(new GetterSetter("Attributes","file:///android_asset/html/attributes.html"));
        getterSetterList.add(new GetterSetter("Formatting","file:///android_asset/html/formatting.html"));
        getterSetterList.add(new GetterSetter("Images","file:///android_asset/html/image.html"));
        getterSetterList.add(new GetterSetter("Tables","file:///android_asset/html/tables.html"));
        getterSetterList.add(new GetterSetter("List","file:///android_asset/html/list.html"));
        getterSetterList.add(new GetterSetter("Text Links","file:///android_asset/html/textlinks.html"));
        getterSetterList.add(new GetterSetter("Frames","file:///android_asset/html/frames.html"));
        getterSetterList.add(new GetterSetter("Forms","file:///android_asset/html/forms.html"));
        getterSetterList.add(new GetterSetter("Style Sheet","file:///android_asset/html/stylesheets.html"));
        getterSetterList.add(new GetterSetter("Marquees","file:///android_asset/html/marquee.html"));
        getterSetterList.add(new GetterSetter("Javascript","file:///android_asset/html/js.html"));
        getterSetterList.add(new GetterSetter("Layouts","file:///android_asset/html/layout.html"));

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