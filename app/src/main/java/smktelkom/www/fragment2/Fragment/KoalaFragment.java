package smktelkom.www.fragment2.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View; import android.view.ViewGroup;
import smktelkom.www.fragment2.R;

public class KoalaFragment extends Fragment {

    public KoalaFragment (){

    }

    @Override  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_multiple_koala, container, false);

        return rootView;  } }