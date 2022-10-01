package com.mr666dd.lwjgl.engine;

public class Color {
    public float red = 1;
    public float green = 1;
    public float blue = 1;
    public float a = 1;
    public Color(float red, float green, float blue, float a){
        this.red = MathF.Clamp(red, 0, 1);
        this.green = MathF.Clamp(green, 0, 1);
        this.blue = MathF.Clamp(blue, 0, 1);
        this.a = MathF.Clamp(a, 0, 1);
    }
    public Color(float red, float green, float blue){
        this.red = MathF.Clamp(red, 0, 1);
        this.green = MathF.Clamp(green, 0, 1);
        this.blue = MathF.Clamp(blue, 0, 1);
    }
    public static Color black() {return new Color(0,0,0);}
    public static Color white() {return new Color(1,1,1);}
    public static Color red() {return new Color(1,0,0);}
    public static Color green() {return new Color(0,1,0);}
    public static Color blue() {return new Color(0,0,1);}
    public static Color grey() {return new Color(0.5f,0.5f,0.5f);}
    public static Color wine() {return new Color(0.5f,0,0);}
    public static Color forrest() {return new Color(0,0.5f,0);}
    public static Color marine() {return new Color(0,0,0.5f);}
    public static Color yellow() {return new Color(1,1,0);}
    public static Color cyan() {return new Color(0,1,1);}
    public static Color magenta() {return new Color(1,0,1);}

    public String ToString() {return  "(" + String.valueOf(red) + ", " + String.valueOf(green) + ", " + String.valueOf(blue) + ", " + String.valueOf(a) + ")";}
}
