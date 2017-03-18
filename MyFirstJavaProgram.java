public class MyFirstJavaProgram
{
        public static void main(String []args)
        {       
                // me object
                Person me = new Person("Erick", 22);
                me.isAdult();
                
                //second object person1
                Person person1 = new Person("Peter", 35);
                person1.fewNamesForChild();

                // myDog1 object
                Dog myDog1 = new Dog("Misiek");
                myDog1.barking();
                
                // myDog2 object
                Dog myDog2 = new Dog("Maks");

                // calling methods on myDog1 object
                myDog1.setAge(2);
                myDog1.getAge();
                  
        }
}
