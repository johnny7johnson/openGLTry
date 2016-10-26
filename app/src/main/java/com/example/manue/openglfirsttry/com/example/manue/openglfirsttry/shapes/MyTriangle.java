package com.example.manue.openglfirsttry.com.example.manue.openglfirsttry.shapes;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/**
 * Created by manue on 26.10.2016.
 */

//formen über Dreiecke Zeichnen
//Viereck aus 2 Dreiecken
//Default: [0,0,0]   --> mitte des Bildschirms
//          [1,1,0]    --> rechts oben
//          [1,-1,0]    --> rechts unten
//          [-1,1,0]    --> links oben
//          [1,-1,0]    --> links unten


public  class MyTriangle {

    private FloatBuffer vertexBuffer;

    static final int COORDS_PER_VERTEX = 3;
    static float coords[]={
            0.0f, 0.06782f, 0.0f,
            -0.5f, -0.311f, 0.0f,
            0.5f, -0.311f, 0.0f,
    };

    float color[] = {0.63671875f, 0.63671875f,0.63671875f,0.63671875f};      //rot

    public MyTriangle(){
        ByteBuffer bb = ByteBuffer.allocateDirect(coords.length * 4);  //4 bytes pro float
        bb.order(ByteOrder.nativeOrder());
        vertexBuffer = bb.asFloatBuffer();
        vertexBuffer.put(coords);
        vertexBuffer.position(0);
    }
}

