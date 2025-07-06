package operators;

public class population {
    

    public static void main(String[] args) {
        long population = 312032486l;

        long current_pop=0;

        int birth = 7;
        int death = 13;
        int immigrant = 45; //comes from outsidde

        int seconds = (60*60*24*365)*5; //5 years of seconds 
        long total_birth = (seconds/birth);
        long total_death = (seconds / death);
        long total_immigrant = (seconds/immigrant);

        current_pop = (population +total_birth-total_death+total_immigrant);
        
        System.out.println("the old population is " + population);
        System.out.println("the current population is " + current_pop);




    }
}
