public class AssignmentOne {
    
    public static void main(String[] args){
        //Part 3 Using classes and object
        
        //Creating three objects of General Practitioner
        
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Ram", "General", 4);
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Rimal", "General", 10);
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Bhat", "General", 8);


        // Creating two objects of Specialist
        Specialist specialist1 = new Specialist(4, "Dr.  Retard", "Specialist", "Cardiology");
        Specialist specialist2 = new Specialist(5, "Dr.  Zone", "Specialist", "Physiotherapist");

        // Printing the details of all health professionals
        gp1.printDetails();  // Print details of the first General Practitioner
        System.out.println("------------------------------");

        gp2.printDetails();  // Print details of the second General Practitioner
        System.out.println("------------------------------");

        gp3.printDetails();  // Print details of the third General Practitioner
        System.out.println("------------------------------");

        specialist1.printDetails();  // Print details of the first Specialist
        System.out.println("------------------------------");

        specialist2.printDetails();  // Print details of the second Specialist
        System.out.println("------------------------------");
    }

   
    }

