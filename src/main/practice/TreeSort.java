package practice;

import bst.BinarySearchTree;

/** A solution to the problem of sorting with a binary search tree. */
public final class TreeSort {

  private TreeSort() {
    // This class should not be instantiated!
  }

  // Sorts arr in ascending order by adding its values to a binary search tree
  // and reading them back in order. Assumes arr is not null and its values are
  // distinct.
  public static void treeSort(int[] arr) {
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    for (int value : arr) {
      tree.add(value);
    }
    int i = 0;
    for (int value : tree) {
      arr[i] = value;
      i++;
    }
  }
}
