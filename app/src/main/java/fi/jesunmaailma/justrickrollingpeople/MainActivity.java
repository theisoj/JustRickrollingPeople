package fi.jesunmaailma.justrickrollingpeople;

import android.app.Activity;
import android.os.Bundle;
import android.content.pm.ActivityInfo;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
}