# interest-calc
An interest calculator for users to calculate simple interest using a principal amount, a rate, and a number
of time periods.  

## Calculation

This is the equation that the program uses to calculate simple interest. 

Interest = ( Principal x Rate per Period x Number of Time Periods ) / 100

## Use of AI

This mini project was made with the help of ChatGPT 4o.  

## Local Development

To run the program... 

Check that you have java and gradle installed (Homebrew directions)

```shell
brew install openjdk
brew install gradle
```

The testing uses Junit 5 directly downloaded and added to a lib folder off the main directory
`lib/junit-platform-console-standalone-1.10.0.jar`

This JAR can be downloaded from Maven Central Repository, or using:

```shell
curl -L -o lib/junit-platform-console-standalone-1.10.0.jar \
> https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.10.0/junit-platform-console-standalone-1.10.0.jar
```

Compile

```shell
javac -d out interestcalc/src/main/java/*.java
```

Compile with tests

```shell
javac -d out \
-cp lib/junit-platform-console-standalone-1.10.0.jar \
interestcalc/src/main/java/*.java \
interestcalc/src/test/java/*.java
```

Run with user input
```shell
java -cp out main.InterestCalc
```

All user inputs should be integers or floats.  

Run tests - JUnit 5
```shell
java -jar lib/junit-platform-console-standalone-1.10.0.jar \
> --class-path out \
> --scan-class-path

```


## Thanks for checking out my java app! 