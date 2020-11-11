package app.heyat.client.ui.main.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import app.heyat.client.ui.MainActivity;
import app.heyat.client.R;
import app.heyat.client.base.BaseFragment;
import app.heyat.client.ui.main.profile.setting.SettingFragment;

public class ProfileFragment extends BaseFragment {

    private MainActivity mainActivity;

    private TextView mTextViewUsername;
    private ImageView mImageViewSetting;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        initialLayout(view);
        initial();

        mainActivity = (MainActivity) getActivity();

        mImageViewSetting.setOnClickListener(v -> mainActivity.changeFragment(SettingFragment.newInstance(), "SettingFragment"));

        return view;
    }

    private void initialLayout(View view) {
        mTextViewUsername = view.findViewById(R.id.tv_username_fragment_profile);
        mImageViewSetting = view.findViewById(R.id.iv_setting_fragment_profile);
    }

    private void initial() {
        setSharedName("محمد حسین بابایی");
        if (getSharedName().length() != 0)
            mTextViewUsername.setText(getSharedName());
    }
}