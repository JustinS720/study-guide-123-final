import static org.junit.Assert.*;

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
}
