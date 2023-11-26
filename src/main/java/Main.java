import Vaccine.Moderna;
import Vaccine.Pfizer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Patient patient1 = new Patient("John Molecules", "Epping");
    patient1.addVaccine(new Pfizer());
    patient1.addVaccine(new Moderna());

    JFrame frame = new JFrame();
    frame.setSize(450,400);

    JPanel panel = new JPanel();
    JLabel appt1 = new JLabel(patient1.displayAppointments());
    panel.add(appt1);
    frame.setContentPane(panel);
    frame.setVisible(true);
    frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.white));

    frame.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
