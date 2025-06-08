package org.sandeep.F1_CreationalPatterns.Factory;

public class OSFactory {
    public OS getInstance(String s){
        return switch (s){
            case "Linux" -> new LinuxOS();
            case "Windows" -> new WindowsOS();
            case "IOS" -> new IOS();
            default -> null;
        };
    }
}
