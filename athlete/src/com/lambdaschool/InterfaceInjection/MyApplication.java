package com.lambdaschool.InterfaceInjection;

public class MyApplication implements Processor
{
    private Athletes athlete;

    public MyApplication(Athletes athlete)
    {
        this.athlete = athlete;
    }

    public void create(String sport, String name)
    {
        System.out.println("**********");
        athlete.display(sport,name);
        System.out.println("**********\n");

    }

}