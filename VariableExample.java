public class VariableExample {
// Instance variable 
int instanceVariable = 100;
// instancevariable can only be accessed with the object 
//static vairable 
static boolean staticVariable = false;
//staticvariable can be accessed with class directly 
void firstfunction(){
    int localvariable = 300;
    // local variable are made inside a function/constructer scope/block
    System.out.println("local variable :"+localvariable); 
}
public static void main(String[] args) {
    int localvariable2 = 400;
    System.out.println("Local Variable :" + localvariable2);
    // To use the instance variable of a class, make object 
    //syntax: ClassName objVariable = new ClassName();
    VariableExample variableExampleobj = new VariableExample();
    //the variable of variableExample is called object, here variableExampleObj
    variableExampleobj. instanceVariable = 600;  
    System.out.println("Instance variable :"+ variableExampleobj.instanceVariable);
    // static variable can be accessed with,ClassName.variable
    System.out.println("static variable:"+  VariableExample.staticVariable);

      //Java TypeCasting Primitive Datatype
        //Widening Casting/Implicit Casting/ automatic
        //Conversion of smaller datatype to larger datatype (size/capacity)
        //byte -> short -> int -> long -> float -> double
        byte byteVariable = 10;
        short shortVariable = byteVariable; // here byte is automatically converted to short

        int mathMark =20;
        double mathConverted = mathMark; //int is automatically converted to double -> 20.0
        System.out.println("Int to double " + mathConverted);

        //Narrowing Casting/Explicit Casting/Manual
        //Conversion of larger datatype to smaller datatype (size/capacity)
        double gpa = 3.4;
        int gpaInt = (int) gpa;
        System.out.println("GPA int " + gpaInt);
        int floatConversion = (int) 400.33f; // 400
        


}    
}
