package sedwards90540.com262Final;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import sedwards90540.com262Final.R;

public class AboutActivity extends ActionBarActivity {
public static final String TAG = "about activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        Log.i(TAG, "About");
    }
}
