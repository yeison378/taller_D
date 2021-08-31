package test;

import exeptions.ExeptionDate;
import model.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class RegisteredTest {
    Registered k, p;
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

        k = new Registered("2", "yeison", "ibanez", "sogamoso", mayor, LocalDate.now());
        p = new Registered("6", "karen", "zea", "ibague", menor, LocalDate.now());



        a.addPassenger(k, (short) 4);
        b.addPassenger(k, (short) 4);
        k.addToFly(a, (short) 3);
        k.addToFly(b, (short) 3);
        k.getTicketCost();

    }

    @Test
    void getTicketCost() throws ExeptionDate {
        prueba();
        assertEquals(k.getTicketCost(), 34);
    }

    @Test
    void getMiles() throws ExeptionDate {
        prueba();
        assertEquals(k.getMiles(), 910);
    }


    @Test
    void getDiscount() throws ExeptionDate {
        prueba();
        assertEquals(Registered.getDiscount(), 15);
    }

    @Test
    void getDateRegister() throws ExeptionDate {
        prueba();
        assertEquals(k.getDateRegister(), LocalDate.now());
    }


}