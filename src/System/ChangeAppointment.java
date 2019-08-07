package System;

import Database.Dao;

/**
 * Class of changing an appointment
 */
public class ChangeAppointment{

    /**
     * Start the operation of changing a new appointment
     */
    public void start(int patient_id) {
        Dao dao = new Dao();
        boolean is_valid = dao.checkIdentifierValidation(patient_id);
        if(is_valid) {
            CancelAppointment cancelAppointment = new CancelAppointment();
            cancelAppointment.start(patient_id);
            CreateAppointment createAppointment = new CreateAppointment();
            createAppointment.start();
        } else {
            System.out.println("Invalid identifier number");
        }
    }
}
