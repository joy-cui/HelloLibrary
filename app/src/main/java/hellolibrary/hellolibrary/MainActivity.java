package hellolibrary.hellolibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.suirui.library.LibraryTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) this.findViewById(R.id.test_txt);
        textView.setText("testview:" + LibraryTest.getTest());
    }
}
