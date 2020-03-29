package Homework12.Exceptions;

public class FamilyOverFlowException extends RuntimeException {

    public FamilyOverFlowException()  {
            System.out.println("Family can contain only 4 member!");
    }
}
