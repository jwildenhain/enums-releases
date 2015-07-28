package ca.mcmaster.magarveylab.enums.clusters;

/**
 * Enum for all thiotemplated cluster subtypes.
 */
public enum ThiotemplatedClusterTypes implements ClusterType {
	PKS("Polyketide"),
	NRPS("Nonribosomal peptide"), 
	HYBRID("Hybrid nonribosomal peptide-polyketide"),
	FUNGAL_TYPE_I("Iterative type I polyketide"),
	NULL("");

	private final String name;
	
	private ThiotemplatedClusterTypes(final String name) {
		this.name = name;
	}
	
	public String fullName() {
		return name;
	}
	
}