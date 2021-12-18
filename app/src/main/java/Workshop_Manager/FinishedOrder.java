
package Workshop_Manager;


public class FinishedOrder extends Order {
    int hour;
    int minutes;
    int day;
    int month;
    int year;
    String notes;
    String Parts;

    public FinishedOrder(int hour, int minutes, int day, int month, int year, String notes, String Parts, String customerName, String phoneNumber, String carMake, String problemDescription, String additionalInfo, boolean isActive) {
        super(customerName, phoneNumber, carMake, problemDescription, additionalInfo, isActive);
        this.hour = hour;
        this.minutes = minutes;
        this.day = day;
        this.month = month;
        this.year = year;
        this.notes = notes;
        this.Parts = Parts;
    }


    public FinishedOrder(String customerName, String phoneNumber, String carMake, String problemDescription, String additionalInfo, boolean isActive) {
        super(customerName, phoneNumber, carMake, problemDescription, additionalInfo, isActive);
    } //second constructor. Used to save data for 1. stage (abstract class)

   
            
            

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getParts() {
        return Parts;
    }

    public void setParts(String Parts) {
        this.Parts = Parts;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    
    
}
