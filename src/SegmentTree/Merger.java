package SegmentTree;

/**
 * 把两个对象融合在一起
 * @param <E>
 */
public interface Merger<E> {
    E merge(E a, E b);
}
