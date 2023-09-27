//lex_auth_01289259659037081668
//do not modify the above line

package arraylistassignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;              
//import java.util.List.iterator;

public class Tester {

	public static List<Participant> generateListOfFinalists(Participant[] finalists) {
		// Implement your logic here and change the return statement accordingly
		List<Participant> fList=new ArrayList<Participant>();
		for(Participant p:finalists)
			fList.add(p);
		return fList;
	}

	public static List<Participant> getFinalistsByTalent(List<Participant> finalists, String talent) {
		// Implement your logic here and change the return statement accordingly
		List<Participant> fList=new ArrayList<Participant>();
		for(Participant p:finalists)
			if(p.getParticipantTalent().equals(talent))
				fList.add(p);
				
		return fList;
	}

	public static void main(String[] args) {
		Participant finalist1 = new Participant("Hazel", "Singing", 91.2);
		Participant finalist2 = new Participant("Ben", "Instrumental", 95.7);
		Participant finalist3 = new Participant("John", "Singing", 94.5);
		Participant finalist4 = new Participant("Bravo", "Singing", 97.6);

		Participant[] finalists = { finalist1, finalist2, finalist3, finalist4 };

		List<Participant> finalistsList = generateListOfFinalists(finalists);

		System.out.println("Finalists");
		for (Participant finalist : finalistsList)
			System.out.println(finalist);

		String talent = "Singing";
		System.out.println("Finalists in " + talent + " category");

		List<Participant> finalistsCategoryList = getFinalistsByTalent(finalistsList, talent);
		for (Participant finalist : finalistsCategoryList)
			System.out.println(finalist);
	}

}