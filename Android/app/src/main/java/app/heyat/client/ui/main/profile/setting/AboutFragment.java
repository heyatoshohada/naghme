package app.heyat.client.ui.main.profile.setting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.heyat.client.R;
import app.heyat.client.base.BaseFragment;

public class AboutFragment extends BaseFragment {

    public static AboutFragment newInstance() {

        Bundle args = new Bundle();

        AboutFragment fragment = new AboutFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        initialLayout(view);
        initial();

        return view;
    }

    private void initialLayout(View view) {

    }

    private void initial() {

    }
}
