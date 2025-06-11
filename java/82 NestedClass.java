package code;
import java.util.Arrays;
class ArrayOperations{
	int nums[];
	
	public ArrayOperations(int[] nums) {
		this.nums = Arrays.copyOf(nums, nums.length);
	}

	class Statistics {
		double mean() {
			double sum=0;
			for(int num : nums) {
				sum+=num;
			}
			return sum/nums.length;
			
		}
		double median() {
			int[] sortedNums = Arrays.copyOf(nums, nums.length);
            Arrays.sort(sortedNums);

            int middle = sortedNums.length / 2;

            if (sortedNums.length % 2 == 1) {
                return sortedNums[middle];
            } else {
                return (sortedNums[middle - 1] + sortedNums[middle]) / 2.0;
            }
			
		}
	}
}
public class Test {
	public static void main(String[] args) {
		ArrayOperations a1=new ArrayOperations(new int[]{1,3,5,9});
		ArrayOperations.Statistics  s1=a1.new Statistics ();
		System.out.println(s1.mean()+" "+s1.median());
	}
}