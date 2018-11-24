package xyz.tridentlab.WorkOrderTracking;

public class WorkOrder {

    private String customerFirstName,customerLastName,customerAddress;
    private int customerPhoneNumber;
    private int workOrderNumber = 1;
    private boolean completed = false;

    public WorkOrder(String custFirstName, String custLastName, String custAddress, int custPhoneNumber){
        customerFirstName = custFirstName;
        customerLastName = custLastName;
        customerAddress = custAddress;
        customerPhoneNumber = custPhoneNumber;
        workOrderNumber++;
    }

    public String getCustomerFirstName(){
        return customerFirstName;
    }

    public String getCustomerLastName(){
        return customerLastName;
    }

    public String getCustomerAddress(){
        return customerAddress;
    }

    public int getCustomerPhoneNumber(){
        return customerPhoneNumber;
    }

    public int getWorkOrderNumber(){
        return workOrderNumber;
    }

    public void setCustomerFirstName(String firstName){
        customerFirstName = firstName;
    }

    public void setCustomerLastName(String lastName){
        customerLastName = lastName;
    }

    public void setCustomerAddress(String address){
        customerAddress = address;
    }

    public void setCustomerPhoneNumber(int phoneNumber){
        customerPhoneNumber = phoneNumber;
    }

    /**
     * Marks the work order as completed
     */
    public void completeWorkOrder(){
        completed = true;
    }
}