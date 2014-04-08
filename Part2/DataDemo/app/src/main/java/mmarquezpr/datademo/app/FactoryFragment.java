package mmarquezpr.datademo.app;



import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FactoryFragment extends Fragment {


    public String arg1;


    //Factory
    public static FactoryFragment getInstance(String arg1){
        FactoryFragment blankFragment = new FactoryFragment();
        blankFragment.setArg1(arg1);
        return  blankFragment;


    }


    private void setArg1(String str){
        this.arg1 = str;
    }


    public FactoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        View view =  inflater.inflate(R.layout.fragment_blank, container, false);
        TextView tv = (TextView) view.findViewById(R.id.empty);

        tv.setText(arg1);

        return view;
    }


}
