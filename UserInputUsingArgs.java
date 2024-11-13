// UserInputUsingArgs.java
public class UserInputUsingArgs {
    public static void main(String[] args) {
        // The parameter String[] args takes array of input
        // when running from command line
        // You can compile java file with
        // javac FileName.java
        // java FileName args1 args2
        // or
        // java FileName.java args1 args2
        
        System.out.println("First Args " + args[0]);
        System.out.println("Second Args " + args[1]);

        // The args are in datatype String, to convert or parse any args
        int argsParse1 = Integer.parseInt(args[0]);
        int argsParse2 = Integer.parseInt(args[1]);
        System.out.println("Sum of args " + (argsParse1 + argsParse2));
    }
}
