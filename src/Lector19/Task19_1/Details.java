package Lector19.Task19_1;

import java.util.Random;

enum Details {
    Had,
    Body,
    Left_Hand,
    Right_Hand,
    Left_Leg,
    Right_Leg,
    CPU,
    RAM,
    HDD;
    static int numOfDetail;

    static Details randomDetail() {
        Details detail = null;
        Random rand = new Random();
        numOfDetail = rand.nextInt(9) + 1;
        switch (numOfDetail) {
            case 1:
                detail = Details.CPU;
                break;
            case 2:
                detail = Details.HDD;
                break;
            case 3:
                detail = Details.Had;
                break;
            case 4:
                detail = Details.Left_Hand;
                break;
            case 5:
                detail = Details.Left_Leg;
                break;
            case 6:
                detail = Details.RAM;
                break;
            case 7:
                detail = Details.Right_Hand;
                break;
            case 8:
                detail = Details.Right_Leg;
            case 9:
                detail = Details.Body;
        }
        return detail;
    }

}
