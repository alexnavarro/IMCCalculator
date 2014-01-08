package br.com.imccalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends Activity {

	private RadioButton radioKilogramsMeters;
	
	private RadioButton radioPoundsInches;
	
	private EditText heigh;
	
	private EditText weigh;
	
	private LinearLayout layoutPonds;
	
	private Button calculator;
	
	private LinearLayout result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		radioKilogramsMeters = (RadioButton) findViewById(R.id.quilogramas_metros);
		radioPoundsInches = (RadioButton) findViewById(R.id.libras_polegadas);
		
		heigh = (EditText) findViewById(R.id.et_altura_metros);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
