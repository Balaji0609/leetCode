package leetCode;

public class Merge_Sorted_Array_88 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int index1 = m-1;
        int index2 = n-1;
        int size = nums1.length-1;
        while(index1 > -1 && index2 > -1)
        {
            if(nums1[index1] > nums2[index2])
            {
                nums1[size--] = nums1[index1--]; 
            }
            else
            {
                nums1[size--] = nums2[index2--]; 
            }
        }
        while(index2 > -1)
        {
            nums1[size--] = nums2[index2--]; 
        }
        
    }
}
