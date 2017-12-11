
public class ArrayPractice
{
    int [][] array;
    double sum = 0;
    int count = 0;
    public double averageArray(int[][] nums){
        for(int row = 0; row < 4; row++){
            for(int col=0; col<3; col++){
                sum += nums[row][col];
                count++;
            }
        }
        sum = (sum/count);
        return sum;
    }
}
