package org.sandeep.F2_StructuralPatterns.Composite.FileSystemSolution;


/**
 * Composite Design Pattern
 * Used wherever it forms a tree like structure.
 * In this usecase, we have a file System where there would be a Directory and inside the Directory can be n number of files or directories.
 * Each directory can also have n files/directories inside it and it goes on.
 */
public class Client {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movies");
        Directory actionMovies = new Directory("Action Movies");
        Directory comedyMovies = new Directory("Comedy Movies");

        Directory actionMovieSubCategory = new Directory("Action Movie Subcategory");
        FileSystemComponent actionMovie1 = new File("ActionMovie1");
        FileSystemComponent actionMovie2 = new File("ActionMovie2");
        FileSystemComponent actionMovie3 = new File("ActionMovie3");
        FileSystemComponent actionMovie4 = new File("ActionMovie4");

        FileSystemComponent comedyMovie1 = new File("ComedyMovie1");
        FileSystemComponent comedyMovie2 = new File("ComedyMovie2");
        FileSystemComponent comedyMovie3 = new File("ComedyMovie3");
        FileSystemComponent comedyMovie4 = new File("ComedyMovie4");

        actionMovieSubCategory.add(actionMovie4);
        actionMovies.add(actionMovie1);
        actionMovies.add(actionMovie2);
        actionMovies.add(actionMovie3);
        actionMovies.add(actionMovieSubCategory);

        comedyMovies.add(comedyMovie1);
        comedyMovies.add(comedyMovie2);
        comedyMovies.add(comedyMovie3);
        comedyMovies.add(comedyMovie4);

        movieDirectory.add(actionMovies);
        movieDirectory.add(comedyMovies);

        movieDirectory.ls(1);       //indentation added just for fun, not part of the composite design use-case requirement
    }
}
