package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("A");
        collection.add("B");
        collection.add("C");
        collection.add("A");
        System.out.println(collection);
        Collection collectionset = new HashSet();
        System.out.println(collectionset.add("A"));
        collectionset.add("B");
        collectionset.add("C");
        System.out.println(collectionset.add("A"));
        System.out.println(collectionset);
        System.out.println(collectionset.contains("A"));
        for (Object o : collectionset) {
            System.out.println(o);
        }
        System.out.println(collection.size());
        System.out.println(collectionset.size());
        Collection x=new ArrayList();
//        long m=Integer.MAX_VALUE-1;
//        for (long i = 0; i < m*2; i++) {
//            x.add(i);
//        }
//        System.out.println(x.size());
//        System.out.println(x);
        System.out.println(collectionset.isEmpty());
        collectionset.clear();
        System.out.println(collectionset.isEmpty());
        System.out.println(collectionset);
        System.out.println(collectionset.size());






//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            @Override
//            public Iterator<String> iterator() {
//                return null;
//            }
//
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @Override
//            public <T> T[] toArray(T[] a) {
//                return null;
//            }
//
//            @Override
//            public boolean add(String s) {
//                return false;
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection<? extends String> c) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//
//            }
//
//            @Override
//            public boolean equals(Object o) {
//                return false;
//            }
//
//            @Override
//            public int hashCode() {
//                return 0;
//            }


    }
}
