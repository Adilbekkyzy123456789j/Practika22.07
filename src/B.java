public class B extends Bank{
    @Override
    void getBalance() {
        System.out.println(" You have 200 $");

    }

    public B() {
    }

    public B(int a, int b, int c) {
        super(a, b, c);
    }
}
