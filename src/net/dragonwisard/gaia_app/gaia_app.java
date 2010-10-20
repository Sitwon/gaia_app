package net.dragonwisard.gaia_app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class gaia_app extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Uri uri = Uri.parse(getResources().getString(R.string.uri));
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
        this.finish();
    }
}
