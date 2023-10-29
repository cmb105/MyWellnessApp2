package dte.masteriot.mdp.mywellnessapp.ui.acc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import dte.masteriot.mdp.mywellnessapp.databinding.FragmentAccBinding;
import dte.masteriot.mdp.mywellnessapp.ui.acc.AccViewModel;

public class AccFragment extends Fragment{
    private FragmentAccBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AccViewModel accViewModel =
                new ViewModelProvider(this).get(AccViewModel.class);

        binding = FragmentAccBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAcc;
        accViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}