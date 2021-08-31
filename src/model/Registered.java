package model;

import java.time.LocalDate;

public class Registered extends Passenger{
    private double miles;
    private static float discount = 15;
    private LocalDate dateRegister;

    public Registered(String idPassenger, String firstName, String lastName, String country, LocalDate dateBirthday,LocalDate dateRegister) {
        super(idPassenger, firstName, lastName, country, dateBirthday);
        this.dateRegister = dateRegister;
        miles =0;
    }

    @Override
    public double getTicketCost() {
        double valor =tickets.get(tickets.size() - 1).getFly().getTarget().getValueTicket();
        System.out.println("valor "+valor);
        double cost = valor - (valor * ((double)discount/100));
        if (tickets.get(tickets.size() - 1).getFly().getAirplane().getYear() > 10) {
            cost += valor - (valor * 0.1);
        }
        cost += calcOvercrowed();
        return cost;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles += miles;
    }

    public static float getDiscount() {
        return discount;
    }

    public static void setDiscount(float discount) {
        Registered.discount = discount;
    }

    public LocalDate getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(LocalDate dateRegister) {
        this.dateRegister = dateRegister;
    }
}
