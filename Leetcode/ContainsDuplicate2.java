import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public static boolean containsDuplicate2(int nums[], int k) {
        Map<Integer, Integer> hm = new HashMap <>(); 
        for(int i = 0; i < nums.length; i++) {
            if(!hm.containsKey(nums[i])) {
                hm.put(nums[i], i);
            }
            else {
                int PastIndex = hm.get(nums[i]);
                if(Math.abs(PastIndex - i) <= k) {
                    return true;
                }
                else {
                    hm.put(nums[i], i);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        int k = 3;
        System.out.println(containsDuplicate2(nums, k));
    }
}