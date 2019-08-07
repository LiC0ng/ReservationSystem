package System;

import Database.Dao;

/**
 * Class of updating doctor's information
 */
public class UpdateDoctorInformation {

    /**
     * Start the operation of update doctor's information
     * @param staff_id Doctor's id
     */
    public void start(int staff_id) {
        Dao dao = new Dao();
        boolean is_valid = dao.checkIdValidation(staff_id);
        if(is_valid) {
            String name = "input_name";
            int work_hours = 0;
            boolean is_success = dao.updateDoctorInformation(name, work_hours);
            if(is_success) {
                System.out.println("Update Successfully");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid  ID number");
        }
    }
}
