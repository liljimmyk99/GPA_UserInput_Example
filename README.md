### Robotics Challenge Problem

# What is this going to do?

You are going to ask the user for their first and last name.  One you have their name you will provide a greeting with their name.  Then you will ask for the number of classes they are currently taking and take in that many courses' GPA.  An example exchange with the program should look like this:

```
What is your first name?
Jimmy
What is your last name?
Kane
Hello there Jimmy Kane, how many classes are you taking right now?
3
What is your GPA for course 1 ?
4.0
What is your GPA for course 2 ?
3.8
What is your GPA for course 3 ?
3.78
You have a Grade Point Average of: 3.86
```

## Extra Credit

You can extend this project in a few ways, here are a few ideas: 

1. Ask for the Letter Grade for each course & turn that into the GPA (A = 4.0, A = 3.8, A- = 3.78, etc.) & provide error checking for incorrect values.  See [this website](https://www.registrar.psu.edu/grades/grade-point-average.cfm) from Penn State to understand letter grade to GPA
2. Create Course class & ask for more information: Teacher, Room Number, Subject, Course name.  Then print out all the information in a formatted table like a report card.
3. Provide Error Handling for scanner inputs.  For example, if the user enters `e` when prompted to enter a number of courses they are taking; Output ```Error: Please try again, enter a whole number ``` and ask for the input again.

