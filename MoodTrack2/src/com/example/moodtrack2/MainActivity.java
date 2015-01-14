package com.example.moodtrack2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {

	public void sendMessage(View v) {
		// action goes here
		/*TextView salute = (TextView) findViewById(R.id.textView1);
		String value = "How did you sleep last night?";
		salute.setText(value);*/
		
		 Intent myIntent = new Intent(this, NewActivity.class);
		  startActivity(myIntent);

		/*RadioButton radioGreat = (RadioButton) findViewById(R.id.radioGreat);
		RadioButton radioSoandSo = (RadioButton) findViewById(R.id.radioSoandSo);
		RadioButton radioNoSleep = (RadioButton) findViewById(R.id.radioNoSleep);
		radioGreat.setVisibility(View.VISIBLE);
		radioSoandSo.setVisibility(View.VISIBLE);
		radioNoSleep.setVisibility(View.VISIBLE);*/
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button buttonGoodMorning = (Button) findViewById(R.id.button1);
		/*buttonGoodMorning.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// action goes here
				TextView salute = (TextView) findViewById(R.id.textView1);
				String value = "How did you sleep last night?";
				salute.setText(value);

				RadioButton radioGreat = (RadioButton) findViewById(R.id.radioGreat);
				RadioButton radioSoandSo = (RadioButton) findViewById(R.id.radioSoandSo);
				RadioButton radioNoSleep = (RadioButton) findViewById(R.id.radioNoSleep);
				radioGreat.setVisibility(View.VISIBLE);
				radioSoandSo.setVisibility(View.VISIBLE);
				radioNoSleep.setVisibility(View.VISIBLE);
			}
		});*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
