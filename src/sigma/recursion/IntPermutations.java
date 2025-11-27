package sigma.recursion;

import java.util.ArrayList;
import java.util.List;

class IntPermutations {
    public List<List<Integer>> permute(int[] nums) {
        return permutationsList(new ArrayList<>(), nums);
    }

    // p: processed part (current permutation)
    // up: unprocessed numbers array
    private static List<List<Integer>> permutationsList(List<Integer> p, int[] up) {
        List<List<Integer>> ans = new ArrayList<>();

        // Base case: no unprocessed numbers left
        if (up.length == 0) {
            ans.add(new ArrayList<>(p));
            return ans;
        }

        // Take the first number in unprocessed
        int first = up[0];

        // Insert it at every possible position in the processed list
        for (int i = 0; i <= p.size(); i++) {
            List<Integer> newP = new ArrayList<>(p);  // copy processed
            newP.add(i, first);                       // insert at position i

            // Prepare remaining unprocessed array
            int[] newUp = new int[up.length - 1];
            System.arraycopy(up, 1, newUp, 0, up.length - 1);

            // Recurse
            ans.addAll(permutationsList(newP, newUp));
        }

        return ans;
    }

    // Test
    public static void main(String[] args) {
        IntPermutations sol = new IntPermutations();
        int[] nums = {1, 2, 3};
        List<List<Integer>> perms = sol.permute(nums);
        System.out.println(perms);
    }
}


