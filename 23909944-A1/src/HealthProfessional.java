public class HealthProfessional {
    // instance variables
    private int id;                     //initializing ID
    private String name;                //initializing name of the professional
    private String specialty;           //initializing specialty of Healthprofessional

    
    // Default constructor
    public HealthProfessional(){
        this.id = 0;
        this.name = "Unknown";
        this.specialty = specialty;

    }
      // Constructor to initialize all variables
    public HealthProfessional(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }
    
    //Method to print all instance variable
    public void printDetails(){
     System.out.println("ID:  " + id);
     System.out.println("name:   "+ name);
     System.out.println("specialty:   "+ specialty);

   }
   //Getter amd Setter methods 


   public int getID()
   {return id;
   }
   public void setID(int id){
    this.id = id;
   }
   public String getName()
   {return name;
   }
   public void setName(String name){
    this.name = name;
   }

    public String  getSpecialty(){
        return specialty;
   }
   public void setspecialty(String specialty){
    this.specialty = specialty;

  }
}