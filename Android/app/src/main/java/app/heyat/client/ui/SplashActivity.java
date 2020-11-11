package app.heyat.client.ui;

import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

import app.heyat.client.R;
import app.heyat.client.base.BaseActivity;
import app.heyat.client.ui.login.LoginActivity;

public class SplashActivity extends BaseActivity {

    private ImageView mImageViewMain;
//    private ProgressBar mProgressBarMain;
//    private TextView mTextViewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initialLayout();
        initial();
    }

    private void initialLayout() {
        mImageViewMain = findViewById(R.id.iv_main_activity_splash);
//        mProgressBarMain = findViewById(R.id.pb_main_activity_splash);
//        mTextViewMain = findViewById(R.id.tv_main_activity_splash);
    }

    private void initial() {
//        mProgressBarMain.setVisibility(View.VISIBLE);

        AlphaAnimation start = new AlphaAnimation(0.0f, 1.0f);
        start.setDuration(2000);
        start.setFillAfter(true);
        mImageViewMain.startAnimation(start);

        new Handler().postDelayed(() -> {
            AlphaAnimation end = new AlphaAnimation(1.0f, 0.0f);
            end.setDuration(2000);
            end.setFillAfter(true);
            mImageViewMain.startAnimation(end);
        }, 2000);


        new Handler().postDelayed(this::start, 4000);
    }

    private void start() {
        if (getSharedLogin())
            startActivity(MainActivity.newIntent(this));
        else
            startActivity(LoginActivity.newIntent(this));

        finish();
    }

}
