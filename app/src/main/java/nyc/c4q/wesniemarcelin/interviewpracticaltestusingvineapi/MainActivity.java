package nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager =getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.activity_main, new VineFragment())
                .commit();
    }
}
