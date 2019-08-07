package Database;

/**
 * Dao Class
 * Provide method for database operation
 */
public class Dao {

    /**
     * check the validation of staff's ID
     * @param id staff's ID
     * @return is valid
     */
    public boolean checkIdValidation(int id) {
        return true; // if valid;
        // return false; // if not valid
    }

    /**
     * check the validation of patient's identifier number
     * @param Identifier patients identifier number
     * @return is valid
     */
    public boolean checkIdentifierValidation(int Identifier) {
        return true; // if valid
        // return false; // if not valid
    }

    /**
     * query the reservation list
     * @return return available time slot
     */
    public boolean queryReservationList() {
        return true; //if have available time slot
        // return false  //don't have available time slot
    }

    /**
     * make an appointment
     * @param data selected date
     * @return is success
     */
    public boolean newAppointment(int data) {
        return true; // if success
        // return false; // if not false
    }

    /**
     * Generate identifier number for patient after successful reservation
     * @return Identifier number
     */
    public int generateIdentifierNumber() {
        int identifierNumber = 1;
        return identifierNumber;
    }


    /**
     * make an appointment
     * @return is success
     */
    public boolean cancelAppointment(int id) {
        return true; // if success
        // return false; // if not false
    }

    /**
     * review the appointment
     * @param id the identifier of patient
     * @return appointment data
     */
    public boolean reviewAppointment(int id) {
        return true; // if success
        // return false; // if not false
    }

    /**
     * reservation manager can use this method to modify reservation information
     * @return is success
     */
    public boolean modifyInformation() {
        return true; //if success
        // return false  //if false
    }

    /**
     * doctor can use this method to update their own information
     * @return is success
     */
    public boolean updateDoctorInformation(String name, int work_hours) {
        return true; //if success
        // return false  //if false
    }
}
