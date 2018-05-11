/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Baris
 */
public class Test {
    public static void main(String[] args) {
        Hospital h = new PrivateHospital(100, true);
        Patient p = new Patient("Baris", "Kislak", 20, 20, true, true);
        Patient p1 = new Patient("Ali", "Nizam", 40, 20, true, true);
        Patient p2 = new Patient("Okan", "Kara", 30, 20, true, true);
        Patient p3 = new Patient("Muhammed", "Alkan", 25, 20, true, true);
        h.getAnFastAppointmentFromCardiology(p);
        h.getAnFastAppointmentFromCardiology(p1);
        h.getAnFastAppointmentFromCardiology(p2);
        h.getAnFastAppointmentFromCardiology(p3);
        h.getAnFastAppointmentFromOrthopedics(p);
        h.getAnFastAppointmentFromOrthopedics(p1);
        h.getAnFastAppointmentFromOrthopedics(p2);
        h.getAnFastAppointmentFromOrthopedics(p3);
        h.getAnFastAppointmentFromPaediatrician(p);
        h.getAnFastAppointmentFromPaediatrician(p1);
        h.getAnFastAppointmentFromPaediatrician(p2);
        h.getAnFastAppointmentFromPaediatrician(p3);
        h.listCardiologyPatients();
        h.listOrthopedyPatients();
        h.listPaediatricianPatients();
        h.deleteTheAppointmentAutomaticly(p);
        h.deleteTheAppointmentAutomaticly(p);
        h.deleteTheAppointmentAutomaticly(p);
        h.deleteTheAppointmentAutomaticly(p1);
        h.deleteTheAppointmentAutomaticly(p1);
        h.deleteTheAppointmentAutomaticly(p1);
        h.deleteTheAppointmentAutomaticly(p2);
        h.deleteTheAppointmentAutomaticly(p2);
        h.deleteTheAppointmentAutomaticly(p2);
        h.deleteTheAppointmentAutomaticly(p3);
        h.deleteTheAppointmentAutomaticly(p3);
     
        

        System.out.println(h.costOfServices(p, h));
    }
}
