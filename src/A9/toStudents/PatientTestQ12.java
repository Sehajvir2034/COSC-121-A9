package A9.toStudents;

import java.util.ArrayList;

public class PatientTestQ12 {
	public static void main(String[] args) {
		ArrayList<Patient> list = new ArrayList<>(5);
		list.add(new Patient(1, "p1", false));
		list.add(new Patient(2, "p2", false));
		list.add(new Patient(3, "p3", true));
		list.add(new Patient(4, "p4", false));
		list.add(new Patient(5, "p5", true));

		//before sorting
		System.out.printf("%-15s%25s\n", "Before sorting", list);	//should be [p1, p2, p3, p4, p5]

		//try bubble sort methods 	for Q1
		//A9.toStudents.Sorter.bubbleSort(list);
		//A9.toStudents.Sorter.bubbleSort(list, new PatientComparator());

		//other sort methods		for Q2
		//A9.toStudents.Sorter.selectionSort(list);
		A9.toStudents.Sorter.insertionSort(list);

		//after sorting
		System.out.printf("%-15s%25s\n", "After sorting", list);	//should be [p3, p5, p1, p2, p4]



		// ********** Below is the code for Q3 **********

		/*
		int numPatients = 5000;

		System.out.println("\tN\t Bubble\t   Selection\tInsertion");

		for(int i = 0 ; i < 10 ;i++){
			// original array
			ArrayList<Patient> arr1 = new ArrayList<>(numPatients);

			// populate the original array with random patients using the help of the random patient generator helper method
			for(int j = 0 ; j < numPatients;j++){
				arr1.add(randomPatient(numPatients));
			}

			// create 2 clones using the original array.
			ArrayList<Patient> arr2 = (ArrayList<Patient>)arr1.clone();
			ArrayList<Patient> arr3 = (ArrayList<Patient>)arr1.clone();


			// Get start time and end time for Bubble Sort
			long startTime1 = System.currentTimeMillis();
			Sorter.bubbleSort(arr1);
			long endTime1 = System.currentTimeMillis();

			// Get start time and end time for Selection Sort
			long startTime2 = System.currentTimeMillis();
			Sorter.selectionSort(arr2);
			long endTime2 = System.currentTimeMillis();

			// Get start time and end time for Insertion Sort
			long startTime3 = System.currentTimeMillis();
			Sorter.insertionSort(arr3);
			long endTime3 = System.currentTimeMillis();

			float time1 = (float)(endTime1 - startTime1)/1000;
			float time2 = (float)(endTime2 - startTime2)/1000;
			float time3 = (float)(endTime3 - startTime3)/1000;

			System.out.printf("%5d\t  %5.3f\t   %5.3f \t\t %5.3f\n",numPatients,time1,time2,time3);

			// increment patient by 5000 after each iteration
			numPatients += 5000;
		}
		*/

	}

	public static Patient randomPatient(int arraySize){
		int id = (int)(Math.random()*(arraySize + 1));
		int boolCheck = (int)(Math.round(Math.random()));
		boolean emergency;
		if(boolCheck == 1)
			emergency = true;
		else
			emergency =false;

		return new Patient(id, "anonymous", emergency);
	}
}
