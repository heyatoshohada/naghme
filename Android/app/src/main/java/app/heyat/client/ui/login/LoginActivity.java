package app.heyat.client.ui.login;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

import app.heyat.client.MainActivity;
import app.heyat.client.R;
import app.heyat.client.base.BaseActivity;

public class LoginActivity extends BaseActivity {

    private Button mButtonLogin;
    private TextInputLayout mTextInputLayoutName,
            mTextInputLayoutPhone;
    private TextInputEditText mEditTextName,
            mEditTextPhone;

    public static Intent newIntent(Context context) {
        return new Intent(context, LoginActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hideSystemUi();
        setContentView(R.layout.activity_login);

        initialView();
        initial();

        mButtonLogin.setOnClickListener(v -> login());

        mEditTextName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mTextInputLayoutName.setErrorEnabled(false);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mEditTextPhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mTextInputLayoutPhone.setErrorEnabled(false);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void initialView() {
        mButtonLogin = findViewById(R.id.btn_login_activity_login);

        mTextInputLayoutName = findViewById(R.id.til_name_activity_login);
        mTextInputLayoutPhone = findViewById(R.id.til_phone_activity_login);

        mEditTextName = findViewById(R.id.tiet_name_activity_login);
        mEditTextPhone = findViewById(R.id.tiet_phone_activity_login);
    }

    private void initial() {

    }

    private void login() {
        String
                name = Objects.requireNonNull(mEditTextName.getText()).toString().trim(),
                phone = Objects.requireNonNull(mEditTextPhone.getText()).toString().trim();

        if (name.length() == 0) {
            mTextInputLayoutName.setError("نام نمیتواند خالی باشد!");
            return;
        }

        if (phone.length() == 0) {
            mTextInputLayoutPhone.setError("شماره موبایل نمیتواند خالی باشد!");
            return;
        }

        setSharedLogin(true);
        setSharedName(name);
        setSharedPhone(name);

        startActivity(MainActivity.newIntent(this));

        finish();
    }

    private void hideSystemUi() {
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

//        View decorView = getWindow().getDecorView();
//// Hide both the navigation bar and the status bar.
//// SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
//// a general rule, you should design your app to hide the status bar whenever you
//// hide the navigation bar.
//        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
//                | View.SYSTEM_UI_FLAG_FULLSCREEN;
//        decorView.setSystemUiVisibility(uiOptions);
//
//        decorView = getWindow().getDecorView();
//// Hide the status bar.
//        uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
//        decorView.setSystemUiVisibility(uiOptions);
//// Remember that you should never show the action bar if the
//// status bar is hidden, so hide that too if necessary.
//        ActionBar actionBar = getActionBar();
//        Objects.requireNonNull(actionBar).hide();
    }
}
