package com.lambdaschool.InterfaceInjection;

public class HockeyImple implements Athletes
{
    @Override
    public void display(String sport, String name)
    {
        System.out.println("Sport: " + sport + " Athlete Name: " + name);
    }

}
