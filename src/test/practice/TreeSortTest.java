package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Tests for the problem of sorting with a binary search tree. */
public class TreeSortTest {

  @Test
  public void emptyArrayStaysEmpty() {
    int[] arr = {};
    TreeSort.treeSort(arr);
    assertEquals(0, arr.length);
  }

  @Test
  public void singleElementStaysPut() {
    int[] arr = {7};
    TreeSort.treeSort(arr);
    assertElements(new int[] {7}, arr);
  }

  @Test
  public void problemExampleGetsSorted() {
    int[] arr = {4, 2, 6, 1, 3, 5};
    TreeSort.treeSort(arr);
    assertElements(new int[] {1, 2, 3, 4, 5, 6}, arr);
  }

  @Test
  public void alreadySortedArrayIsUnchanged() {
    int[] arr = {1, 2, 3, 4, 5};
    TreeSort.treeSort(arr);
    assertElements(new int[] {1, 2, 3, 4, 5}, arr);
  }

  @Test
  public void reverseSortedArrayGetsSorted() {
    int[] arr = {5, 4, 3, 2, 1};
    TreeSort.treeSort(arr);
    assertElements(new int[] {1, 2, 3, 4, 5}, arr);
  }

  @Test
  public void negativesSortBeforePositives() {
    int[] arr = {-3, 1, -7, 4};
    TreeSort.treeSort(arr);
    assertElements(new int[] {-7, -3, 1, 4}, arr);
  }

  private static void assertElements(int[] expected, int[] actual) {
    assertEquals(expected.length, actual.length);
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual[i]);
    }
  }
}
