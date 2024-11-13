import java.util.ArrayList;

public class AssignmentOne {

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("------------------------------");

        // Creating instances of HealthProfessional classes
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Ram", "General", 4);
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Rimal", "General", 10);
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Bhat", "General", 8);

        Specialist specialist1 = new Specialist(4, "Dr. Retard", "Specialist", "Cardiology");
        Specialist specialist2 = new Specialist(5, "Dr. Zone", "Specialist", "Physiotherapist");

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("------------------------------");

        // Declare an ArrayList to store appointments
        ArrayList<Appointment> appointments = new ArrayList<>();

        // Making appointments
        createAppointment(appointments, "Kirs", "1234567890", "9:00 AM", gp1);
        createAppointment(appointments, "Koo", "0987654321", "10:00 AM", specialist1);
        createAppointment(appointments, "lol", "1122334455", "11:00 AM", gp2);
        createAppointment(appointments, "Soul", "5566778899", "1:00 PM", specialist2);

        // Print existing appointments
        printExistingAppointments(appointments);

        // Cancel one booking by mobile phone
        cancelBooking(appointments, "1234567890");

        // Print existing appointments again to demonstrate the updated collection
        printExistingAppointments(appointments);
    }

    // Part 5 – Method to create a new appointment and add it to the ArrayList
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        // Ensure all required information is supplied
        if (patientName == null || patientMobile == null || timeSlot == null || doctor == null) {
            System.out.println("Error: Missing information. Appointment cannot be created.");
            return;
        }

        // Create a new appointment and add it to the list
        Appointment newAppointment = new Appointment(patientName, patientMobile, timeSlot, doctor);
        appointments.add(newAppointment);
        System.out.println("Appointment created for " + patientName);
    }

    // Part 5 – Method to print existing appointments
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
            }
        }
        System.out.println("------------------------------");
    }

    // Part 5 – Method to cancel a booking using the patient's mobile phone
    public static void cancelBooking(ArrayList<Appointment> appointments, String patientMobile) {
        boolean appointmentFound = false;
        // Search for the appointment by patient mobile
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientMobile().equals(patientMobile)) {
                appointments.remove(i); // Remove the appointment
                appointmentFound = true;
                System.out.println("Appointment canceled for patient with mobile: " + patientMobile);
                break;
            }
        }
        if (!appointmentFound) {
            System.out.println("Error: No appointment found for the patient with mobile: " + patientMobile);
        }
    }
}
