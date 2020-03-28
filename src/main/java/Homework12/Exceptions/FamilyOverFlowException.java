package Homework12.Exceptions;

import Homework13.model.Family;

public class FamilyOverFlowException extends RuntimeException {
    Family family = new Family();

    public FamilyOverFlowException()  {
            System.out.println("Family can contain only 4 member!");
    }
}
