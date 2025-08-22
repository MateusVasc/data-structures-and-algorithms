package algorithms.insertion_sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {

    private int[] sortedArr;
    private int[] reverseSortedArr;
    private int[] shuffledArr;

    @BeforeEach
    void init() {
        sortedArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        reverseSortedArr = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        shuffledArr = new int[]{5, 2, 4, 6, 1, 3};
    }

    @Test
    @DisplayName("Shuffled array should be correctedly sorted")
    void testShuffledArr() {
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] got = InsertionSort.sort(shuffledArr);
        assertArrayEquals(expected, got);
    }

    @Test
    @DisplayName("Sorted array should remain the same")
    void testSortedArr() {
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] got = InsertionSort.sort(sortedArr);
        assertArrayEquals(expected, got);
    }

    @Test
    @DisplayName("Reversed array should be correctedly sorted")
    void testReversedArr() {
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] got = InsertionSort.sort(reverseSortedArr);
        assertArrayEquals(expected, got);
    }
}
