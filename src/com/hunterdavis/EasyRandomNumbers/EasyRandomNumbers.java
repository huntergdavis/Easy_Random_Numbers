package com.hunterdavis.EasyRandomNumbers;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class EasyRandomNumbers extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// find all the buttons
		final Button generateButton = (Button) findViewById(R.id.customButton);

		final Button twoButton = (Button) findViewById(R.id.twoButton);
		final Button threeButton = (Button) findViewById(R.id.threeButton);
		final Button fourButton = (Button) findViewById(R.id.fourButton);
		final Button fiveButton = (Button) findViewById(R.id.fiveButton);
		final Button sixButton = (Button) findViewById(R.id.sixButton);
		final Button eightButton = (Button) findViewById(R.id.eightButton);
		final Button twelveButton = (Button) findViewById(R.id.twelveButton);
		final Button fifteenButton = (Button) findViewById(R.id.fifteenButton);
		final Button twentyButton = (Button) findViewById(R.id.twentyButton);
		final Button twentyfourButton = (Button) findViewById(R.id.twentyfourButton);
		final Button twentyfiveButton = (Button) findViewById(R.id.twentyfiveButton);
		final Button fiftyButton = (Button) findViewById(R.id.fiftyButton);
		final Button sixtyfourButton = (Button) findViewById(R.id.sixtyfourButton);
		final Button hundredButton = (Button) findViewById(R.id.onehundredButton);
		final Button fivehundredButton = (Button) findViewById(R.id.fivehundredButton);
		
		
		// Create an anonymous implementation of OnClickListener
		OnClickListener everyButtonListner = new OnClickListener() {
			public void onClick(View v) {
				// do something when the button is clicked
				if (v == generateButton) {
					// Things to do
					EditText minText = (EditText) findViewById(R.id.min);
					EditText maxText = (EditText) findViewById(R.id.max);
					int min = Integer.parseInt(minText.getText().toString());
					int max = Integer.parseInt(maxText.getText().toString());
					setRandomFromRange(min,max);
				}
				if (v == twoButton) {
					// Things to do
					setRandomFromRange(1, 2);
				}
				if (v == threeButton) {
					// Things to do
					setRandomFromRange(1, 3);
				}
				if (v == fourButton) {
					// Things to do
					setRandomFromRange(1, 4);
				}
				if (v == fiveButton) {
					// Things to do
					setRandomFromRange(1, 5);
				}
				if (v == sixButton) {
					// Things to do
					setRandomFromRange(1, 6);
				}
				if (v == eightButton) {
					// Things to do
					setRandomFromRange(1, 8);
				}
				if (v == twelveButton) {
					// Things to do
					setRandomFromRange(1, 12);
				}
				if (v == fifteenButton) {
					// Things to do
					setRandomFromRange(1, 15);
				}
				if (v == twentyButton) {
					// Things to do
					setRandomFromRange(1, 20);
				}
				if (v == twentyfourButton) {
					// Things to do
					setRandomFromRange(1, 24);
				}
				if (v == twentyfiveButton) {
					// Things to do
					setRandomFromRange(1, 25);
				}
				if (v == fiftyButton) {
					// Things to do
					setRandomFromRange(1, 50);
				}
				if (v == sixtyfourButton) {
					// Things to do
					setRandomFromRange(1, 64);
				}
				if (v == hundredButton) {
					// Things to do
					setRandomFromRange(1, 100);
				}
				if (v == fivehundredButton) {
					// Things to do
					setRandomFromRange(1, 500);
				}
				//
			}

		};

		// attach all the buttons
		generateButton.setOnClickListener(everyButtonListner);
		twoButton.setOnClickListener(everyButtonListner);
		threeButton.setOnClickListener(everyButtonListner);
		fourButton.setOnClickListener(everyButtonListner);
		fiveButton.setOnClickListener(everyButtonListner);
		sixButton.setOnClickListener(everyButtonListner);

		// row 2 of buttons

		eightButton.setOnClickListener(everyButtonListner);
		twelveButton.setOnClickListener(everyButtonListner);
		fifteenButton.setOnClickListener(everyButtonListner);
		twentyButton.setOnClickListener(everyButtonListner);
		twentyfourButton.setOnClickListener(everyButtonListner);

		// row 3 of buttons
		
		twentyfiveButton.setOnClickListener(everyButtonListner);

		
		fiftyButton.setOnClickListener(everyButtonListner);

		
		sixtyfourButton.setOnClickListener(everyButtonListner);

		
		hundredButton.setOnClickListener(everyButtonListner);

		
		fivehundredButton.setOnClickListener(everyButtonListner);

	}
	
	void setRandomFromRange(int low, int high) {
		EditText resultsText = (EditText) findViewById(R.id.results);
		final Random myRandom = new Random();
		Float myNewRandomPercent = myRandom.nextFloat();
		Integer actualResult = (int) Math.round(low + (Math.abs((high-low))*(myNewRandomPercent)));
		resultsText.setText(String.valueOf(actualResult));
	}

}