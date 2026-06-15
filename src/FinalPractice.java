public class FinalPractice {
    public static void main(String[] args) {
        // Feel free to call your methods here to experiment

        // YOU MUST ALSO MAKE THOROUGH TESTS FOR EVERY METHOD 
    }

    /**
     * Return the sum of the values at odd indexes in a linked list.
     * 
     * Assumes head is at index 0.
     * 
     * If passed a null head, returns 0.
     * 
     * @param head the head of the linked list
     * @return the sum of the values at odd indexes
     */
    public static int oddIndexSum(ListNode head) {
        ListNode curr = head;
        int i = 0;
        int sum = 0;

        if (head == null) {
            return 0;
        }

        while (curr != null) {
            if (i % 2 != 0) {
                sum += curr.data;
            }
            i++;
            curr = curr.next;
        }
        return sum;
    }

    // TODO: implement the rest of the study guide AND MAKE GOOD UNIT TESTS

    public static int largestLastThree(ListNode head) {

        if (head == null) return 0;

        ListNode curr = head;
        int count = 0;
        int highest = Integer.MIN_VALUE;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        curr = head;

        for (int i = 0; i < count - 3; i++) {
            curr = curr.next;
        }

        while (curr != null) {
            if (curr.data > highest) {
                highest = curr.data;
            }
            curr = curr.next;
        }

        return highest;
    }
}
