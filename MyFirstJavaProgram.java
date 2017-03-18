import java.util.Scanner;

public class MyFirstJavaProgram
{
        
        public static void main(String []args)
        {       
                //variable for Dog's age
                int age;   
   
                // me object
                Person me = new Person("Erick", 22);
                                
                //second object person1
                Person person1 = new Person("Peter", 17);
                
                if(person1.isAdult() == true)
                {       
                        System.out.println("I suppose you can have kids.");
                        person1.fewNamesForChild();  
                }
                

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
                  
        }
}
