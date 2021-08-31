package model;

public class Airplane {
    private  String idAirplane;
    private  short capacity;
    private short year;
    private ETypeAirplane typeAirplane;

    public Airplane(String idAirplane, short capacity, short year, ETypeAirplane typeAirplane) {
        this.idAirplane = idAirplane;
        this.capacity = capacity;
        this.year = year;
        this.typeAirplane = typeAirplane;
    }

    public void setIdAirplane(String idAirplane) {
        this.idAirplane = idAirplane;
    }

    public void setCapacity(short capacity) {
        this.capacity = capacity;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public String getIdAirplane() {
        return idAirplane;
    }

    public short getCapacity() {
        return capacity;
    }

    public short getYear() {
        return year;
    }

    public ETypeAirplane getTypeAirplane() {
        return typeAirplane;
    }

    public void setTypeAirplane(ETypeAirplane typeAirplane) {
        this.typeAirplane = typeAirplane;
    }

    @Override
    public String toString() {
        return "model.Airplane{" +
                "idAirplane='" + idAirplane + '\'' +
                ", capacity=" + capacity +
                ", year=" + year +
                ", typeAirplane=" + typeAirplane +
                '}';
    }
}
