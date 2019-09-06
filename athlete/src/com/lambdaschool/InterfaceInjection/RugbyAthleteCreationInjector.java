package com.lambdaschool.InterfaceInjection;

public class RugbyAthleteCreationInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new RugbyImple());
    }
}