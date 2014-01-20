/***
  Copyright (c) 2014 Nima Ghafoori
  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
  by applicable law or agreed to in writing, software distributed under the
  License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
  OF ANY KIND, either express or implied. See the License for the specific
  language governing permissions and limitations under the License.

  From _AndroidTuts_
  http://androidtuts.net
 */

package net.androidtuts.gradientbuttons;

import com.example.shiny3dbutton.R;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends Activity {

	
	private static Typeface tf;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tf = Typeface.createFromAsset(getAssets(), "Roboto-Thin.ttf");
		
		Button btn1 = (Button) findViewById(R.id.button1); 
		Button btn2 = (Button) findViewById(R.id.button2); 
		Button btn3 = (Button) findViewById(R.id.button3);
		Button btn4 = (Button) findViewById(R.id.button4);
		Button btn5 = (Button) findViewById(R.id.button5);
		Button btn6 = (Button) findViewById(R.id.button6);
		Button btn7 = (Button) findViewById(R.id.button7);
		Button btn8 = (Button) findViewById(R.id.button8);
		
		btn1.setTypeface(tf);
		btn2.setTypeface(tf);
		btn3.setTypeface(tf);
		btn4.setTypeface(tf);
		btn5.setTypeface(tf);
		btn6.setTypeface(tf);
		btn7.setTypeface(tf);
		btn8.setTypeface(tf);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
