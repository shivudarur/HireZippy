package com.android.hirezippy.activities;

import android.app.Activity;
import android.os.Bundle;

import com.android.hirezippy.R;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		if (savedInstanceState == null) {
			// getSupportFragmentManager().beginTransaction()
			// .add(R.id.container, new LoginFragment()).commit();
		}
	}
}
