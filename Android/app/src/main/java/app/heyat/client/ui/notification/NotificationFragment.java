package app.heyat.client.ui.notification;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

        TextView textView =view.findViewById(R.id.text_notification);
        textView.setText("NotificationFragment");
    }

    private void initial() {

    }
}