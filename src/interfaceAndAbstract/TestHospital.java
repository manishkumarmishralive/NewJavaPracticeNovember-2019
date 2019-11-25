package interfaceAndAbstract;

public class TestHospital {

	public static void main(String[] args) {
		ApoloHospital ap = new ApoloHospital();
		ap.ambulanceServices();
		ap.emergencyServices();
		ap.ENTServices();
		ap.medicalInsurence();
		ap.neuroServices();
		ap.onchologyServices();
		ap.OPDServices();
		ap.orthopadicServices();
		ap.pathologyServices();
		ap.peditricServices();
		ap.physioService();
		USMedical.Servies_911();
		IndiaMedical.dangueServices();
		ap.internShip();
		ap.radiologyServices();
		ap.getPatientData();

		// System.out.println(ap.min_fee);
		System.out.println(USMedical.min_fee);// static variables should be
												// accessed in static way means
												// variable
		// should be called by either interface name or class name

		// top casting
		USMedical us = new ApoloHospital();// by referring us medical reference
											// we can access only us medical
											// object
		us.onchologyServices();
		us.orthopadicServices();
		us.physioService();
		us.internShip();
		us.radiologyServices();

		// DownCasting is not allowed bc we can not create object of interface

	}

}
