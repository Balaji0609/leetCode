package leetCode;

public class Construct_the_Rectangle_492 
{
    public int[] constructRectangle(int area) 
    {
        int num1 = (int)Math.sqrt(area);
        while(area%num1 != 0)
            num1--;
        return new int[]{area/num1,num1};
        
    }
}
