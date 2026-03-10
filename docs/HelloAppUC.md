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

## UC3: Support Optional Argument Handling

*To be implemented in future iterations*

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
