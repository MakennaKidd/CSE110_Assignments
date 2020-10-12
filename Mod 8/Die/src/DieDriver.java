public class DieDriver
{
    public static void main(String [] args)
    {
        System.out.println("Die Driver - Makenna Kidd\n");

        //creating 3 different die
        System.out.println("1. Creation of Die");
        System.out.print("a) ");
        Die d1 = new Die();
        d1.print();
        System.out.print("\nb) ");
        Die d2 = new Die(4);
        d2.print();
        System.out.print("\nc) ");
        Die d3 = new Die(10);
        d3.print();

        // setting value of 3 different die
        System.out.println("\n\n2. Setting value of Die");
        System.out.print("a) ");
        d1.setValue(3);
        d1.print();
        System.out.print("\nb) ");
        d2.setValue(5);
        d2.print();
        System.out.print("\nc) ");
        d3.setValue(0);
        d3.print();

        //freezing the 3 different die
        System.out.println("\n\n3. Freezing a Die");
        System.out.print("a) ");
        d1.freeze();
        d1.setValue(5);
        d1.print();
        System.out.print("\nb) ");
        d1.unFreeze();
        d1.setValue(5);
        d1.print();

        //drawing 3 different die - where the die face will be printed
        System.out.println("\n\n4. Drawing a Die");
        System.out.print("a) ");
        d1.draw();
        System.out.print("\nb) ");
        d2.draw();
        System.out.print("\nc) ");
        d3.draw();

        //rolling and creating a random roll each time
        System.out.println("\n\n5. Rolling a Die");
        System.out.print("a) ");
        for(int i=0; i<10; i++){
            d1.roll();
            d1.print();
        }

        //where the die face will be printed
        System.out.print("\nb) ");
        for(int i=0; i<3; i++){
            d2.roll();
            d2.draw();
        }
        // statistics of random die will be printed
        System.out.print("\nc) ");
        for(int i=0; i<10; i++){
            d3.roll();
            d3.print();
        }
    }
}

