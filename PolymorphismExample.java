class Payment {
    void pay() {
        System.out.println("General payment method");
    }
}

class CreditCard extends Payment {
    @Override
    void pay() {
        System.out.println("Paid using Credit Card");
    }
}

class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Paid using UPI");
    }
}

class Cash extends Payment {
    @Override
    void pay() {
        System.out.println("Paid using Cash");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new UPI();
        Payment p3 = new Cash();

        p1.pay();
        p2.pay();
        p3.pay();
    }
}

