package baithi;

public class TestBank {
    public static void main(String[] args) {
        Bank b1 = new Bank(1000, 100);

        System.out.println("Lãi suất hàng tháng là "+b1.calculateInterest());
    }


}
