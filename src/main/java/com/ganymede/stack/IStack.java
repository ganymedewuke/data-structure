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

    /**
     * 查看栈顶的元素
     *
     * @return
     */
    E peek();

}
