public class Appointment {
    //Instance variables for patient details, time slot and selected doctor
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional doctor; //can be specialist or GeneralPractitioner

      //Default constructor
      public Appointment()
      {
          this.patientName = "";
          this.patientMobile = "";
          this.timeSlot = "";
          this.doctor = null; //no doctor selected by default
  
      }

    //Constructor to intialize all the instance variablers
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor){
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // Getter method for patientMobile
    public String getPatientMobile() {
        return patientMobile;
    }

    // Other getter methods and necessary methods like printDetails()
    public String getPatientName() {
        return patientName;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    //Method to print the appointment details
    public void printDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Preferred Time Slot: " + timeSlot);
        System.out.println("Selected Doctor: ");
        doctor.printDetails(); //Calls the doctor's printDetails method (from HealthProfessional or its subclasses)
        System.out.println("------------------------------");
    }
}
