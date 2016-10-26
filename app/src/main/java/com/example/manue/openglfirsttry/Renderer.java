package com.example.manue.openglfirsttry;

import android.opengl.GLSurfaceView;

import com.example.manue.openglfirsttry.com.example.manue.openglfirsttry.shapes.MyTriangle;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by manue on 26.10.2016.
 */


public class Renderer implements GLSurfaceView.Renderer {

    private MyTriangle firstTriangle;
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {

        firstTriangle = new MyTriangle();

    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {

    }

    @Override
    public void onDrawFrame(GL10 gl) {

    }
}
