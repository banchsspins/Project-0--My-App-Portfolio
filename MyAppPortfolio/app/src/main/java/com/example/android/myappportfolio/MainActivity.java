package com.example.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    /**
     * This method displays the message for Spotify Button
     * Toast code modified from example on AndroidDeveloper website:
     * http://developer.android.com/guide/topics/ui/notifiers/toasts.html
     */
    public void displayMesg1(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Spotify streamer";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    /**
     * This method displays the message for Scores App Button
     * Toast code modified from example on AndroidDeveloper website:
     * http://developer.android.com/guide/topics/ui/notifiers/toasts.html
     */
    public void displayMesg2(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Scores App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    /**
     * This method displays the message for Library App Button
     * Toast code modified from example on AndroidDeveloper website:
     * http://developer.android.com/guide/topics/ui/notifiers/toasts.html
     */
    public void displayMesg3(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Library App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    /**
     * This method displays the message for Build it Bigger Button
     * Toast code modified from example on AndroidDeveloper website:
     * http://developer.android.com/guide/topics/ui/notifiers/toasts.html
     */
    public void displayMesg4(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Build it Bigger";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    /**
     * This method displays the message for XYZ Reader button
     * Toast code modified from example on AndroidDeveloper website:
     * http://developer.android.com/guide/topics/ui/notifiers/toasts.html
     */
    public void displayMesg5(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch XYZ Reader";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    /**
     * This method displays the message for Capstone Button
     * Toast code modified from example on AndroidDeveloper website:
     * http://developer.android.com/guide/topics/ui/notifiers/toasts.html
     */
    public void displayMesg6(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my capstone app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
