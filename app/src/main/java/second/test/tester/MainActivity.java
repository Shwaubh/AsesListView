package second.test.tester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import second.test.aseslib.EaseView;

public class MainActivity extends AppCompatActivity {

    EaseView a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = (EaseView) findViewById(R.id.aa);
        ArrayList<String> upper = new ArrayList<>();
        ArrayList<String> lower = new ArrayList<>();

        for(int i = 0; i < 100 ; i++ )
        {
            upper.add("Upper " +i);
            lower.add("lower " +i);
        }
        a.init(this , upper , lower);;
    }
}
