CodSoft Internship Task

The files are split as follows:

 Task 1 : Student Grade Calculator
 
     Maincalculator class(Maincalculator.java):
           Input Marks: Prompt the user to enter marks obtained in each subject (out of 100).
           Call Calculation Methods: Call methods from calculatetotal to calculate total marks and average percentage.
           Display Results: Show the total marks, average percentage, and grade to the user.
           
     File: CalculateTotal.java
            Calculate Total Marks: Implement a method to sum up the marks obtained in all subjects.
            Calculate Average Percentage: Implement a method to divide the total marks by the number of subjects to get the average percentage.
            Grade Calculation: Implement logic to assign grades based on the average percentage achieved.
            
            
 Task 2 : ATM Interface
 
      ATM Class (ATM.java):
           Represents the ATM machine with attributes like cash reserves and transaction limits.
           Methods implemented: withdraw(amount), deposit(amount), checkBalance().
           Validations: Ensure sufficient cash for withdrawals, validate input for deposit and withdrawal amounts.
          
     Main ATM Interface (mainAtm.java):
           Contains the main method to run the ATM interface.
           Displays a menu for options like withdraw, deposit, and check balance.
           Handles user input and calls corresponding methods in the ATM class (ATM.java).
           
    User Bank Account Class (userbankaccount.java):
           Represents the user's bank account with attributes like account balance and account number.
           Methods implemented: getBalance(), deposit(amount), withdraw(amount).
           Validations: Ensure sufficient balance for withdrawals, validate input for deposit amounts.

           
 Task 3 : Student Course Registration System.
     
     Main Course Management (maincourse.java):
            Contains the main method to manage the course registration system.
            Initializes student and course data.
            Displays a menu for options like course listing, student registration, and course removal.
            Handles user input and calls corresponding methods in other classes (course.java, student.java).
            
      Course Class (course.java):
            Represents a course with attributes such as course code, title, description, capacity, and schedule.
            Methods implemented: displayCourseDetails(), registerStudent(Student student), removeStudent(Student student).
            Manages student registration and removal from courses.
            
       Student Class (student.java)
            Represents a student with attributes like student ID, name, and registered courses.
            Methods implemented: registerForCourse(Course course), dropCourse(Course course), displayRegisteredCourses().
            Manages registration and removal of courses for the student.


