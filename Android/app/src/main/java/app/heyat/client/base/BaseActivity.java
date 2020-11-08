package app.heyat.client.base;

import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    private static final String LOGIN_SHARED_PREFERENCES = "login_shared_preferences";
    private static final String NAME_SHARED_PREFERENCES = "name_shared_preferences";
    private static final String PHONE_SHARED_PREFERENCES = "phone_shared_preferences";

    //    Login
    protected void setSharedLogin(boolean isLogin) {
        SharedPreferences.Editor editor = getSharedPreferences(LOGIN_SHARED_PREFERENCES, MODE_PRIVATE).edit();
        editor.putBoolean("login", isLogin);
        editor.apply();
    }

    protected boolean getSharedLogin() {
        return getSharedPreferences(LOGIN_SHARED_PREFERENCES, MODE_PRIVATE).getBoolean("login", false);
    }

    //    Name
    protected void setSharedName(String name) {
        SharedPreferences.Editor editor = getSharedPreferences(NAME_SHARED_PREFERENCES, MODE_PRIVATE).edit();
        editor.putString("name", name);
        editor.apply();
    }

    protected String getSharedName() {
        return getSharedPreferences(NAME_SHARED_PREFERENCES, MODE_PRIVATE).getString("name", "");
    }

    //    Phone
    protected void setSharedPhone(String phone) {
        SharedPreferences.Editor editor = getSharedPreferences(PHONE_SHARED_PREFERENCES, MODE_PRIVATE).edit();
        editor.putString("phone", phone);
        editor.apply();
    }

    protected String getSharedPhone() {
        return getSharedPreferences(PHONE_SHARED_PREFERENCES, MODE_PRIVATE).getString("phone", "");
    }
}
