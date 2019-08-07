package User;
import System.MaintainInformation;

/**
 * Class of Reservation Manager
 */
public class ReservationManager extends Staff {

    /**
     * ReservationManager id
     */
    private int reservationManagerId;

    /**
     * Constructor of ReservationManager Class
     * @param id reservationManager id
     */
    public ReservationManager(int id) {
        reservationManagerId = id;
    }

    /**
     * Return reservationManager id
     * @return reservationManager id
     */
    @Override
    public int getIdentifierNumber(){
        return reservationManagerId;
    }

    /**
     * Maintain reservation information
     */
    public void maintainInformation() {
        MaintainInformation maintainInformation = new MaintainInformation();
        maintainInformation.start(getIdentifierNumber());
    }
}