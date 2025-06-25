package org.sandeep.F1_CreationalPatterns.AbstractFactory;

import org.sandeep.F1_CreationalPatterns.AbstractFactory.University.University;

/**
1️. AbstractFactory → declares factory methods for product types<br>
2️. ConcreteFactory → implements creation of concrete products<br>
3️. AbstractProduct → declares interfaces for product types<br>
4️. ConcreteProduct → concrete implementations<br>
5️. Client → uses factory, unaware of concrete products<br>
 */

// Client
public class AbstractFactoryClient {
    public static void main(String[] args) {
        UniversityLeagueFactory universityLeagueFactory = new UniversityLeagueFactory();
        UniversityFactory ivyUniversityFactory = universityLeagueFactory.getUniversityFactory(200);
        UniversityFactory publicUniversityFactory = universityLeagueFactory.getUniversityFactory(50);

        University ivyCs = ivyUniversityFactory.getUniversityInstance("CS");
        System.out.println(ivyCs.getClass() + " : " + ivyCs.getAdmitCard() + " : " + ivyCs.getFee());

        University ivyMath = ivyUniversityFactory.getUniversityInstance("Math");
        System.out.println(ivyMath.getClass() + " : " + ivyMath.getAdmitCard() + " : " + ivyMath.getFee());

        University publicCS = publicUniversityFactory.getUniversityInstance("CS");
        System.out.println(publicCS.getClass() + " : " + publicCS.getAdmitCard() + " : " + publicCS.getFee());

        University publicMath = publicUniversityFactory.getUniversityInstance("Math");
        System.out.println(publicMath.getClass() + " : " + publicMath.getAdmitCard() + " : " + publicMath.getFee());


    }
}
