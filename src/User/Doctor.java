package User;

import System.UpdateDoctorInformation;

/**
 * Class of Doctor
 */
public class Doctor extends Staff {

    /**
     * doctor's name
     */
    private String name;

    /**
     * doctor's id
     */
    private int doctorId;

    /**
     * doctor's department
     */
    private String department;

    /**
     * Constructor of Doctor Class
     * @param id doctor id
     */
    public Doctor(int id) {
        doctorId = id;
    }

    /**
     * return doctor id
     * @return doctor id
     */
    @Override
    public int getIdentifierNumber() {
        return doctorId;
    }

    /**
     * Method of updating doctor's information
     */
    public void updateDoctorInformation() {
        UpdateDoctorInformation updateDoctorInformation = new UpdateDoctorInformation();
        updateDoctorInformation.start(getIdentifierNumber());
    }
}
