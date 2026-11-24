package demo;

import java.util.Arrays;
import practice.TreeSort;

/** A demo of TreeSort on the notes' example array. */
public final class TreeSortDemo {

  private TreeSortDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] arr = {4, 2, 6, 1, 3, 5};
    System.out.println("before: " + Arrays.toString(arr));

    // Expect [1, 2, 3, 4, 5, 6].
    TreeSort.treeSort(arr);
    System.out.println("after:  " + Arrays.toString(arr));
  }
}
