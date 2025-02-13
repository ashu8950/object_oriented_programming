class PenDistribution{
    public static void main(String[] args){
        int pen = 14;
        int student = 3;

        int penPerPerson = pen/student;
        int remainingNonDistributed = pen%student;
        System.out.printf("The Pen Per Student is %d and the remaining pen not distributed is %d",penPerPerson,remainingNonDistributed);
    }
}