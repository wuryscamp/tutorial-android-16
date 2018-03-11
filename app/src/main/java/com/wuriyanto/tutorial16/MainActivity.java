package com.wuriyanto.tutorial16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBarVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBarVolume = (SeekBar) findViewById(R.id.sb_volume);
        seekBarVolume.setMax(100);

        seekBarVolume.setOnSeekBarChangeListener(new MySeekBarChangeListener());
    }

    private class MySeekBarChangeListener implements SeekBar.OnSeekBarChangeListener {

        private EditText editTextResult;

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
            editTextResult = (EditText) findViewById(R.id.et_result);

            String result = "Volume : "+progress;
            editTextResult.setText(result);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }
}
