package choudhary.shuvam.my_resume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       setContentView(R.layout.activity_main);
       i=(ImageView) findViewById(R.id.img1);
       i.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openActivity2();

           }
       });
    }
    public void openActivity2()
    {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}
