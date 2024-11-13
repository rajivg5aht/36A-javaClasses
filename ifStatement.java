public class ifStatement {
    public static void main(String[]args){
        // if statement , decision making
        int num1 = 10;
        if (num1 > 10){
            System.out.println("Greater than 10");
            // more statement

        }
        // if - else statement 
        if (num1 > 20){
            System.out.println("greater than 20");

        }else{
            System.out.println("lesser than 40:");
        }
        // if - else -if 
        if(num1 ==10){
            System.out.println("Num is 10");
        }else if (num1 ==9){
            System.out.println ("Num is 9");

        }else{
            System.out.println("Num is unknown");
        }
        // if - else - if ladder // multiple else if 
        String bevarage ="coke";
        if(bevarage == "fanta"){
            System.out.println("orange drink");
        }else if (bevarage == "coke"){
            System.out.println("black deink");
        }else if (bevarage == "sprite"){
            System.out.println("Clear Drink");
        }else{
            System.out.println("Unknown Drink");
        }

        // Nested if
        if(bevarage == "Coke"){
            if(num1 == 10){
                System.out.println("Coke and 10");
            }else{
                System.out.println("Only Coke");
            }
        }else{
            if(num1 == 10){
                System.out.println("Only 10");
            }else{
                System.out.println("No coke and 10");
            }
        }
    }
}
// task 1
// make a variable int day and assign value 
// if day 1 is -> print sunday 
// if day 2 is -> print monday 
// if day 3 is -> print tuesday 
// if day 4 is -> print wednesdy
// if day 5 is -> print thursday
// if day 6 is -> print friday
// if fay 7 is -> print saturday  
// if day is not in number -> print unknown day 

// task 2
// make a varaiable avagmark and char variable gender
// if avgmark is greater than 80 and gender is 'm' print "good boy"
// if avgmark is greater than 80 and gender is 'f' print "good girl"
// if avgmark is not greater than 80 and gender is 'm'print "bad boy"
// if avgmark is not greater than 80 and gender is 'f' print "bad girl" 




int day1 = sunday;

