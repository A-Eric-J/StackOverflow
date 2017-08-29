package com.hfad.stackoverflow;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

import static com.hfad.stackoverflow.SecondActivity.img;
import static com.hfad.stackoverflow.SecondActivity.item;
import static com.hfad.stackoverflow.SecondActivity.lin;
import static com.hfad.stackoverflow.SecondActivity.name1;
import static com.hfad.stackoverflow.SecondActivity.sc;
import static com.hfad.stackoverflow.SecondActivity.sub1;
import static com.hfad.stackoverflow.SecondActivity.taG;

public class ThirdActivity extends AppCompatActivity {

    CircleImageView cr;
    TextView tx1,tx2,tx3,tx4;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        cr= (CircleImageView) findViewById(R.id.circleImageView2);
        tx1= (TextView) findViewById(R.id.textName);
        tx2= (TextView) findViewById(R.id.textScore);
        tx3= (TextView) findViewById(R.id.textSubject);
        tx4= (TextView) findViewById(R.id.textTag);


        Picasso.with(this).load(img).resize(120,120).into(cr);
        tx1.setText("Name: "+name1);
        tx2.setText("Score: "+sc);
        tx3.setText("Title:  "+sub1);
        tx4.setText("Tags:  "+taG);
        Toast.makeText(ThirdActivity.this,"Question "+item+" Selected", Toast.LENGTH_SHORT).show();

    }
    public void search(View view){


        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(lin));
        startActivity(browserIntent);

    }
    public void click(View view)
    {


    }
}
