package com.ctci.ds.stack;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StackImplTest {
    private StackImpl stackImpl;
    private int CAPACITY = 3;

    @Before
    public void setUp() {
        stackImpl = new StackImpl(CAPACITY);
    }

    @Test
    public void push() {
        assertThat(stackImpl.push(1)).isTrue();
        assertThat(stackImpl.peek()).isEqualTo(1);
        assertThat(stackImpl.pop()).isEqualTo(1);
        assertThat(stackImpl.isEmpty()).isTrue();

        /*assertThat(stackImpl.push(2)).isTrue();
        assertThat(stackImpl.push(3)).isTrue();
        assertThat(stackImpl.push(4)).isFalse();*/
    }

    @Test
    public void pop() {
    }

    @Test
    public void peek() {

    }
}