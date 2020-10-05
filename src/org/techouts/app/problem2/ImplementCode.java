package org.techouts.app.problem2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ImplementCode {

	Trainee trainee;
	StudyMaterial material ;
	Scanner scanner = new Scanner(System.in);
	Map<Integer, Trainee> traineeList = new HashMap<Integer, Trainee>();
	Map<Integer, List> studyMaterials = new HashMap<>();
	List<StudyMaterial> list = new LinkedList<>();
	int traineeID ;
	public void manyToMany() {
		createObjectTrainee();
		System.out.println(traineeList.toString());
		scanner.close();
	}
	public void createObjectTrainee() {
		System.out.println("Enter the Trainee ID : ");
		traineeID = scanner.nextInt();
		System.out.println("Enter Trainee Name : ");
		String traineeName = scanner.next();
		trainee = new Trainee(traineeID, traineeName,list);
		traineeList.put(traineeID, trainee);
		System.out.println("Do You Want Add the Trainee Details Continue Enter Y or Add Study Materials Enter S or Terminated Enter N");
		scanner.nextLine();
		char ch = scanner.next().charAt(0);
		if(ch == 'Y' || ch == 'y') {
			createObjectTrainee();
		}
		else if(ch == 's' || ch == 'S') {
			createObjectStudyMaterials();
		}

	}
	public void createObjectStudyMaterials() {
		System.out.println("Enter the Study Material ID : ");
		int studyMaterialID = scanner.nextInt();
		System.out.println("Enter the Studt Material Name : ");
		String studtMaterialName = scanner.next();
		material = new StudyMaterial(studyMaterialID, studtMaterialName);
		list.add(material);
		System.out.println("Do You Want Add the Trainee Details Continue Enter Y or Add Study Materials Enter S or Terminated Enter N");
		scanner.nextLine();
		char ch = scanner.next().charAt(0);
		if(ch == 'Y' || ch == 'y') {
			createObjectTrainee();
		}
		else if(ch == 's' || ch == 'S') {
			createObjectStudyMaterials();
		}
		studyMaterials.put(traineeID,list);
	}
}
