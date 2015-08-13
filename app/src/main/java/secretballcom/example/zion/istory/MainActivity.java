package secretballcom.example.zion.istory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mName;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText)findViewById(R.id.nameText);
        mStartButton=(Button)findViewById(R.id.button);
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mName.getText().toString();
                Toast.makeText(MainActivity.this,name,Toast.LENGTH_LONG).show();
                startStory(name);

            }
        });
    }

    private void startStory(String name){
        Intent intent = new Intent(MainActivity.this,StoryActivity.class);
        intent.putExtra("name",name);
        startActivity(intent);
    }

}
