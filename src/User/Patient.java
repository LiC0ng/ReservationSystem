package User;

import System.CreateAppointment;
import System.ChangeAppointment;
import System.CancelAppointment;
import System.ReviewInformation;

/**
 * Class of patient
 */
public class Patient {

    /**
     * patient's name
     */
    private String name;

    /**
     * patient's contact information
     */
    private String contact;

    /**
     * Method of make a new appointment
     */
    public void newAppointment() {
        CreateAppointment createAppointment = new CreateAppointment();
        createAppointment.start();
    }

    /**
     * method of change an existing appointment
     * @param patient_id patient's identifier number
     */
    public void changeAppointment(int patient_id) {
        ChangeAppointment changeAppointment = new ChangeAppointment();
        changeAppointment.start(patient_id);
    }

    /**
     * Method of cancel an existing appointment
     * @param patient_id patient's identifier number
     */
    public void cancelAppointment(int patient_id) {
        CancelAppointment cancelAppointment = new CancelAppointment();
        cancelAppointment.start(patient_id);
    }

    /**
     * Method of reviewing an existing appointment
     * @param patient_id patient's identifier number
     */
    public void reviewInformation(int patient_id) {
        ReviewInformation reviewInformation = new ReviewInformation();
        reviewInformation.start(patient_id);
    }



}
