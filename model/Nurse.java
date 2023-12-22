package model;

public class Nurse extends User{
    private String speciality ;

    public Nurse(String name, String email) {
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Cruz Verde");
        System.out.println("Departamento 2");
        System.out.println("Departamento 3");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
