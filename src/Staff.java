public abstract class Staff {
    private int staffId;
    private String name;
    private String role;

    public Staff(int staffId, String name, String role) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
    }

    public Staff() {

    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getStaffId() {
        return this.staffId;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }

    public abstract void performDuties();
}