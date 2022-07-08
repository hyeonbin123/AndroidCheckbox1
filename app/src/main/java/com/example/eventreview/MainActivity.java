package com.example.eventreview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2;
    CheckBox chkAgree;
    RadioGroup rg1;
    RadioButton rD,rC,rR;
    Button btnOK;
    ImageView imgPet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.text1);
        t2 = findViewById(R.id.text2);
        chkAgree = findViewById(R.id.chkAgree);
        rg1 = findViewById(R.id.rgroup1);
        rD = findViewById(R.id.rdoDog);
        rC = findViewById(R.id.rdoCat);
        rR = findViewById(R.id.rdoRabbit);
        btnOK = findViewById(R.id.btnOK);
        imgPet = findViewById(R.id.imgPet);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkAgree.isChecked()==true){
                    t2.setVisibility(View.VISIBLE);
                    rg1.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }else{
                    t2.setVisibility(View.INVISIBLE);
                    rg1.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (rg1.getCheckedRadioButtonId()){
                    case R.id.rdoDog:
                        imgPet.setImageResource(R.drawable.dog);
                        break;
                    case R.id.rdoCat:
                        imgPet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.rdoRabbit:
                        imgPet.setImageResource(R.drawable.rabbit);
                        break;
                }
            }
        });
    }
}