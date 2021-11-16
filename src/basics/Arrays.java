package basics;

public class Arrays {
    public static void main(String[]args){
        //define and declare size and content
        String[] cities = {"New York", "San Francisco","Dallas"};
        System.out.println(cities[0]);

        //declare and define only size of array
        String[] countries = new String[4];
        countries[0] = "France";
        countries[1] = "Switzerland";
        countries[2] = "Japan";
        countries[3] = "Estonia";
        System.out.println(countries[3]);

        //declare and define later
        String[] state;

        state = new String[3];
        state[0] = "Ohio";
        state[1] = "California";
        state[2] = "Arizona";
        System.out.println(state[1]);
    }
}
