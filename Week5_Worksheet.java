public class Week5_Worksheet {

    public static void main(String[] args) {

        /* =========================================================
         * EXERCISE 1 (ODD / EVEN using for-loop + if + modulo)
         * Worksheet idea: print i and "(+)" when i is even/odd (depending on task)
         * ========================================================= */
        System.out.println("=== Exercise 1: Odd/Even (+) ===");
        exercise1_OddEvenPlus(10); // change n if needed


        /* =========================================================
         * EXERCISE 2 (while-loop example)
         * Original worksheet code would print forever because x never changes.
         * We fix it by incrementing x (so the condition eventually becomes false).
         * ========================================================= */
        System.out.println("\n=== Exercise 2: While loop example (fixed) ===");
        exercise2_WhileLoopFixed();


        /* =========================================================
         * EXERCISE 3 (nested loops: implement equation with i and j)
         * Worksheet says implement where i and j run between ranges (e.g. 1..n, 1..m).
         * ========================================================= */
        System.out.println("\n=== Exercise 3: Nested loops i and j ===");
        exercise3_NestedLoops(3, 4);


        /* =========================================================
         * GENERATING PATTERNS USING FOR LOOPS
         * Print the exact symbol sequences shown in the worksheet
         * ========================================================= */
        System.out.println("\n=== Patterns (For Loops) ===");
        patterns();


        /* =========================================================
         * GENERATING SEQUENCES USING FOR LOOPS
         * Print the exact number sequences shown in the worksheet
         * ========================================================= */
        System.out.println("\n=== Number Sequences (For Loops) ===");
        sequences();


        /* =========================================================
         * EUCLID'S ALGORITHM (GCD) USING A WHILE LOOP
         * Includes the test cases listed on the worksheet
         * ========================================================= */
        System.out.println("\n=== Euclid's Algorithm (GCD) ===");
        gcdTests();


        /* =========================================================
         * NESTED LOOPS – PRODUCE GIVEN NUMBER/SYMBOL STRINGS
         * ========================================================= */
        System.out.println("\n=== Nested Loop Sequences ===");
        nestedLoopSequences();


        /* =========================================================
         * NESTED LOOPS – PAIRS TASKS
         * ========================================================= */
        System.out.println("\n=== Pairs Tasks ===");
        pairsTasks();
    }


    /* =========================================================
     * Exercise 1: Odd/Even example
     * Prints "i (+)" when condition is true.
     * Choose odd or even using modulo.
     * ========================================================= */
    static void exercise1_OddEvenPlus(int n) {
        for (int i = 1; i <= n; i++) {

            // Modulo: i % 2 == 0 means EVEN, i % 2 != 0 means ODD
            if (i % 2 != 0) { // ODD numbers
                System.out.println(i + " (+)");
            } else {
                // If you want to print the others, you can do it here (or leave blank)
                System.out.println(i);
            }
        }
    }


    /* =========================================================
     * Exercise 2: While-loop example (fixed)
     * Worksheet's version would run forever. Here we update x each loop.
     * ========================================================= */
    static void exercise2_WhileLoopFixed() {
        int x = 4;
        int y = 5;

        while (x < y) {
            System.out.println("Hi there...");
            x++; // IMPORTANT: Without this, x stays 4 forever and loop never ends.
        }

        System.out.println("Loop ended because x is now " + x + " (x < y is false).");
    }


    /* =========================================================
     * Exercise 3: Nested loops
     * Outer loop i from 1..n
     * Inner loop j from 1..m
     * ========================================================= */
    static void exercise3_NestedLoops(int n, int m) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);

            for (int j = 1; j <= m; j++) {
                System.out.println(" ----> " + j);
            }
        }
    }


    /* =========================================================
     * PATTERNS SECTION
     * Helper methods + the exact outputs requested by worksheet.
     * ========================================================= */
    static void patterns() {

        // "++++++++++"
        System.out.println(repeatChar('+', 10));

        // "---------"
        System.out.println(repeatChar('-', 9));

        // "+-+-+-+-+-"
        System.out.println(alternateChars('+', '-', 10));

        // "*+-*+-*+-"
        // 9 chars total: "*+-" repeated 3 times = 9 chars
        System.out.println(repeatString("*+-", 3));

        // "*+-*+-*+-*"
        // 10 chars: "*+-" repeated 3 times + "*" at end
        System.out.println(repeatString("*+-", 3) + "*");

        // "**++**++**++"
        // pattern "**++" repeated 3 times
        System.out.println(repeatString("**++", 3));

        // "***+++---***+++---"
        // pattern "***+++---" repeated 2 times
        System.out.println(repeatString("***+++---", 2));

        // "***+++------+++***"
        // "***" + "+++" + "------" + "+++" + "***"
        System.out.println(repeatChar('*', 3)
                + repeatChar('+', 3)
                + repeatChar('-', 6)
                + repeatChar('+', 3)
                + repeatChar('*', 3));
    }

    // Repeat a single character n times
    static String repeatChar(char c, int n) {
        String out = "";
        for (int i = 0; i < n; i++) out += c;
        return out;
    }

    // Repeat a full string k times
    static String repeatString(String s, int k) {
        String out = "";
        for (int i = 0; i < k; i++) out += s;
        return out;
    }

    // Alternate between two characters for total length n (e.g. "+-+-+-")
    static String alternateChars(char a, char b, int n) {
        String out = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) out += a;
            else out += b;
        }
        return out;
    }


    /* =========================================================
     * SEQUENCES SECTION
     * Prints the number sequences exactly like the worksheet list.
     * ========================================================= */
    static void sequences() {

        // 4,5,6,7,8,9,10,11
        printSequenceRange(4, 11, 1);

        // 10, 13, 16, 19
        printSequenceRange(10, 19, 3);

        // 1, 4, 7, 10, 13, 16
        printSequenceRange(1, 16, 3);

        // 2, 4, 6, 8, 10, 12
        printSequenceRange(2, 12, 2);

        // 1, 4, 9, 16, ... 100 (squares)
        printSquares(1, 10);

        // -10, -8, -6, ... 10
        printSequenceRange(-10, 10, 2);

        // -20, -15, -10, -5, 5, 10, 15, 20
        // (Note: worksheet list skips 0. We'll follow that exactly.)
        printMinus20To20Skip0Step5();
    }

    // Print a sequence from start to end using step (assumes step positive and start<=end)
    static void printSequenceRange(int start, int end, int step) {
        for (int x = start; x <= end; x += step) {
            System.out.print(x);
            if (x + step <= end) System.out.print(", ");
        }
        System.out.println();
    }

    // Print squares from a^2 to b^2 (inclusive)
    static void printSquares(int a, int b) {
        for (int i = a; i <= b; i++) {
            int sq = i * i;
            System.out.print(sq);
            if (i < b) System.out.print(", ");
        }
        System.out.println();
    }

    static void printMinus20To20Skip0Step5() {
        // Print negative part: -20 to -5
        for (int x = -20; x <= -5; x += 5) {
            System.out.print(x + ", ");
        }
        // Skip 0, then print positive part: 5 to 20
        for (int x = 5; x <= 20; x += 5) {
            System.out.print(x);
            if (x < 20) System.out.print(", ");
        }
        System.out.println();
    }


    /* =========================================================
     * EUCLID'S ALGORITHM (GCD) USING WHILE LOOP
     * Standard iterative version:
     * while (b != 0) { int r = a % b; a = b; b = r; }
     * ========================================================= */
    static int gcd(int a, int b) {
        // Make sure gcd works even if inputs are negative
        if (a < 0) a = -a;
        if (b < 0) b = -b;

        while (b != 0) {
            int r = a % b; // remainder
            a = b;
            b = r;
        }
        return a; // when b==0, a is the gcd
    }

    static void gcdTests() {
        // Worksheet examples
        System.out.println("GCD(270,192) = " + gcd(270, 192));

        // Test cases listed
        testGcd(88, 26, 2);
        testGcd(54, 87, 3);
        testGcd(16, 84, 4);
        testGcd(55, 25, 5);
        testGcd(42, 72, 6);
        testGcd(77, 28, 7);
        testGcd(80, 88, 8);

        // Verify GCD(a,b) = GCD(b,a)
        int a = 42, b = 72;
        System.out.println("Check symmetry: gcd(" + a + "," + b + ") = " + gcd(a, b)
                + " and gcd(" + b + "," + a + ") = " + gcd(b, a));
    }

    static void testGcd(int a, int b, int expected) {
        int result = gcd(a, b);
        System.out.println("GCD(" + a + "," + b + ") = " + result + " (expected " + expected + ")");
    }


    /* =========================================================
     * NESTED LOOPS – SPECIFIC STRINGS
     * Build using loops (not hard-coded).
     * ========================================================= */
    static void nestedLoopSequences() {

        // "122333444455555"
        // print 1 once, 2 twice, 3 three times, 4 four times, 5 five times
        System.out.println(makeRepeatNumberStair(1, 5));

        // "22333444455555666666"
        // 2 twice, 3 three times, 4 four times, 5 five times, 6 six times
        System.out.println(makeRepeatNumberStair(2, 6));

        // "133355555"
        // 1 once, 3 three times, 5 five times
        System.out.println(makeRepeatOddStair(1, 5));

        // "1335557777"
        // 1 once, 3 three times, 5 five times, 7 seven times (but worksheet shows 7 four times!)
        // IMPORTANT: The target output has "7777" (4 times), not 7 times.
        // So we follow the target output exactly: 7 repeated 4 times.
        System.out.println("1" + repeatChar('3', 3) + repeatChar('5', 5) + repeatChar('7', 4));

        // "555554444333221"
        // 5 five times, 4 four times, 3 three times, 2 two times, 1 once
        System.out.println(makeRepeatNumberStairDescending(5, 1));

        // "544333222211111"
        // 5 once, 4 twice? But target starts with single 5 then single 4 then 3*3 then 2*4 then 1*5
        // We'll follow the exact target output by constructing it directly via loops:
        System.out.println(makeCustom_544333222211111());

        // "+**+++****+++++"
        // + once, * twice, + three times, * four times, + five times
        System.out.println(makeSymbolStair('+', '*', 1, 2, 3, 4, 5));

        // "--***++++-----******+++++++"
        // - two, * three, + four, - five, * six, + seven
        System.out.println(
                repeatChar('-', 2) +
                repeatChar('*', 3) +
                repeatChar('+', 4) +
                repeatChar('-', 5) +
                repeatChar('*', 6) +
                repeatChar('+', 7)
        );
    }

    static String makeRepeatNumberStair(int start, int end) {
        String out = "";
        for (int n = start; n <= end; n++) {
            for (int k = 0; k < n; k++) out += n;
        }
        return out;
    }

    static String makeRepeatOddStair(int startOdd, int endOdd) {
        String out = "";
        for (int n = startOdd; n <= endOdd; n += 2) {
            for (int k = 0; k < n; k++) out += n;
        }
        return out;
    }

    static String makeRepeatNumberStairDescending(int start, int end) {
        String out = "";
        for (int n = start; n >= end; n--) {
            for (int k = 0; k < n; k++) out += n;
        }
        return out;
    }

    static String makeCustom_544333222211111() {
        String out = "";
        // "5"
        out += "5";
        // "4"
        out += "4";
        // "333"
        out += repeatChar('3', 3);
        // "2222"
        out += repeatChar('2', 4);
        // "11111"
        out += repeatChar('1', 5);
        return out;
    }

    static String makeSymbolStair(char sym1, char sym2, int a, int b, int c, int d, int e) {
        // Builds: sym1 repeated a + sym2 repeated b + sym1 repeated c + sym2 repeated d + sym1 repeated e
        return repeatChar(sym1, a)
                + repeatChar(sym2, b)
                + repeatChar(sym1, c)
                + repeatChar(sym2, d)
                + repeatChar(sym1, e);
    }


    /* =========================================================
     * PAIRS TASKS
     * 1) All pairs (x,y) where x and y are 1..10  -> 100 pairs
     * 2) All pairs (x,y) where x<y and 0<x,y<11  -> 45 pairs
     * 3) Pairs of {1,2,3,4} with {4,5,6,7,8}    -> 20 pairs
     * ========================================================= */
    static void pairsTasks() {

        System.out.println("--- All pairs between 1 and 10 (100 pairs) ---");
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.print("(" + x + "," + y + ") ");
            }
            System.out.println();
        }

        System.out.println("\n--- Pairs (x,y) with x < y and 1..10 (45 pairs) ---");
        int count = 0;
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if (x < y) {
                    System.out.print("(" + x + "," + y + ") ");
                    count++;
                }
            }
        }
        System.out.println("\nTotal = " + count);

        System.out.println("\n--- Pairs: {1,2,3,4} with {4,5,6,7,8} (20 pairs) ---");
        for (int x = 1; x <= 4; x++) {
            for (int y = 4; y <= 8; y++) {
                System.out.print("(" + x + "," + y + ") ");
            }
        }
        System.out.println();
    }
}
