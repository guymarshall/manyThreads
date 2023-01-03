package com.marshall.guy;

public class App 
{
    public static void main(String[] args) throws InterruptedException
    {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Number of threads: ");
        // int numberOfThreads = scanner.nextInt();

        // Thread[] threads = new Thread[numberOfThreads];

        int numberOfThreads = Runtime.getRuntime().availableProcessors();

        System.out.printf("Calculation started with %s threads.%n", numberOfThreads);

        Thread.sleep(3_000);

        for (int i = 0; i < numberOfThreads; i++)
        {
            Worker worker = new Worker(Integer.toString(i));
            Thread thread = new Thread(worker);

            // threads[i] = thread;
            thread.start();
        }
    }
}
