package model;

import exeptions.ExeptionDate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Fly {
    private String number;

    private String idFly;
    private LocalDate date;
    private LocalTime time;
    private Airplane airplane;
    private Target target;
    private ArrayList<Ticket> tickets;

    public Fly(String idFly, Target target, Airplane airplane, LocalDate date, LocalTime time) throws ExeptionDate {
        if (date.isBefore(LocalDate.now())) {
            throw new ExeptionDate("La fecha no es valida");
        } else {
            this.idFly = idFly;
            this.date = date;
            this.time = time;
            this.airplane = airplane;
            this.target = target;

            number = "";
            tickets = new ArrayList<>();
        }

    }


    public boolean addPassenger(Passenger passenger, short short_) throws ExeptionDate {
        boolean t = true;
        if (tickets.size() < airplane.getCapacity()) {
            if (passenger instanceof Registered) {
                for (Ticket a : tickets) {
                    if (a.getPassenger().equals(passenger)) return false;
                }
                if (t){
                    ((Registered) passenger).setMiles(target.getDistance());
                    tickets.add(new Ticket(Fly.this, passenger, short_));

//                    System.out.println("Registado "+tickets.get(tickets.size()-1).getPassenger().toString());
                }
                return t;
            } else {
                for (Ticket a : tickets) {
                    if (a.getPassenger().equals(passenger)) return false;
                }
                if (t){
                    tickets.add(new Ticket(Fly.this, passenger, short_));
//                    System.out.println((Occasional)tickets.get(tickets.size()-1).getPassenger());
//                    System.out.println("Ocasional "+tickets.get(tickets.size()-1).getPassenger().toString());
                }
                return t;
            }

        } else {

            return false;
        }

    }

    public boolean addPassenger(Passenger passenger, short short_, float float_) {
        boolean t = true;
        if (tickets.size() < airplane.getCapacity()) {
            if (passenger instanceof Registered) {
                for (Ticket a : tickets) {
                    if (a.getPassenger().equals(passenger)) return false;
                }
                if (t){
                    ((Registered) passenger).setMiles(target.getDistance());
                    tickets.add(new Ticket(Fly.this, passenger, short_,float_));

                }
                return t;
            } else {
                for (Ticket a : tickets) {
                    if (a.getPassenger().equals(passenger)) return false;
                }
                if (t){
                    tickets.add(new Ticket(Fly.this, passenger, short_,float_));

                }
                return t;
            }

        } else {

            return false;
        }
    }


    public double calcTotal() {
        double value = 0;
        for (Ticket a : tickets) {
            value += a.getFly().getTarget().getValueTicket();
//            System.out.println(a.getFly().toString());
        }
        return value;
    }

    public Passenger getLessAge() {
        int edad = 120, posicion = 0;
        for (int i = 0; i < tickets.size(); i++) {
            if (edad > tickets.get(i).getPassenger().getAge()) {
                edad = tickets.get(i).getPassenger().getAge();
                posicion = i;
            }
        }
        return tickets.get(posicion).getPassenger();
    }

    public Passenger getGreaterAge() {
        int edad = 0, posicion = 0;
        for (int i = 0; i < tickets.size(); i++) {
            if (edad < tickets.get(i).getPassenger().getAge()) {
                edad = tickets.get(i).getPassenger().getAge();
                posicion = i;
            }
        }
        return tickets.get(posicion).getPassenger();
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getIdFly() {
        return idFly;
    }

    public void setIdFly(String idFly) {
        this.idFly = idFly;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }


    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Fly{" +
                "number='" + number + '\'' +
                ", idFly='" + idFly + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", airplane=" + airplane +
                ", target=" + target +
                ", tickets=" + tickets +
                '}';
    }
}
