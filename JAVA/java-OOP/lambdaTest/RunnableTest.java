package lambdaTest;

public class RunnableTest {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++)
                    System.out.println(i);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
