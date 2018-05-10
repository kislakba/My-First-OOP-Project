/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Baris
 */
public class Hospital {
    
    private double costOfMedicalExamination;
    private boolean haveHealthInsuranceAgreement;
    private Patient[] paediatricianPatients = new Patient[24];
    private Patient[] orthopedicsPatients = new Patient[24];
    private Patient[] cardiologyPatients = new Patient[24];
    private ArrayList<Patient> appointmentedPatients = new ArrayList<>();

    public double getCostOfMedicalExamination() {
        return costOfMedicalExamination;
    }

    public void setCostOfMedicalExamination(double costOfMedicalExamination) {
        this.costOfMedicalExamination = costOfMedicalExamination;
    }

    public boolean isHaveHealthInsuranceAgreement() {
        return haveHealthInsuranceAgreement;
    }

    public void setHaveHealthInsuranceAgreement(boolean haveHealthInsuranceAgreement) {
        this.haveHealthInsuranceAgreement = haveHealthInsuranceAgreement;
    }

    public Hospital(double costOfMedicalExamination, boolean haveHealthInsuranceAgreement) {
        this.costOfMedicalExamination = costOfMedicalExamination;
        this.haveHealthInsuranceAgreement = haveHealthInsuranceAgreement;
    }

    public Hospital() {

    }

    void listPaediatricianPatients() {
        for (int i = 0; i < paediatricianPatients.length; i++) {
            if (!(paediatricianPatients[i] == null)) {
                System.out.println(i + " o'clock " + paediatricianPatients[i].getName() + " " + paediatricianPatients[i].getSurname());
            }
        }
    }

    void listOrthopedyPatients() {
        for (int i = 0; i < orthopedicsPatients.length; i++) {
            if (!(orthopedicsPatients[i] == null)) {
                System.out.println(i + " o'clock " + orthopedicsPatients[i].getName() + " " + orthopedicsPatients[i].getSurname());
            }
        }
    }

    void listCardiologyPatients() {
        for (int i = 0; i < cardiologyPatients.length; i++) {
            if (!(cardiologyPatients[i] == null)) {
                System.out.println(i + " o'clock " + cardiologyPatients[i].getName() + " " + cardiologyPatients[i].getSurname());
            }
        }
    }

    void getAnAppointmentFromPaediatrician(Patient p, int appointmentTime) {
        boolean otherAppointments = true;
        if (orthopedicsPatients[appointmentTime] == null && cardiologyPatients[appointmentTime] == null) {
            otherAppointments = false;
        }
        boolean patientHasAppointment = Arrays.stream(paediatricianPatients).anyMatch(x -> p.equals(x));
        if (patientHasAppointment == false && otherAppointments == false) {
            if (p.getName() == null || p.getSurname() == null || p.getAge() == 0) {
                System.out.println("Please enter the patient's informations correctly");
            } else if (appointmentTime >= 9 && appointmentTime <= 17) {
                if (paediatricianPatients[appointmentTime] == null) {
                    paediatricianPatients[appointmentTime] = p;
                    System.out.println("Dear " + p.getName() + " " + p.getSurname() + " your paediatrician appointment confirmed");
                } else {
                    System.out.println("Doctor is not avaible at that time");
                }
            } else {
                System.out.println("Please choose the time between 9-17 o'clock");
            }
            appointmentedPatients.add(p);
        } else {
            System.out.println(p.getName() + " " + p.getSurname() + "already has appointment");
        }
    }

    void getAnAppointmentFromOrthopedic(Patient p, int appointmentTime) {
        boolean otherAppointments = true;
        if (paediatricianPatients[appointmentTime] == null && cardiologyPatients[appointmentTime] == null) {
            otherAppointments = false;
        }
        boolean patientHasAppointment = Arrays.stream(orthopedicsPatients).anyMatch(x -> p.equals(x));
        if (patientHasAppointment == false && otherAppointments == false) {
            if (p.getName() == null || p.getSurname() == null || p.getAge() == 0) {
                System.out.println("Please enter the patient's informations correctly");
            } else if (appointmentTime > 9 && appointmentTime < 17) {
                if (orthopedicsPatients[appointmentTime] == null) {
                    orthopedicsPatients[appointmentTime] = p;
                    System.out.println("Dear " + p.getName() + " " + p.getSurname() + " your orthopedic appointment confirmed");
                } else {
                    System.out.println("Doctor is not avaible at that time");
                }
            } else {
                System.out.println("Please choose the time between 9-17 o'clock");
            }
            appointmentedPatients.add(p);
        } else {
            System.out.println(p.getName() + " " + p.getSurname() + "already has appointment");
        }
    }

    void getAnAppointmentFromCardiology(Patient p, int appointmentTime) {
        boolean otherAppointments = true;
        if (orthopedicsPatients[appointmentTime] == null && paediatricianPatients[appointmentTime] == null) {
            otherAppointments = false;
        }
        boolean patientHasAppointment = Arrays.stream(cardiologyPatients).anyMatch(x -> p.equals(x));
        if (patientHasAppointment == false && otherAppointments == false) {
            if (p.getName() == null || p.getSurname() == null || p.getAge() == 0) {
                System.out.println("Please enter the patient's informations correctly");
            } else if (appointmentTime > 9 && appointmentTime < 17) {
                if (cardiologyPatients[appointmentTime] == null) {
                    cardiologyPatients[appointmentTime] = p;
                    System.out.println("Dear " + p.getName() + " " + p.getSurname() + " your cardiology appointment confirmed");
                } else {
                    System.out.println("Doctor is not avaible at that time");
                }
            } else {
                System.out.println("Please choose the time between 9-17 o'clock");
            }
            appointmentedPatients.add(p);
        } else {
            System.out.println(p.getName() + " " + p.getSurname() + "already has appointment");
        }
    }

    void getAnFastAppointmentFromPaediatrician(Patient p) {
        boolean patientHasAppointment = Arrays.stream(paediatricianPatients).anyMatch(x -> p.equals(x));
        if (patientHasAppointment == false) {
            if (p.getName() == null || p.getSurname() == null || p.getAge() == 0) {
                System.out.println("Please enter the patient's informations correctly");
            }
            for (int i = 9; i <= 17; i++) {
                boolean otherAppointments = false;
                if (orthopedicsPatients[i] == p || cardiologyPatients[i] == p) {
                    otherAppointments = true;
                }
                if (paediatricianPatients[i] == null && otherAppointments == false) {
                    paediatricianPatients[i] = p;
                    System.out.println("Dear " + p.getName() + " " + p.getSurname() + " Your paediatrician appointment time is at " + i + ":00  o clock");
                    break;
                } else if (i == 17) {
                    System.out.println("Doctor is not avaible for today. Please try to take appointment tomorrow");
                }

            }
            appointmentedPatients.add(p);
        } else {
            System.out.println("Patient already has appointment");
        }
    }

    void getAnFastAppointmentFromOrthopedics(Patient p) {
        boolean patientHasAppointment = Arrays.stream(orthopedicsPatients).anyMatch(x -> p.equals(x));
        if (patientHasAppointment == false) {
            if (p.getName() == null || p.getSurname() == null || p.getAge() == 0) {
                System.out.println("Please enter the patient's informations correctly");
            }
            for (int i = 9; i <= 17; i++) {
                boolean otherAppointments = false;
                if (paediatricianPatients[i] == p || cardiologyPatients[i] == p) {
                    otherAppointments = true;
                }
                if (orthopedicsPatients[i] == null && otherAppointments == false) {
                    orthopedicsPatients[i] = p;
                    System.out.println("Dear " + p.getName() + " " + p.getSurname() + " Your orthopedy appointment time is at " + i + ":00  o clock");
                    break;
                } else if (i == 17) {
                    System.out.println("Doctor is not avaible for today. Please try to take appointment tomorrow");
                }

            }
            appointmentedPatients.add(p);
        } else {
            System.out.println("Patient already has appointment");
        }
    }

    void getAnFastAppointmentFromCardiology(Patient p) {
        boolean patientHasAppointment = Arrays.stream(cardiologyPatients).anyMatch(x -> p.equals(x));
        if (patientHasAppointment == false) {
            if (p.getName() == null || p.getSurname() == null || p.getAge() == 0) {
                System.out.println("Please enter the patient's informations correctly");
            }
            for (int i = 9; i <= 17; i++) {
                boolean otherAppointments = false;
                if (orthopedicsPatients[i] == p || paediatricianPatients[i] == p) {
                    otherAppointments = true;
                }
                if (cardiologyPatients[i] == null && otherAppointments == false) {
                    cardiologyPatients[i] = p;
                    System.out.println("Dear " + p.getName() + " " + p.getSurname() + " Your cardiology appointment time is at " + i + ":00  o clock");
                    break;
                } else if (i == 17) {
                    System.out.println("Doctor is not avaible for today. Please try to take appointment tomorrow");
                }

            }
            appointmentedPatients.add(p);
        } else {
            System.out.println("Patient already has appointment");
        }
    }

    double costOfServices(Patient p, Hospital h) {
        double totalCost;
        if (p.isCountryMember() && p.isHealthInsurance() && h.haveHealthInsuranceAgreement) {
            totalCost = costOfMedicalExamination * 0.5;
        } else if (p.isCountryMember()) {
            totalCost = costOfMedicalExamination * 0.95;
        } else {
            if (p.getLengthOfStayInTheCountry() > 10) {
                totalCost = costOfMedicalExamination * 0.55;
            } else if (p.getLengthOfStayInTheCountry() > 5) {
                totalCost = costOfMedicalExamination * 0.7;
            } else {
                totalCost = costOfMedicalExamination * 1.1;
            }
        }
        return totalCost;
    }

    void endOfTheDay() {
        for (int i = 0; i < paediatricianPatients.length; i++) {
            if (!(paediatricianPatients[i] == null)) {
                paediatricianPatients[i] = null;
            }
        }
        for (int i = 0; i < cardiologyPatients.length; i++) {
            if (!(cardiologyPatients[i] == null)) {
                cardiologyPatients[i] = null;
            }
        }
        for (int i = 0; i < orthopedicsPatients.length; i++) {
            if (!(orthopedicsPatients[i] == null)) {
                orthopedicsPatients[i] = null;
            }
        }
    }

    void deleteTheAppointmentAutomaticly(Patient p) {
        for (int i = 0; i < 24; i++) {
            if (paediatricianPatients[i] == p) {
                paediatricianPatients[i] = null;
                appointmentedPatients.remove(p);
                System.out.println(p.getName() +" " + p.getSurname() + " your paediatricy appointment at " + i + " o'clock successfully removed");
                break;
            } else if (orthopedicsPatients[i] == p) {
                orthopedicsPatients[i] = null;
                appointmentedPatients.remove(p);
                System.out.println(p.getName() + " " + p.getSurname() + " your orthopedicy appointment at " + i + " o'clock successfully removed");
                break;
            } else if (cardiologyPatients[i] == p) {
                cardiologyPatients[i] = null;
                appointmentedPatients.remove(p);
                System.out.println(p.getName() +" "+ p.getSurname() + " your cardiology appointment at " + i + "o'clock successfully removed");
                break;
            } else if (i == 23) {
                System.out.println("Appointment that registered by " + p.getName() + " " + p.getSurname() + " couldn't find");
            }
        }
    }

    void deleteTheAppointmentFromPaediatrician(Patient p, int appointmentTime) {
        if (paediatricianPatients[appointmentTime] == null) {
            System.out.println("Dear patient your appointment couldn't find please enter informations correctly");
        } else {
            paediatricianPatients[appointmentTime] = null;
            System.out.println("Dear patient your paediatricy appointment at " + appointmentTime + " o'clock successfully removed");
            appointmentedPatients.remove(p);
        }
    }

    void deleteTheAppointmentFromCardiology(Patient p, int appointmentTime) {
        if (cardiologyPatients[appointmentTime] == null) {
            System.out.println("Dear patient your appointment couldn't find please enter informations correctly");
        } else {
            cardiologyPatients[appointmentTime] = null;
            System.out.println("Dear patient your cardiology appointment at " + appointmentTime + " o'clock successfully removed");
            appointmentedPatients.remove(p);
        }
    }

    void deleteTheAppointmentFromOrthopedy(Patient p, int appointmentTime) {
        if (orthopedicsPatients[appointmentTime] == null) {
            System.out.println("Dear patient your appointment couldn't find, please enter informations correctly");
        } else {
            orthopedicsPatients[appointmentTime] = null;
            System.out.println("Dear patient your orthopedy appointment at " + appointmentTime + " o'clock successfully removed");
            appointmentedPatients.remove(p);
        }
    }

}
