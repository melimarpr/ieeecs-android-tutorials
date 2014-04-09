package mmarquezpr.fragmentdemo.app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class GreenFragment extends Fragment {

    private View view;
    private boolean isGreen;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

       isGreen = false;
        view = inflater.inflate(R.layout.fragment_green, container, false);

        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isGreen){
                    view.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
                    view.invalidate();
                    isGreen = !isGreen;
                }
                else{
                    view.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    view.invalidate();
                    isGreen = !isGreen;

                }

            }
        });


        return view;
    }





}
