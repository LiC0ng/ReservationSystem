package System;

import Database.Dao;

/**
 * Class of maintaining reservation information
 */
public class MaintainInformation {

    /**
     * Start the operation of maintaining reservation information
     * @param staff_id reservation manager's id
     */
    public void start(int staff_id) {
        Dao dao = new Dao();
        boolean is_valid = dao.checkIdValidation(staff_id);
        if(is_valid) {
            boolean is_success = dao.modifyInformation();
            if(is_success) {
                System.out.println("Modify Successfully");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid  ID number");
        }
    }
}
