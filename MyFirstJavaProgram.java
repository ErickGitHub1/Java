import java.util.*;

public class MyFirstJavaProgram
{
        
        public static void main(String []args)
        {       
                //variable for Dog's age
                int age;   
                 
                //variables for height and weight 
                double height, weight;                       
            
                //first object person1
                Person person1 = new Person("Peter", 17);

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
