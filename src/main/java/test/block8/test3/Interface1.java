package test.block8.test3;

@FunctionalInterface
public interface Interface1 {
    void dosms();
    default void dodef(){
        System.out.println("defoult");
    }

    static void dodef2(){
        System.out.println("defoult");
    }
}
