package DataStructureAndAlgorithm;

//interpolation search = improvement over binary search best used for "uniformly" distributed data
// "guesses" where a value might be based on calculated probe results
// if probe is incorrect, search area is narrowed, and a new probe is calculated
// average case: O(log(log(n)))
// worst case: O(n) [values increase exponentially]


public class CustomInterpolationSearch {
    int[] array = {1,2,4,5,6,7,8,9,34};
    int target = 6;
    public CustomInterpolationSearch() {
        int index = interpolationSearch(array,target);
        if(index != -1){
            System.out.println("Element found at " + index);
        }else {
            System.out.println("Element not found");
        }
    }

   int interpolationSearch(int[] userArray, int userTarget){
        int low = 0;
        int high = userArray.length - 1;
        while (userTarget >= userArray[low] && userTarget <= userArray[high] && low <= high){
            int probe = low + (high - low)
                            * (userTarget - userArray[low])
                            / (userArray[high] - userArray[low]);

            System.out.println("probe: " + probe);

            if(userArray[probe]== userTarget){
                return probe;
            }else if(userArray[probe] < userTarget){
                low = probe + 1;
            }else {
                high = probe - 1;
            }
        }
        return - 1;
    }

}
