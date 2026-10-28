package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Tests for the problem of building a max-heap top-down. */
public class BuildHeapTopDownTest {

  @Test
  public void emptyArrayStaysEmpty() {
    int[] arr = {};
    BuildHeapTopDown.buildHeapTopDown(arr);
    assertEquals(0, arr.length);
  }

  @Test
  public void singleElementStaysPut() {
    int[] arr = {7};
    BuildHeapTopDown.buildHeapTopDown(arr);
    assertEquals(7, arr[0]);
  }

  @Test
  public void largestValueEndsAtTheRoot() {
    int[] arr = {5, 3, 8, 1, 9, 2};
    BuildHeapTopDown.buildHeapTopDown(arr);
    assertEquals(9, arr[0]);
  }

  @Test
  public void unsortedArrayBecomesAMaxHeap() {
    int[] arr = {5, 3, 8, 1, 9, 2};
    BuildHeapTopDown.buildHeapTopDown(arr);
    assertTrue(isMaxHeap(arr));
  }

  @Test
  public void unsortedArrayGetsTheTopDownArrangement() {
    int[] arr = {5, 3, 8, 1, 9, 2};
    BuildHeapTopDown.buildHeapTopDown(arr);
    assertElements(new int[] {9, 8, 5, 1, 3, 2}, arr);
  }

  @Test
  public void ascendingArrayBecomesAMaxHeap() {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    BuildHeapTopDown.buildHeapTopDown(arr);
    assertTrue(isMaxHeap(arr));
  }

  @Test
  public void duplicatesBecomeAMaxHeap() {
    int[] arr = {4, 7, 4, 7, 1};
    BuildHeapTopDown.buildHeapTopDown(arr);
    assertTrue(isMaxHeap(arr));
  }

  // True if no element of arr is larger than its parent.
  private static boolean isMaxHeap(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[(i - 1) / 2]) {
        return false;
      }
    }
    return true;
  }

  private static void assertElements(int[] expected, int[] actual) {
    assertEquals(expected.length, actual.length);
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual[i]);
    }
  }
}
