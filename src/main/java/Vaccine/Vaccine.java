package Vaccine;

import Appointment.Appointment;

import java.time.LocalDate;
import java.util.List;

public abstract class Vaccine {
    protected String vaccineName;
    protected String apptLocation;
    protected int numOfDoses;
    protected int dosesInterval;
    protected LocalDate dateOfFirstDose;

    public Vaccine(String name,String location,int doseNum,int daysBetweenDoses, LocalDate firstDoseDate){
        this.vaccineName = name;
        this.apptLocation = location;
        this.numOfDoses = doseNum;
        this.dosesInterval = daysBetweenDoses;
        this.dateOfFirstDose = firstDoseDate;
    }

    public String getLocation(){
        return apptLocation;
    }
    public String getVaccineName(){
        return vaccineName;
    }

    public int getNumOfDoses(){
        return numOfDoses;
    }
    public abstract List<Appointment> getAppointments();
}
