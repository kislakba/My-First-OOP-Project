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
public class PrivateHospital extends Hospital {
    
    public PrivateHospital() {
    }

    public PrivateHospital(double costOfMedicalExamination, boolean haveHealthInsuranceAgreement) {
        super(costOfMedicalExamination, haveHealthInsuranceAgreement);
    }

    @Override
    double costOfServices(Patient p, Hospital h) {
        double totalCost;
        if (p.isHealthInsurance() && p.isHealthInsurance() && super.isHaveHealthInsuranceAgreement()) {
            totalCost = super.getCostOfMedicalExamination() * 0.75;
        } else if (p.isCountryMember()) {
            totalCost = super.getCostOfMedicalExamination() * 1.25;
        } else {
            if (p.getLengthOfStayInTheCountry() > 10) {
                totalCost = super.getCostOfMedicalExamination() * 1.55;
            } else if (p.getLengthOfStayInTheCountry() > 5) {
                totalCost = super.getCostOfMedicalExamination() * 1.7;
            } else {
                totalCost = super.getCostOfMedicalExamination() * 2.1;
            }
        }
        return totalCost;
    }
}
