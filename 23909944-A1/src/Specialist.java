public class Specialist extends HealthProfessional{
    private String specializationArea; // doctor specialization for example physiotherapist


    //Default constructor 
    public Specialist(){
        super(); //calls the default constructor of parent class
        this.specializationArea = "Unknown"; //Default value


    }

   //Constructor with parameter to initialize all variable
   public Specialist(int id, String name, String specialty , String specializationArea){

    super(id, name , specialty); // calls the constructor of the parent class
    this.specializationArea = specializationArea;


   }
   //Method to print details of the General Practitioner 
   @Override
   
    public void printDetails(){
    System.out.println("The health professional details are: "); // prints ot the details of the General practitioner
    super.printDetails(); // call the printDetails method from the parent class
    System.out.println("Specialization Area:  " + specializationArea); //Print the specific detail
    System.out.println("Health Professional Type : Specialist");


   }
    
}
