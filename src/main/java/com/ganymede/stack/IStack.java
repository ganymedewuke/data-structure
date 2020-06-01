package com.ganymede.stack;

/**
 * 定义栈的基本操作接口
 *
 * @param <E>
 */
public interface IStack<E> {
    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();

}
