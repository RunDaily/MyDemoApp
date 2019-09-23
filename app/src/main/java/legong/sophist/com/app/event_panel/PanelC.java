package legong.sophist.com.app.event_panel;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import legong.sophist.com.app.R;

/**
 * 仪表板C
 */
public class PanelC extends Fragment {


    public PanelC() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_panel_c, container, false);
    }

}
