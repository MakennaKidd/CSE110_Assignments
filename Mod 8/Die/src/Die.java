import java.util.Random;

class Die
{
    int numSides;
    boolean frozen;
    int value;
    //sets value of Die
    public void setValue(int value) {
        if(value <= numSides && value > 0 && !frozen){
            this.value = value;
        }else{
            System.out.println("*** Attempted to set value to "+value+" Assumed 1");
            this.value = 1;
        }
    }
    //Constructor
    public Die(int numSides){
        if(numSides > 1){
            this.numSides = numSides;
        }else{
            System.out.println("Assuming 6 sides");
            this.numSides = 6;
        }
        this.value = 1;
        frozen=false;
    }
    //gets value of Die
    public int getValue() {
        return value;
    }
    // Constructor
    public Die(){

        this.numSides = 6;
        this.value = 1;
        this.frozen=false;
    }
    //Roll a Die
    public void roll(){
        if(!frozen){
            Random rand = new Random();
            value = rand.nextInt(numSides-1)+1;
        }
    }
    //Draw a Die
    public void draw(){
        if(numSides > 6){
            print();
        }else{
            switch(value){
                case 1:drawOne();break;
                case 2:drawTwo();break;
                case 3:drawThree();break;
                case 4:drawFour();break;
                case 5:drawFive();break;
                case 6:drawSix();break;
            }
        }
    }
    private void drawSix(){
        System.out.println("\n.......");
        System.out.println(".     .");
        System.out.println(".* * *.");
        System.out.println(".     .");
        System.out.println(".* * *.");
        System.out.println(".     .");
        System.out.println(".......");
    }
    private void drawFive(){
        System.out.println("\n.......");
        System.out.println(".     .");
        System.out.println(". * * .");
        System.out.println(".  *  .");
        System.out.println(". * * .");
        System.out.println(".     .");
        System.out.println(".......");
    }
    private void drawFour(){
        System.out.println("\n.......");
        System.out.println(".     .");
        System.out.println(". * * .");
        System.out.println(".     .");
        System.out.println(". * * .");
        System.out.println(".     .");
        System.out.println(".......");
    }
    private void drawThree(){
        System.out.println("\n.......");
        System.out.println(".     .");
        System.out.println(". *   .");
        System.out.println(".  *  .");
        System.out.println(".   * .");
        System.out.println(".     .");
        System.out.println(".......");
    }
    private void drawTwo(){
        System.out.println("\n.......");
        System.out.println(".     .");
        System.out.println(". *   .");
        System.out.println(".     .");
        System.out.println(".   * .");
        System.out.println(".     .");
        System.out.println(".......");
    }
    private void drawOne(){
        System.out.println("\n.......");
        System.out.println(".     .");
        System.out.println(".     .");
        System.out.println(".  *  .");
        System.out.println(".     .");
        System.out.println(".     .");
        System.out.println(".......");
    }
    //Print a Die
    public void print(){
        System.out.print("["+value+":"+numSides+"]");
    }
    // Freeze a Die
    public void freeze(){
        frozen = true;
    }
    //Unfreeze a Die
    public void unFreeze(){
        frozen = false;
    }
}

