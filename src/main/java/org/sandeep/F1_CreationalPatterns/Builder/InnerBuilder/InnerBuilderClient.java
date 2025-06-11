package org.sandeep.F1_CreationalPatterns.Builder.InnerBuilder;

public class InnerBuilderClient {
    public static void main(String[] args) {
        URL url = new URL.Builder().protocol("https://").hostName("google").port("8080").build();
        System.out.println(url);
    }
}
