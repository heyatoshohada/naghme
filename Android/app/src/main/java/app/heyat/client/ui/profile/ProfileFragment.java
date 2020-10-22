package app.heyat.client.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import app.heyat.client.R;
import app.heyat.client.base.BaseFragment;

public class ProfileFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        initialLayout(view);
        initial();

        return view;
    }

    private void initialLayout(View view) {

        TextView textView =view.findViewById(R.id.text_profile);
        textView.setText("ProfileFragment");
    }

    private void initial() {

    }
}