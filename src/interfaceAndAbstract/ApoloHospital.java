package interfaceAndAbstract;

public class ApoloHospital extends GlobalPatientData implements USMedical, UKMedical, IndiaMedical {

	@Override
	public void emergencyServices() {

		System.out.println("Ap- emergencyServices");
	}

	@Override
	public void neuroServices() {

		System.out.println("AP---neuroServices");
	}

	@Override
	public void peditricServices() {

		System.out.println("AP---peditricServices");
	}

	@Override
	public void ENTServices() {

		System.out.println("AP---ENTServices");

	}

	@Override
	public void ambulanceServices() {
		System.out.println("AP---ENTServices");

	}

	@Override
	public void physioService() {
		System.out.println("AP---physioService");

	}

	@Override
	public void onchologyServices() {

		System.out.println("AP---onchologyServices");
	}

	@Override
	public void orthopadicServices() {

		System.out.println("AP---orthopadicServices");
	}

	// WHO
	@Override
	public void polioServices() {
		// TODO Auto-generated method stub

	}

	// Non overridden method

	public void OPDServices() {
		System.out.println("AP--OPDServices");
	}

	public void medicalInsurence() {
		System.out.println("AP---medicalInsurence");
	}

	public void pathologyServices() {
		System.out.println("AP---pathologyServices");
	}

	@Override
	public void radiologyServices() {
		System.out.println("AP--radiologyServices");

	}

}
