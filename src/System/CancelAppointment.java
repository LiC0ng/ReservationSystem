package System;

import Database.Dao;

/**
 * Class of canceling an appointment
 */
public class CancelAppointment {

    /**
     * Start the operation of canceling an appointment
     */
    public void start(int patient_id) {
        Dao dao = new Dao();
        boolean is_valid = dao.checkIdentifierValidation(patient_id);
        if(is_valid) {
            boolean is_success = dao.cancelAppointment(patient_id);
            if(is_success) {
                System.out.println("Cancel Successfully");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid identifier number");
        }
    }
}
