package com.example.work4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.work4.MyCustomAdapter.mycustomadapter;
import com.example.work4.MyCustomAdapter.mycustomadapter2;
import com.example.work4.model.quizmodel;
import com.example.work4.model.wwemodel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView1,recyclerView2;
    List<quizmodel> quizmodelList;
    List<wwemodel> wwemodelList;
    mycustomadapter myCustomAdapter;
    mycustomadapter2 mycustomadapter2;
    StaggeredGridLayoutManager staggeredGridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView1=findViewById(R.id.recycleview);
        recyclerView2=findViewById(R.id.reycleview2);
        quizmodelList=new ArrayList<>();
        wwemodelList=new ArrayList<>();
        quizmodel c1=new quizmodel("Special Contest",500);
        quizmodel c2=new quizmodel("Premium Contest",1000);
        quizmodel c3=new quizmodel("Special Contest",500);
        quizmodel c4=new quizmodel("Premium Contest",1000);
        quizmodelList.add(c1);
        quizmodelList.add(c2);
        quizmodelList.add(c3);
        quizmodelList.add(c4);


        myCustomAdapter=new mycustomadapter(quizmodelList);

  recyclerView1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView1.setAdapter(myCustomAdapter);
        mycustomadapter2=new mycustomadapter2(wwemodelList);
        staggeredGridLayoutManager=new StaggeredGridLayoutManager(2,staggeredGridLayoutManager.VERTICAL);
        recyclerView2.setLayoutManager(staggeredGridLayoutManager);
        recyclerView2.setAdapter(mycustomadapter2);
        IntializeDataintoRecycleview();

    }
    private void  IntializeDataintoRecycleview(){
        wwemodel a1=new wwemodel("randy orton",R.drawable.wwe);
        wwemodel a2=new wwemodel("randy orton",R.drawable.bbci);
        wwemodel a3=new wwemodel("randy orton",R.drawable.wwe);
        wwemodel a4=new wwemodel("randy orton",R.drawable.images);
        wwemodel a5=new wwemodel("randy orton",R.drawable.taj);
        wwemodelList.add(a1);
        wwemodelList.add(a2);
        wwemodelList.add(a3);
        wwemodelList.add(a4);
        wwemodelList.add(a5);
        mycustomadapter2.notifyDataSetChanged();

    }
}