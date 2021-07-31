public class TerminationBlocker {

    public static void main(String[] args) throws Exception{
        com.sun.star.comp.helper.Bootstrap.bootstrap();
        while (true) {
            Thread.sleep(1000);
        }
    }

}
