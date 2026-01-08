public class Week3_Worksheet {

    public static void main(String[] args) {

        /* =========================================================
         * PART A) SEMINAR ACTIVITY: Area of Rectangle
         * ========================================================= */
        int l = 10, w = 5;
        int A = l * w;
        System.out.println("Area of the rectangle: " + A);

        // Biggest int value (useful for the worksheet question)
        System.out.println("Largest int is: " + Integer.MAX_VALUE);

        // Why can we add String + int? -> Java converts the int to String automatically (concatenation).


        /* =========================================================
         * PART B) RUNTIME EXPRESSIONS (x changes during execution)
         * ========================================================= */
        int xInt = 100;
        System.out.println(xInt);

        // Another way to write Line A and B:
        // x = x + 10;  ->  x += 10;
        // x = x + 20;  ->  x += 20;
        xInt += 10; // Line A equivalent
        System.out.println(xInt);

        xInt += 20; // Line B equivalent
        System.out.println(xInt);

        // The worksheet then tries invalid "long x = 100.1" etc.
        // long cannot store decimals, so Java gives: "possible lossy conversion from double to long"
        // Fix: use double.
        double xDouble = 100.1;
        System.out.println(xDouble);
        xDouble += 10.2;
        System.out.println(xDouble);
        xDouble += 20.3;
        System.out.println(xDouble);


        /* =========================================================
         * PART C) EXERCISES: Declare variables + constants
         * ========================================================= */
        int a = 100;
        double b = 2.3;
        double c = -52.2;
        boolean d = true;
        String e = "I am ";
        String f = "a student";
        int g = 0;
        char h = '!';

        // Constants (final = constant)
        final double pi = 3.142;
        final String name = "YOUR_NAME_HERE"; // <-- put your name

        // Extra variables requested
        long x = 0L;
        double y = 0.0;
        String z = "";


        /* =========================================================
         * PART D) EXPRESSIONS 1..20
         * Do the valid ones, comment out invalid ones with reasons.
         * ========================================================= */

        // 1) y = a + b  (valid: int + double -> double)
        y = a + b;
        System.out.println("1) y = a + b -> " + y);

        // 2) y = a + d  (invalid: cannot add int + boolean)
        // y = a + d; // ERROR: bad operand types for '+' (int and boolean)

        // 3) z = e + f  (valid: String + String -> String)
        z = e + f;
        System.out.println("3) z = e + f -> " + z);

        // 4) y = bc  (invalid: missing operator)
        // y = bc; // ERROR: bc is not a variable; you probably meant b*c

        // 5) pi = 22/7 (invalid because pi is final constant AND 22/7 is int division)
        // pi = 22 / 7; // ERROR: cannot assign a value to final variable 'pi'
        // Also: (22/7) with ints equals 3, not 3.142...

        // 6) z = name / g (invalid: cannot divide String by int)
        // z = name / g; // ERROR: operator '/' not defined for String and int

        // 7) z = c / g (invalid at runtime: division by zero)
        // z = "" + (c / g); // Would crash if g == 0 (ArithmeticException if int /0; doubles give Infinity)
        // NOTE: because c is double and g is int, Java converts to double division -> result is Infinity/-Infinity, not crash.
        System.out.println("7) c/g with g=0 gives -> " + (c / g)); // demonstrates Infinity

        // 8) x = 10; x = x3 (invalid: x3 not declared)
        x = 10;
        // x = x3; // ERROR: cannot find symbol x3

        // 9) z = name + " is " + f + h (valid)
        z = name + " is " + f + h;
        System.out.println("9) " + z);

        // 10) y = (name + 10)/(name + h) (invalid: cannot divide Strings)
        // y = (name + 10) / (name + h); // ERROR: operator '/' not defined for String

        // 11) x = (a + b) / (d + c)
        // invalid because (d + c) -> boolean + double not allowed
        // x = (long)((a + b) / (d + c)); // ERROR: bad operand types for '+' (boolean and double)

        // 12) y = 100.3; y = (y / (a + b)) - c  (valid)
        y = 100.3;
        y = (y / (a + b)) - c;
        System.out.println("12) y -> " + y);

        // 13) x2 = y2 + z2 (invalid unless you declare x2,y2,z2)
        // double x2, y2, z2; x2 = y2 + z2; // would be valid ONLY if declared
        // As written: ERROR: cannot find symbol x2/y2/z2

        // 14) name = "Is " + f - h (invalid: name is final AND String - char not allowed)
        // name = "Is " + f - h; // ERROR (final + invalid '-')
        // If you wanted to include h, do: "Is " + f + h

        // 15) (blank in worksheet) -> leave as placeholder comment
        // 15) Not provided in worksheet.

        // 16) (blank in worksheet) -> leave as placeholder comment
        // 16) Not provided in worksheet.

        // 17) y = b/g ; z = y + name
        // b/g with g=0 => Infinity (double division), then String concatenation works
        y = b / g;
        z = y + name; // double + String -> String
        System.out.println("17) y=b/g -> " + y + " , z=y+name -> " + z);

        // 18) z = name ; z = b/g + z
        z = name;
        z = (b / g) + z; // double + String -> String
        System.out.println("18) " + z);

        // 19) y = -2.3 ; y = a*y^2 + b*y + c
        // In Java, ^ is XOR, NOT power.
        // Use Math.pow(y,2)
        y = -2.3;
        y = a * Math.pow(y, 2) + b * y + c;
        System.out.println("19) quadratic -> " + y);

        // 20) (blank in worksheet)
        // 20) Not provided in worksheet.


        /* =========================================================
         * PART E) RESERVED WORDS / INVALID VARIABLE NAMES
         * You can't "test" reserved words without causing compile errors,
         * so we list the answers clearly (what the worksheet wants).
         * ========================================================= */

        // RESERVED WORDS in Java (cannot be variable names):
        // for, while, switch, package, throw, new, class

        // INVALID variable names (break naming rules):
        // 4        (cannot start with digit)
        // 17beans  (cannot start with digit)

        // VALID variable names (allowed):
        // four, x4, x_4b, While, Switch, $witch, switch23,
        // name, friends, object, student, day, date, time, month, year,
        // age, height, weight, beans17, note, x___

        // Quick reminder:
        // - Java is case-sensitive: "switch" is reserved, "Switch" is allowed as a variable name.
        // - $ is allowed in identifiers (though not recommended in normal style).
    }
}
