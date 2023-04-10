package com.cookandroid.project4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    Switch swiAgree;
    RadioGroup rGroup1;
    RadioButton rdoc8, rdocx, rdomus;
    Button btnout, btndacapo;
    ImageView imgCAR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("맘에 드는 차종 고르");

        text1 = (TextView) findViewById(R.id.Text1);
        swiAgree = (Switch) findViewById(R.id.START);
        text2 = (TextView) findViewById(R.id.Text2);
        rGroup1 = (RadioGroup) findViewById(R.id.Rground1);
        rdoc8 = (RadioButton) findViewById(R.id.RdoC8);
        rdocx = (RadioButton) findViewById(R.id.RdoCX);
        rdomus = (RadioButton) findViewById(R.id.RdoMUS);

        btnout = (Button) findViewById(R.id.BtnOUT);
        btndacapo = (Button) findViewById(R.id.BtnDacapo);
        imgCAR = (ImageView) findViewById(R.id.Imgcar);

        swiAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(swiAgree.isChecked() == true) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnout.setVisibility(View.VISIBLE);
                    btndacapo.setVisibility(View.VISIBLE);
                    imgCAR.setVisibility(View.VISIBLE);
                } else
                {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btndacapo.setVisibility(View.VISIBLE);
                    btnout.setVisibility(View.VISIBLE);
                    imgCAR.setVisibility(View.VISIBLE);
                }
            }
        });

        rdoc8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(rdoc8.isChecked() == true) {
                    imgCAR.setImageResource(R.drawable.car);
                }
            }
        });

        rdocx.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(rdocx.isChecked() == true) {
                    imgCAR.setImageResource(R.drawable.car2);
                }
            }
        });

        rdomus.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(rdomus.isChecked() == true) {
                    imgCAR.setImageResource(R.drawable.car3);
                }
            }
        });

        btnout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btndacapo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                return;
            }
        });



    }
}