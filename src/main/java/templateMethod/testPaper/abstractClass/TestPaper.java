package templateMethod.testPaper.abstractClass;

public abstract class TestPaper {

    public void testQuestion1() {
        System.out.println("Who is most handsome? A. Piers B. Jax");
        System.out.println("Answer: " + answer1());
    }

    public void testQuestion2() {
        System.out.println("Who is most beautiful? A. Fiers B. Jax");
        System.out.println("Answer: " + answer2());
    }

    public void testQuestion3() {
        System.out.println("Who am I? A. Piers B. Jax");
        System.out.println("Answer: " + answer3());
    }

    public abstract String answer1();

    public abstract String answer2();

    public abstract String answer3();

}
