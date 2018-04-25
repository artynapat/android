package om.btec.arty.arty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import om.btec.arty.arty.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Add Fragment
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment,new MainFragment())
                    .commit();

        }



    }   //Main Method

}   //Main Class
