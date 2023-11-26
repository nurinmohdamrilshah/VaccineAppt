package Appointment;

import java.time.LocalDate;
import Vaccine.Vaccine;

public class VaccineAppt extends Appointment {
    private String giver;
    private Vaccine vaccine;
    private int doseNum;
    public VaccineAppt(LocalDate date, String location, Vaccine vaccine, String giver,int doseNum){
        super(date, location);
        this.vaccine = vaccine;
        this.doseNum = doseNum;
        this.giver = giver;
    }
    public String getApptInfo() {
        return "Vaccine: "+vaccine.getVaccineName()+"<br> Dose "+doseNum+"<br> Will be given by: "+giver+"<br>Date: "+date.toString()+"<br> Clinic Location:"+location+".<br>";
    }
}
