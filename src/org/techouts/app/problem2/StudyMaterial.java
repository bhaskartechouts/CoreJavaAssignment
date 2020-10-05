package org.techouts.app.problem2;

import java.util.List;
import java.util.Map;

public class StudyMaterial {

	int studyMaterialID ;
	String studtMaterialName;
	public StudyMaterial(int studyMaterialID, String studtMaterialName) {
		super();
		this.studyMaterialID = studyMaterialID;
		this.studtMaterialName = studtMaterialName;
	}
	public int getStudyMaterialID() {
		return studyMaterialID;
	}
	public void setStudyMaterialID(int studyMaterialID) {
		this.studyMaterialID = studyMaterialID;
	}
	public String getStudtMaterialName() {
		return studtMaterialName;
	}
	public void setStudtMaterialName(String studtMaterialName) {
		this.studtMaterialName = studtMaterialName;
	}
	@Override
	public String toString() {
		return "StudyMaterial [studyMaterialID=" + studyMaterialID + ", studtMaterialName=" + studtMaterialName + "]";
	}
	
	
    
}
