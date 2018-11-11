//You get an array of numbers, write a method to return the sum of all of the positives numbers.
public class SumOfPositive {
    public static int sum(int[] arr)
    {
        int sum = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > 0)
            {
                sum += arr[i];
            }
        }

        return sum;
    }
}
