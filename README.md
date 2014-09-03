# Java Rovers on Mars
___

_Prerequisite to run program_

* Gradle
```
$ brew install gradle
```

Note:
* Link for more info about [gradle](http://www.gradle.org/) and in case you don't have [brew](http://brew.sh/)


### To Run Program:
---
_Open the project and run the following code from the root directory, "MarsRover"_

```
$ gradle build
$ java -jar build/libs/MarsRover-1.0.jar TW_input.txt
```

##### For Funsies, follow up with these next two commands:

```
$ java -jar build/libs/MarsRover-1.0.jar three_rovers.txt
$ java -jar build/libs/MarsRover-1.0.jar eight_rovers.txt
```

### Code Design Aspects

* Write code that was well tested and scalable; there are 31 tests and I frequently refactored code
* Write single responsibility methods, inject dependencies, and decrease code redundancy
* Design modular classes that are independent and reusable
    * ex: Rover, Grid, TxtReader, and Printer
* Use descriptive variable, method, and class naming
* Create a descriptive git history that helps to show how project progressed from start to finish
* Carefully choose data shapes that makes the most sense for the type of data I am passing

### Assumptions Made

* a Java developer with "Gradle" will be the one executing this project
* most people assume that a coordinate plane's origin is at the bottom left

### Short Reflections

* Zero Java knowledge five days ago
* Learned sooo much!
* First time using statically typed language
* TDD with JUnit helped produce better code
* IntelliJ is an amazing IDE!

### Core Components

##### Rover Class
* able to create rovers that store an x coordinate, y coordinate, and orientation
* able to move forward, turn right, and turn left

##### Grid Class
* instantiated by specifying maximum x and y coordinate values
* creates a coordinate system; stored as a String[][]

##### TxtReader
* able to read txt files and returns a String[] containing each line
* very reusable

##### Parser
* specializes in extracting grid and rover data
* strong predisposition toward using HashMaps

##### AppController
* leverages all the previous mentioned components
* Fully completes challenge in three steps:
    * 1) Instantiate 2) read method 3) run method

### UX Components (optional)

##### AppInterface
* uses the ContextPrinter and Printer to deliver a good user experience
* simply execute main method

##### ContextPrinter
* contains a series of text that tells user the program execution details

##### Printer
* prints different data shapes
* very reuseable
