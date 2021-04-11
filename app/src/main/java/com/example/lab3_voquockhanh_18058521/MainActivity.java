package com.example.lab3_voquockhanh_18058521;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private View layoutPreview,layoutChooseColor;
    private Button btnOption,btnCyan,btnRed,btnBlack,btnBlue,btnSubmit;
    private  TextView txtColorLabel,txtSuplierLabel;
    private TextView txtColor,txtSuplier,txtPrice;
    private ImageView imgPreview,imgHint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         layoutPreview=getLayoutInflater().inflate(R.layout.activity_main,null);
         layoutChooseColor=getLayoutInflater().inflate(R.layout.layout_2,null);
        setContentView(layoutPreview);

        imgPreview=layoutPreview.findViewById(R.id.imgpreview);

        btnOption=layoutPreview.findViewById(R.id.btnoption);
        btnOption.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnoption:{
                setContentView(layoutChooseColor);

                imgHint=layoutChooseColor.findViewById(R.id.imghint);

                txtColorLabel=layoutChooseColor.findViewById(R.id.txtcolorlabel);
                txtSuplierLabel=layoutChooseColor.findViewById(R.id.txtsuplierlabel);

                txtColor=layoutChooseColor.findViewById(R.id.txtcolor);
                txtSuplier=layoutChooseColor.findViewById(R.id.txtsuplier);
                txtPrice=layoutChooseColor.findViewById(R.id.txtprice);

                btnCyan=layoutChooseColor.findViewById(R.id.btncyan);
                btnCyan.setOnClickListener(this);
                btnRed=layoutChooseColor.findViewById(R.id.btnred);
                btnRed.setOnClickListener(this);
                btnBlack=layoutChooseColor.findViewById(R.id.btnblack);
                btnBlack.setOnClickListener(this);
                btnBlue=layoutChooseColor.findViewById(R.id.btnblue);
                btnBlue.setOnClickListener(this);
                btnSubmit=layoutChooseColor.findViewById(R.id.btnsubmit);
                btnSubmit.setOnClickListener(this);

                btnCyan.callOnClick();

                txtColorLabel.setVisibility(View.VISIBLE);
                txtSuplierLabel.setVisibility(View.VISIBLE);
                txtColor.setVisibility(View.VISIBLE);
                txtSuplier.setVisibility(View.VISIBLE);
                txtPrice.setVisibility(View.VISIBLE);
                break;
            }
            case  R.id.btncyan:{
                imgHint.setImageResource(R.drawable.vs_bac_1);
                txtColor.setText("xanh nhạt");
                txtSuplier.setText("Tiki trading");
                txtPrice.setText("1.790.000 đ");
                break;
            }
            case R.id.btnred:{
                imgHint.setImageResource(R.drawable.vs_red_a_2);
                txtColor.setText("đỏ");
                txtSuplier.setText("Tiki trading");
                txtPrice.setText("1.790.000 đ");
                break;
            }
            case R.id.btnblack:{
                imgHint.setImageResource(R.drawable.vsmart_black_star_1);
                txtColor.setText("đen");
                txtSuplier.setText("Tiki trading");
                txtPrice.setText("1.790.000 đ");
                break;
            }
            case R.id.btnblue:{
                imgHint.setImageResource(R.drawable.vsmart_live_xanh_2);
                txtColor.setText("xanh dương");
                txtSuplier.setText("Tiki trading");
                txtPrice.setText("1.790.000 đ");
                break;
            }
            case R.id.btnsubmit:{
                setContentView(layoutPreview);

                if(imgHint.getDrawable().getConstantState()==getResources().getDrawable(R.drawable.vs_bac_1).getConstantState()){
                   imgPreview.setImageResource(R.drawable.vs_bac_1);
                }
                else if(imgHint.getDrawable().getConstantState()==getResources().getDrawable(R.drawable.vs_red_a_2).getConstantState()){
                    imgPreview.setImageResource(R.drawable.vs_red_a_2);
                }
                else if(imgHint.getDrawable().getConstantState()==getResources().getDrawable(R.drawable.vsmart_black_star_1).getConstantState()){
                    imgPreview.setImageResource(R.drawable.vsmart_black_star_1);
                }
                else if(imgHint.getDrawable().getConstantState()==getResources().getDrawable(R.drawable.vsmart_live_xanh_2).getConstantState()){
                    imgPreview.setImageResource(R.drawable.vsmart_live_xanh_2);
                }
                break;
            }
        }
    }
}