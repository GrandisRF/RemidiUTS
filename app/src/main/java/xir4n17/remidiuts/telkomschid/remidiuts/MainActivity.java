package xir4n17.remidiuts.telkomschid.remidiuts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnswipe, btntabs, btnspinner, btndrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnswipe = (Button) findViewById(R.id.swipebtn);
        btntabs = (Button) findViewById(R.id.tabsbtn);
        btnspinner = (Button) findViewById(R.id.spinnerbtn);
        btndrawer = (Button) findViewById(R.id.navdrawerbtn);

        btnswipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SwipeActivity.class));
            }
        });
        btntabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TabsActivity.class));
            }
        });
        btnspinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SpinnerActivity.class));
            }
        });
        btndrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DrawerActivity.class));
            }
        });
    }
}
