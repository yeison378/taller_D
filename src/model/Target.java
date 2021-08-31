package model;

public class Target {
    private String idTarget;
    private String nameTarget;
    private double valueTicket;
    private float distance;

    public Target(String idTarget, String nameTarget, double valueTicket, float distance) {
        this.idTarget = idTarget;
        this.nameTarget = nameTarget;
        this.valueTicket = valueTicket;
        this.distance = distance;
    }

    public void setIdTarget(String idTarget) {
        this.idTarget = idTarget;
    }

    public void setNameTarget(String nameTarget) {
        this.nameTarget = nameTarget;
    }

    public void setValueTicket(double valueTicket) {
        this.valueTicket = valueTicket;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public String getIdTarget() {
        return idTarget;
    }

    public String getNameTarget() {
        return nameTarget;
    }

    public double getValueTicket() {
        return valueTicket;
    }

    public float getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "model.Target{" +
                "idTarget='" + idTarget + '\'' +
                ", nameTarget='" + nameTarget + '\'' +
                ", valueTicket=" + valueTicket +
                ", distance=" + distance +
                '}';
    }
}
