package com.lambdaschool.InterfaceInjection;

public class TrackAthleteCreationInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new TrackImple());
    }
}