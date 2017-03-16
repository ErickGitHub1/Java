public class Dog
{
        // Pola
        private int age;
        private String breed;
        private String color;
        private static int numberInstances = 0;        

        // Konstruktor I
        public Dog()
        {
                Dog.addDog();
        }

        // Konstruktor II
        public Dog(String name)
        {
                System.out.println("Your dog's name is: "+ name);
                Dog.addDog();
        }

        // Metody
        // Setter for age's dog 
        public void setAge(int age)
        {
                this.age = age;        
        }

        // Getter for age's dog
        public int getAge()
        {
                System.out.println("Your dog's age is: " + this.age);
                return this.age;
        }

        private static void addDog()
        {
                numberInstances++;    
        }

        public int numberDogs()
        {
                return numberInstances;
        }

        void barking()
        {
                // Implmenentacja metody
        }

        void hungry()
        {
                // Implementacja metody
        }

        void sleeping()
        {
                // Implementacja metody
        }
}
