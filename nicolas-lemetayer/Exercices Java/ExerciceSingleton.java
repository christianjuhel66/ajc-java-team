package com.demo;

/**
 * @Author: LE METAYER Nicolas
 */
public class ExerciceSingleton {
    private static final ExerciceSingleton instance = new ExerciceSingleton();

    private ExerciceSingleton()
    {
        System.out.println("Construction du Singleton au premier appel");
    }

    public static final ExerciceSingleton getInstance()
    {
        return instance;
    }

    @Override
    public String toString()
    {
        return String.format(super.toString());
    }

    public static void main(String[] args)
    {
        ExerciceSingleton singleton = ExerciceSingleton.getInstance();
        System.out.println(singleton);
    }
}
