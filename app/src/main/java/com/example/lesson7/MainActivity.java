package com.example.lesson7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.media.MediaPlayer;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Date date = new Date();
    Button button1;
    ImageButton button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void someMethod(View theButton) {
        button1=(Button)findViewById(R.id.button1);
        button1.setText("TESTING");
    }

    public void ShowTextButton2AndPlaySound(View theButton) {
        Toast toast1 =
                Toast.makeText(getApplicationContext(),
                        "Error!!", Toast.LENGTH_SHORT);
        toast1.show();
        final MediaPlayer sound = MediaPlayer.create(this, R.raw.minecraft);
        sound.start();
        TextView textreset=findViewById(R.id.field);
        textreset.setText("123");

    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        CheckBox cb;
        cb=(CheckBox)findViewById(R.id.check);
        switch(view.getId()) {
            case R.id.check:
                if (checked){
                    cb.setText("This checkbox is: checked");
                }else{
                    cb.setText("This checkbox is: unchecked");
                }
                break;
        }
    }


    public void RadioChangeColor(View view){
        TextView textChange=findViewById(R.id.Change_letter_color);
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radio1:
                if (checked)
                    textChange.setTextColor(Color.parseColor("#D9D615"));
                    break;
            case R.id.radio2:
                if (checked)
                    textChange.setTextColor(Color.parseColor("#3546A7"));
                    break;
            case R.id.radio3:
                if (checked)
                    textChange.setTextColor(Color.parseColor("#E21DC8"));
                    break;
        }

    }

}
