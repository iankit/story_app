package secretballcom.example.zion.istory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mName;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText)findViewById(R.id.nameText);
        mStartButton=(Button)findViewById(R.id.button);
        mStartButton.hasOnClickListeners(new View.OnClickListener(){
        public void onClick()
    }

}
