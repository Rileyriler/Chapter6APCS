public class ArrayDriver
{
    public static void main(String[] args)
    {
        int [][]myArray1 = {{1, 2, 3},
                        {4, 5, 6},
                         {7, 8, 9},
                          {10, 11, 12}};
        
        ArrayPractice practice = new ArrayPractice();
        practice.averageArray(myArray1);
        
        System.out.println("The average of the Array is" + practice.sum);
        
        
        
    }
}
