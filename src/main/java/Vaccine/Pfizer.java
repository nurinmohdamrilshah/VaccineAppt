package Vaccine;

import Appointment.Appointment;
import Appointment.VaccineAppt;
import Vaccine.Vaccine;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pfizer extends Vaccine {
    public Pfizer(){
        super("Vaccine.Pfizer","Southall",2, 6,LocalDate.now().plusDays(5));
    }
    public List<Appointment> getAppointments(){
        ArrayList<Appointment> appts = new ArrayList<Appointment>();
        String giver;

        for (int i=1; i<numOfDoses; i++){
            if (i==1) giver = "doctor";
            else giver = "nurse";

            LocalDate apptdate = dateOfFirstDose.plusDays((i-1)*dosesInterval);
            appts.add(new VaccineAppt(apptdate,getLocation(),this, giver,i));
        }
        return appts;
    }
}
