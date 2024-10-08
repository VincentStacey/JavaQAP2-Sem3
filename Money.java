package CreditCard;

public class Money {
    private long dollars;
    private long cents;

    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - dollars) * 100);
    }

    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherAmount) {
        long newCents = this.cents + otherAmount.cents;
        long newDollars = this.dollars + otherAmount.dollars + newCents / 100;
        newCents = newCents % 100;
        return new Money(newDollars + newCents / 100.0);
    }

    public Money subtract(Money otherAmount) {
        long totalCents1 = this.dollars * 100 + this.cents;
        long totalCents2 = otherAmount.dollars * 100 + otherAmount.cents;
        long newTotalCents = totalCents1 - totalCents2;
        long newDollars = newTotalCents / 100;
        long newCents = newTotalCents % 100;
        return new Money(newDollars + newCents / 100.0);
    }

    public int compareTo(Money otherObject) {
        long totalCents1 = this.dollars * 100 + this.cents;
        long totalCents2 = otherObject.dollars * 100 + otherObject.cents;
        return Long.compare(totalCents1, totalCents2);
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject)
            return true;
        if (otherObject == null || getClass() != otherObject.getClass())
            return false;
        Money money = (Money) otherObject;
        return dollars == money.dollars && cents == money.cents;
    }

    public String toString() {
        return "$" + dollars + "." + (cents < 10 ? "0" + cents : cents);
    }
}
