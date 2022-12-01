package net.wenzuo.codes.designpattern.iterator;

/**
 * @author Catch
 * @since 2022-04-01
 */
public class NameList implements List {

    private final String[] names;

    public NameList(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator iterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < names.length;
        }

        @Override
        public Object next() {
            if (!this.hasNext()) {
                throw new IllegalStateException("没有元素可以遍历了");
            }
            return names[cursor++];
        }

    }

}