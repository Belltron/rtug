package com.william.r_tug;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button go_to_bioharness;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        this.go_to_bioharness = (Button) this.findViewById(R.id.initiate_bioharness_button);
		
		this.go_to_bioharness.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent bioHarness = new Intent(getApplicationContext(),
						BioHarness.class);

				startActivity(bioHarness);
			}
		});

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
