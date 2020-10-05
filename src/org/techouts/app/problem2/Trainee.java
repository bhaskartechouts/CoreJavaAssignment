package org.techouts.app.problem2;

import java.util.List;
import java.util.Map;

public class Trainee {

	int traineeID ;
	String traineeName;
	List<StudyMaterial> list ;
	
	public Trainee(int traineeID, String traineeName, List<StudyMaterial> list) {
		super();
		this.traineeID = traineeID;
		this.traineeName = traineeName;
		this.list = list;
	}
	public int getTraineeID() {
		return traineeID;
	}
	public void setTraineeID(int traineeID) {
		this.traineeID = traineeID;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public List<StudyMaterial> getList() {
		return list;
	}
	public void setList(List<StudyMaterial> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Trainee [traineeID=" + traineeID + ", traineeName=" + traineeName + ", list=" + list + "]";
	}
	
	
	
	
	
	
}
