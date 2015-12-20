package vn.techmaster.orderflower;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class FlowerActivity extends Activity {

    TextView priceText, quantityTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_flower);

        //init UI
        priceText = (TextView) findViewById(R.id.priceText);
        quantityTextView = (TextView) findViewById(R.id.quantityText);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        //77 nguoi uong 2 coc
        //78 uong  1 coc
        String message = "\nChristmast\nThankyou.";
        message += "\nSee you again"; //message = message + " ..."

        int numberOfCoffeeOrdered = 6; //type name = value
        String mesToaster = numberOfCoffeeOrdered + " "+ message;

        String messagePrice = "Total count " + numberOfCoffeeOrdered + " coffees." + message;

        /*
        display(numberOfCoffeeOrdered); //3 coc
        displayPrice(numberOfCoffeeOrdered * 5);
        */
        displayMessage(messagePrice);

        //flash messenger
        Toast toaster = Toast.makeText(FlowerActivity.this, mesToaster, Toast.LENGTH_SHORT);
        toaster.show();
    }

    private void displayPrice(int price) {
        //settext
        priceText.setText(NumberFormat.getCurrencyInstance().format(price));
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        //binde Text of Quantity ->quantityTextView
        quantityTextView.setText("" + number);
    }

    public void displayMessage(String message){
        //settext
        priceText.setText(message);
    }


}
