# MortagePlan
## How to start the code
Download/ clone this code.
<b>This shows the steps in IntelliJ</b>
- Firstly open the project
- Go to "Add Configurations" 
- <img width="320" alt="step1" src="https://user-images.githubusercontent.com/70576475/153418569-58038971-9914-4425-a694-486f53ce4d62.PNG">
- In there go on plus sign and choose "Application"
- There same the Application, set Main class, set also Use classpath of module. It should look something like this: <img width="542" alt="step4top" src="https://user-images.githubusercontent.com/70576475/153419540-b14645fa-3ea4-4d9c-a114-6f6e247fc585.png"> <img width="542" alt="step4bottom" src="https://user-images.githubusercontent.com/70576475/153419566-8b60142d-300d-4fd8-a4a0-ebe002872e5c.png">
- Then applay it and Run the code with the play button.
- To run the JUnit test, go to test file and push the play button next to the code. ![Inkedstep6](https://user-images.githubusercontent.com/70576475/153419936-fb8cdc33-063a-412d-a3ba-6987d2fa0548.jpg)
- After running the test code then change back to the Main application in the "Add Configurations" ![laststep](https://user-images.githubusercontent.com/70576475/153420416-98bc6584-b700-4bdc-bb23-270ba23e6e64.jpg)

## The code
This code calculates how much the customer should  pay each month. The information is gotten from the text file and the answer is printed out in System.out.println and makes even text file with answers.

The code is adjusted to the procpects.txt file. In the text file one can see that the last customer has “ “ in the name. In that case the code ignores the line/customer and in run console it gives error(Forbidden character in the: 4th input. Check for "). The last dot is also ignored by seeing that it does not have , in it. And again one gets information about it in the output (Eroor occured. Make sure that columns are separated with , ). The empty lines are also ignored. 

After getting the needed information the values are sent over to CalculateTheMortage to calculate the monthly pill. And there it prints it also out.

Lastly, after doing the calculations, the code makes a text file where one can see the results. 
<b>OBS! The code can crash if the file exists. In that case, please do run the code again and then it should run smoothly once again.</b>

## Unit Test
For unit test I used JUnit. This will check that the math in public float e works.
