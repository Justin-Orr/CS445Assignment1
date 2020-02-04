# CS445Assignment1
Goal: The purpose of this homework is to experience developing classes using inheritance.
The program will use abstract classes, concrete classes, and interfaces to write a simple program that uses polymorphism.
This assignment's goal is also an introduction to setting up unit test cases.

Setup: AWS server VM instance of Ubuntu Server v.18.04 LTS

Java: javac 1.8.0_242;
openjdk version "1.8.0_242"
OpenJDK Runtime Environment (build 1.8.0_242-8u242-b08-0ubuntu3~18.04-b08)
OpenJDK 64-Bit Server VM (build 25.242-b08, mixed mode)

Junit: JUnit 4.12 by Kent Beck and Erich Gamma
Usage: TestRunner [-wait] testCaseName, where name is the name of the TestCase class

Credit: Professor Virgil Bistriceanu for providing junit setup: http://cs.iit.edu/~virgil/cs445/mail.spring2020/tools-setup/junit-from-command-line.html


NOTES: This program is setup and ran using a terminal and no IDE.
TestCreature.java contains the main method. It's purpose is to help test the 'Thing' hierarchy.
AppTest.java contains the unit test cases for JUnit.

Prerequisites:
java 8 installed;
junit 4 http://search.maven.org/remotecontent?filepath=junit/junit/4.12/junit-4.12.jar -O junit-4.12.jar;
hamcrest 1.3 http://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar -O hamcrest-core-1.3.jar;

How to run: (Linux)
*Some of the instructions are taken from Professor Bistriceanu at the link above.
Download the junit and hamcrest jars into your test directory: you can start at jUnit4's github page, or you can use the following commmands:

$ wget http://search.maven.org/remotecontent?filepath=junit/junit/4.12/junit-4.12.jar -O junit-4.12.jar
$ wget http://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar -O hamcrest-core-1.3.jar

Set the CLASSPATH environment variable:

$ CLASSPATH=.:junit-4.12.jar:hamcrest-core-1.3.jar ; export CLASSPATH
$ echo $CLASSPATH
.:junit-4.12.jar:hamcrest-core-1.3.jar

Compile the java files:

$ javac *.java

Run the test suite in AppTest:

$ java org.junit.runner.JUnitCore AppTest
JUnit version 4.12
.........
Time: 0.02

OK (14 tests)

Or run the main program using:

java TestCreature
