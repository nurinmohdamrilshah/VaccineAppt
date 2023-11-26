package Appointment;

import java.time.LocalDate;

public class InitialAppt extends Appointment {

    public InitialAppt(LocalDate date,String location){
        super(date,location);
    }
    public String getApptInfo() {
        System.out.println("The initial appointment was on "+date+" at "+location+".");
        return null;
    }
}
