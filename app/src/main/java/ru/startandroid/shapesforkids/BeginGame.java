package ru.startandroid.shapesforkids;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ru.startandroid.shapesforkids.databinding.FragmentBeginGameBinding;

public class BeginGame extends Fragment {

    public BeginGame() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private FragmentBeginGameBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentBeginGameBinding.inflate(inflater, container, false);

        // add animation to navOptions object
        NavOptions navOptions = new NavOptions.Builder().setEnterAnim(R.anim.enter).setExitAnim(R.anim.exit).setPopEnterAnim(R.anim.pop_enter).setPopExitAnim(R.anim.pop_exit).build();

        binding.btnStart.setOnClickListener(v -> {
            // go another fragment
            Navigation.findNavController(container).navigate(R.id.playingGame, null, navOptions);
        });

        return binding.getRoot();
    }

    // we had better write these codes for onDestroyView
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}