package DataStructureAndAlgorithm;

public class BigO {
int sum;
    public BigO() {
        for(int i =0; i<1000; i++){
            sum +=i;
        }

    }
  public void addUp(int n){
        int sum;
        sum = n * (n + 1)/2;
       System.out.println("addup "+ sum);
    }
    public int printSum(){
        return sum;
    }
}
