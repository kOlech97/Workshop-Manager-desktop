
package Workshop_Manager;


public abstract class Order {
    String customerName;
    String phoneNumber;
    String carMake;
    String problemDescription;
    String additionalInfo;
    boolean isActive;

    public Order(String customerName, String phoneNumber, String carMake, String problemDescription, String additionalInfo, boolean isActive) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.carMake = carMake;
        this.problemDescription = problemDescription;
        this.additionalInfo = additionalInfo;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return customerName+","
                 + phoneNumber+","
                + carMake+","
                + problemDescription+","
                + additionalInfo+","
                + isActive+',';
    } //Overrided method toString() to save or show object as string type

 
    
}
