package org.sandeep.F1_CreationalPatterns.AbstractFactory;

//Abstract Factory
public class UniversityLeagueFactory {
    static int cutoff = 120;

    public UniversityFactory getUniversityFactory(int score) {
        if (score > cutoff) return new IvyLeagueUniversityFactory();
        else return new PublicUniversityFactory();
    }
}
