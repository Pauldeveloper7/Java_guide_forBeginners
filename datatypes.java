// This file contains knowldge about data types in java , we can classify them . Into two categories 1) primitive types  - which is build in data types , 2) 
/* a value to be stored may be  interger , floating point number , a character or a string  etc
 * primitive types are stored in memory in a fixed size , they are faster than object types and consume less memory .
 * primitive types are declared using the keyword 'type' , for example int, float, char, boolean.
 * primitive types are immutable , they cannot be changed once assigned .
 * primitive types are stored on the stack , while object types are stored on the heap .
 * primitive types are passed by value , while object types are passed by reference.
 * primitive types are autoboxed and unboxed when needed .
 * primitive types are used when you need to perform arithmetic operations or comparisons on a small number of values.
 * primitive types are used when you need to store a fixed number of values of a particular type.
 * primitive types are used when you need to perform memory-efficient operations.
 * primitive types are used when you need to perform quick and efficient comparisons.
 * primitive types are used when you need to perform arithmetic operations.

  */
// defination of keyword , identifier and literals 
/*Keyword = A keyword is any one of 68 reserved words that have a predefined meaning in the language.
 * Identifier = A sequence of characters that begins with a letter, underscore (_), or dollar sign ($). The rest of the characters can be letters, digits, underscores, or dollar signs.
 * Literal = A fixed value that is directly written into the source code. Examples include integers, floating-point numbers, strings, booleans, and null.
  
**/
public class datatypes {
    int number = 90;
    double decimal = 3.14;
    char letter = 'A';  // single character
    String choice = "Komal  paul";
    float no  = 700; 
    boolean flag  = true;

    public static void main(String[] args) {
        System.out.println("THE PRIMITIVE DATA TYPES ARE : \n 1)NUMBERIC TYPES \n 2) BOOLEAN TYPES");
        System.out.println("1)NUMBERIC TYPES");
        System.out.println(" 1.1) INTEGRAL TYPE");
        System.out.println(" 1.1) INTEGRAL FURTHER TWO TYPES "); 
        System.out.println(" 1.1.1) INTEGER TYPES "); 
        System.out.println(" 1.1.1.1) 1)BYTE 2) SHORT 3)INT 4)LONG");       
        System.out.println(" 1.1.2) CHARACTER TYPES"); 
        System.out.println(" 1.1.2) CHAR");       
        System.out.println(" 1.2) FLOATING-POINT TYPE");
        System.out.println(" 1.2.1) FLOAT ");
        System.out.println(" 1.2.2) DOUBLE ");
        System.out.println("2)BOOLEAN TYPES");
        System.out.println("2.1)BOOLEAN");
        System.out.println(" NON-PRIMITIVE DATATYPES ARE ARRAY , INTERFACE AND CLASS");


    }
}
