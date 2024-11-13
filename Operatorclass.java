public class Operatorclass {
    public static void main(String [] args) {
        // arthimatic operator
        // +,-,*,/,%
        int intVAr1 = 10,intVar2  = 20;
        int addOper = intVAr1+ + intVar2; // 10+20
        int minusOper = intVAr1 - intVar2; // 10-20
        int multiOper = intVAr1 * intVar2; // 1o*30
        int divOper = intVAr1 / intVar2; // 10/20
        int modOper = intVAr1 % intVar2;// 10/ 20 (reminder)


        // assignment Operator 
        int assignvar =10;
        assignvar += 20; //10+20 -> 30
        assignvar -= 15; // 30-15 ->15
        assignvar *= 2; // 15*2 -> 30
        assignvar /= 10; // 30/10 -> 3
        assignvar %= 2; // 3%2 -> 1
        
        // Unary operator
        int unaryVar= 20;
        unaryVar++; // unaryvar += 1;20+1;21
        unaryVar--;// unaryvar-=1; 21-1;20
        
        //Relational operator
        int relVar1=20,relVar2=30;
        boolean equalOper = relVar1== relVar2;// 20=30? flase
        boolean greaterOpear= relVar1>relVar2;//20>30?flase
        boolean lessEqualOpear= relVar2<=30;// 30<=30 ? true
        boolean notEqual=20!=10;//true

        //Logical operator
        int logVar1=10,logVar2=20,logVar3=23;
        boolean andOper= true&& true;
        boolean andOperVar= (logVar1<logVar2)&&(logVar3==logVar2);// true && flase
        boolean orOper= false || false || true;
        boolean notOper =! (logVar1<logVar2); // !true--> false
        boolean OrOperVar= (logVar1<logVar2)|| (logVar3==logVar2);//
         

        






    















    
    }
    
}
