package Appointment;

import java.time.LocalDate;
import Vaccine.Vaccine;

public class VaccineAppt extends Appointment {
    private String giver = new String();
    private Vaccine vaccine;
    private int doseNum;
    public VaccineAppt(LocalDate date, String location, Vaccine vaccine, String giver,int doseNum){
        super(date, location);
        this.vaccine = vaccine;
        this.doseNum = doseNum;
        this.giver = giver;
    }
    public String getApptInfo() {
        return "Vaccine:"+vaccine.getVaccineName()+" Dose "+doseNum+" given by: "+giver+" date "+date.toString()+" at "+location+"<br>";
    }
}
