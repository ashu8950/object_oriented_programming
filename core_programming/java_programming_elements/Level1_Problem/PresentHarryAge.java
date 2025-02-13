class PresentHarryAge{
    public static void main(String[] args){
        int birthYear = 2000;
        System.out.println("Birth year is :"+birthYear);
        int currentYear = 2024;
        System.out.println("Current year is : "+currentYear);
        if(birthYear > currentYear){
            System.out.println("birthYear can't be greater than currentYear.");
        }
        else{
            System.out.println("Age of Harry is : "+ (currentYear - birthYear));
        }
    }
}