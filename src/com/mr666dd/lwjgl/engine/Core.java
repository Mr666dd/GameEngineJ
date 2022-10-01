package com.mr666dd.lwjgl.engine;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL11.*;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.glClearColor;

public class Core {
    private static Color clear = Color.green();
    public static void main(String[] args){
        long window = Application.Init();
        //Пока окно не закрыто...
        while(!glfwWindowShouldClose(window)){
            glfwPollEvents();

            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
            //Меняем цвет
            glClearColor(clear.red, clear.green, clear.blue, clear.a);

            glfwSwapBuffers(window);
        }
        //Уничтожаем окно
        glfwTerminate();

    }
}
