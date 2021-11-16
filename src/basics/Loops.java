package basics;

public class Loops {
    public static void main(String[]args){
        String[]  vegetables = {"carrot", "onion", "tomato","lettuce"};
        boolean stateFound = false;
        int i = 0;
        while(stateFound == false)
        {
            if(vegetables[i] == "tomato"){
                stateFound = true;
                System.out.println("tomato found!");
            }else{
                System.out.println("not found yet :v");
                i++;
            }
        }
    }
}
