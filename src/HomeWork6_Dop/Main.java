package HomeWork6_Dop;

public class Main {
    public static void main(String[] args) {

        Patient patient1 = new Patient();
        patient1.setTreatmentPlan(new TreatmentPlan(1));
        setDoc(patient1);
        patient1.doctor.heal();


        Patient patient2 = new Patient();
        patient2.setTreatmentPlan(new TreatmentPlan(2));
        setDoc(patient2);
        patient2.doctor.heal();

        Patient patient3 = new Patient();
        patient3.setTreatmentPlan(new TreatmentPlan(3));
        setDoc(patient3);
        patient3.doctor.heal();

    }

    public static void setDoc (Patient patient){
        if (patient.getTreatmentPlan().getCode() == 1)
        {
            patient.setDoctor(patient.doctor = new Surgeon());
        }
        else if (patient.getTreatmentPlan().getCode() == 2)
        {
            patient.setDoctor(patient.doctor = new Dentist());
        }
        else
        {
            patient.setDoctor(patient.doctor = new Therapist());
        }
    }
}






