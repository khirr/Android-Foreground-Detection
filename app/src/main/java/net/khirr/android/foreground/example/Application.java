package net.khirr.android.foreground.example;

import android.util.Log;

import net.khirr.library.foreground.Foreground;

public class Application extends android.app.Application implements Foreground.Listener {

    @Override
    public void onCreate() {
        super.onCreate();
        //  Initialize
        Foreground.Companion.init(this);
        //  Add listener
        Foreground.Companion.addListener(this);
    }

    @Override
    public void foreground() {
        Log.e("Foreground", "Go to foreground");
    }

    @Override
    public void background() {
        Log.e("Foreground", "Go to background");
    }
}
