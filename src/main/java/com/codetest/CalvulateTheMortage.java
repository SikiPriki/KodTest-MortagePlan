package com.codetest;

class CalculateTheMortage {

    public float e(float u, float bDecimal, float pPower){
        return (u * ((bDecimal) * pPower) / (pPower - 1));
    }
    public void CalculateTheMortage(Float [] b, Float[] u, Float[] y, String[] name) {

        System.out.println("Hello World");
        for (int i = 0; i < name.length; i++) {
            float p = y[i] * 12; //change year to number of payments
            float bDecimal = ((b[i] / 100) / 12);

            float pPower = 1;
            float b1 = (1 + (bDecimal));

            for (float j = p; j != 0; j--) {
                pPower = (pPower * b1);
            }

            System.out.println("Des" + bDecimal);
            System.out.println("pow+" + pPower);
            //  e = (u[i] * ((bDecimal) * pPower) / (pPower - 1));
            //  this.e(u[i],bDecimal,pPower);

            System.out.println("****************************************************************************************************\n" +
                    "Prospect " + (i + 1) + ": " + name[i] + " wants to borrow " + u[i] + "€ for a period of " + y[i] + " years and pay " + e(u[i],bDecimal,pPower)+ "€ each month.");

        }

    }


}
