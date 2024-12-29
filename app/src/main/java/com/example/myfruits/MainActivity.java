package com.example.myfruits;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bSimple, bCustom, bRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bSimple=findViewById(R.id.bSimple);
        bCustom=findViewById(R.id.bCustom);
        bRecycler=findViewById(R.id.bCustom3);
        bSimple.setOnClickListener(this);
        bCustom.setOnClickListener(this);
        bRecycler.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_main,menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item) {
            int itemID=item.getItemId();

            if(itemID==R.id.back){
                finish();
            }
            return super.onOptionsItemSelected(item);
        }

    @Override
    public void onClick(View v) {
        if(v==bSimple)
        {
            Intent go=new Intent(this, SimpleDesignList.class);
            startActivity(go);
        }

        if(v==bCustom)
        {
            Intent go=new Intent(this, CustomDesignList.class);
            startActivity(go);
        }
        if(v==bRecycler)
        {
            Intent go=new Intent(this, RecyclerViewList.class);
            startActivity(go);
        }
    }
}