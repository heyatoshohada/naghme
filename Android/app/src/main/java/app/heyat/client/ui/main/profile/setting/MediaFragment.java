package app.heyat.client.ui.main.profile.setting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.heyat.client.R;
import app.heyat.client.base.BaseFragment;

public class MediaFragment extends BaseFragment {

    static MediaFragment newInstance() {

        Bundle args = new Bundle();

        MediaFragment fragment = new MediaFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_media, container, false);

        initialLayout(view);
        initial();

        return view;
    }

    private void initialLayout(View view) {

    }

    private void initial() {

    }
}
