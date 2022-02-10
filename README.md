# MortagePlan

## The code
This code calculates how much the customer should  pay each month. The information is gotten from the text file and the answer is printed out in System.out.println and makes even text file with answers. 

The code is adjusted to the procpects.txt file. In the text file one can see that the last customer has “ “ in the name. In that case the code ignores the line/customer and in run console it gives error(Forbidden character in the: 4th input. Check for "). The last dot is also ignored by seeing that it does not have , in it. And again one gets information about it in the output (Eroor occured. Make sure that columns are separated with , ). The empty lines are also ignored. 

After getting the needed information the values are sent over to CalculateTheMortage to calculate the monthly pill. And there it prints it also out.

Lastly, after doing the calculations, the code makes a text file where one can see the results. 
<b>OBS!</b> The code can crash if the file exists. In that case, please do run the code again and then it should run smoothly once again.

## Unit Test
For unit test I used JUnit. This will check that the math in public float e works.
