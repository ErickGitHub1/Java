public class Person
{
        private int age;
        private double height;
        private double weight;
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
        
        // Setter for weight
        public void setWeight(double weight)
        {
                this.weight = weight;
        }

        // Getter for weight
        public double getWeight()
        {       
                System.out.println("Your weight is: " + weight);
                return weight;
        }

        // Setter for height
        public void setHeight(double height)
        {
                this.height = height;
        }
        
        // Getter for height
        public double getHeight()
        {       
                System.out.println("Your height is: " + height);
                return height;
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
        
        //Possibly names for Kids
        public void fewNamesForChild()
        {
                System.out.print("You can choose for your child name like:\n");
                for(String name : names)
                {
                        System.out.println(name);
                }
        }

        // Calculation BMI
        public void bmi()
        {
                double bmi = 0;
                bmi = weight / Math.pow(height,2.0);
                System.out.println("Your bmi is: " + bmi);                      
        }       
}
