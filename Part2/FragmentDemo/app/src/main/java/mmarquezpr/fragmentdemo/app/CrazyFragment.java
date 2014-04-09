package mmarquezpr.fragmentdemo.app;



import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;




public class CrazyFragment extends Fragment {


    private View view;
    public CrazyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_crazy, container, false);
        view.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));

        return view;
    }




}
