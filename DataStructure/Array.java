package DataStructure;

public class Array {
    public static void main(String[] arg) {
        int[] numbersArray = new int[5];
        numbersArray[0] = 17;
        numbersArray[1] = 34;
        numbersArray[2] = 54;
        numbersArray[3] = 77;
        numbersArray[4] = 47;


    for(int i = numbersArray.length-1; i >=0; i--){
        if(numbersArray[i] == 54){
            System.out.println("found " + numbersArray[i]);
            break;
        }
    }
    }
}
