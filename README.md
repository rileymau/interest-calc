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

Compile

```shell
javac -d out interestcalc/src/main/java/*.java
```

Run with user input
```shell
java -cp out main.InterestCalc
```
All user inputs should be integers or floats.  

Thanks for checking out my java app! 