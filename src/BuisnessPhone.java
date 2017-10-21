import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class BuisnessPhone extends Phone implements IBuisnessPhone {
    String InventoryNumber;

    public String getInventoryNumber() {
        return InventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        InventoryNumber = inventoryNumber;
    }

    public String getAppointment() {
        throw new NotImplementedException();
    }

}
