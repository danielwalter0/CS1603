public class Week4_Worksheet {

    public static void main(String[] args) {

        /* =========================================================
         * SECTION 1: BASIC IF / ELSE IF / ELSE (CheckWeather)
         * ========================================================= */
        System.out.println("=== 1) CheckWeather (if / else if / else) ===");
        checkWeather(1);   // try 1, 2, 999 to see different outputs
        checkWeather(2);
        checkWeather(999);


        /* =========================================================
         * SECTION 2: RELATIONAL OPERATORS ( = vs == etc. )
         * (This section is mostly theory, but we show quick examples.)
         * ========================================================= */
        System.out.println("\n=== 2) Relational Operators Examples ===");
        relationalOperatorExamples();


        /* =========================================================
         * SECTION 3: COMPOUND CONDITIONS (&& AND, || OR)
         * ========================================================= */
        System.out.println("\n=== 3) Compound Conditions (AND / OR) ===");
        compoundConditionsDemo(1, 1); // raining=1, snowing=1
        compoundConditionsDemo(1, 0);
        compoundConditionsDemo(0, 1);
        compoundConditionsDemo(0, 0);


        /* =========================================================
         * EXERCISES: Conditional compound operators (divisibility)
         * ========================================================= */
        System.out.println("\n=== 4) Divisibility Exercises ===");
        divisibleBy2And3(12);
        divisibleBy7Or9(63);
        divisibleBy2And3ButNot5(30);
        divisibleBy2And3ButNot5(18);

        // Quick “if rerun 1..1000” demo (so you don't manually test each number)
        System.out.println("\n--- Checking numbers 1..50 for divisible by 2&3 but not 5 ---");
        for (int n = 1; n <= 50; n++) {
            if (n % 2 == 0 && n % 3 == 0 && n % 5 != 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();


        /* =========================================================
         * EXERCISES: Sorting based on conditions
         * ========================================================= */
        System.out.println("\n=== 5) Sort 3 numbers (ascending) ===");
        sortThreeNumbersAscending(10, -10, 3);
        sortThreeNumbersAscending(5, 5, 1);
        sortThreeNumbersAscending(9, 2, 7);

        System.out.println("\n=== 6) Sort 3 names (alphabetical) ===");
        sortThreeNamesAlphabetical("Zara", "Alice", "Bob");
        sortThreeNamesAlphabetical("Paul", "paul", "Allen"); // compareTo is case-sensitive
        sortThreeNamesAlphabetical("Minke", "Klingon", "Potto");


        /* =========================================================
         * SECTION: Switch Statements (month -> days)
         * ========================================================= */
        System.out.println("\n=== 7) Switch: Days in Month (long version) ===");
        System.out.println("Days in September = " + daysInMonthSwitchLong("September"));
        System.out.println("Days in February = " + daysInMonthSwitchLong("February"));
        System.out.println("Days in FakeMonth = " + daysInMonthSwitchLong("FakeMonth"));

        System.out.println("\n=== 8) Switch: Days in Month (grouped version) ===");
        System.out.println("Days in September = " + daysInMonthSwitchGrouped("September"));
        System.out.println("Days in February = " + daysInMonthSwitchGrouped("February"));
        System.out.println("Days in FakeMonth = " + daysInMonthSwitchGrouped("FakeMonth"));


        /* =========================================================
         * SECTION: Switch Statements (creature -> number of legs)
         * Worksheet list:
         * Alsatian Dog, Sphynx Cat, Cobra, Baboon, Centipede, Ocelot,
         * Cod, Human, Tarantula, Black Scorpion, Paul Allen the German Octopus,
         * Minke Whale, Klingon and Potto
         * ========================================================= */
        System.out.println("\n=== 9) Switch: Creature Legs (grouped) ===");
        printCreatureLegs("Alsatian Dog");
        printCreatureLegs("Cobra");
        printCreatureLegs("Paul Allen the German Octopus");
        printCreatureLegs("Centipede");
        printCreatureLegs("Unknown Creature");


        /* =========================================================
         * SECTION: Ternary Operator (?:)
         * Worksheet says: rewrite section 4.5.1 using ternary operator.
         * That means: month->days and creature->legs using ?: instead of switch.
         * ========================================================= */
        System.out.println("\n=== 10) Ternary: Days in Month (?:) ===");
        System.out.println("Days in September = " + daysInMonthTernary("September"));
        System.out.println("Days in February = " + daysInMonthTernary("February"));
        System.out.println("Days in FakeMonth = " + daysInMonthTernary("FakeMonth"));

        System.out.println("\n=== 11) Ternary: Creature Legs (?:) ===");
        printCreatureLegsTernary("Human");
        printCreatureLegsTernary("Cod");
        printCreatureLegsTernary("Tarantula");
        printCreatureLegsTernary("Unknown Creature");
    }


    /* =========================================================
     * 1) CheckWeather: if / else if / else
     * x = 1 -> raining, x = 2 -> not raining (example from worksheet)
     * else -> unknown value
     * ========================================================= */
    static void checkWeather(int x) {

        if (x == 1) {
            System.out.println("x=" + x + " -> Bring an umbrella.");
        } else if (x == 2) {
            System.out.println("x=" + x + " -> No need for an umbrella.");
        } else {
            // This is the "otherwise" (unknown input) case.
            System.out.println("x=" + x + " -> Unknown weather value (no rule defined).");
        }
    }


    /* =========================================================
     * 2) Relational Operators examples
     *
     * =   assignment operator: puts a value into a variable
     * ==  equality operator: compares two values, result is true/false
     * !=  not equal
     * <, >, <=, >= comparisons
     * ========================================================= */
    static void relationalOperatorExamples() {

        int x = 5; // assignment (=) -> x becomes 5
        System.out.println("After 'int x = 5', x is: " + x);

        // equality (==) -> compares x and 5, results in true/false
        System.out.println("x == 5 is: " + (x == 5));
        System.out.println("x == 7 is: " + (x == 7));

        // not equal (!=)
        System.out.println("x != 5 is: " + (x != 5));

        // comparisons
        System.out.println("x < 10 is: " + (x < 10));
        System.out.println("x > 10 is: " + (x > 10));
        System.out.println("x <= 5 is: " + (x <= 5));
        System.out.println("x >= 5 is: " + (x >= 5));
    }


    /* =========================================================
     * 3) Compound conditions demo
     * x = raining? (1=yes, 0=no)
     * y = snowing? (1=yes, 0=no)
     *
     * AND (&&): both must be true
     * OR  (||): at least one must be true
     * ========================================================= */
    static void compoundConditionsDemo(int x, int y) {

        // AND example: sleet if raining AND snowing
        if (x == 1 && y == 1) {
            System.out.println("raining=" + x + ", snowing=" + y + " -> There will be sleet (AND).");
        } else {
            System.out.println("raining=" + x + ", snowing=" + y + " -> No sleet (AND).");
        }

        // OR example: wet/snowy day if raining OR snowing
        if (x == 1 || y == 1) {
            System.out.println("raining=" + x + ", snowing=" + y + " -> Rain OR snow is happening (OR).");
        } else {
            System.out.println("raining=" + x + ", snowing=" + y + " -> Neither rain nor snow (OR).");
        }
    }


    /* =========================================================
     * 4) Divisibility exercises
     *
     * If n is divisible by d -> n % d == 0
     * % is "modulo": it gives the remainder.
     * ========================================================= */

    // Displays if a whole number (>0) is divisible by 2 and 3
    static void divisibleBy2And3(int n) {

        if (n > 0 && n % 2 == 0 && n % 3 == 0) {
            System.out.println(n + " is divisible by 2 AND 3.");
        } else if (n > 0) {
            System.out.println(n + " is NOT divisible by 2 AND 3.");
        } else {
            System.out.println(n + " is not > 0 (input should be a whole number > 0).");
        }
    }

    // Displays if a whole number (>0) is divisible by 7 or 9
    static void divisibleBy7Or9(int n) {

        if (n > 0 && (n % 7 == 0 || n % 9 == 0)) {
            System.out.println(n + " is divisible by 7 OR 9.");
        } else if (n > 0) {
            System.out.println(n + " is NOT divisible by 7 OR 9.");
        } else {
            System.out.println(n + " is not > 0 (input should be a whole number > 0).");
        }
    }

    // Displays if a whole number (>0) is divisible by 2 and 3 but not 5
    static void divisibleBy2And3ButNot5(int n) {

        if (n > 0 && n % 2 == 0 && n % 3 == 0 && n % 5 != 0) {
            System.out.println(n + " is divisible by 2 AND 3 BUT NOT 5.");
        } else if (n > 0) {
            System.out.println(n + " does NOT meet (divisible by 2 and 3 but not 5).");
        } else {
            System.out.println(n + " is not > 0 (input should be a whole number > 0).");
        }
    }


    /* =========================================================
     * 5) Sorting 3 numbers ascending using conditions
     *
     * Approach: do "swaps" (classic exam method)
     * - Ensure a <= b, then b <= c, then a <= b again
     * ========================================================= */
    static void sortThreeNumbersAscending(int a, int b, int c) {

        int originalA = a, originalB = b, originalC = c;

        // swap helper logic:
        // if a > b -> swap a and b
        if (a > b) {
            int temp = a; a = b; b = temp;
        }

        // if b > c -> swap b and c
        if (b > c) {
            int temp = b; b = c; c = temp;
        }

        // after swapping b and c, a might be > b again, so check once more
        if (a > b) {
            int temp = a; a = b; b = temp;
        }

        System.out.println("Input:  a=" + originalA + ", b=" + originalB + ", c=" + originalC);
        System.out.println("Sorted: " + a + " <= " + b + " <= " + c);
    }


    /* =========================================================
     * 6) Sorting 3 names alphabetically
     *
     * Use compareTo (recommended in worksheet):
     * s1.compareTo(s2) < 0  means s1 comes before s2 alphabetically
     * s1.compareTo(s2) > 0  means s1 comes after s2
     * ========================================================= */
    static void sortThreeNamesAlphabetical(String name1, String name2, String name3) {

        String a = name1;
        String b = name2;
        String c = name3;

        // Same swap idea as numbers, but compare using compareTo
        if (a.compareTo(b) > 0) {
            String temp = a; a = b; b = temp;
        }

        if (b.compareTo(c) > 0) {
            String temp = b; b = c; c = temp;
        }

        if (a.compareTo(b) > 0) {
            String temp = a; a = b; b = temp;
        }

        System.out.println("Input:  " + name1 + ", " + name2 + ", " + name3);
        System.out.println("Sorted: " + a + " <= " + b + " <= " + c);
    }


    /* =========================================================
     * 7) Switch (long version): days in month
     * Returns -1 if month is invalid (default case).
     * ========================================================= */
    static int daysInMonthSwitchLong(String month) {

        int daysInMonth = 0;

        switch (month) {
            case "January":
                daysInMonth = 31;
                break;
            case "February":
                daysInMonth = 28;
                break;
            case "March":
                daysInMonth = 31;
                break;
            case "April":
                daysInMonth = 30;
                break;
            case "May":
                daysInMonth = 31;
                break;
            case "June":
                daysInMonth = 30;
                break;
            case "July":
                daysInMonth = 31;
                break;
            case "August":
                daysInMonth = 31;
                break;
            case "September":
                daysInMonth = 30;
                break;
            case "October":
                daysInMonth = 31;
                break;
            case "November":
                daysInMonth = 30;
                break;
            case "December":
                daysInMonth = 31;
                break;
            default:
                daysInMonth = -1; // invalid month
                break;
        }

        return daysInMonth;
    }


    /* =========================================================
     * 8) Switch (grouped): days in month
     * Cleaner: group months with the same number of days.
     * ========================================================= */
    static int daysInMonthSwitchGrouped(String month) {

        int daysInMonth;

        switch (month) {

            // All 31-day months:
            case "January": case "March": case "May":
            case "July": case "August": case "October": case "December":
                daysInMonth = 31;
                break;

            case "February":
                daysInMonth = 28;
                break;

            // All 30-day months:
            case "April": case "June": case "September": case "November":
                daysInMonth = 30;
                break;

            default:
                daysInMonth = -1;
                break;
        }

        return daysInMonth;
    }


    /* =========================================================
     * 9) Switch (grouped): creature -> number of legs
     *
     * NOTE: Some creatures have "0 legs" (snake, fish, whale).
     * Centipede has many legs; for a simple exercise we can treat as 100.
     * If the input doesn't match, return -1.
     * ========================================================= */
    static int legsForCreatureSwitch(String creature) {

        int legs;

        switch (creature) {

            // 4 legs
            case "Alsatian Dog":
            case "Sphynx Cat":
            case "Baboon":
            case "Ocelot":
            case "Potto":
            case "Klingon": // (fictional; worksheet asks to include it)
                legs = 4;
                break;

            // 2 legs
            case "Human":
                legs = 2;
                break;

            // 0 legs (snake/fish/whale)
            case "Cobra":
            case "Cod":
            case "Minke Whale":
                legs = 0;
                break;

            // 8 legs
            case "Tarantula":
            case "Paul Allen the German Octopus": // octopus technically has 8 arms; worksheet says legs
                legs = 8;
                break;

            // 8 legs for a scorpion? (scorpions have 8 legs)
            case "Black Scorpion":
                legs = 8;
                break;

            // Centipede has many legs (we choose a simple representative number)
            case "Centipede":
                legs = 100;
                break;

            default:
                legs = -1; // unknown creature
                break;
        }

        return legs;
    }

    static void printCreatureLegs(String creature) {
        int legs = legsForCreatureSwitch(creature);

        if (legs == -1) {
            System.out.println("Creature: " + creature + " -> Unknown creature (default case).");
        } else {
            System.out.println("Creature: " + creature + " -> Legs = " + legs);
        }
    }


    /* =========================================================
     * 10) TERNARY OPERATOR (?:) for days in month
     *
     * ternary syntax:
     * condition ? value_if_true : value_if_false
     *
     * This becomes ugly when there are many cases, but it's what the worksheet asked.
     * ========================================================= */
    static int daysInMonthTernary(String month) {

        // We build it as nested ternaries.
        // If none match -> -1.
        return (month.equals("January")  || month.equals("March")   || month.equals("May") ||
                month.equals("July")    || month.equals("August")  || month.equals("October") || month.equals("December"))
                ? 31
                : (month.equals("April") || month.equals("June") || month.equals("September") || month.equals("November"))
                    ? 30
                    : (month.equals("February"))
                        ? 28
                        : -1;
    }


    /* =========================================================
     * 11) TERNARY OPERATOR (?:) for creature legs
     * Again: nested ternaries for many categories.
     * ========================================================= */
    static int legsForCreatureTernary(String creature) {

        return (creature.equals("Human")) ? 2

                : (creature.equals("Alsatian Dog") || creature.equals("Sphynx Cat") ||
                   creature.equals("Baboon") || creature.equals("Ocelot") ||
                   creature.equals("Potto") || creature.equals("Klingon"))
                    ? 4

                : (creature.equals("Cobra") || creature.equals("Cod") || creature.equals("Minke Whale"))
                    ? 0

                : (creature.equals("Tarantula") || creature.equals("Black Scorpion") ||
                   creature.equals("Paul Allen the German Octopus"))
                    ? 8

                : (creature.equals("Centipede"))
                    ? 100

                : -1;
    }

    static void printCreatureLegsTernary(String creature) {
        int legs = legsForCreatureTernary(creature);
        String msg = (legs == -1)
                ? ("Creature: " + creature + " -> Unknown creature (default case).")
                : ("Creature: " + creature + " -> Legs = " + legs);

        System.out.println(msg);
    }
}
