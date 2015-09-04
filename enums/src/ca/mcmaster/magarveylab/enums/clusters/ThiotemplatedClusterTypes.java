package ca.mcmaster.magarveylab.enums.clusters;

/**
 * Enum for all thiotemplated cluster subtypes.
 */
public enum ThiotemplatedClusterTypes implements ClusterType {
	
	PKS("polyketide"),
	NRPS("nonribosomal peptide"), 
	ENEDIYNE_9_MEMBERED("enediyne (9-membered)"),
	ENEDIYNE_10_MEMBERED("enediyne (10-membered)"),
	FUNGAL_TYPE_I("iterative type I polyketide"),
	NULL("unknown thiotemplated cluster type");

	private final String name;
	
	private ThiotemplatedClusterTypes(final String name) {
		this.name = name;
	}
	
	public String fullName() {
		return name;
	}
	
}