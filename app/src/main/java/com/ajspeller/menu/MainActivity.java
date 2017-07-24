package com.ajspeller.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView item1 = (TextView) findViewById(R.id.menu_item_1);
        Log.d(getClass().getSimpleName(), "printToLogs: " + item1.getText());

        // Find second menu item TextView and print the text to the logs
        TextView item2 = (TextView) findViewById(R.id.menu_item_2);
        Log.d(getClass().getSimpleName(), "printToLogs: " + item2.getText());

        // Find third menu item TextView and print the text to the logs
        TextView item3 = (TextView) findViewById(R.id.menu_item_3);
        Log.d(getClass().getSimpleName(), "printToLogs: " + item3.getText());
    }
}