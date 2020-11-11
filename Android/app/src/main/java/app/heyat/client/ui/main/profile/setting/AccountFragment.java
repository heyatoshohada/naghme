package app.heyat.client.ui.main.profile.setting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Objects;

import app.heyat.client.R;
import app.heyat.client.base.BaseFragment;
import app.heyat.client.ui.MainActivity;
import app.heyat.client.ui.login.LoginActivity;
import app.heyat.client.ui.main.profile.EditFragment;

public class AccountFragment extends BaseFragment {

    private TextView mTextViewLogout,
            mTextViewEdit;

    static AccountFragment newInstance() {

        Bundle args = new Bundle();

        AccountFragment fragment = new AccountFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account, container, false);

        initialLayout(view);
        initial();

        MainActivity mainActivity = (MainActivity) getActivity();

        mTextViewLogout.setOnClickListener(v -> {
            setSharedName("");
            setSharedPhone("");
            startActivity(LoginActivity.newIntent(requireActivity()));
            Objects.requireNonNull(mainActivity).finish();
        });

        mTextViewEdit.setOnClickListener(v -> Objects.requireNonNull(mainActivity).changeFragment(EditFragment.newInstance(), "EditFragment"));

        return view;
    }

    private void initialLayout(View view) {
        mTextViewLogout = view.findViewById(R.id.tv_logout_fragment_account);
        mTextViewEdit = view.findViewById(R.id.tv_edit_fragment_account);
    }

    private void initial() {

    }
}
