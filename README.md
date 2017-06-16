# Android-Foreground-Detector
A very simple Android background/foreground detector

Detect event when app go to background/foreground
Api-level 15+

Usage:

Add the repository to your gradle app
```
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    compile 'com.github.khirr:Android-Foreground-Detector:1.0.1'
}
```

Initialize on your Application singleton:

Java
```
@Override
public void onCreate() {
    super.onCreate();
    //  Initialize
    Foreground.Companion.init(this);
}
```

Kotlin
```
override fun onCreate() {
   super.onCreate()
   Foreground.init(this)
}
```

You can check status anytime

Java
```
Foreground.Companion.isForeground();
Foreground.Companion.isBackground();
```

Kotlin
```
Foreground.isBackground()
Foreground.isForeground()
```


You can add events to listen when status changes

Java
```
final Foreground.Listener foregroundListener = new Foreground.Listener() {
    @Override
    public void foreground() {
        Log.e("Foreground", "Go to foreground");
    }

    @Override
    public void background() {
        Log.e("Foreground", "Go to background");
    }
};

Foreground.Companion.addListener(foregroundListener);
```

Kotlin
```
val foregroundListener = object: Foreground.Listener {
    override fun background() {
        Log.e("Foreground", "Go to background")
    }

    override fun foreground() {
        Log.e("Foreground", "Go to foreground")
    }
}
Foreground.addListener(foregroundListener)
```
