package DataStructureAndAlgorithm;

// recursion = When a thing is defined in terms of itself. - Wikipedia
//      Apply the result of a procedure, to a procedure.
//      A recursive method calls itself. Can be a substitute for iteration.
//      Divide a problem into sub-problems of the same type as the original.
//      Commonly used with advanced sorting algorithms and navigating trees

//      Advantages
//      ----------
//      easier to read/write
//      easier to debug

//      Disadvantages
//      ----------
//      sometimes slower
//      uses more memory

public class Recursion {

    public Recursion() {
//        System.out.println(powerOf(2,3));
//        System.out.println(factorial(10));
//        count(5);
    }
    int powerOf(int base, int power){
        if(power < 1){
            return 1;
        }
            return base * powerOf(base, power - 1);
    }

    int factorial(int i){
        if(i < 1)return 1;
       return i * factorial(i -1);
    }

     void count(int i) {
        if(i < 1) return;
         System.out.println("count is " + i);
        count(i - 1);
    }
}
