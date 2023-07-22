public class C extends  Bank{
    @Override
    void getBalance() {
        System.out.println("We have a 300 $ ");
    }

    public C() {
    }

    public C(int a, int b, int c) {
        super(a, b, c);
    }
}
