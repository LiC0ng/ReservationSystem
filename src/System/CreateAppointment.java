package System;

import Database.Dao;

/**
 * Class of creating an appointment
 */
public class CreateAppointment {

    /**
     * Start the operation of creating a new appointment
     */
    public void start() {
        Dao dao = new Dao();
        boolean available = dao.queryReservationList();
        if(available) {
            int selected_date = 0;
            boolean is_success = dao.newAppointment(selected_date);
            if(is_success) {
                System.out.println("Successful Reservation. Your identifier number is " + dao.generateIdentifierNumber());
            } else {
                System.out.println("failed");
            }
        } else {
            System.out.println("don't have available time slot");
        }
    }
}
