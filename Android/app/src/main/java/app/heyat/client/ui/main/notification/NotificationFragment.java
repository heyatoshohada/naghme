package app.heyat.client.ui.main.notification;

import android.os.Bundle;

import androidx.annotation.NonNull;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.heyat.client.R;
import app.heyat.client.base.BaseFragment;


public class NotificationFragment extends BaseFragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_notification, container, false);

        initialLayout(view);
        initial();

        return view;
    }

    private void initialLayout(View view) {
    }

    private void initial() {

    }
}