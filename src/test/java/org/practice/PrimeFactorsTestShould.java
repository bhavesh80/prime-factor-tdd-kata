package org.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PrimeFactorsTestShould {


    @Test
    @DisplayName("return an empty list for 1")
    void return_an_empty_list_for_1() {
        assertThat(PrimeFactors.factorsOf(1)).isEqualTo(Collections.emptyList());
    }

    @Test
    @DisplayName("return a list with 2 for  2")
    void return_an_empty_for_2() {
        assertThat(PrimeFactors.factorsOf(2)).isEqualTo(List.of(2));
    }

    @Test
    @DisplayName("return a list with 3 for 3")
    void return_a_list_with_3_for_3() {
        assertThat(PrimeFactors.factorsOf(3)).isEqualTo(List.of(3));
    }

    @Test
    @DisplayName("return a list with 2,2 for 4")
    void return_a_list_with_2_2_for_4() {
        assertThat(PrimeFactors.factorsOf(4)).isEqualTo(List.of(2, 2));
    }

    @Test
    @DisplayName("return a list with 5 for 5")
    void return_a_list_with_5_for_5() {
        assertThat(PrimeFactors.factorsOf(5)).isEqualTo(List.of(5));
    }

    @Test
    @DisplayName("return a list with 2,3 for 6")
    void return_a_list_with_2_3_for_6() {
        assertThat(PrimeFactors.factorsOf(6)).isEqualTo(List.of(2, 3));
    }

    @Test
    @DisplayName("return a list with 2,2,2 for 8")
    void return_a_list_with_2_2_2_for_8() {
        assertThat(PrimeFactors.factorsOf(8)).isEqualTo(List.of(2, 2, 2));
    }


    @Test
    @DisplayName("return a list with 3,3 for 9")
    void return_a_list_with_3_3_for_9() {
        assertThat(PrimeFactors.factorsOf(9)).isEqualTo(List.of(3, 3));
    }

    @Test
    @DisplayName("return a list with 2,2,2,5,3,3 for 360")
    void return_a_list_with_2_2_2_5_3_3_for_360() {
        assertThat(PrimeFactors.factorsOf(360)).isEqualTo(List.of(2, 2, 2, 3, 3, 5));
    }

    @Test
    @DisplayName("return a list with 2,3,3,5,7,11,13 for 90090")
    void return_a_list_with_2_3_3_5_7_11_13_for_90090() {
        assertThat(PrimeFactors.factorsOf(90090)).isEqualTo(List.of(2, 3, 3, 5, 7, 11, 13));
    }
}
