import Vaccine.Moderna;
import Vaccine.Pfizer;
import Vaccine.Vaccine;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Patient patient1 = new Patient("John Molecules", "Epping");
    patient1.addVaccine(new Pfizer());
    patient1.addVaccine(new Moderna());

    Patient patient2 = new Patient("Jill Biomedenhall","Southall");
    patient2.addVaccine(new Pfizer());

    Patient patient3 = new Patient("Matty Healy","Southall");
    patient3.addVaccine(new Pfizer());
    patient3.addVaccine(new Moderna());

    ArrayList<Patient> patients = new ArrayList<Patient>();
    patients.add(patient1);
    patients.add(patient2);
    patients.add(patient3);

    JFrame frame = new JFrame();
    frame.setSize(700,700);

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(1,patients.size()));

    JLabel appt1 = new JLabel(patient1.displayAppointments());
    JLabel appt2 = new JLabel(patient2.displayAppointments());
    JLabel appt3 = new JLabel(patient3.displayAppointments());


    EmptyBorder emptyBorder = new EmptyBorder(5, 10, 5, 10);
    appt1.setBorder(emptyBorder);
    appt2.setBorder(emptyBorder);
    appt3.setBorder(emptyBorder);

    panel.add(appt1);
    panel.add(appt2);
    panel.add(appt3);


    frame.setContentPane(panel);
    frame.setVisible(true);




    frame.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
