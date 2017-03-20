import java.util.*;
import java.lang.Character;

public class MyFirstJavaProgram
{
                     
        public static void main(String []args)
        {       
                //variable for Dog's age
                int age;   
                 
                //variables for height and weight 
                double height, weight;                       
            
                //variable for user's name
                String name;

                //first object person1
                System.out.println("Enter name: ");
                Scanner name_reader = new Scanner(System.in);
                name = name_reader.nextLine();
                
                //Capitalize first letter of name if first letter is lowercase                                
                name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();        

                Person person1 = new Person(name, 17);

                //Entry for height and weight
                
                System.out.println("Enter height: ");
                Scanner enter_height = new Scanner(System.in);
                enter_height.useLocale(Locale.US);
                height = enter_height.nextDouble();
                
                System.out.println("Enter weight: ");
                Scanner enter_weight = new Scanner(System.in);
                enter_weight.useLocale(Locale.US);
                weight = enter_weight.nextDouble();                
        
                person1.setWeight(weight);
                person1.setHeight(height);
                person1.getWeight();                
                person1.getHeight();
                person1.bmi();
/*                
                if(person1.isAdult() == true)
                {       
                        System.out.println("I suppose you can have kids.");
                        person1.fewNamesForChild();  
                }
*/
/*                

                // myDog1 object
                Dog myDog1 = new Dog("Misiek");
                myDog1.barking();
                
                // myDog2 object
                Dog myDog2 = new Dog("Maks");

                //User enter for Dog's age
                System.out.println("Enter your Dog's age: ");
                Scanner reader = new Scanner(System.in);
                age = reader.nextInt();
        
                // calling methods on myDog1 object
                myDog1.setAge(age);
                myDog1.getAge();
*/                  
        }
}
