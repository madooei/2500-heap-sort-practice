package demo;

import java.util.Arrays;
import practice.BuildHeapTopDown;

/** A demo of BuildHeapTopDown on the array the notes trace. */
public final class BuildHeapTopDownDemo {

  private BuildHeapTopDownDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] arr = {5, 3, 8, 1, 9, 2};
    System.out.println("before: " + Arrays.toString(arr));

    // Each element swims up in turn. Expect the max-heap [9, 8, 5, 1, 3, 2].
    BuildHeapTopDown.buildHeapTopDown(arr);
    System.out.println("after:  " + Arrays.toString(arr));
  }
}
