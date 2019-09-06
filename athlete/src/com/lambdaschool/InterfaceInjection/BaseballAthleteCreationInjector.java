package com.lambdaschool.InterfaceInjection;

public class BaseballAthleteCreationInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new BaseballImple());
    }
}