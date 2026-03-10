# HelloApp Use Cases Documentation

## UC1: Display "Hello World"

### Description

The app displays "Hello World" on the console when executed. This is the most basic use case to demonstrate a simple Java application that outputs text to the console.

### Preconditions

- App is launched
- Java Runtime Environment (JRE) is installed

### Main Flow

1. User runs the application
2. App executes the main method
3. App prints "Hello World" to the console
4. App terminates

### Postconditions

- Message is displayed to user
- Application successfully completes execution

### Hints

- Create a public class named HelloApp
- Define a main() method with String array parameter
- Use System.out.println() to print to console
- The program will execute and terminate immediately

### Code Snippet

```java
public class HelloApp {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

### Compilation and Execution

#### Using Java directly:
```bash
javac HelloApp.java
java HelloApp
```

#### Using Maven:
```bash
mvn compile
mvn exec:java -Dexec.mainClass="HelloApp"
```

### Example Output

```
Hello World
```

### Concepts Learned

#### Class Declaration

- **Definition**: Defines a blueprint for objects. In this case, HelloApp is the class that contains the main method.
- **Naming Convention**: Classes in Java use PascalCase (e.g., HelloApp, MyClass)
- **Public Modifier**: The public class name must match the file name (HelloApp.java)
- **Purpose**: The class encapsulates the behavior of the application, and in this simple case, it contains only the main method

#### Main Method

- **Signature**: `public static void main(String[] args)`
- **Purpose**: Serves as the entry point for program execution
- **JVM Access**: The Java Virtual Machine (JVM) looks for this method to begin execution of the application

#### Method Modifiers Explained

**Public Access Modifier**
- The `public` access modifier indicates that the `main` method can be accessed from anywhere
- Allows the Java runtime to call it when the program starts
- Essential because the JVM needs to access this method to begin execution

**Static Keyword**
- Indicates that the method belongs to the class rather than an instance of the class
- Allows the Java runtime to call the `main` method without needing to create an object of the HelloApp class
- Memory Efficiency: Static methods are loaded into memory once when the class is loaded

**Void Return Type**
- The `void` return type indicates that the `main` method does not return any value
- Standard convention for the entry point of a Java application
- The JVM does not expect any data to be returned to the caller

**String Array Parameter**
- The `String[] args` parameter holds command-line arguments passed to the program
- In UC1, we are not utilizing any command-line arguments
- Standard part of the main method signature
- Allows for future expansion where the program can accept input from the user

#### System.out.println()

- **System**: A final class in the `java.lang` package that provides access to system resources
- **out**: A static member of the 'System' class representing the standard output stream (console)
- **println**: A method of the PrintStream class that:
  - Prints the specified message to the console
  - Adds a newline character after the message
  - Each call prints on a new line

#### Program Execution Flow

```
JVM Startup
    |
    v
Search for main() method
    |
    v
Execute System.out.println("Hello World")
    |
    v
Print "Hello World" to console
    |
    v
Program Termination
```

### Key Takeaways

1. Every Java application requires a main method as the entry point
2. The `public static void main(String[] args)` signature is mandatory
3. System.out is used for standard console output
4. The application will continue to execute sequentially through all statements in main()
5. Once main() completes, the application terminates

---

## UC2: Display "Hello" with Command-Line Argument

### Description

The app accepts a user's name as a command-line argument and displays a personalized greeting. This enhances the basic functionality of UC1 by allowing user input to customize the output. If no name is provided, the app defaults to greeting "World".

### Disadvantages of Previous Use Case

UC1 is limited because it only displays a static message. To make the application more interactive and useful, it should accept user input and personalize the output based on that input.

### Preconditions

- App is launched with or without a command-line argument containing a name
- Java Runtime Environment (JRE) is installed

### Main Flow

**Scenario 1: With Command-Line Argument**
1. User runs the application with a name argument: `java HelloApp John`
2. App reads the name from the args[0] parameter
3. App displays "Hello, John!" to the console
4. App terminates

**Scenario 2: Without Command-Line Argument**
1. User runs the application without arguments: `java HelloApp`
2. App checks if arguments exist
3. Since no arguments are provided, app displays "Hello, World!" to the console
4. App terminates

### Postconditions

- Personalized greeting is displayed based on the command-line argument provided
- If no argument provided, default greeting is displayed

### Hints for Implementing UC2

- Command-line arguments are passed to the main method as the String[] args parameter
- Access the first argument using args[0]
- Check if arguments exist before accessing them to avoid ArrayIndexOutOfBoundsException
- Use string concatenation with the + operator to combine strings
- Test with different names to verify the output

### Code Snippet

```java
public class HelloApp {
    public static void main(String[] args) {
        // Check if command-line arguments were provided
        if (args.length > 0) {
            // Use the first argument as the name
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Default greeting if no arguments provided
            System.out.println("Hello, World!");
        }
    }
}
```

### Compilation and Execution

#### Using Java directly:
```bash
javac HelloApp.java

# With command-line argument
java HelloApp Alice

# Without command-line argument
java HelloApp
```

#### Using Maven:
```bash
mvn compile

# With command-line argument
mvn exec:java -Dexec.mainClass="HelloApp" -Dexec.args="Alice"

# Without command-line argument
mvn exec:java -Dexec.mainClass="HelloApp"
```

### Example Output

**Input**: `java HelloApp Alice`
**Output**:
```
Hello, Alice!
```

**Input**: `java HelloApp`
**Output**:
```
Hello, World!
```

**Input**: `java HelloApp Bob`
**Output**:
```
Hello, Bob!
```

### Concepts Learned

#### Command-Line Arguments

- **Definition**: Parameters passed to the program when it is executed
- **Access**: Accessible through the args array in the main method
- **Purpose**: Allows the program to receive input without prompting the user interactively
- **Example**: In `java HelloApp John`, "John" is passed as a command-line argument

#### Array Length

- **Property**: The `args.length` property returns the number of command-line arguments provided
- **Purpose**: Checking this before accessing array elements prevents runtime errors
- **Syntax**: Use `if (args.length > 0)` to safely check if arguments were provided

#### Array Indexing

- **Zero-Based**: Arrays are zero-indexed in Java
- **First Element**: The first argument is accessed using args[0]
- **Second Element**: The second argument is accessed using args[1]
- **Pattern**: Elements are accessed as args[n] where n is the index (0, 1, 2, ...)

#### String Concatenation

- **Operator**: The + operator combines strings together
- **Example**: `"Hello, " + name + "!"` concatenates three parts (prefix, variable, suffix)
- **Result**: Creates a single combined string
- **Alternative**: Java also supports string concatenation using StringBuilder or String.format()

#### Conditional Logic

- **If-Else Statements**: Used to check conditions and execute different code paths
- **Syntax**: 
  ```java
  if (condition) {
      // code executed if condition is true
  } else {
      // code executed if condition is false
  }
  ```
- **Purpose**: Allows different behavior based on input or state

#### Error Prevention

- **ArrayIndexOutOfBoundsException**: Occurs when trying to access an array element that doesn't exist
- **Prevention**: Always check the length of the args array before accessing its elements
- **Best Practice**: Use `args.length > 0` before accessing `args[0]`

#### Default Values

- **Purpose**: Providing a fallback message ("Hello, World!") when no command-line arguments are given
- **Benefit**: Ensures the program behaves predictably even without user input
- **Pattern**: Use else clause to provide default behavior

#### Array Handling

- **Fundamental Concept**: Understanding how to work with arrays in Java
- **Skills**: Accessing elements and checking their length
- **Importance**: Essential for handling command-line arguments effectively
- **Extension**: Arrays can store multiple values for future use cases

### Program Execution Flow

```
JVM Startup with Command-Line Arguments
    |
    v
Search for main() method
    |
    v
Check if args.length > 0
    |
    ├─────────────────────┐
    |                     |
    v                     v
args provided        No args provided
    |                     |
    v                     v
Read name from      Set name to
args[0]             "World"
    |                     |
    └─────────────────────┘
           |
           v
Print "Hello, " + name + "!"
           |
           v
Program Termination
```

### Key Takeaways

1. Command-line arguments provide a way to pass input to Java applications
2. Always check args.length before accessing array elements
3. The first command-line argument is accessed using args[0]
4. String concatenation with + operator is a simple way to build strings
5. Default values ensure programs behave predictably when no input is provided
6. Conditional logic (if-else) allows different execution paths based on input

---

## UC3: Display "Hello" with Command-Line Argument or Default Message

### Description

The app accepts a user's name as a command-line argument and displays a personalized greeting. If no name is provided, it defaults to "World". This use case combines the basic functionality from UC1 with the personalization from UC2, adding robustness through default handling.

### Disadvantages of Previous Use Case

UC2 requires a command-line argument to work correctly. If the user runs the program without providing an argument, the application will crash with an ArrayIndexOutOfBoundsException. This makes the program fragile and less user-friendly. UC3 addresses this limitation by providing a sensible default value when no argument is supplied.

### Preconditions

- App is launched with or without a command-line argument
- Java Runtime Environment (JRE) is installed

### Main Flow

**Scenario 1: With Command-Line Argument**
1. User runs the application with a name argument: `java HelloApp John`
2. App checks if a command-line argument was provided
3. Since an argument exists, app reads the name from args[0]
4. App displays "Hello, John!" to the console
5. App terminates

**Scenario 2: Without Command-Line Argument**
1. User runs the application without arguments: `java HelloApp`
2. App checks if a command-line argument was provided
3. Since no argument exists, app uses the default value "World"
4. App displays "Hello, World!" to the console
5. App terminates

### Postconditions

- Personalized greeting is displayed with either the provided name or the default "World"
- Application terminates successfully in both scenarios

### Hints for Implementing UC3

- Check the length of the args array before accessing elements
- Use a ternary operator or if-else statement to assign the name based on argument availability
- The args.length property determines how many arguments were passed
- Test with and without command-line arguments to ensure both paths work correctly

### Code Snippet

```java
public class HelloApp {
    public static void main(String[] args) {
        // Use ternary operator to assign name based on argument availability
        String name = (args.length > 0) ? args[0] : "World";

        // Display the personalized greeting
        System.out.println("Hello, " + name + "!");
    }
}
```

### Compilation and Execution

#### Using Java directly:
```bash
javac HelloApp.java

# With command-line argument
java HelloApp Alice

# Without command-line argument
java HelloApp
```

#### Using Maven:
```bash
mvn compile

# With command-line argument
mvn exec:java -Dexec.mainClass="HelloApp" -Dexec.args="Alice"

# Without command-line argument
mvn exec:java -Dexec.mainClass="HelloApp"
```

### Example Output

**Input**: `java HelloApp Alice`
**Output**:
```
Hello, Alice!
```

**Input**: `java HelloApp`
**Output**:
```
Hello, World!
```

### Concepts Learned

#### Conditional Logic

- **Definition**: Using if-else statements to execute different code paths based on argument availability
- **Purpose**: Ensures the program handles multiple scenarios gracefully
- **Application**: Check if the args array has any elements before accessing them
- **Benefit**: Allows the program to function correctly regardless of user input

#### Ternary Operator

- **Syntax**: `condition ? valueIfTrue : valueIfFalse`
- **Purpose**: Provides a concise way to assign values based on a condition
- **Components**:
  - **condition**: Boolean expression (e.g., `args.length > 0`)
  - **valueIfTrue**: Value assigned if condition is true (e.g., `args[0]`)
  - **valueIfFalse**: Value assigned if condition is false (e.g., `"World"`)
- **Example**: `String name = (args.length > 0) ? args[0] : "World";`
- **Advantage**: More concise than if-else for simple assignments

#### Operator Precedence

- **Importance**: Understanding operator precedence is crucial for correct code
- **Application**: Use parentheses to explicitly define order of operations
- **Example**: Parentheses in `(args.length > 0) ? args[0] : "World"` ensure correct evaluation

#### Array Length Checking

- **Method**: Always validate `args.length` before accessing array elements
- **Purpose**: Prevent runtime exceptions like ArrayIndexOutOfBoundsException
- **Pattern**: Check `if (args.length > 0)` before accessing `args[0]`
- **Best Practice**: Defensive programming to make applications robust

#### Default Values

- **Purpose**: Providing fallback values when expected input is missing
- **Benefit**: Improves user experience by preventing application failure
- **Pattern**: Use ternary operator or if-else to assign defaults

#### Defensive Programming

- **Definition**: Writing code that anticipates and handles edge cases
- **Application**: Handle missing command-line arguments gracefully
- **Techniques**: Input validation, default values, error prevention
- **Benefit**: Makes applications more robust and reliable

#### String Concatenation

- **Method**: Combining multiple strings using the + operator
- **Purpose**: Create dynamic output based on user input
- **Example**: `"Hello, " + name + "!"` creates personalized messages
- **Flexibility**: Allows for customizable and reusable messaging

#### Operator Overloading

- **Concept**: The + operator behaves differently based on operand types
- **String Context**: When used with strings, + performs concatenation
- **Numeric Context**: When used with numbers, + performs addition
- **Java Feature**: This flexibility simplifies string manipulation

#### Program Flexibility

- **Design Principle**: Programs should work with optional inputs
- **Implementation**: Allow running with or without command-line arguments
- **User Experience**: Accommodate different user preferences and scenarios
- **Versatility**: Makes applications more user-friendly and adaptable

### Key Takeaways

1. **Ternary Operator**: Concise alternative to if-else for simple conditional assignments
2. **Array Bounds Checking**: Always validate array length before access
3. **Default Values**: Essential for robust, user-friendly applications
4. **Defensive Programming**: Anticipate edge cases and handle them gracefully
5. **Operator Precedence**: Use parentheses to ensure correct evaluation order
6. **String Concatenation**: Flexible way to build dynamic messages
7. **Program Flexibility**: Design for optional inputs improves usability

---

## UC4: Handle Multiple Command-Line Names

*To be implemented in future iterations*

---

## UC5: Read Single Name from Standard Input

*To be implemented in future iterations*

---

## UC6: Read and Process Multiple Names from Standard Input

*To be implemented in future iterations*

---

## UC7: Store Names in Memory and List Them

*To be implemented in future iterations*

---

## UC8: Add Removal Support for Stored Names

*To be implemented in future iterations*

---

## UC9: Extract Input-Processing Logic into Methods

*To be implemented in future iterations*

---

## UC10: Move Name-Management into Separate Class

*To be implemented in future iterations*

---

## UC11: Persist Names to Storage

*To be implemented in future iterations*

---

## UC12: Display Names in Banner Format

*To be implemented in future iterations*
