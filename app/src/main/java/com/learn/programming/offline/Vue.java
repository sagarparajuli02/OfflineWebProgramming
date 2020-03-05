package com.learn.programming.offline;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Vue extends AppCompatActivity {
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<GetterSetter> getterSetterList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue);
        setTitle("Learn Vue Js");
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
        getterSetterList.add(new GetterSetter("Overview","file:///android_asset/vue/intro.html"));
        getterSetterList.add(new GetterSetter("Environment Setup","file:///android_asset/vue/setup.html"));
        getterSetterList.add(new GetterSetter("Instances","file:///android_asset/vue/instance.html"));
        getterSetterList.add(new GetterSetter("Templete","file:///android_asset/vue/templete.html"));
        getterSetterList.add(new GetterSetter("Components","file:///android_asset/vue/component.html"));
        getterSetterList.add(new GetterSetter("Computed Properties","file:///android_asset/vue/computed.html"));
        getterSetterList.add(new GetterSetter("Watch Property","file:///android_asset/vue/watch.html"));
        getterSetterList.add(new GetterSetter("Binding","file:///android_asset/vue/binding.html"));
        getterSetterList.add(new GetterSetter("Events","file:///android_asset/vue/events.html"));
        getterSetterList.add(new GetterSetter("Rendering","file:///android_asset/vue/reendering.html"));
        getterSetterList.add(new GetterSetter("Transition & Animation","file:///android_asset/vue/ta.html"));
        getterSetterList.add(new GetterSetter("Directives","file:///android_asset/vue/directives.html"));
        getterSetterList.add(new GetterSetter("Routing","file:///android_asset/vue/routing.html"));
        getterSetterList.add(new GetterSetter("Mixins","file:///android_asset/vue/mixin.html"));
        getterSetterList.add(new GetterSetter("Render Function","file:///android_asset/vue/render.html"));
        getterSetterList.add(new GetterSetter("Reactive Interface","file:///android_asset/vue/reactive.html"));
       getterSetterList.add(new GetterSetter("Vue Example","file:///android_asset/vue/eample.html"));


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