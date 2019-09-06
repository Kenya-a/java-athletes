package com.lambdaschool.InterfaceInjection;

public class TrackImple implements Athletes
{
    @Override
    public void display(String sport, String name)
    {
        System.out.println("Sport: " + sport + " Athlete Name: " + name);
    }

}
