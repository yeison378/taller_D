package model;

import exeptions.ExeptionDate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) throws ExeptionDate {
        LocalDate antes = LocalDate.of(2000, 1, 11);
        LocalDate mayor = LocalDate.of(2000, 1, 11);
        LocalDate menor = LocalDate.of(2002, 1, 11);
        LocalDate despues = LocalDate.of(2022, 2, 5);
        Fly a = new Fly("1", new Target("2", "nombre", 40, 455), new Airplane("1",
                (short) 9, (short) 9, ETypeAirplane.AirbusA380), despues, LocalTime.of(5, 6));
        Fly b = new Fly("1", new Target("2", "nombre", 40, 455), new Airplane("1",
                (short) 9, (short) 10, ETypeAirplane.AirbusA380), despues, LocalTime.of(5, 6));

        Registered k = new Registered("2", "yeison", "ibanez", "sogamoso", mayor, LocalDate.now());
        Occasional h = new Occasional("3", "jess", "iban", "sogamo", menor, LocalDate.now());
        Passenger p = new Registered("6", "karen", "zea", "ibague", menor, LocalDate.now());
        Occasional q = new Occasional("9", "andre", "ibadn", "sogasdmo", menor, LocalDate.now());


//        System.out.println(a.addPassenger(k,(short)3,(float)6));
//        System.out.println(b.addPassenger(k,(short)3,(float)6));
        System.out.println("--------------------------------------------------");
        System.out.println("VUELO A: "+a.addPassenger(h, (short) 4));
        h.tamagno();
        System.out.println("VUELO B: "+b.addPassenger(h, (short) 4));
        h.tamagno();
        System.out.println("--------------------------------------------------");
//        System.out.println(a.addPassenger(p, (short) 4));
//        System.out.println(a.addPassenger(q, (short) 5));


        ArrayList<Ticket> tickets = a.getTickets();
/*        for (Ticket l : tickets) {
            System.out.println("EN VUELO "+l.getPassenger().toString());
//            System.out.println("COSTO "+l.getPassenger().getTicketCost());

        }*/

//        System.out.println(a.getGreaterAge());
//        System.out.println("calculo total");
//        System.out.println(a.calcTotal());
//        System.out.println(k.getMiles());
        System.out.println("--------------------------------------------------");
        System.out.println("AÑADIR A VUELO "+h.addToFly(a,(short) 3));
        h.tamagno();
        System.out.println("AÑADIR A VUELO "+h.addToFly(b,(short) 3));
        h.tamagno();
//        System.out.println("AÑADIR A VUELO "+q.addToFly(a,(short)5,(float)4));
//        System.out.println("AÑADIR A VUELO "+q.addToFly(a,(short)5));
//        System.out.println("MILLAS DE K "+k.getMiles());
        System.out.println("OCASIONAL DE H "+h.getTicketCost());

        h.tamagno();


//        a.addPassenger();
    }

}
