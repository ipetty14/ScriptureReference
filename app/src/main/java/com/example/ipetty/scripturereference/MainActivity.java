package com.example.ipetty.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.ipetty.scripturereference";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        EditText editText2 = (EditText) findViewById(R.id.edit_message2);
        EditText editText3 = (EditText) findViewById(R.id.edit_message3);

        String book = editText.getText().toString();
        String chapter = editText2.getText().toString();
        String verse = editText3.getText().toString();
        String message = "Your favorite scripture is: " + book + " " + chapter + ":" + verse;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
