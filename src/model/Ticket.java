package model;

public class Ticket {
    private short chairNumber;
    private boolean baggage;
    private float weight;
    private Fly fly;
    private Passenger passenger;
    public Ticket(Fly fly,Passenger passenger,short chairNumber) {
        this.fly = fly;
        this.passenger = passenger;
        this.chairNumber = chairNumber;
        this.weight = weight;
    }

    public Ticket(Fly fly,Passenger passenger,short chairNumber, float weight) {
        this.fly = fly;
        this.passenger = passenger;
        this.chairNumber = chairNumber;
        this.weight = weight;
    }
    public void  valor(){
        System.out.println(fly.getTarget().getValueTicket());

    }

    public short getChairNumber() {
        return chairNumber;
    }

    public void setChairNumber(short chairNumber) {
        this.chairNumber = chairNumber;
    }

    public boolean isBaggage() {
        return baggage;
    }

    public void setBaggage(boolean baggage) {
        this.baggage = baggage;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Fly getFly() {
        return fly;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "chairNumber=" + chairNumber +
                ", baggage=" + baggage +
                ", weight=" + weight +
                ", fly=" + fly +
                ", passenger=" + passenger +
                '}';
    }
}
