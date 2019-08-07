import User.Doctor;
import User.Patient;
import User.ReservationManager;

/**
 * Main Class
 */
public class Main {

    public static final int MAKE_AN_APPOINTMENT = 0;
    public static final int CHANGE_AN_APPOINTMENT = 1;
    public static final int CANCEL_AN_APPOINTMENT = 2;
    public static final int REVIEW_INFORMATION = 3;
    public static final int MAINTAIN_INFORMATION = 4;
    public static final int UPDATE_DOCTOR_INFORMATION = 5;

    public static int operation;

    /**
     * Entrance
     * @param args
     */
    public static void main(String[] args) {
        int inputId = 0;
        switch (operation) {
            case MAKE_AN_APPOINTMENT: {
                Patient patient = new Patient();
                patient.newAppointment();
            } case CHANGE_AN_APPOINTMENT: {
                Patient patient = new Patient();
                patient.changeAppointment(inputId);
            } case CANCEL_AN_APPOINTMENT: {
                Patient patient = new Patient();
                patient.cancelAppointment(inputId);
            } case REVIEW_INFORMATION: {
                Patient patient = new Patient();
                patient.reviewInformation(inputId);
            } case MAINTAIN_INFORMATION: {
                ReservationManager reservationManager = new ReservationManager(inputId);
                reservationManager.maintainInformation();
            } case UPDATE_DOCTOR_INFORMATION: {
                Doctor doctor = new Doctor(inputId);
                doctor.updateDoctorInformation();
            }
        }
    }
}
