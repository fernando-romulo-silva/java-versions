package org.java.versons.java14.helpful_null_pointer_exceptions;

class Main {

    // We all know the following problem: Our code throws a NullPointerException:
    // Exception in thread "main" java.lang.NullPointerException
    // at eu.happycoders.BusinessLogic.calculate(BusinessLogic.java:80)
    //
    // And in the code, we find something like this:
    // long value = context.getService().getContainer().getMap().getValue();
    //
    // What is null now?
    // * context?
    // * context.getService()?
    // * Service.getContainer()?
    // * Container.getMap()?
    // * Map.getValue()? (in case this method returns a Long object)
    //
    //
    // After upgrading to Java 14, you won't have to ask yourself this question
    // anymore because then the error message will look like this, for example:
    //
    // Exception in thread "main" java.lang.NullPointerException:
    // Cannot invoke"Map.getValue()" because the return value
    // of"Container.getMap()"is null at
    // eu.happycoders.BusinessLogic.calculate(BusinessLogic.java:80)

    public int x = 10;

    public static void main(String[] args) {

        Main t = initT();

        int i = t.x;

    }

    private static Main initT() {
        return null;
    }

}
