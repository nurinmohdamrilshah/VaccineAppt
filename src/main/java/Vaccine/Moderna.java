package Vaccine;

import Appointment.Appointment;
import Vaccine.Vaccine;
import Appointment.VaccineAppt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Moderna extends Vaccine {
    public Moderna(){
        super("Vaccine.Moderna","Epping",3,4, LocalDate.now().plusDays(5));
    }

    public List<Appointment> getAppointments(){
        ArrayList<Appointment> appts = new ArrayList<Appointment>();
        String giver;

        for (int i=1; i<numOfDoses; i++){
            if (i==1) giver = "nurse";
            else giver = "doctor";

            LocalDate apptdate = dateOfFirstDose.plusDays((i-1)*dosesInterval);
            appts.add(new VaccineAppt(apptdate,getLocation(),this, giver,i));
        }
        return appts;
    }
}
