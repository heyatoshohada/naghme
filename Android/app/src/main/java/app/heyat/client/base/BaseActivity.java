package app.heyat.client.base;

import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    private static final String LOGIN_SHARED_PREFERENCES = "login_shared_preferences";

    //    Login
    protected void setSharedLogin(boolean isLogin) {
        SharedPreferences.Editor editor = getSharedPreferences(LOGIN_SHARED_PREFERENCES, MODE_PRIVATE).edit();
        editor.putBoolean("login", isLogin);
        editor.apply();
    }

    protected boolean getSharedLogin() {
        return getSharedPreferences(LOGIN_SHARED_PREFERENCES, MODE_PRIVATE).getBoolean("login", false);
    }
}
