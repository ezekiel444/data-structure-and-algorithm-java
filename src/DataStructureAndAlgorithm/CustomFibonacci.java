package DataStructureAndAlgorithm;

// A very fast Fibonacci Algorithm implemented using a cache.

public class CustomFibonacci {
    private long[] fibonacciCache;
   int num = 93;

    public CustomFibonacci() {
        fibonacciCache = new long[num + 1];
//        System.out.println(fibonacci(num));
        for(int i = 0; i<num; i++){
            System.out.print(fibonacci(i) +" ");
        }
    }
    long fibonacci(int number){
        if(number <= 1) return number;
        if(fibonacciCache[number] != 0 ){
            return fibonacciCache[number];
        }
        long fibonacciNth = (fibonacci(number -1) + fibonacci(number - 2));
        fibonacciCache[number] = fibonacciNth;
        return fibonacciNth;
    }
}
