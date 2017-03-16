public class MyFirstJavaProgram
{
        public static void main(String []args)
        {       
                Person me = new Person("Erick", 22);
                // myDog1 object
                Dog myDog1 = new Dog("Misiek");
                
                // myDog2 object
                Dog myDog2 = new Dog("Maks");

                // calling methods on myDog1 object
                myDog1.setAge(2);
                myDog1.getAge();
                  
        }
}
