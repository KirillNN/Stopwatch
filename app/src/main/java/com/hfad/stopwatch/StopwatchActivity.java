package com.hfad.stopwatch;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StopwatchActivity extends Activity {
    private int seconds = 0;
    private boolean running;
    TextView timeView = findViewById(R.id.timeView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
    }

    public void onClickStart(View view) {
        running = true;
    }

    public void onClickStop(View view) {
        running = false;
    }

    public void onClickReset(View view) {
        running = false;
        seconds = 0;
    }
    void runTimer() {

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        String time = String.format("%d:%02d:%02d", hours, minutes, seconds);
        timeView.setText(time);
        if (running) {
            seconds++;
        }

    }
}
