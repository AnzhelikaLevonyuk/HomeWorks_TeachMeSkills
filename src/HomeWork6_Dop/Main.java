package HomeWork6_Dop;

public class Main {
    public static void main(String[] args) {

        Patient patient1 = new Patient();
        patient1.setTreatmentPlan(new TreatmentPlan(1));
        setDoc(patient1);

        Patient patient2 = new Patient();
        patient2.setTreatmentPlan(new TreatmentPlan(2));
        setDoc(patient2);

        Patient patient3 = new Patient();
        patient3.setTreatmentPlan(new TreatmentPlan(3));
        setDoc(patient3);

    }

    public static void setDoc (Patient patient){
        if (patient.getTreatmentPlan().getCode() == 1)
        {
            patient.setDoctor(new Surgeon());
            new Surgeon().heal();
        }
        else if (patient.getTreatmentPlan().getCode() == 2)
        {
            patient.setDoctor(new Dentist());
            new Dentist().heal();
        }
        else
        {
            patient.setDoctor(new Therapist());
            new Therapist().heal();
        }
    }
}






