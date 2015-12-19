package vn.techmaster.orderflower;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class FlowerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_flower);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        //77 nguoi uong 2 coc
        //78 uong  1 coc
        String message = " unit ordered";

        int numberOfCoffeeOrdered = 6; //type name = value
        display(numberOfCoffeeOrdered); //3 coc
        displayPrice(numberOfCoffeeOrdered * 5);

        Toast.makeText(FlowerActivity.this, numberOfCoffeeOrdered + message, Toast.LENGTH_SHORT).show();
    }

    private void displayPrice(int price) {
        //get price text view
        TextView priceText = (TextView) findViewById(R.id.priceText);

        //settext
        priceText.setText(NumberFormat.getCurrencyInstance().format(price));
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        //binde Text of Quantity ->quantityTextView
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantityText);
        quantityTextView.setText("" + number);
    }
}
