package ca.mcmaster.magarveylab.enums.clusters;

public enum TypeIIPolyketideClusterTypes implements ClusterType {
	
	TETRACYCLINE("tetracycline-type polyketide"),
	ANTHRACYCLINE("anthracycline-type polyketide"),
	ANGUCYCLINE("angucycline-type polyketide"),
	AUREOLIC_ACID("aureolic acid polyketide"),
	TETRACENOMYCIN("tetracenomycin-type polyketide"),
	BENZOISOCHROMANEQUINONE("benzoisochromanequinone polyketide"),
	PENTANGULAR_POLYPHENOL("pentangular polyphenol"),
	PLURAMYCIN("pluramycin-type polyketide"),
	RESISTOMYCIN("resistomycin-type polyketide"),
	ENTEROCIN("enterocin-type polyketide"),
	OTHER("other type II polyketide scaffold"),
	;
	
	private final String name;
	
	private TypeIIPolyketideClusterTypes(final String name) {
		this.name = name;
	}

	public String fullName() {
		return name;
	}

}
