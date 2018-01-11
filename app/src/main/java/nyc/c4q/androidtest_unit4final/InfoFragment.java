package nyc.c4q.androidtest_unit4final;


import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by justiceo on 1/9/18.
 */

public class InfoFragment extends Fragment {

    View rootView;
    public Button button;
    public TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.info_fragment, container, false);

        button = rootView.findViewById(R.id.button_fragment);
        textView = rootView.findViewById(R.id.more_textView);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.hide(InfoFragment.this).addToBackStack(" ").commit();


            }
        });


        return rootView;
    }
}
