public class CreditCard {
    private int maxLimit;
    private int total;
    private int minimumPayment;

    public CreditCard() {
        this(5000);
    }

    public CreditCard(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot create a card with a negative limit.");
        } else {
            this.maxLimit = amount;
            this.total = 0;
            this.minimumPayment = 0;
        }
    }

    public void pay(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot pay a negative amount.");
        } else if (amount > this.total) {
            throw new IllegalArgumentException("Cannot pay more than is due.");
        } else if (amount < this.minimumDue()) {
            throw new IllegalArgumentException("Must pay at least minimum payment.");
        } else {
            this.total -= amount;
        }
    }

    public int limit() {
        return this.maxLimit - this.total;
    }

    public int totalDue() {
        return this.total;
    }

    public int minimumDue() {
        return this.total > 10 ? 10 : this.total;
    }

    public void charge(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot charge a negative amount.");
        } else if (amount > this.limit()) {
            throw new IllegalArgumentException("Cannot charge more than current credit limit.");
        } else {
            this.total += amount;
        }
    }

    public static void main(String[] args) {
        /* First Type of Exception:
         * Exception in thread "main" java.lang.IllegalArgumentException:
         * Cannot charge more than current credit limit.*/
        CreditCard mastercard = new CreditCard(10000);
        mastercard.charge(10000000);
        int maxAmt1 = mastercard.limit();
        System.out.println("The initial limit of my Mastercard card is $" + maxAmt1);
        int totalDue1 = mastercard.totalDue();
        System.out.println("The amount owed initially of my Mastercard card is $" + totalDue1);
        int minDue1 = mastercard.minimumDue();
        System.out.println("The minimum initial payment of my Mastercard card is $" + minDue1);

        /* Second Type of Exception:
         * Exception in thread "main" java.lang.IllegalArgumentException:
         * Cannot charge a negative amount.*/
        CreditCard visa = new CreditCard(10000);
        visa.charge(-100);
        int maxAmt2 = visa.limit();
        System.out.println("The initial limit of my Visa card is $" + maxAmt2);
        int totalDue2 = visa.totalDue();
        System.out.println("The amount owed initially of my Visa card is $" + totalDue2);
        int minDue2 = visa.minimumDue();
        System.out.println("The minimum initial payment of my Visa card is $" + minDue2);

        CreditCard amEx = new CreditCard(10000);
        amEx.charge(100);
        int maxAmt3 = amEx.limit();
        System.out.println("The initial limit of my AMEX card is $" + maxAmt3);
        int totalDue3 = amEx.totalDue();
        System.out.println("The amount owed initially of my AMEX card is $" + totalDue3);
        int minDue3 = amEx.minimumDue();
        System.out.println("The minimum initial payment of my Visa card is $" + minDue3);

        /* Third Type of Error:
         * Exception in thread "main" java.lang.IllegalArgumentException:
         * Must pay at least minimum payment. */
        amEx.pay(5);

    }
}