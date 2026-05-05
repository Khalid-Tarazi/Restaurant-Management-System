public class Chef extends Staff {
    private String speciality;

    public Chef(int staffId, String name, String role, String speciality) {
        super(staffId, name, role);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void prepareOrder(Order order) {
        //
    }

    @Override
    public void performDuties() {

    }
}