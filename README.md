# HelloApp

Hello App starts with Hello World, progresses to displaying a user name, then names from command-line args and standard input. It then manages names in a collection with list/remove options, refactors into methods and classes, adds persistence across runs, and finally displays names in banner format.

## Summary

Hello App Use Case begins with simple display of Hello World then goes on to display user name then to displaying the names from the command line arguments and then from standard input and then managing the names in a collection with options to list and remove names and then refactoring the code to separate concerns into different methods and classes and finally adding persistence to the name list across runs. The final use cases involve enhancing the display of names by showing them in banner format

## Use Case Roadmap

The Hello App evolves step by step from a fixed console message to a modular, persistent, and extensible application.

- UC1: Print a basic greeting in the console.
- UC2: Accept one name via command-line input and greet that user.
- UC3: Support optional argument handling with a default greeting path.
- UC4: Handle multiple command-line names in one execution.
- UC5: Read a single name from standard input.
- UC6: Read and process multiple names from standard input.
- UC7: Store entered names in memory and list them on request.
- UC8: Add removal support for stored names.
- UC9: Extract input-processing logic into dedicated methods.
- UC10: Move name-management responsibilities into a separate class.
- UC11: Persist names to storage and reload them across runs.
- UC12: Render greeting text in banner-style output for enhanced display.

## Project Structure

```
HelloApp/
├── pom.xml
├── README.md
├── .gitignore
└── src/
    ├── main/
    │   └── java/
    │       └── HelloApp.java
    └── test/
        └── java/
            └── HelloAppTest.java (optional)
```

## How to Build and Run

### Prerequisites
- Java 8 or higher
- Maven 3.6 or higher
- Git

### Build
```bash
mvn clean install
```

### Run
```bash
mvn exec:java -Dexec.mainClass="HelloApp"
```

## Development

This project uses Git branching strategy:
- `main` - Production-ready code
- `dev` - Development branch for feature integration
- `feature/*` - Feature branches for individual use cases

## Contributing

To implement a new use case:
1. Create a feature branch from `dev`
2. Implement the functionality
3. Commit changes
4. Create a Pull Request to merge into `dev`
5. After testing, merge `dev` into `main`
