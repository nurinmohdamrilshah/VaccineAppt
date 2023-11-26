package Appointment;

import java.time.LocalDate;

public abstract class Appointment{
    LocalDate date;
    String location;

    public Appointment(LocalDate date,String location){
        this.date = date;
        this.location = location;
    }

    public abstract String getApptInfo();


}
