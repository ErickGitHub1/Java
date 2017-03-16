public class Person
{
        private int age;
        private float height;
        private float weight;
        private String name;

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
}
