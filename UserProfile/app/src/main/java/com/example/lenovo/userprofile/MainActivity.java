package com.example.lenovo.userprofile;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView name;
    private TextView birthday;
    private TextView country;
    private ImageView picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        birthday = findViewById(R.id.birthday);
        country = findViewById(R.id.country);
        /**
         * This method displays the profile picture on the screen. The placeholder profile picture of the mona lisa was downloaded with permission from Pexels (https://www.pexels.com/collections/99tbodh/).
         */
        ImageView picture = (ImageView) findViewById(R.id.profile_picture);
        picture.setImageResource(R.drawable.monalisa);
    }

    /**
     * This method displays the given name on the screen.
     */
    private void displayName(String message) {
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(message);
    }

    /**
     * This method displays the given birthday on the screen.
     */
    private void displayBirthday(String message) {
        TextView birthday = (TextView) findViewById(R.id.birthday);
        birthday.setText(message);
    }

    /**
     * This method displays the given country on the screen.
     */
    private void displayCountry(String message) {
        TextView country = (TextView) findViewById(R.id.country);
        country.setText(message);
    }

    /**
     * This method is called when the user touches the screen outside the edit text field.
     */
    public void closeKeyboard(View view) {
        View v = this.getCurrentFocus();
        if (v != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
        }
    }
}
