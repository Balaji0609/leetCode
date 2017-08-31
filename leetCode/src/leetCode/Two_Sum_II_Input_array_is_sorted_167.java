package leetCode;

public class Two_Sum_II_Input_array_is_sorted_167 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int[] retArr = new int[2];
        if(numbers.length == 0 || numbers.length < 2)
            return retArr;
        int start = 0;
        int end = numbers.length-1;
        while(start < end)
        {
            int val = numbers[start] + numbers[end];
            if(val == target)
            {
                retArr[0] = start+1;
                retArr[1] = end +1;
                return retArr;
            }
            if(val < target)
                start++;
            else
                end--;
        }
        return retArr;
    }
}
