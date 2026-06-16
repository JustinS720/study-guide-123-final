import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class FinalPracticeTest {
    @Test
    void testOddIndexSum_oddLengthList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(95, actual);
    }

    // TODO: Make more tests for oddIndexSum
    @Test
    void testOddIndexSum_SingularOdd() {
        ListNode list = new ListNode(1, new ListNode(2));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(2, actual);
    }

    @Test
    void testOddIndexSum_null() {
        ListNode list = null;
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(0, actual);
    }

    // TODO: Make thorough tests for ALL the questions on the study guide

    // LargestLastThree

    @Test
    void testLargestLastThree() {
        ListNode list = new ListNode(7, new ListNode(3, new ListNode(19, new ListNode(21, new ListNode(14, new ListNode(33, new ListNode(8, new ListNode(26, new ListNode(11, new ListNode(5))))))))));;
        int actual = FinalPractice.largestLastThree(list);
        assertEquals(26, actual);
    }

    @Test
    void testLargestLastThree_OnlyThree() {
        ListNode list = new ListNode(7, new ListNode(3, new ListNode(19)));;
        int actual = FinalPractice.largestLastThree(list);
        assertEquals(19, actual);
    }

    @Test
    void testLargestLastThree_OnlyOne() {
        ListNode list = new ListNode(7);
        int actual = FinalPractice.largestLastThree(list);
        assertEquals(7, actual);
    }

    @Test
    void testLargestLastThree_null() {
        ListNode list = null;
        int actual = FinalPractice.largestLastThree(list);
        assertEquals(0, actual);
    }

    // evenLeafNodesSum

    @Test
    void testEvenLeafNodesSum() {
        TreeNode root = new TreeNode(12);

        root.left = new TreeNode(6);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(8);
        root.left.left.left = new TreeNode(3);

        root.right = new TreeNode(18);
        root.right.right = new TreeNode(20);
        root.right.right.right = new TreeNode(22);
        root.right.left = new TreeNode(16);

        int actual = FinalPractice.evenLeafNodesSum(root);
        assertEquals(46, actual);
    }

    @Test
    void testEvenLeafNodesSingularSum() {
        TreeNode root = new TreeNode(12);

        root.left = new TreeNode(6);

        int actual = FinalPractice.evenLeafNodesSum(root);
        assertEquals(6, actual);
    }

    @Test
    void testEvenLeafNodesOnlyOdd() {
        TreeNode root = new TreeNode(12);

        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        int actual = FinalPractice.evenLeafNodesSum(root);
        assertEquals(0, actual);
    }

    @Test
    void testEvenLeafNodesRoot() {
        TreeNode root = new TreeNode(12);

        int actual = FinalPractice.evenLeafNodesSum(root);
        assertEquals(12, actual);
    }

    // oddBranchNodesSum

    @Test
    void testOddBranchNodesSum() {
        TreeNode root = new TreeNode(15);

        root.left = new TreeNode(9);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(11);
        root.left.left.left = new TreeNode(2);
        root.left.left.right = new TreeNode(6);

        root.right = new TreeNode(4);
        root.right.right = new TreeNode(30);
        root.right.left = new TreeNode(21);
        root.right.left.right = new TreeNode(23);

        int actual = FinalPractice.oddBranchNodesSum(root);
        assertEquals(45, actual);
    }

    @Test
    void testOddBranchNodesSumNull() {
        TreeNode root = null;
        int actual = FinalPractice.oddBranchNodesSum(root);
        assertEquals(0, actual);
    }

    @Test
    void testOddBranchNodesSumNoBranchNode() {
        TreeNode root = new TreeNode(5);
        int actual = FinalPractice.oddBranchNodesSum(root);
        assertEquals(0, actual);
    }

    @Test
    void testOddBranchNodesSumSingularBranchNode() {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(2);

        int actual = FinalPractice.oddBranchNodesSum(root);
        assertEquals(5, actual);
    }

    @Test
    void testOddBranchNodesSumOnlyEven() {
        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(8);

        int actual = FinalPractice.oddBranchNodesSum(root);
        assertEquals(0, actual);
    }

    // mapCount

    @Test
    void testMapCount() {
        ListNode list = new ListNode(4, new ListNode(34, new ListNode(4, new ListNode(16, new ListNode(4, new ListNode(16, new ListNode(29, new ListNode(8, new ListNode(8)))))))));

        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(4,3);
        expected.put(8,2);
        expected.put(16,2);
        expected.put(29,1);
        expected.put(34,1);

        Map<Integer, Integer> actual = FinalPractice.mapCount(list);
        assertEquals(expected, actual);
    }

    @Test
    void testMapCountNull() {
        ListNode list = null;
        Map<Integer, Integer> expected = null;

        Map<Integer, Integer> actual = FinalPractice.mapCount(list);
        assertEquals(expected, actual);
    }

    @Test
    void testMapCountSameNumber() {
        ListNode list = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1)))))))));;
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 9);

        Map<Integer, Integer> actual = FinalPractice.mapCount(list);
        assertEquals(expected, actual);
    }

    @Test
    void testMapCountSingular() {
        ListNode list = new ListNode(67); // haha that number
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(67, 1);

        Map<Integer, Integer> actual = FinalPractice.mapCount(list);
        assertEquals(expected, actual);
    }

}
