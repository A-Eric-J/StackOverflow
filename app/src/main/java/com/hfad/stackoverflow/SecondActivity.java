package com.hfad.stackoverflow;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hfad.stackoverflow.webservice.Models.BaseModel;
import com.hfad.stackoverflow.webservice.connectionProvider;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.hfad.stackoverflow.MainActivity.Qlink;
import static com.hfad.stackoverflow.MainActivity.flag;
import static com.hfad.stackoverflow.MainActivity.image;
import static com.hfad.stackoverflow.MainActivity.name;
import static com.hfad.stackoverflow.MainActivity.score;
import static com.hfad.stackoverflow.MainActivity.sub;
import static com.hfad.stackoverflow.MainActivity.tag1;
import static com.hfad.stackoverflow.MainActivity.tag10;
import static com.hfad.stackoverflow.MainActivity.tag2;
import static com.hfad.stackoverflow.MainActivity.tag3;
import static com.hfad.stackoverflow.MainActivity.tag4;
import static com.hfad.stackoverflow.MainActivity.tag5;
import static com.hfad.stackoverflow.MainActivity.tag6;
import static com.hfad.stackoverflow.MainActivity.tag7;
import static com.hfad.stackoverflow.MainActivity.tag8;
import static com.hfad.stackoverflow.MainActivity.tag9;
import static com.hfad.stackoverflow.R.styleable.View;




public class SecondActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {



    public static String name1;
    public static  String img;
    public static String sub1;
    public static String sc;
    public static String[] tg=new String[10];
    public static String taG;
    public static String lin;
    public static String item;



    Toolbar toolbar;
    RecyclerView RV;
    SimpleListAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<SimpleListEntry> entries=new ArrayList<>();

    public  static String[] image1=new String[10];
    public  static String[] sub11=new String [10];
    public  static String[] sT=new String [10];
    public  static String[] name11=new String [10];
    public  static String[] score1=new String [10];
    public  static String[] Qlink1=new String [10];


    public int num=0;
    public  int m=0;







    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        RV = (RecyclerView) findViewById(R.id.RVsimpleList);
        layoutManager= new LinearLayoutManager(this);
        RV.setLayoutManager(layoutManager);
        RV.setHasFixedSize(true);









          SimpleListEntry entry1 = new SimpleListEntry(image[0],sub[0],tag1,flag[0]);
          entries.add(entry1);

        SimpleListEntry entry2 = new SimpleListEntry(image[1],sub[1],tag2,flag[1]);
        entries.add(entry2);

        SimpleListEntry entry3 = new SimpleListEntry(image[2],sub[2],tag3,flag[2]);
        entries.add(entry3);

        SimpleListEntry entry4 = new SimpleListEntry(image[3],sub[3],tag4,flag[3]);
        entries.add(entry4);

        SimpleListEntry entry5 = new SimpleListEntry(image[4],sub[4],tag5,flag[4]);
        entries.add(entry5);

        SimpleListEntry entry6 = new SimpleListEntry(image[5],sub[5],tag6,flag[5]);
        entries.add(entry6);

        SimpleListEntry entry7 = new SimpleListEntry(image[6],sub[6],tag7,flag[6]);
        entries.add(entry7);

        SimpleListEntry entry8 = new SimpleListEntry(image[7],sub[7],tag8,flag[7]);
        entries.add(entry8);

        SimpleListEntry entry9 = new SimpleListEntry(image[8],sub[8],tag9,flag[8]);
        entries.add(entry9);

        SimpleListEntry entry10 = new SimpleListEntry(image[9],sub[9],tag10,flag[9]);
        entries.add(entry10);



        tg[0]=tag1;
        tg[1]=tag2;
        tg[2]=tag3;
        tg[3]=tag4;
        tg[4]=tag5;
        tg[5]=tag6;
        tg[6]=tag7;
        tg[7]=tag8;
        tg[8]=tag9;
        tg[9]=tag10;



       /* RV.setAdapter(new SimpleListAdapter(SecondActivity.this,entries));
        RV.setLayoutManager(new LinearLayoutManager(this));
        RV.setHasFixedSize(true);*/
       adapter = new SimpleListAdapter(SecondActivity.this,entries);
        RV.setAdapter(adapter);









       RV.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), RV, new RecyclerTouchListener.ClickListener() {

            @Override
            public void onClick(View view, int position) {



if(num==0) {

    name1 = name[position];
    img = image[position];
    sub1 = sub[position];
    sc = score[position];
    taG = tg[position];
    lin = Qlink[position];


    int i = position + 1;
    item = String.valueOf(i);
}
else
{

    name1 = name11[position];
    img = image1[position];
    sub1 = sub11[position];
    sc = score1[position];
    taG = sT[position];
    lin = Qlink1[position];


    int i = position + 1;
    item = String.valueOf(i);


}



                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);

            }

            @Override
            public void onLongClick(View view, int position) {


            }
        }));




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_item,menu);
        MenuItem menuItem=menu.findItem(R.id.action_search);
        SearchView searchView= (SearchView) MenuItemCompat.getActionView(menuItem);
        searchView.setOnQueryTextListener(this);
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText)
    {
        newText=newText.toLowerCase();

        ArrayList<SimpleListEntry> newList=new ArrayList<>();


        for (SimpleListEntry simple:entries) {
            String tName= simple.getTags().toLowerCase();
            if(tName.contains(newText))
            newList.add(simple);

        }
         m=newList.size();
        for(int c=0;c<m;c++)
        {
            image1[c]=newList.get(c).getImage();
            sub11[c]=newList.get(c).getSub();
            sT[c]=newList.get(c).getTags();



        }
        for (int c=0;c<m;c++)
        {
            for(int j=0;j<10;j++) {
                if (image1[c].equals(image[j])) {
                    Qlink1[c] = Qlink[j];
                    score1[c] = score[j];
                    name11[c] = name[j];

                }
            }


        }



        adapter.setFilter(newList);
        num++;
        return true;
    }


}

