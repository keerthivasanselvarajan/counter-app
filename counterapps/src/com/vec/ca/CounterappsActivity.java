package com.vec.ca;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterappsActivity extends Activity {
	
	int clicked=0;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final TextView text = (TextView) findViewById(R.id.textview1);
        text.setText("\nthe button hasn't been clicked\n");
        final Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new view.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				clicked++;
				text.setText("\nbutton has been clicked" + clicked + "times");
			}
		});
        
         
         
    }
}