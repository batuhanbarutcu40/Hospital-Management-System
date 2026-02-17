import java.util.ArrayList;

class Person {

	public String name;
	public int birthYear;
	public boolean isFemale;

	public Person(String name, int birthYear, boolean isFemale) {

		this.name = name;
		this.birthYear = birthYear;
		this.isFemale = isFemale;

	}

	public String toString() {
		String cinsiyet = "";
		if (this.isFemale) {
			cinsiyet = "female";
		} else {
			cinsiyet = "male";
		}
		return "name, " + birthYear + ", " + cinsiyet;
	}

}

class Patient extends Person {
	public int patientID;
	public String[] medicalHistory;

	public Patient(String name, int birthYear, boolean isFemale, int patientID) {
		super(name, birthYear, isFemale);
		this.patientID = patientID;
	}

	public void addMedicalRecord(String record) {
		ArrayList<String> array = new ArrayList<String>();
		array.toArray(medicalHistory);
		array.add(record);
	}

	public String toString() {
		return super.toString() + "+ " + patientID + medicalHistory;
	}
}

class Doctor extends Person {
	public String specialization;
	public String[] patientsAssigned;

	public Doctor(String name, int birthYear, boolean isFemale, String specialization) {
		super(name, birthYear, isFemale);
		this.specialization = specialization;
	}

	public void assignPatient(String patientName) {
		ArrayList<String> array = new ArrayList<String>();
		array.toArray(patientsAssigned);
		array.add(patientName);
	}

	public void diagnosePatients(String[] patientName,String diagnosis) {
		diagnosis=patientName.toString();
	}
	public String toString() {
		return super.toString() + ", " + specialization;
	}

}

public class Test {

	public static void main(String[] args) {
		
		Person doctor1=new Doctor("Dr. Ahmet Yılmaz",1975,false,"Cardiology");
		Person doctor2= new Doctor("Dr. Zeynep Kaya",1980,true,"Neurology");
		Person patient1= new Patient("Fatih Demir",1990,false,101);
		Person patient2= new Patient("Elif Aydın",1995,true,102);
		Person patient3= new Patient("Mehmet Can",1992,false,103);
		Person patient4= new Patient("Ayşe Koç",1998,true,104);
		Person[] person = {doctor1,doctor2,patient1,patient2,patient3,patient4};
		
		
	}

	public void hospitalSchedule(Person[] person) {
		for (Person person2 : person) {
			if(person2 instanceof Doctor) {
				
			}
		}
	}
}
