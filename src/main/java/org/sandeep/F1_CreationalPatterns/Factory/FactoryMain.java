package org.sandeep.F1_CreationalPatterns.Factory;

public class FactoryMain {
    public static void main(String[] args) {
        OS windowsOS = new WindowsOS();
        windowsOS.spec();


        /* Using the Factory, we don't need to statically mention which type we want. It also makes it easy to make some changes.
        Using the factory design pattern also hides the niche details from the client that they don't need to know.
        In case in future we want to change some condition like on providing "Linux" we need some different OS, or we need to add a new OS...
        we can do it easily by making changes in the Factory class and it wont require any changes at the client side code.*/
        System.out.println("\n\n----------------------Using Factory Builder----------------");
        OSFactory osFactory = new OSFactory();
        OS linux = osFactory.getInstance("Linux");
        linux.spec();

        OS windows = osFactory.getInstance("Windows");
        windows.spec();

        OS ios = osFactory.getInstance("IOS");
        ios.spec();
    }
}
