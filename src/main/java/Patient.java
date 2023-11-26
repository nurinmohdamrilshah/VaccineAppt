import Appointment.Appointment;
import Appointment.InitialAppt;
import Vaccine.Vaccine;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patient {
    private ArrayList<Vaccine> vaccines = new ArrayList<Vaccine>();
    private String patientName;
    private InitialAppt initialAppointment;

    public Patient(String name,String initialApptLocation){
        this.patientName = name;
        this.initialAppointment = new InitialAppt(LocalDate.now(),initialApptLocation);
    }
    public void addVaccine(Vaccine vaccine){
        this.vaccines.add(vaccine);
    }

    public String displayAppointments() {
        String display = new String("<html>");
        display+="Patient: "+patientName+"<br>";
        display+=initialAppointment.getApptInfo();
        for (Vaccine v:vaccines){
            List<Appointment> appts = v.getAppointments();
            for (Appointment a:appts){
                display += a.getApptInfo()+"<br>";
            }
        }
        return display+"<br></html>";
    }
}
