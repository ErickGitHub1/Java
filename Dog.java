public class Dog
{
        // Pola
        int age;
        String breed;
        String color;

        // Konstruktor I
        public Dog()
        {
                // Implementacja konstruktora
        }

        // Konstruktor II
        public Dog(String name)
        {
                System.out.println("Your dog's name is: "+ name);
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
