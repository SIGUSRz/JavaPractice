package LeetCode;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;

public class Test_1 {
    private Two_Sum solution = new Two_Sum();

    @Test
    public void sample1() {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        int[] ans = new int[] {0, 1};
        assertThat(Arrays.equals(ans, solution.twoSum(nums, target)));
    }
}
