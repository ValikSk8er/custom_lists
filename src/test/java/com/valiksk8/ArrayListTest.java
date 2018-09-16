package com.valiksk8;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayListTest {
    private ArrayList<Integer> arrayList;

    @Before
    public void setUp(){
        arrayList = new ArrayList<>();
    }

    @Test
    public void test_add_one_value_and_check_it_added() {
        int expected = 1;
        arrayList.add(expected);
        assertThat(arrayList.get(0), is(expected));
    }

    @Test
    public void test_add_more_than_one_value_and_check_they_added() {
        int expected = 3;
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        assertThat(arrayList.get(2), is(expected));
    }

    @Test
    public void test_add_zero_as_value() {
        int expected = 0;
        arrayList.add(expected);
        assertThat(arrayList.get(0), is(expected));
    }

    @Test
    public void test_add_value_less_than_zero() {
        int expected = -10;
        arrayList.add(expected);
        assertThat(arrayList.get(0), is(expected));
    }

    @Test
    public void test_size_equals_zero_for_emtpy_list() {
        assertThat(arrayList.size(), is(0));
    }

    @Test
    public void test_size_for_filled_list() {
        int expected = 3;
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        assertThat(arrayList.size(), is(expected));
    }

    @Test
    public void test_size_changed_after_remove_value() {
        int expected = 2;
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.remove(1);
        assertThat(arrayList.size(), is(expected));
    }

    @Test
    public void test_size_not_change_after_get_value() {
        arrayList.add(1);
        arrayList.get(0);
        assertThat(arrayList.size(), is(1));
    }

    @Test
    public void test_get_return_null_for_emtpy_list() {
        assertEquals(arrayList.get(0), null);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_get_trow_exception_if_index_out_of_bound() {
        arrayList.add(1);
        arrayList.get(100);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_get_trows_exception_if_index_less_zero() {
        arrayList.get(-1);
    }

    @Test
    public void test_get_returns_correct_value_all_time() {
        int expected = 3;
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        assertThat(arrayList.get(2), is(expected));
        assertThat(arrayList.get(2), is(expected));
    }

    @Test
    public void test_get_returns_correct_for_different_values() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        assertThat(arrayList.get(0), is(1));
        assertThat(arrayList.get(2), is(3));
    }

    @Test
    public void test_remove_by_index_that_last_element_shifted() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.remove(1);
        assertThat(arrayList.get(1), is(3));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_remove_by_incorrect_index_trows_exception() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.remove(-1);
    }
}