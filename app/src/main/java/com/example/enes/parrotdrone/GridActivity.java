package com.example.enes.parrotdrone;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GridActivity extends AppCompatActivity {

    Button yukari,asagi,sol,sag,donme;
    Dialog yukaripopup,asagipopup,solpopup,sagpopup,donmepopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        yukari=findViewById(R.id.yukari);
        asagi=findViewById(R.id.asagi);
        sol=findViewById(R.id.sol);
        sag=findViewById(R.id.sag);
        donme=findViewById(R.id.donme);

        yukaripopup=new Dialog(this);
        asagipopup=new Dialog(this);
        solpopup=new Dialog(this);
        sagpopup=new Dialog(this);
        donmepopup=new Dialog(this);



        yukari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yukaripopup.setContentView(R.layout.yukaripopup);

                Button btntamam;
                btntamam=yukaripopup.findViewById(R.id.btnbaglan);
                btntamam.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        yukaripopup.dismiss();
                    }
                });
                yukaripopup.show();
            }
        });

        asagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                asagipopup.setContentView(R.layout.asagipopup);

                Button btntamam;
                btntamam=asagipopup.findViewById(R.id.btnbaglan);
                btntamam.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        asagipopup.dismiss();
                    }
                });
                asagipopup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                asagipopup.show();
            }
        });

        sol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                solpopup.setContentView(R.layout.solpopup);

                Button btntamam;
                btntamam=solpopup.findViewById(R.id.btnbaglan);
                btntamam.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        solpopup.dismiss();
                    }
                });
                solpopup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                solpopup.show();
            }
        });

        sag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sagpopup.setContentView(R.layout.sagpopup);

                Button btntamam;
                btntamam=sagpopup.findViewById(R.id.btnbaglan);
                btntamam.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sagpopup.dismiss();
                    }
                });
                sagpopup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                sagpopup.show();
            }
        });

        donme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                donmepopup.setContentView(R.layout.donmepopup);

                Button btntamam;
                btntamam=donmepopup.findViewById(R.id.btnbaglan);
                btntamam.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        donmepopup.dismiss();
                    }
                });
                donmepopup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                donmepopup.show();
            }
        });

    }
}
