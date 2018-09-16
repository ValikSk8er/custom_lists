package com.valiksk8;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LinkedListTest {

    private LinkedList<Integer> linkedList;

    @Before
    public void setUp() {
        linkedList = new LinkedList<>();
    }

    @Test
    public void test_add_one_value_and_check_it_added() {
        int expected = 1;
        linkedList.add(expected);
        assertThat(linkedList.get(0), is(expected));
    }

    @Test
    public void test_add_more_than_one_value_and_check_they_added() {
        int expected = 3;
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        assertThat(linkedList.get(2), is(expected));
    }

    @Test
    public void test_add_zero_as_value() {
        int expected = 0;
        linkedList.add(expected);
        assertThat(linkedList.get(0), is(expected));
    }

    @Test
    public void test_add_value_less_than_zero() {
        int expected = -10;
        linkedList.add(expected);
        assertThat(linkedList.get(0), is(expected));
    }

    @Test
    public void test_size_equals_zero_for_emtpy_list() {
        assertThat(linkedList.size(), is(0));
    }

    @Test
    public void test_size_for_filled_list() {
        int expected = 3;
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        assertThat(linkedList.size(), is(expected));
    }

    @Test
    public void test_size_changed_after_remove_value() {
        int expected = 2;
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.remove(1);
        assertThat(linkedList.size(), is(expected));
    }

    @Test
    public void test_size_not_change_after_get_value() {
        linkedList.add(1);
        linkedList.get(0);
        assertThat(linkedList.size(), is(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_get_trow_exception_for_emtpy_list() {
        linkedList.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_get_trow_exception_if_index_out_of_bound() {
        linkedList.add(1);
        linkedList.get(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_get_trows_exception_if_index_less_zero() {
        linkedList.get(-1);
    }

    @Test
    public void test_get_returns_correct_value_all_time() {
        int expected = 3;
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        assertThat(linkedList.get(2), is(expected));
        assertThat(linkedList.get(2), is(expected));
    }

    @Test
    public void test_get_returns_correct_for_different_values() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        assertThat(linkedList.get(0), is(1));
        assertThat(linkedList.get(2), is(3));
    }

    @Test
    public void test_remove_by_index_that_last_element_shifted() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.remove(1);
        assertThat(linkedList.get(1), is(3));
    }

    @Test
    public void test_remove_by_value() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        Integer expectedResult = 3;
        linkedList.remove(Integer.valueOf(2));
        Assert.assertEquals(expectedResult, linkedList.get(1));
    }

    @Test(expected = NullPointerException.class)
    public void test_remove_by_incorrect_value_trows_exception() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.remove(Integer.valueOf(4));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_remove_by_incorrect_index_trows_exception() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.remove(3);
    }
}