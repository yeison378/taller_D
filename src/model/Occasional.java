package model;

import java.time.LocalDate;

public class Occasional extends Passenger {
    private LocalDate dateLastFly;



    public Occasional(String idPassenger, String firstName, String lastName, String country, LocalDate dateBirthday, LocalDate dateLastFly) {
        super(idPassenger, firstName, lastName, country, dateBirthday);
        this.dateLastFly = dateLastFly;

    }

    @Override
    public double getTicketCost() {
        double cost = 0;

        if (tickets.get(tickets.size()-1).getFly().getAirplane().getYear() > 10) {
            cost = tickets.get(tickets.size() - 1).getFly().getTarget().getValueTicket() - (tickets.get(tickets.size() - 1).getFly().getTarget().getValueTicket() * 0.1);
//            System.out.println("COSTO T: "+tickets.get(tickets.size() - 1).getFly().getTarget().getValueTicket() );
        }else{
            cost = tickets.get(tickets.size() - 1).getFly().getTarget().getValueTicket();
        }

        cost += calcOvercrowed();
        return cost;
    }


    public LocalDate getDateLastFly() {
        return dateLastFly;
    }

    public void setDateLastFly(LocalDate dateLastFly) {
        this.dateLastFly = dateLastFly;
    }
}
