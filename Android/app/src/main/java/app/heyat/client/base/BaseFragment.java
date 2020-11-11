package app.heyat.client.base;

import android.content.SharedPreferences;

import androidx.fragment.app.Fragment;

import static android.content.Context.MODE_PRIVATE;
import static app.heyat.client.base.BaseActivity.NAME_SHARED_PREFERENCES;
import static app.heyat.client.base.BaseActivity.PHONE_SHARED_PREFERENCES;

public class BaseFragment extends Fragment {

    //    Name
    protected void setSharedName(String name) {
        SharedPreferences.Editor editor = requireActivity().getSharedPreferences(NAME_SHARED_PREFERENCES, MODE_PRIVATE).edit();
        editor.putString("name", name);
        editor.apply();
    }

    protected String getSharedName() {
        return requireActivity().getSharedPreferences(NAME_SHARED_PREFERENCES, MODE_PRIVATE).getString("name", "");
    }

    //    Phone
    protected void setSharedPhone(String phone) {
        SharedPreferences.Editor editor = requireActivity().getSharedPreferences(PHONE_SHARED_PREFERENCES, MODE_PRIVATE).edit();
        editor.putString("phone", phone);
        editor.apply();
    }

    protected String getSharedPhone() {
        return requireActivity().getSharedPreferences(PHONE_SHARED_PREFERENCES, MODE_PRIVATE).getString("phone", "");
    }

}
