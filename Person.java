public class Person
{
        private int age;
        private float height;
        private float weight;
        private String name;
        
        String [] names = {"Erick", "John", "Andrew", "Mathew", "Peter"};         
                
        // Constructor1
        public Person(String name)
        {       
                System.out.println("Person name is: " + name);
                this.name = name;
        }

        // Constructor2
        public Person(String name, int age)
        {
                System.out.println("Person name is: " + name + " and age: " + age);
                this.name = name;
                this.age = age;
        }
        
        // Method isAdult() checking if user is adult or not
        public boolean isAdult()
        {
                if(age >= 18)
                {
                        System.out.println(name + " is adult");
                        return true;
                }else{
                        System.out.println(name + " is not adult");
                        return false;
                }                
        }
        
        //Possible names for Kids
        public void fewNamesForChild()
        {
                System.out.print("You can choose for your child name like:\n");
                for(String name : names)
                {
                        System.out.println(name);
                }
        }        
}
