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

## UC2: Accept and Greet User Name

*To be implemented in future iterations*

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
