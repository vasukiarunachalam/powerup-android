package powerup.systers.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CompletedScene extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.completed_scene);
		Button backToMap = (Button) findViewById(R.id.ContinueButtonMap);
		backToMap.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent myIntent = new Intent(CompletedScene.this,
						MapActivity.class);
				finish();
				startActivityForResult(myIntent, 0);
			}
		});
	}
	
}