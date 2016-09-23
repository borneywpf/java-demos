package com.thinkdevos.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by borney on 9/1/16.
 */
public class ArrayListTests {

    Object[] elementData = new Object[]{"a", "b", "c", "d", "a", "b"};
    int size = elementData.length;
    int modCount = 0;

    public static void main(String[] args) {
        ArrayListTests tests = new ArrayListTests();
//        tests.testRemove();
//        tests.batchRemove(new ArrayList<String>() {
//            {
//                add("a");
//                add("b");
//            }
//        }, false);
//
//        tests.testSublist();

    }

    @org.junit.Test
    public void testIterator_loop_remove() {
        List<String> list = new ArrayList<String>() {
            {
                add("a");
                add("b");
                add("c");
                add("d");
            }
        };

        System.out.println("before : " + list);

        for (String s : list) {
            System.out.println(list.remove(s));
        }
    }
    @org.junit.Test
    public void testIterator_iterator_remove_no_next() {
        List<String> list = new ArrayList<String>() {
            {
                add("a");
                add("b");
                add("c");
                add("d");
            }
        };

        System.out.println("before : " + list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
        }
    }

    @org.junit.Test
    public void testIterator_iterator_hasnext() {
        List<String> list = new ArrayList<String>() {
            {
                add("a");
                add("b");
                add("c");
                add("d");
            }
        };

        System.out.println("before : " + list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            list.add("e");
            iterator.next();
        }
    }

    private void testSublist() {
        List<String> list = new ArrayList<String>() {
            {
                add("a");
                add("b");
            }
        };
        List<String> subList = list.subList(0, list.size());

        list.add("c");

        System.out.println("list.size = " + list.size());

        System.out.println("subList.size = " + subList.size());
    }

    private void testRemove() {
        List<String> list = new ArrayList<String>() {
            {
                add("a");
                add("b");
                add("c");
                add("a");
                add("b");
                add("d");
            }
        };
        System.out.println("list = " + list);
        List<String> removeList = new ArrayList<String>() {
            {
                add("a");
                add("b");
            }
        };
        System.out.println("removeList = " + removeList);
        list.removeAll(removeList);
        System.out.println("list = " + list);
    }

    private boolean batchRemove(Collection<?> c, boolean complement) {
        final Object[] elementData = this.elementData;
        int r = 0, w = 0;
        boolean modified = false;
        try {
            for (; r < size; r++)
                if (c.contains(elementData[r]) == complement)
                    elementData[w++] = elementData[r];
        } finally {
            // Preserve behavioral compatibility with AbstractCollection,
            // even if c.contains() throws.
            if (r != size) {
                System.arraycopy(elementData, r,
                        elementData, w,
                        size - r);
                w += size - r;
            }
            if (w != size) {
                // clear to let GC do its work
                for (int i = w; i < size; i++)
                    elementData[i] = null;
                modCount += size - w;
                size = w;
                modified = true;
            }
        }
        for (int i = 0; i < this.elementData.length; i++) {
            System.out.println("elementData[" + i + "] = " + this.elementData[i]);
        }
        return modified;
    }
}
