# Heapsort — Practice

Two practice problems: build a max-heap by swimming each element up in turn, and sort an array by adding its values to a binary search tree and reading them back in order. Each problem has a JUnit suite.

## Prerequisites

- JDK 17+ (JUnit 6 requires it).
- The JUnit jar is already vendored in `lib/`; there is nothing to download.

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  lib/
    junit-platform-console-standalone-6.1.0.jar
  src/
    main/
      practice/
        BuildHeapTopDown.java           # build a max-heap by swimming each element up
        TreeSort.java                   # sort with a binary search tree
      bst/
        BinarySearchTree.java           # the binary search tree from the search tree chapter
      stack/
        Stack.java                      # the Stack ADT, used by the tree's iterator
        LinkedStack.java                # linked implementation of Stack
      demo/                             # one demo per problem class
        BuildHeapTopDownDemo.java
        TreeSortDemo.java
    test/
      practice/
        BuildHeapTopDownTest.java
        TreeSortTest.java
  scripts/
    test.sh                             # compile and run the JUnit tests
    run.sh                              # compile and run one demo
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite.
- `scripts/test.sh practice.TreeSortTest` — compiles everything and runs only that test class.
- `scripts/run.sh demo.TreeSortDemo` — compiles everything and runs that one demo. Every problem class has its own demo, `<Class>Demo`.

## What's here

- `practice.BuildHeapTopDown` — `buildHeapTopDown`, which rearranges an array into a max-heap by swimming each element up into the heap formed by the slots before it.
- `practice.TreeSort` — `treeSort`, which sorts an array of distinct values by adding them to a `BinarySearchTree` and iterating the tree in order.
- `bst.BinarySearchTree<T>`, `stack.Stack<T>`, and `stack.LinkedStack<T>` — the binary search tree from the search tree chapter and the stack its iterator uses, copied unchanged so this code compiles and runs on its own. The tree stores no duplicates.
- `practice.BuildHeapTopDownTest` and `practice.TreeSortTest` — tests for the two problems.
- `demo.BuildHeapTopDownDemo` and `demo.TreeSortDemo` — one demo per problem class, each on the example array from the notes.
