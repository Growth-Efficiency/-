package hello.core.singleton;

public class SingletonServiceTest {

    private static final SingletonServiceTest instance = new SingletonServiceTest();

    public static SingletonServiceTest getInstance() {
        return instance;
    }

    private SingletonServiceTest() {}

    public static void main(String[] args) {
        System.out.println("싱글톤 실행");
    }

}
