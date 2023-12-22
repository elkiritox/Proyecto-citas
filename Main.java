
import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import java.util.Date;

import static ui.UIMenu.*;

public class Main{
    public static void main(String[] args) {
//        Doctor myDoctor = new Doctor("Kirito");
//        myDoctor.name = "Kirito";
//        myDoctor.showName();
//        myDoctor.showID();
//
//        Doctor newDoctor2 = new Doctor();
//        myDoctor.showID();
        showMenu();

     /*   Doctor doc = new Doctor("Kirito","kiri@gmail.com");
        System.out.println(doc.getSpeciality());
        doc.addAvailableAppointment(new Date(),"4 pm");
        doc.addAvailableAppointment(new Date(), "5 pm");
        for (Doctor.AvailableAppointment aA: doc.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }*/
/*
        Patient pat = new Patient("Asuna","asuna@gmail.com");
        System.out.println(pat);
*/  /*    User user = new Patient("Kazuto","kazuto@yahoo.com");
        user.showDataUser();

        User user1 = new User("Kiri","kiri@yahoo.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Cruz Azul");
                System.out.println("Departamento Geriatría");
            }
        };
        user1.showDataUser();
        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {
                
            }
        };

        */
        //System.out.println(doc);
        //System.out.println(Doctor.Day.MONDAY.getSpanish());
        //System.out.println(Doctor.Day.MONDAY.getAbrev());

       /* for (int i = 0; i <Doctor.Day.values().length; i++) {
            System.out.println(Doctor.Day.values()[i].getAbrev());
        }
        */

    }
}

