package mmarquezpr.datademo.app;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class NormalFragment extends Fragment {


    public NormalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_normal, container, false);

        TextView tv = (TextView) view.findViewById(R.id.empty);

        Bundle bnd = this.getArguments();
        if(bnd != null){

            SerialObject serialObject = (SerialObject) bnd.getSerializable(Keys.Bundle.SERIAL_KEY);

            tv.setText(serialObject.container);
        }





        return view;
    }


}
