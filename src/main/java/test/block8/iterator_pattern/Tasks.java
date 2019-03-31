package test.block8.iterator_pattern;

public class Tasks implements Container {
    private String[] tasks = {"house","son","tree","",};

    @Override
    public MyIterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements MyIterator{

        int index = 0;

        @Override
        public boolean hasNext() {

            return index < tasks.length;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
