package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public abstract class Passenger {
    protected String idPassenger;
    protected String firstName;
    protected String lastName;
    protected String country;
    protected LocalDate dateBirthday;
    protected ArrayList<Ticket> tickets;

    public Passenger(String idPassenger, String firstName, String lastName, String country, LocalDate dateBirthday) {
        this.idPassenger = idPassenger;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.dateBirthday = dateBirthday;
        tickets = new ArrayList<>();

    }

    public void setIdPassenger(String idPassenger) {
        this.idPassenger = idPassenger;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDateBirthday(LocalDate dateBirthday) {
        this.dateBirthday = dateBirthday;
    }


    public String getIdPassenger() {
        return idPassenger;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    public LocalDate getDateBirthday() {
        return dateBirthday;
    }

    public byte getAge() {
        return (byte) ChronoUnit.YEARS.between(dateBirthday, LocalDate.now());
    }

    public boolean addToFly(Fly fly,short shor){
        int cont = 0;
        ArrayList<Ticket> ticketst= fly.getTickets();
        for (Ticket a: ticketst){
            if(a.getPassenger().equals(Passenger.this))cont++;

        }
        if(cont == 1){
            tickets.add(new Ticket(fly,Passenger.this,shor));
            System.out.println("AÑADIDO "+tickets.size());
            for(Ticket j: tickets){
                System.out.println(j.getWeight());
            }
            return true;
        }else{
            return false;
        }

    }

    public boolean addToFly(Fly fly,short shor,float flo){
        int cont = 0;
        ArrayList<Ticket> ticketss= fly.getTickets();
        for (Ticket a: ticketss){
            if(a.getPassenger().equals(Passenger.this))cont++;
        }
        if(cont == 1){
            tickets.add(new Ticket(fly,Passenger.this,shor,flo));
            System.out.println("AÑADIDO");
            return true;
        }else{
            return false;
        }

    }



    public abstract double getTicketCost();

    public double calcOvercrowed(){
       float weight = tickets.get(tickets.size()-1).getWeight();
        if(weight <=23)return 0;
        else if(weight <= 33)return (weight*0.1);
        else return (weight*0.3);
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void tamagno(){
        System.out.println(tickets.size());
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "idPassenger='" + idPassenger + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", dateBirthday=" + dateBirthday +
                ", tickets=" + tickets +
                '}';
    }
}
