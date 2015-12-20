package com.n9xkun.iziroi.flowerorder;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private TextView quantityTxt, priceTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //use layout xml
        setContentView(R.layout.activity_main);

        //find quantity
        quantityTxt = (TextView) findViewById(R.id.quantityTxt);
        priceTxt = (TextView) findViewById(R.id.priceTxt);
    }

    /**
     *
     * @param num
     * @return
     */
    public int calculatePrice(int num, int pricePerUnit){
        //logic: *5
        //logic: 3 free
        int price = num * pricePerUnit;

        num++;
        Log.d("flower_tmp", num+ "coffees");

        return price;
    }

    public void orderFlower(View v){
        //localy variable
        //int numberOfCoffees = 3;
        //displayOrder(numberOfCoffees);
        int price = calculatePrice(numberOfCoffees, 5);
        Log.d("flower", numberOfCoffees+ " coffees");
        this.displayPrice(price);
    }

    private void displayPrice(int price) {
        String mes = createSummary(price);

        //text
        priceTxt.setText(mes);

        //change to red color
        priceTxt.setTextColor(Color.BLUE);

        //flash message
        displayToast(mes);
    }

    private void displayToast(String mes) {
        Toast.makeText(this, mes, Toast.LENGTH_LONG).show(); //chaining
    }

    private String createSummary(int price) {
        String messagePrice = "Hoang\n";
        messagePrice += "Quantity: " + numberOfCoffees + "\n";
        messagePrice += "Total price:";

        //display order number on text
        //using format currency
        messagePrice += NumberFormat.getCurrencyInstance().format(price)+".";
        messagePrice += "\nThank you.";

        return messagePrice;
    }

    private void displayOrder(int order) {
        //display order number on text
        quantityTxt.setText(order+" unit");

        //change to red color
        quantityTxt.setTextColor(Color.RED);

        //bigger if order = 100
    }

    public void increment(View v){
        //+1
        numberOfCoffees = numberOfCoffees + 1;
        displayOrder(numberOfCoffees);
    }

    public void decrement(View v){
        //check if=1 , do nothing
        if(numberOfCoffees > 1){
            numberOfCoffees--;
        }

        displayOrder(numberOfCoffees);
    }

    //global
    int numberOfCoffees = 3;
}
