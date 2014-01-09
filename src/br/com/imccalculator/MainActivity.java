package br.com.imccalculator;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

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
		
		layoutPonds = (LinearLayout) findViewById(R.id.layout_altura_inches);

		radioKilogramsMeters = (RadioButton) findViewById(R.id.quilogramas_metros);
		radioKilogramsMeters.setChecked(true);
		radioKilogramsMeters.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				radioKilogramsMeters.setVisibility(VISIBLE);
				weigh.setHint(R.string.exemplo_peso_quilogramas);
				layoutPonds.setVisibility(GONE);

			}
		});

		radioPoundsInches = (RadioButton) findViewById(R.id.libras_polegadas);
		radioPoundsInches.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				radioKilogramsMeters.setVisibility(GONE);
				heigh.setVisibility(GONE);
				weigh.setHint(R.string.exemplo_peso_libras);
				layoutPonds.setVisibility(VISIBLE);
			}
		});

		heigh = (EditText) findViewById(R.id.et_altura_metros);
		weigh = (EditText) findViewById(R.id.et_peso);
		result = (LinearLayout) findViewById(R.id.layout_resultado);

		calculator = (Button) findViewById(R.id.btnCalcular);
		calculator.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				result.setVisibility(VISIBLE);
				TextView tvResultado = (TextView) result.findViewById(R.id.tv_resultado);
				tvResultado.setText("Calcular Agora");
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
