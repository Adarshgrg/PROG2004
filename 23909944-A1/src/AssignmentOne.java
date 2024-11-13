public class AssignmentOne {
    
    public static void main(String[] args){
        
   // Create a GeneralPractitioner object
   GeneralPractitioner gp = new GeneralPractitioner(1, "Dr. Ram", "General", 4);
   gp.printDetails();  // Print details of the General Practitioner

   System.out.println();  // Blank line between outputs
   
   // Create a Specialist object
   Specialist specialist = new Specialist(2, "Dr. Johnson", "Specialist", "Physiotherapist");
   specialist.printDetails();  // Print details of the Specialist

   
    }
}
