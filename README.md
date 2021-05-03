# C.G.P.A-Calculator
Project title:	Calculation of CGPA


DESCRIPTION:


The basic idea of our project is to calculate the CGPA and grade of the students by considering the results and credits. The output of the project will be the report card displaying the name of the student, number of subjects, marks of a student in a particular course, name of courses with credits, the overall grade of the student, and CGPA of the student.



ALGORITHM

STEP-1: Importing JFrame, JLabel, Font, JtextField, SwingConstants, JButton, ActionListener, ActionEvent.

STEP-2: Requesting users to enter the name in JTextField.

STEP-3: Users need to enter the names of subjects, marks, and credits of the subjects.

STEP-4: User had access to 6 JButtons: CLEAR, EXIT, TOTAL, Percentage, GRADE, and GPA.

STEP-5: If the user selected the TOTAL JButton, the code will be directed to the TOTAL function

STEP-6: In the TOTAL function we need to get the information entered by the user to calculate total. To get the values we use the .getText() function for every subject, if the user did not enter any text Field we will give it as 0 default by using the try and catch method.
try {
subject1=Integer.parseInt(textField_8.getText());
}
catch(NumberFormatException e1){ subject1 = 0;
}
//textField_8.setText("Invalid input");
}
 
STEP-7: We are storing the text in the variable subject with data type float and add all marks of the subject to get the total.

STEP-8: We display the total value in a textField by using .setText() function. textField.setText(""+total);

STEP-9: If the user selected the Percentage JButton, the code will be directed to the Percentage function.

STEP-10: In the Percentage function we need to get the value of Total.
Float total = Float.parseFloat(textField.getText());

STEP-11: We need to divide the total by 6 to get the percentage and display in the textField. float per = total / 6;
textField_14.setText(""+percentage);

STEP-12: If the user selected the GRADE JButton, the code will be directed to the GRADE function.
STEP-13: In the GRADE function we will calculate the grade with total marks. STEP-14: In the GRADE function we need to get the value of Total.
Float total = Float.parseFloat(textField.getText());


STEP-15:
if (percentage>=90)
{grade = 'A'; }

else {


if (percentage>=80)
{grade = 'B' ;}

else {

if (percentage>=70)
{grade = 'C'; }

else {
{grade = 'F';}

STEP-16: We will display the grade in textField by the setText function
 
textField_15.setText(""+grade);

STEP-17: If the user selected the GPA JButton, the code will be directed to the GPA function.

STEP-18: In the TGPA function we need to get the Subject marks and credits information entered by the user to calculate GPA. To get the values we use the .getText() function for every subject, if the user did not enter any text Field we will give it as 0 default by using the try and catch method.
try {
subject1=Integer.parseInt(textField_8.getText());
}
catch(NumberFormatException e1){ subject1 = 0;
}
//textField_8.setText("Invalid input");
}

 
try {

}
 

credit1=Integer.parseInt(textField_17.getText());
 
catch(NumberFormatException e1){ credit1 = 0;
}

STEP-19: Calculating points for the marks entered by the user. if (subject1>=90)
{points = 10; }

else {


if (subject1>=80)
{points = 9 ;}

else {

if (subject1>=70)
{points = 8; }

else	{points = 0;}

STEP-20: The formula for GPA is
 
float up = ((points*credit1) + (points2*credit2) + (points3*credit3) + (points4*credit4) + (points5*credit5) + (points6*credit6));
float down = credit1+credit2+credit3+credit4+credit5+credit6;
gpa = up/down;

STEP-21: We display the total value in a textField by using .setText() function. textField.setText(""+GPA);

STEP-22: If the user selected the CLEAR JButton, the code will be directed to the CLEAR function.

 
STEP-23:
 

textField.setText("");
textField_1.setText(""); textField_2.setText(""); textField_3.setText(""); textField_4.setText(""); textField_5.setText(""); textField_6.setText("");
 

STEP-24: If the user selected the EXIT JButton, the code will be directed to the EXIT function. STEP-25: It will exit the program by System. exit(0) function.
FLOW CHART:
![image](https://user-images.githubusercontent.com/62333854/116897632-1afd4100-ac53-11eb-87bf-3e4090bc6c25.png)
SAMPLE OUTPUT:
![image](https://user-images.githubusercontent.com/62333854/116897987-7deed800-ac53-11eb-8384-ade188abfe64.png)

