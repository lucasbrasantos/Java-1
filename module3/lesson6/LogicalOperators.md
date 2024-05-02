# Logical Operators Table

| Name  | Symbol | Usage |
|-------|--------|-------|
| AND   | &&     | `a && b` |
| OR    | \|\|   | `a \|\| b` |
| NOT   | !      | `!a` |

## Truth Tables

### NOT Operator (!)

| a     | !a    |
|-------|-------|
| true  | false |
| false | true  |

### AND (&&) and OR (||) Operators

| a     | b     | a && b | a \|\| b |
|-------|-------|--------|----------|
| false | false | false  | false    |
| false | true  | false  | true     |
| true  | false | false  | true     |
| true  | true  | true   | true     |


# Summary of Important Content

### Logical Operators in Java
- **AND (`&&`), OR (`||`), NOT (`!`)** are the three logical operators in Java.
- They are applied on boolean operands.
- **AND** and **OR** are binary operators, while **NOT** is a unary operator.

### Truth Tables for Logical Operators
- The truth table for **NOT** operator (`!`) shows the result of negating a boolean value.
- The truth table for **AND** and **OR** operators (`&&` and `||`) shows the result of combining two boolean values.

### Interpretation of Logical Operators
- For **AND** operator, the expression `(a && b)` is true only if both operands are true, otherwise false.
- For **OR** operator, the expression `(a || b)` is true if at least one of the operands is true, otherwise false.
- For **NOT** operator, the expression `!a` is true if `a` is false, and false if `a` is true.

### Example Usage
- Logical operators are often used to build compound boolean expressions.
- They help in making decisions based on multiple conditions, as shown in the example of determining whether to go to the park based on the temperature range.

### Note on Operator Precedence
- Relational operators have higher precedence than logical operators in Java.
- While parentheses are not always necessary, they can enhance the readability of compound expressions.

### Practical Demonstration
- The content concludes with a mention of a demonstration involving logical operators within a full Java program.
- It suggests expanding the screen to full size and following along with the code for better understanding.


---

### Bitwise Logical Operators in Java
- **Bitwise AND (`&`)**: Performs a bitwise AND operation between corresponding bits of two operands.
- **Bitwise OR (`|`)**: Performs a bitwise OR operation between corresponding bits of two operands.
- **Bitwise XOR (`^`)**: Performs a bitwise exclusive OR (XOR) operation between corresponding bits of two operands.
- **Bitwise complement (`~`)**: Performs a bitwise complement (bitwise negation) operation on a single operand, flipping each bit.

### Truth Tables for Bitwise Logical Operators
| a     | b     | a & b | a \| b | a ^ b | ~a    |
|-------|-------|-------|--------|-------|-------|
| false | false | false | false  | false | true  |
| false | true  | false | true   | true  | true  |
| true  | false | false | true   | true  | false |
| true  | true  | true  | true   | false | false |

### Bitwise AND (`&`)
- **Explanation**: The result of the bitwise AND operation (`&`) between two bits is true (1) if and only if both corresponding bits are true (1). Otherwise, the result is false (0).

### Bitwise OR (`|`)
- **Explanation**: The result of the bitwise OR operation (`|`) between two bits is true (1) if at least one of the corresponding bits is true (1). If both bits are false (0), the result is false (0).

### Bitwise XOR (`^`)
- **Explanation**: The result of the bitwise XOR (exclusive OR) operation (`^`) between two bits is true (1) if and only if exactly one of the corresponding bits is true (1). If both bits are the same (either both 0 or both 1), the result is false (0).

### Bitwise Complement (`~`)
- **Explanation**: The result of the bitwise complement operation (`~`) on a single bit is the inversion of that bit. That is, if the original bit is true (1), the complemented bit is false (0), and vice versa.

These bitwise logical operators are used for operations at the binary level, often in contexts such as working with binary data or manipulating individual bits within numbers.



