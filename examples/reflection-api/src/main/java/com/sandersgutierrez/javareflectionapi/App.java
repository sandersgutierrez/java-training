package com.sandersgutierrez.javareflectionapi;

import com.sandersgutierrez.javareflectionapi.model.Computer;
import com.sandersgutierrez.javareflectionapi.model.Washer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Computer> computerList = new ArrayList<>();
        Computer computerOne = new Computer(1L, 3, "HP EliteBook 840 G6");
        Computer computerTwo = new Computer(2L, 2, "Lenovo ThinkPad T490");
        computerList.add(computerOne);
        computerList.add(computerTwo);

        List<Washer> washerList = new ArrayList<>();
        Washer washerOne = new Washer(1L, "LG-480", "The Washer's home");
        Washer washerTwo = new Washer(2L, "Samsung-T50", "The Washer of my Mom");
        washerList.add(washerOne);
        washerList.add(washerTwo);

        System.out.println("|=====================================================================|");
        printAnyProductList(computerList);
        System.out.println("|---------------------------------------------------------------------|");
        printAnyProductList(washerList);
        System.out.println("|=====================================================================|");
    }

    public static void printAnyProductList(List<?> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object l : list) {
            Method[] methods = l.getClass().getDeclaredMethods();
            for (Method m : methods) {
                if (m.getName().equals("getId") || m.getName().equals("getDescription")) {
                    try {
                        stringBuilder.append(m.invoke(l)).append("\t | ");
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println(" --> " + stringBuilder.toString());
    }
}
