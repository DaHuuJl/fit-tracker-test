package ru.fitness.tracker.ui.training;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import ru.fitness.tracker.databinding.FragmentTrainingBinding;

public class TrainingFragment extends Fragment {

    private FragmentTrainingBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TrainingViewModel trainingViewModel =
                new ViewModelProvider(this).get(TrainingViewModel.class);

        binding = FragmentTrainingBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}