package com.sangeeta.qrcodescanner;

import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class product_details extends AppCompatActivity {

    TextView code, name, price;

    SharedPreferences sharedPreferences;
    private static final String SHARED_PREF_NAME ="mypref";
    private static final String KEY_CODE ="code";
    private static final String KEY_NAME ="name";
    private static final String KEY_PRICE ="price";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);


        name = (TextView)findViewById(R.id.name);
        code = (TextView)findViewById(R.id.code);
        price = (TextView)findViewById(R.id.price);


        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        String code_s = sharedPreferences.getString(KEY_CODE,null);
        String name_s = sharedPreferences.getString(KEY_NAME,null);
        String price_s = sharedPreferences.getString(KEY_PRICE,null);


        code.setText(code_s);
        name.setText(name_s);
        price.setText(price_s);
    }

    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(product_details.this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
    }
}