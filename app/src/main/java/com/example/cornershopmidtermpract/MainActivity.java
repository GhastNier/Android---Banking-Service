package com.example.cornershopmidtermpract;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double milkCost = 3.00,eggCost = 2.00,beefCost = 23.00,sodaCost = 1.00,cookieCost = 2.50,fruitCost = 6.50,veggiesCost = 4.00;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkout();
    }

    public void checkout() {
        Button checkout = (Button) findViewById(R.id.checkoutBtn);
        checkout.setOnClickListener(view -> checkOutTotal());
    }

    private void checkOutTotal() {
        double total = checkBeefQty() +
                checkCookieQty() +
                checkEggQty() +
                checkFruitQty() +
                checkSodaQty() +
                checkMilkQty() +
                checkVeggiesQty();
        TextView tv = (TextView) (findViewById(R.id.total));
        Log.println(Log.INFO,"Milk Value",String.valueOf(checkMilkQty()));
        String s = String.valueOf(total);
        tv.setText(s+"0$");
    }

    private double checkMilkQty() {
        double qty = 0;
        CheckBox cb = (CheckBox) findViewById(R.id.milkAdd);
        TextView tv = (TextView) findViewById(R.id.milkQty);
        if (cb.isChecked()) {
            qty = Double.parseDouble(tv.getText().toString());
            return milkCost * qty;
        } else return qty;
    }

    private double checkEggQty() {
        double qty = 0;
        CheckBox cb = (CheckBox) findViewById(R.id.eggAdd);
        TextView tv = (TextView) findViewById(R.id.eggQty);
        if (cb.isChecked())  {
            qty = Double.parseDouble(tv.getText().toString());
            return eggCost * qty;
        } else return qty;
    }

    private double checkBeefQty() {
        double qty = 0;
        TextView tv = (TextView) findViewById(R.id.beefQty);
        CheckBox cb = (CheckBox) findViewById(R.id.beefAdd);
        if (cb.isChecked())  {
            qty = Double.parseDouble(tv.getText().toString());
            return qty * beefCost;
        } else return qty;
    }

    private double checkSodaQty() {
        double qty = 0;
        CheckBox cb = (CheckBox) findViewById(R.id.sodaAdd);
        TextView tv = (TextView) findViewById(R.id.sodaQty);
        if (cb.isChecked()) {
            qty = Double.parseDouble(tv.getText().toString());
            return qty * sodaCost;
        } else return qty;
    }

    private double checkCookieQty() {
        double qty = 0;
        CheckBox cb = (CheckBox) findViewById(R.id.cookieAdd);
        TextView tv = (TextView) findViewById(R.id.cookieQty);
        if (cb.isChecked()) {
            qty = Double.parseDouble(tv.getText().toString());
            return cookieCost * qty;
        } else return qty;
    }

    private double checkFruitQty() {
        double qty = 0;
        CheckBox cb = (CheckBox) findViewById(R.id.fruitAdd);
        TextView tv = (TextView) findViewById(R.id.fruitQty);
        if (cb.isChecked()) {
            qty = Double.parseDouble(tv.getText().toString());
            return qty * fruitCost;
        } else return qty;
    }

    private double checkVeggiesQty() {
        double qty = 0;
        CheckBox cb = (CheckBox) findViewById(R.id.veggiesAdd);
        TextView tv = (TextView) findViewById(R.id.veggiesQty);
        if (cb.isChecked()) {
            qty = Double.parseDouble(tv.getText().toString());
            return qty * veggiesCost;
        } else return qty;
    }

}
