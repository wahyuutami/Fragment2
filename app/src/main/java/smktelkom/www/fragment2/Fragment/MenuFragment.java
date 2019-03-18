package smktelkom.www.fragment2.Fragment;

import android.os.Bundle; import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import smktelkom.www.fragment2.R;

public class MenuFragment extends Fragment {
    Button btnkoala, btnpenguin, btntulip;
    Fragment frag;
    FragmentTransaction fragTransaction;

    public MenuFragment(){ }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_fragment,container,false);
        frag = new KoalaFragment();
        fragTransaction =  getFragmentManager().beginTransaction().add(R.id.container, frag);
        fragTransaction.commit();
        Button btnkoala = (Button)view.findViewById(R.id.btnkoala);
        Button btnpenguin = (Button)view.findViewById(R.id.btnpenguin);
        Button btntulip = (Button)view.findViewById(R.id.btntulip);
        btnkoala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new KoalaFragment();
                fragTransaction =  getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragTransaction.commit();
        }
        });
        btnpenguin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new PenguinFragment();
                fragTransaction =  getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragTransaction.commit();
        }
        });
        btntulip.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                frag = new TulipFragment();
                fragTransaction =  getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragTransaction.commit();
            }
        });
        return view;
    }
}

