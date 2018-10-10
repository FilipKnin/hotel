public class Booking {
    private Bedroom bedroom;
    private int numberOfNights;

    public Booking(Bedroom bedroom, int numberOfNights){
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public Bedroom getRoom() {
        return bedroom;
    }

    public double getRate() {
        return getRoom().getRate();
    }

    public double getBill() {
        double bill = (getNumberOfNights()) * (getRate());
        return bill;
    }

}
