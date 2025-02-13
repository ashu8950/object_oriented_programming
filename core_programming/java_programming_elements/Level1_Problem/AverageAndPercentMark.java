import java.util.*;
class AverageAndPercentMark{
    public static void main(String[] args){
        int math = 94;
        System.out.println("Math marks is :"+ math);
        int physics = 95;
        System.out.println("Physics marks is :"+ physics);
        int chemistry = 96;
        System.out.println("chemistry marks is :"+ chemistry);

        int marksObtained = 94+95+96;
        int totalSubject  = 3;
        int maxMark = 300;

        //As all the subject mark is out of 100 so we didn't need to calculate percentage separately

        double average = (double)marksObtained/totalSubject;
        System.out.println("Average marks obtained by Sam in PCM : "+ average);

        //here is all calculation for percentage also 

        double percentage = ((double)marksObtained/maxMark)*100;
        System.out.println("Sam percentage in PCM : "+percentage+"%");


    }
}