package app.heyat.client.ui.main.profile.setting;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.Objects;

import app.heyat.client.R;
import app.heyat.client.ui.MainActivity;

public class SettingFragment extends Fragment {

    private ImageView mImageViewBack;
    private TextView mTextViewAccount,
            mTextViewMedia,
            mTextViewCall,
            mTextViewAbout;

    public static SettingFragment newInstance() {

        Bundle args = new Bundle();

        SettingFragment fragment = new SettingFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting, container, false);

        initialView(view);
        initial();

        MainActivity mainActivity = (MainActivity) getActivity();
        mImageViewBack.setOnClickListener(v -> Objects.requireNonNull(mainActivity).onBackPressed());

        mTextViewAccount.setOnClickListener(v -> Objects.requireNonNull(mainActivity).changeFragment(AccountFragment.newInstance(), "AccountFragment"));
        mTextViewMedia.setOnClickListener(v -> Objects.requireNonNull(mainActivity).changeFragment(MediaFragment.newInstance(), "MediaFragment"));
        mTextViewAbout.setOnClickListener(v -> Objects.requireNonNull(mainActivity).changeFragment(AboutFragment.newInstance(), "AboutFragment"));

        mTextViewCall.setOnClickListener(v -> call());

        return view;
    }

    private void initialView(View view) {
        mImageViewBack = view.findViewById(R.id.iv_back_fragment_setting);
        mTextViewAccount = view.findViewById(R.id.tv_account_fragment_setting);
        mTextViewMedia = view.findViewById(R.id.tv_media_fragment_account);
        mTextViewCall = view.findViewById(R.id.tv_call_fragment_account);
        mTextViewAbout = view.findViewById(R.id.tv_about_fragment_account);
    }

    private void initial() {

    }

    private void call() {
        String phone = "09211385519";
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
        startActivity(intent);
    }
}
