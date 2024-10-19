package Array;

public class CheckHeapSize {
    public static void main(String[] args) {
        // Get runtime instance
        Runtime runtime = Runtime.getRuntime();

        // Convert bytes to megabytes
        int mb = 1024 * 1024;

        // Total allocated memory
        System.out.println("Total Memory: " + runtime.totalMemory() / mb + " MB");

        // Free memory in the heap
        System.out.println("Free Memory: " + runtime.freeMemory() / mb + " MB");

        // Maximum memory that the JVM will attempt to use
        System.out.println("Max Memory: " + runtime.maxMemory() / mb + " MB");

        // Used memory
        System.out.println("Used Memory: " + (runtime.totalMemory() - runtime.freeMemory()) / mb + " MB");
    }
}
