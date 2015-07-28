package ca.mcmaster.magarveylab.enums.clusters;

public enum TypeIIPolyketideClusterTypes implements ClusterType {
	
	TETRACYCLINE("Tetracycline-type polyketide"),
	ANTHRACYCLINE("Anthracycline-type polyketide"),
	ANGUCYCLINE("Angucycline-type polyketide"),
	AUREOLIC_ACID("Aureolic acid polyketide"),
	TETRACENOMYCIN("Tetracenomycin-type polyketide"),
	BENZOISOCHROMANEQUINONE("Benzoisochromanequinone polyketide"),
	PENTANGULAR_POLYPHENOL("Pentangular polyphenol"),
	PLURAMYCIN("Pluramycin-type polyketide"),
	RESISTOMYCIN("Resistomycin-type polyketide"),
	ENTEROCIN("Enterocin-type polyketide"),
	OTHER("Other type II polyketide scaffold"),
	;
	
	/*
	 * Pradimicin
	 * Pluramycins: pluramycin, altromycin, hedamycin 
	 * Gilvocarcins
	 * Jadomycins? 
	 *  
	 */
	
	private final String name;
	
	private TypeIIPolyketideClusterTypes(final String name) {
		this.name = name;
	}

	public String fullName() {
		return name;
	}

}
