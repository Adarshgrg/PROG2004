public class GeneralPractitioner extends HealthProfessional {
    // instance variable specific to GeneralPractitioner
    private int yearsOfExperience; // num of years of experience


    //Default constructor 
    public GeneralPractitioner(){
        super(); //calls the default constructor of parent class
        this.yearsOfExperience = 0; //Default value


    }

   //Constructor  with parameter to initialize all variable
   public GeneralPractitioner(int id, String name, String specialty , int yearsOfExperience){

    super(id, name , specialty); // calls the constructor of the parent class
    this.yearsOfExperience = yearsOfExperience;


   }
   //Method to print details of the General Practitioner 
   @Override

    public void printDetails(){
    System.out.println("The health professional details are: "); // prints ot the details of the General practitioner
    super.printDetails(); // call the printDetails method from the parent class
    System.out.println("Years of Experience: " + yearsOfExperience); //Print the specific detail
    System.out.println("Health Professional Type : General Practitioner");


   }
    
}
