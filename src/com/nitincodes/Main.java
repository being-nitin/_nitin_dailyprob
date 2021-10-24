package com.nitincodes;

public class Main {
// predict the output:
    public static void main(String[] args) {
	// write your code  here
        Abc.method();
    }
}
class Abc{
    void method(){
        System.out.println("method is calling:");
    }
}




/* it will show an error because of two reasons
1. we have called the method with the name of the class, it means the method should be static but here the method is not
static so we can not call it by the name of the class
2. if the method is not static then we can go for creation of an object and a constructor too but here we haven't
done anything something like that , this question will demonstrate the use of static method and invoking it
 */