package module3.lesson6;

/**
 * IfStatement
 */
public class IfStatement {

    public static void main(String[] args) {
        // Example 1: Basic if statement
        int x = 10;

        if (x > 5) {
            System.out.println("Example 1: x is greater than 5");
        }



        // Example 2: if statement with an else block
        int y = 3;

        if (y > 5) {
            System.out.println("Example 2: y is greater than 5");
        } else {
            System.out.println("Example 2: y is not greater than 5");
        }



        // Example 3: Nested if statements
        int a = 10;
        int b = 20;

        if (a > 5) {
            if (b > 15) {
                System.out.println("Example 3: Both a and b are greater than their respective thresholds.");
            }
        }

        // Example 4: if statement with logical operators (&&, ||) (and, or)
        int age = 25;
        boolean isStudent = true;

        if (age >= 18 && isStudent) {
            System.out.println("Example 4: You are an adult AND student (using &&).");
        } else if (age >= 18 || isStudent) {
            System.out.println("Example 4: You are either an adult OR a student (using ||).");
        } else {
            System.out.println("Example 4: You are not an adult yet and not a student.");
        }



        // Example 5: if statement with multiple conditions using else if
        int num = 0;

        if (num > 0) {
            System.out.println("Example 5: The number is positive.");
        } else if (num < 0) {
            System.out.println("Example 5: The number is negative.");
        } else {
            System.out.println("Example 5: The number is zero.");
        }
        
        
        equalMethod();
        compareToMethod();
    }

    

    public static void equalMethod(){

        String x = "park";
        String y = "home";

        
        System.out.println("\n\n---\nEqual Method");
        System.out.println(("x.equals(y): " + x.equals(y))); // (x == y) -> is false
        System.out.println(("!x.equals(y): " + !x.equals(y))); // (x !=y) -> is true

    }

    public static void compareToMethod(){

        String x = "park";
        String y = "home";

        int result = x.compareTo(y);
        System.out.println("\n\n---\ncompareTo method: " + result);

        if (result > 0) {
            System.out.println("x > y");
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }

        /*
            Return value	        Meaning
             0                       x and y are equal; i.e., x.equals(y) is true
             negative int value	     x is less than y
             positive int value	     x is greater than y
        */

    }
}

 /* 
  * 
Unicode Value   Character
48              0
49              1
50              2
51              3
52              4
53              5
54              6
55              7
56              8
57              9
58              :
59              ;
60              <
61              =
62              >
63              ?
64              @
65              A
66              B
67              C
68              D
69              E
70              F
71              G
72              H
73              I
74              J
75              K
76              L
77              M
78              N
79              O
80              P
81              Q
82              R
83              S
84              T
85              U
86              V
87              W
88              X
89              Y
90              Z
91              [
92              \
93              ]
94              ^
95              _
96              `
97              a
98              b
99              c
100             d
101             e
102             f
103             g
104             h
105             i
106             j
107             k
108             l
109             m
110             n
111             o
112             p
113             q
114             r
115             s
116             t
117             u
118             v
119             w
120             x
121             y
122             z

  */