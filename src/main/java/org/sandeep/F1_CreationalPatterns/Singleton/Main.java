package org.sandeep.F1_CreationalPatterns.Singleton;

public class Main {
    public static void main(String[] args) {

        // Singleton but not thread safe
        System.out.println("Singleton but not thread safe");
        Singleton_Not_ThreadSafe singletonNotThreadSafe = Singleton_Not_ThreadSafe.getInstance();
        singletonNotThreadSafe.setNum(5);

        Singleton_Not_ThreadSafe singletonNotThreadSafe1 = Singleton_Not_ThreadSafe.getInstance();
        System.out.println(singletonNotThreadSafe1.getNum());

        // Thread safe singleton but blocks reads too
        System.out.println("Thread-safe Singleton but blocks reads too");
        Singleton_ThreadSafe_ButBlocksReadsToo singletonThreadSafeButBlocksReadsToo = Singleton_ThreadSafe_ButBlocksReadsToo.getInstance();;
        singletonThreadSafeButBlocksReadsToo.setNum(10);

        Singleton_ThreadSafe_ButBlocksReadsToo singletonThreadSafeButBlocksReadsToo1 = Singleton_ThreadSafe_ButBlocksReadsToo.getInstance();
        System.out.println(singletonThreadSafeButBlocksReadsToo1.getNum());

        // Thread safe optimal singleton using double-checking
        System.out.println("Thread safe optimal singleton using double-checking");
        OptimalSingleton_DoubleChecking optimalSingletonDoubleChecking = OptimalSingleton_DoubleChecking.getInstance();;
        optimalSingletonDoubleChecking.setNum(15);

        OptimalSingleton_DoubleChecking optimalSingletonDoubleChecking1 = OptimalSingleton_DoubleChecking.getInstance();
        System.out.println(optimalSingletonDoubleChecking1.getNum());

        // Thread safe optimal singleton using double-checking by using Holder
        System.out.println("Thread safe optimal singleton using double-checking by using Holder");
        OptimalSingleton_DoubleCheckingUsingHolder optimalSingletonDoubleCheckingUsingHolder = OptimalSingleton_DoubleCheckingUsingHolder.getInstance();;
        optimalSingletonDoubleCheckingUsingHolder.setNum(20);

        OptimalSingleton_DoubleCheckingUsingHolder optimalSingletonDoubleCheckingUsingHolder1 = OptimalSingleton_DoubleCheckingUsingHolder.getInstance();
        System.out.println(optimalSingletonDoubleCheckingUsingHolder1.getNum());

        // Thread safe optimal singleton using enum
        System.out.println("Thread safe optimal singleton using enum");
        SingletonEnum singletonEnumInstance = SingletonEnum.INSTANCE;
        singletonEnumInstance.setNum(25);
        System.out.println(SingletonEnum.INSTANCE.getNum());

    }
}
