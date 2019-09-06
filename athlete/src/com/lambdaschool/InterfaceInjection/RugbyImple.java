package com.lambdaschool.InterfaceInjection;

public class RugbyImple implements Athletes
{
    @Override
    public void display(String sport, String name)
    {
        System.out.println("Sport: " + sport + " Athlete Name: " + name);
    }

}
