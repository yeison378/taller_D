package test;

import exeptions.ExeptionDate;
import model.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OccasionalTest {

    Occasional h, q;
    LocalDate antes, menor, mayor, despues;
    Fly a, b;

    public void prueba() throws ExeptionDate {
        antes = LocalDate.of(2000, 1, 11);
        mayor = LocalDate.of(2000, 1, 11);
        menor = LocalDate.of(2002, 1, 11);
        despues = LocalDate.of(2022, 2, 5);

        a = new Fly("1", new Target("2", "nombre", 40, 455), new Airplane("1",
                (short) 9, (short) 9, ETypeAirplane.AirbusA380), despues, LocalTime.of(5, 6));
        b = new Fly("1", new Target("2", "nombre", 40, 455), new Airplane("1",
                (short) 9, (short) 10, ETypeAirplane.AirbusA380), despues, LocalTime.of(5, 6));


         h = new Occasional("3", "jess", "iban", "sogamo", menor, LocalDate.now());
         q = new Occasional("9", "andre", "ibadn", "sogasdmo", menor, LocalDate.now());

        a.addPassenger(h, (short) 4);
        b.addPassenger(h, (short) 4);
        h.addToFly(a, (short) 3);
        h.addToFly(b, (short) 3);
        h.getTicketCost();


    }

    @Test
    void getTicketCost() throws ExeptionDate {
        prueba();
        assertEquals(h.getTicketCost(), 40);
    }

    @Test
    void getDateLastFly() throws ExeptionDate {
        prueba();
        assertEquals(h.getDateLastFly(), LocalDate.now());
    }


}