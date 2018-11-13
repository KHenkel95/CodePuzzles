//Find the smallest integer in the array
public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int min = Math.min(args[0], args[1]);
        for (int x = 3; x < args.length; x++){
            if (args[x]<args[x-1]&&args[x]<min){
                min = args[x];
            }
            else if(args[x-1]<args[x]&&args[x-1]<min){
                min = args[x-1];
            }
        }
        return min;
    }
    public static void main(String[] args){
        int[] arr = {10, 5, 8, 12, 46};

        System.out.println(findSmallestInt(arr));
    }
}
