# FaalGui
This is a simple graphic software created using Java that can retrieve a fortune teller from the server. The software works with the server's API and requires adding fasterxml.jackson.core.databind for the code to run.

Features of the software:
 - Displaying the fortune teller and interpreting the fortune 
 - Having a back button and a button to rerun the fortune 
 - Separating the lines of the fortune
## Dependencies

[](https://github.com/ykazemim/hafez-divination#dependencies)

The project uses the following dependency:

-   `com.fasterxml.jackson.core:jackson-databind:2.14.2`

Make sure to include the Jackson library in your project. If you're using Maven, add the following to your `pom.xml`:
```
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.14.2</version>
</dependency>
```

## Getting Started

### Running the Project

1.  **Compile the Java files**:
    
    Open a terminal or command prompt and navigate to the directory containing the Java files. Run the following command to compile the files:
    
    ```sh
    javac Faal.java FaalGUI.java Main.java
    ```
   2. **Run the Application**:

		After successful compilation, run the application using the following command:
		```sh
		java Main
		```
		
