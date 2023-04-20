package ru.startandroid.shapesforkids;

import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

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
    ImageView shape_1;
    ImageView shape_2;
    ImageView shape_3;
    TextView ansver;
    LinearLayout shapeList;

    ArrayList<ImageView> shapes = new ArrayList<ImageView>();
    HashMap<String, Integer> shapesMap = new HashMap<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentPlayingGameBinding.inflate(inflater, container, false);

        shape_1 = binding.shape1;
        shape_2 = binding.shape2;
        shape_3 = binding.shape3;
        ansver = binding.ansver;

        shapesMap.put("circle", R.drawable.circle);
        shapesMap.put("polygon", R.drawable.polygon);
        shapesMap.put("triangle", R.drawable.triangle);
        shapesMap.put("rectangle", R.drawable.rectangle);
        shapesMap.put("star", R.drawable.star);
        shapesMap.put("pentagon", R.drawable.pentagon);

        shapeList = binding.shapeList;
        shapeList.setOnClickListener(v -> {
            generateShapes();
            return;
        });

        shapes.add(shape_1);
        shapes.add(shape_2);
        shapes.add(shape_3);
        generateShapes();

        return binding.getRoot();

    }



    private void generateShapes() {

        for (ImageView shape : shapes) {
            int random = (int) (Math.random()*6);
            switch (random) {
                case 0:
                    shape.setImageResource(shapesMap.get("circle"));
                    shape.setOnClickListener(v -> {
                    ansver.setText("Aylana");
                });
                    break;

                case 1:
                    shape.setImageResource(shapesMap.get("polygon"));
                    shape.setOnClickListener(v -> {
                    ansver.setText("oltiburchak");
                });
                    break;
                case 2:
                    shape.setImageResource(shapesMap.get("triangle"));
                    shape.setOnClickListener(v -> {
                        ansver.setText("uchburchak");
                    });
                    break;
                case 3:
                    shape.setImageResource(shapesMap.get("rectangle"));
                    shape.setOnClickListener(v -> {
                        ansver.setText("to'rtburchak");
                    });
                    break;
                case 4:
                    shape.setImageResource(shapesMap.get("star"));
                    shape.setOnClickListener(v -> {
                        ansver.setText("yulduzcha");
                    });
                    break;
                case 5:
                    shape.setImageResource(shapesMap.get("pentagon"));
                    shape.setOnClickListener(v -> {
                        ansver.setText("beshburchak");
                    });

            }

        }

    }


    // we had better write these codes for onDestroyView
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}