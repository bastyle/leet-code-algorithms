package algorithms;

public class RecyclingGarbageTrucks2 {

	/*
	 * There are N houses (numbered from 0 to N-1) along a street. In each of them,
	 * recyclable trash (plastic, glass, metal) Is collected into separate bags.
	 * 
	 * There are three trucks that collect the trash. Each of them collects a
	 * separate type of trash (the first collects plastic, the second, glass and the
	 * third, metal). All the trucks begin and end their Jobs at the starting end of
	 * the street. Passing from the starting point to house number 0 takes D[0]
	 * minutes. Passing between houses number K-1 and K (for K in the range 1 to
	 * N-1) takes D[K] minutes. Loading one bag onto the truck takes one minute.
	 * 
	 * For example, D = [2, 5] means that passing between the starting point and
	 * house number 0 takes 2 minutes and passing between houses number 0 and 1
	 * takes 5 minutes.
	 * 
	 * Each of the houses has already collected some bags (or possibly no bags) of
	 * recyclable trash. The number of bags that house number K has collected is
	 * recorded in string T[K], composed of letters 'P' (plastic), 'G' (glass) and
	 * 'M' (metal). For example, T[1] = "GMG" means that house number 1 has
	 * collected two bags of glass and one bag of metal. Each house may collect more
	 * than one bag of each type.
	 * 
	 * All of the trucks start their jobs simultaneously. Each finishes its job
	 * after collecting all of the bags of the given type of trash and returning
	 * back to the starting point. What is the minimum number of minutes that will
	 * pass before all the trucks finish all the jobs?
	 * 
	 * Write a function:
	 * 
	 * class Solution { public int solution(int[] D, String[] T); }
	 * 
	 * that, given array D of N integers and array T of N strings, returns the
	 * minimum number of minutes needed by the trucks to finish all the jobs.
	 * 
	 * Examples:
	 * 
	 * 1. Given D = [2, 5], T = ["PGP", "M"], the function should return 15. The
	 * truck collecting plastic needs to go to house number 0, collect two bags and
	 * go back, which takes 2+1+1+2=6 minutes. The truck collecting glass needs 5
	 * minutes: 2 minutes to go to house number 0, 1 minute to collect a bag and 2
	 * minutes to return to the starting point. The truck collecting metal
	 * 
	 * will go straight to house number 1, collect a bag and go back in 7+1+7=15
	 * minutes. After 15 minutes all of the trash will have been collected and all
	 * trucks will have returned to the starting point.
	 */

	public static void main(String[] args) {
		System.out.println("hello world!!!!");
		String[] D = { "PGP", "M" };
		int[] T = { 2, 5 };

		//System.out.println("maxTIme: " + getMaxTime(D, T));

	}

	public int getMaxTime(String[] D, int[] T) {

		int maxTime = 0, travelTime = 0;
		int plasticTime=0;

		for (int i = 0; i < D.length; i++) {
			final String garbageBagsType = D[i];
			travelTime += T[i];
			System.out.println("travel time: "+travelTime);

			int plasticBags = (garbageBagsType.length() - garbageBagsType.replaceAll("P", "").length());
			System.out.printf("index %d plasticBags %d \n", i, plasticBags);
			//int plasticTime = plasticBags > 0 ? plasticBags + (travelTime * 2) : 0;
			plasticTime = (i==0? plasticBags + T[i]*2 : (plasticBags > 0 ? plasticBags + (travelTime * 2) : 0));
			System.out.println("plastic time: " + plasticTime);
			maxTime = Math.max(maxTime, plasticTime);
			System.out.println("maxTime: " + maxTime + "------");

			int metalBags = (garbageBagsType.length() - garbageBagsType.replaceAll("M", "").length());
			System.out.printf("index %d metalBags %d \n", i, metalBags);
			int metalTime = metalBags > 0 ? metalBags + (travelTime * 2) : 0;
			System.out.println("metal time: " + metalTime);
			maxTime = Math.max(maxTime, metalTime);
			System.out.println("maxTime: " + maxTime + "------");

			int glassBags = (garbageBagsType.length() - garbageBagsType.replaceAll("G", "").length());
			System.out.printf("index %d glassBags %d \n", i, glassBags);
			int glassTime = glassBags > 0 ? glassBags + (travelTime * 2) : 0;
			System.out.println("glass time: " + glassTime);
			maxTime = Math.max(maxTime, glassTime);
			System.out.println("maxTime: " + maxTime + "------");

			System.out.println("--------");
		}

		return maxTime;
	}
	
	public void hello() {
		System.out.println("hello");
	}

}
