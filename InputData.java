import java.util.Scanner;

    class InputData 
        {
            public static void main (String[] args) {
                
                Scanner keyboard = new Scanner(System.in); 
                
                    String first;
                    String last;
                    String login;
                    double grade;
                    double student;
                    float  year;
                    
                    System.out.print("Please enter the following information for data harvesting and collection! ");
                    System.out.print("What is your first name?");
                        first = keyboard.nextLine();
                    
                    System.out.print("What is your last name?");
                        last = keyboard.nextLine();
                    
                    System.out.print("Provide your login name:");
                        login = keyboard.nextLine();
                    
                    System.out.print("What grade are you in?");
                        grade = keyboard.nextInt();
                    
                    System.out.print("What's your Student ID number?");
                        student = keyboard.nextInt();
                    
                    System.out.print("Provide your GPA:");
                        year = keyboard.nextFloat();
                        
                        
                
                        System.out.print("Your information below: ");
                            System.out.println();
                            System.out.print("\nLogin: " + login );
                            System.out.println();
                            System.out.print("\nID: "    + student);
                            System.out.println();
                            System.out.print("\nName: "  + first +  last);
                            System.out.println();
                            System.out.print("\nGPA: "   + grade );
                            System.out.println();
                            System.out.print("\nGrade: " + year );
                        
                    
                    
                
        
        
    }
}