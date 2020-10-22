package app.heyat.client.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import app.heyat.client.R;
import app.heyat.client.base.BaseFragment;

public class HomeFragment extends BaseFragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        initialLayout(view);
        initial();

        return view;
    }

    private void initialLayout(View view) {

        TextView textView =view.findViewById(R.id.text_home);
        textView.setText("HomeFragment");
    }

    private void initial() {

    }
}
