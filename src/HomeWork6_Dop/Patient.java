package HomeWork6_Dop;

public class Patient {
    protected Doctor doctor;
    protected TreatmentPlan treatmentPlan;

    public Patient()
    {}

    public TreatmentPlan getTreatmentPlan()
    {
        return treatmentPlan;
    }

    public void setTreatmentPlan(TreatmentPlan treatmentPlan)
    {
        this.treatmentPlan = treatmentPlan;
    }

    public void setDoctor(Doctor doctor)
    {
        this.doctor = doctor;
    }
}
