package app.heyat.client;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import app.heyat.client.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    private ProgressBar mProgressBarMain;
    private TextView mTextViewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initialLayout();
        initial();
    }

    private void initialLayout() {
        mProgressBarMain = findViewById(R.id.pb_main_activity_splash);
        mTextViewMain = findViewById(R.id.tv_main_activity_splash);
    }

    private void initial() {
        mProgressBarMain.setVisibility(View.VISIBLE);

        new Handler().postDelayed(this::start, 2000);
    }

    private void start() {
        mProgressBarMain.setVisibility(View.GONE);

        new Handler().postDelayed(() -> {
            startActivity(MainActivity.newIntent(this));
            finish();
        }, 1000);

    }

}
