package System;

import Database.Dao;

/**
 * Class of reviewing reservation information
 */
public class ReviewInformation {

    /**
     * Start the operation of reviewing information
     * @param patient_id Reservation manager's id
     */
    public void start(int patient_id) {
        Dao dao = new Dao();
        boolean is_valid = dao.checkIdentifierValidation(patient_id);
        if(is_valid) {
            boolean is_success = dao.reviewAppointment(patient_id);
            if(is_success) {
                System.out.println("Review Successfully");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid identifier number");
        }
    }
}
