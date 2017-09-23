package com.example.aincrad.android_project_01_seekbar_rgb;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class RGB_SeekBar extends AppCompatActivity {

    private int seekR, seekG, seekB;
    private TextView colorBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rgb__seek_bar);

        SeekBar sbR = (SeekBar) findViewById(R.id.seekBar_R);
        SeekBar sbG = (SeekBar) findViewById(R.id.seekBar_G);
        SeekBar sbB = (SeekBar) findViewById(R.id.seekBar_B);
        colorBox = (TextView) findViewById(R.id.Color_Box);


        sbR.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekR = progress;

                colorChange();
            }
        });

        sbG.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekG = progress;

                colorChange();
            }
        });

        sbB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekB = progress;

                colorChange();
            }
        });

        colorBox.setBackgroundColor(Color.rgb(seekR, seekG, seekB));
        colorBox.setText("("+seekR+","+seekG+","+seekB+")");
        colorBox.setTextColor(Color.rgb(255-seekR,255-seekG,255-seekB));


    }
    private void colorChange() {
        int color = Color.rgb(seekR, seekG, seekB);
        int reverseColor = Color.rgb(255-seekR,255-seekG,255-seekB);
        colorBox.setBackgroundColor(color);
        colorBox.setText("("+seekR+","+seekG+","+seekB+")");
        colorBox.setTextColor(reverseColor);
    }
}
