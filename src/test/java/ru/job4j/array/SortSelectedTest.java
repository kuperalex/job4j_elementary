package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3Num() {
        int[] data = new int[] {10, 8, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {8, 9, 10};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5Num() {
        int[] data = new int[] {16, 19, 17, 15, 18};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {15, 16, 17, 18, 19};
        assertThat(result).containsExactly(expected);
    }
}