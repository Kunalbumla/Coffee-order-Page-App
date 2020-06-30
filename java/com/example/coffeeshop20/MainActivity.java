package com.example.coffeeshop20;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int number_of_muffin = 0;
    int muffin_price = 25;
    int numberOfCoffees = 0;
    int Price = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        numberOfCoffees = numberOfCoffees + 1;
        display(numberOfCoffees);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        numberOfCoffees = numberOfCoffees - 1;
        display(numberOfCoffees);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment_muffin(View view) {
        number_of_muffin = number_of_muffin + 1;
        displaymuffins(number_of_muffin);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement_muffin(View view) {
        number_of_muffin = number_of_muffin - 1;
        displaymuffins(number_of_muffin);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(numberOfCoffees);
        displaymuffins(number_of_muffin);
        displayPrice(numberOfCoffees * Price + number_of_muffin * muffin_price);
    }


    /**
     * This method displays the given Muffins quantity value on the screen.
     */
    private void displaymuffins(int number) {
        TextView muffinsTextView = (TextView) findViewById(R.id.muffins_text_view);
        muffinsTextView.setText("" + number);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number)  {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(number));
    }


}
