package practice;

/** A solution to the problem of building a max-heap top-down. */
public final class BuildHeapTopDown {

  private BuildHeapTopDown() {
    // This class should not be instantiated!
  }

  // Rearranges arr into a max-heap by swimming each element up in turn.
  // Assumes arr is not null.
  public static void buildHeapTopDown(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      swim(arr, i);
    }
  }

  // Moves arr[i] up until it is no larger than its parent.
  private static void swim(int[] arr, int i) {
    while (i > 0 && arr[i] > arr[parent(i)]) {
      swap(arr, i, parent(i));
      i = parent(i);
    }
  }

  // The parent of the node at index i. Pre: i > 0.
  private static int parent(int i) {
    return (i - 1) / 2;
  }

  // Exchanges arr[i] and arr[j].
  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
