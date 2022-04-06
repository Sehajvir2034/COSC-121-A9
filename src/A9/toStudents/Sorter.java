package A9.toStudents;

import java.util.ArrayList;
import java.util.Comparator;

public class Sorter {
    public static void bubbleSort(ArrayList<Patient> list){
        boolean sorted = false;


        for(int pass = 0 ; pass < list.size() && !sorted; pass++){
            sorted = true;

            for(int i = 0 ; i < list.size() - pass -1;i++){
                if(list.get(i ).compareTo(list.get(i+1)) > 0){
                    Patient temp = list.get(i);
                    list.set(i,list.get(i + 1));
                    list.set(i +1 , temp);

                    sorted = false;

                }
            }
        }
    }
    public static void bubbleSort(ArrayList<Patient> list, Comparator<Patient> comparator){

        for(int pass = 0; pass < list.size(); pass++){

            for(int i = 0; i < list.size() - pass - 1;i++){
                if(comparator.compare(list.get(i), (list.get(i+1))) > 0){
                    Patient temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }
        }
    }
    public static void selectionSort(ArrayList<Patient> list){
        for (int index = 0; index < list.size() ; index++)
        {
            int idxMin = index;
            for (int scan = index + 1; scan < list.size() ; scan++)
                if (list.get(scan).compareTo(list.get(idxMin))<0)
                    idxMin = scan;

            Patient tempPatient = list.get(index);
            list.set(index, list.get(idxMin));
            list.set(idxMin,tempPatient);
        }
    }
    public static void insertionSort(ArrayList<Patient> list){
        for(int i = 0 ; i < list.size();i++){
            Patient temp = list.get(i);

            int pos;
            for(pos = i; pos > 0 && list.get(pos - 1).compareTo(temp)> 0;pos-- ){
                list.set(pos, list.get(pos - 1));
            }
            list.set(pos, temp);
        }
    }

}
