package com.lambdaschool.InterfaceInjection;

public class BaseballImple implements Athletes
{
    @Override
    public void display(String sport, String name)
    {
        System.out.println("Sport: " + sport + " Athlete Name: " + name);
    }

}
