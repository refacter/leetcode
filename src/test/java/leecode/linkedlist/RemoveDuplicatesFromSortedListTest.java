package leecode.linkedlist;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicatesFromSortedListTest {
  RemoveDuplicatesFromSortedList solution;

  @Before
  public void init() {
    solution = new RemoveDuplicatesFromSortedList();
  }

  @Test
  public void deleteDuplicates() {
    ListNode listNode =
        solution.deleteDuplicates(ListNodeBuilder.buildNode(new int[] {1, 1, 2, 2, 2, 3, 3}));
    ListNode listNode1 = solution.deleteDuplicates(listNode);
    assertThat(ListNodePrinter.toArrayString(listNode1), Is.is("[1,2,3]"));
  }
}
