public class SwitchCaseStatement {
    public static void main (string[]args){
        int day - 5;
        switch (day){
            //day=0
         case 0:
            System.out.println("sunday");
            Break;
         case 1;
            System.out.println("monday");
            Break;
         case 2:
            System.out.println("tuesday");
            Break;
         default; 
            System.out.println("unknown day");
            Break;
        }
    }

    

// nest switch statament 
String bevereage ="coke";
char gender ='m';
switch(beverage){
    case "coke":
     switch (gender){
        case 'm':
           System.out.println("male");
           break;
        case 'f':
           System.out.println("Female");
           break;
    }
    System.out.println("black");
    break;
default:
System.out.println("unknown beverage");
break;    
    }
    // switch case or
    int status =404;
    switch(status){
        // ststus ==200 || status ==201|| status==202
        case 200:
        case 201:
        case 202:
            System.out.println("success");
            break;
        // status == 401|| status == 404
        case 401:
        case 404:
            System.out.println("not found");
            break;
        default:
        System.out.println("unknown status");
        break;         
    }
}