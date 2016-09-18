package com.example.developer.coffeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity=3;
    EditText orderer;
    Button button;
    CheckBox whipped;
    CheckBox chclate;
    TextView price_text_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view){

        displayPrice(quantity*5);
        EditText orderer = (EditText) findViewById(R.id.edittext_orderename);
        String name =orderer.getText().toString();
        CheckBox whipped =(CheckBox) findViewById(R.id.checkbox_whippedcream);
        String forwhipped = whipped.getText().toString();
        CheckBox chclate =(CheckBox) findViewById(R.id.checkbox_coclate);
        String forchoclate = whipped.getText().toString();
        price_text_view.setText(name);
        price_text_view.setText(forwhipped);
        price_text_view.setText(forchoclate);
    }
    public void increment(View view){

        quantity = quantity+1;
        display(quantity);

    }
    public void decrement(View view){

        quantity = quantity-1;
        display(quantity);

    }
    public void display(int number){
        TextView quantityTextView =(TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(" " +number);
    }
    public void displayPrice(int number){
        TextView priceTextView =(TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number) );
    }
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_whippedcream:
                if (checked)
                    price_text_view.setText("Whipped Cream?\t yes");
               else
                    price_text_view.setText("Whipped Cream?\t No");
               break;
           case R.id.checkbox_coclate:
               if (checked)
                   price_text_view.setText("Choclate?\t yes");
               else
                   price_text_view.setText("Choclate?\t No");
                break;


        }
    }

}
