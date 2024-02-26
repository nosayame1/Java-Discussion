import java.util.*;

class ArrayDifferences{
    public static void main (String[]args){


        // This is an array. It has a set size which means that it can't be changed or accept new values.

        String[] DaysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};


        /*An arraylist provides a level of flexibility that a regular array does not. For example you can increase its
        by simply adding more values. It will shrink or increase in size to accomodate all values*/

        ArrayList <String> MonthArrayList = new ArrayList<> (Arrays.asList("January", "February", "March", "April"));

        //This allows you to add to an array.
        MonthArrayList.add("May");

        /* When printing out an array you have to call on on the index value of your intended string message.
         * to call on an object in an array you would basically subtract one from its position in the array because
         * the start with the initial number of zero assigned to the first value in the array.  */

        

        System.out.println ("I was born on a " + DaysOfWeek[2] + " in " + MonthArrayList.get(3));

        //Array list also allows you to print out the full array while Array will only print out the address that the elements are stored in.

        System.out.println(DaysOfWeek);
        System.out.println(MonthArrayList);

        }
}