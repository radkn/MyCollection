package test.block8.iterator_pattern;

public class IteratorApp {
    public static void main(String[] args) {

        Tasks ca = new Tasks();

        MyIterator iter = ca.getIterator();
        while (iter.hasNext()){
            System.out.println((String)iter.next());
        }
    }
}
