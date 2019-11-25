package com.lambdaschool.solution;

public class MyApp implements Processor
{
    private Athlete athlete;

    public MyApp(Athlete athlete)
    {
        this.athlete = athlete;
    }

    @Override
    public void displayAthlete() {
        System.out.println("***********");
        athlete.displayAthlete();
        System.out.println("***********");
        System.out.println(" ");
    }
}