package com.lambdaschool.InterfaceInjection;

public class HockeyAthleteCreationInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new HockeyImple());
    }
}