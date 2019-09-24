package caveofProgramming;

import static com.util.Print.*;

public class WorkerApp {
	public static void main(String[] args){
		new Worker().main();
		printLearning(
			"Without Synchronized\t\t: List will be having less number of elements as List are shared resourses",
			"With Method Synchronized\t: Time will get doubled as one list is waiting on other to get updated as single lock used for Worker object.",
			"WIth Synchronized Block "
		+"\n   with different Lock Objs\t: Full Lists will be filled with optimized time."
		);
	}
}
