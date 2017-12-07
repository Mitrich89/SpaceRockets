package ru.samsung.itschool.spacearrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ImageManager.resources = getResources();
		setContentView(R.layout.activity_main);
	}
	public void change1(View view){
		Intent intent = new Intent(this,Main2Activity.class);
		startActivity(intent);
	}
}
