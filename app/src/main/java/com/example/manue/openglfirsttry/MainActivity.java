package com.example.manue.openglfirsttry;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//Bsp für Pfeil: http://stackoverflow.com/questions/24061343/drawing-an-arrow-with-opengl-android
//https://android.googlesource.com/platform/development/+/master/samples/ApiDemos/src/com/example/android/apis/os/RotationVectorDemo.java


public class MainActivity extends Activity {

    private GLSurfaceView surface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(surface);
        surface = new GLSurfaceView(this);
        surface.setEGLContextClientVersion(2);
        surface.setRenderer((GLSurfaceView.Renderer) new Renderer());

    }

    public  void onPause(){
        super.onPause();
        surface.onPause();

    }

    public void onResume() {
        super.onResume();
        surface.onResume();
    }

}
