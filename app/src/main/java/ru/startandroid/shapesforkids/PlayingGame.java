package ru.startandroid.shapesforkids;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.startandroid.shapesforkids.databinding.FragmentPlayingGameBinding;

public class PlayingGame extends Fragment {

    public PlayingGame() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private FragmentPlayingGameBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentPlayingGameBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    // we had better write these codes for onDestroyView
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}