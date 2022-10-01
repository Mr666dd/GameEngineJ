package com.mr666dd.lwjgl.engine;

public class MathF {
    public static float Clamp(float val, float min, float max){
        if(val < min) return min;
        else if (val > max) return max;
        else return val;
    }
}
