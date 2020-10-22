package app.heyat.client.ui.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import app.heyat.client.R;
import app.heyat.client.base.BaseFragment;

public class SearchFragment extends BaseFragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_search, container, false);

        initialLayout(view);
        initial();

        return view;
    }

    private void initialLayout(View view) {

        TextView textView =view.findViewById(R.id.text_search);
        textView.setText("SearchFragment");
    }

    private void initial() {

    }
}