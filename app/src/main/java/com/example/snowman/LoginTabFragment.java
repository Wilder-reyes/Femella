package com.example.snowman;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class LoginTabFragment  extends Fragment {
    EditText email,pass;
    TextView forget;
    Button button;
    float v=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment,container, false
        );

        email = root.findViewById(R.id.email);
        pass =  root.findViewById(R.id.pass);
        forget = root.findViewById(R.id.forget);
        button = root.findViewById(R.id.button);

        email.setAlpha(v);
        pass.setAlpha(v);
        forget.setAlpha(v);
        button.setAlpha(v);

        email.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        forget.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        button.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();

        return root;
    }
}
