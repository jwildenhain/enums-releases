package ca.mcmaster.magarveylab.enums.clusters;

/**
 * Nucleoside cluster subtypes. 
 * @author skinnider
 *
 */
public enum NucleosideClusterTypes implements ClusterType {

	TUNICAMYCIN("Tunicamycin-family nucleoside"),
	CAPURAMYCIN("Capuramycin-family nucleoside"),
	
	// default
	NUCLEOSIDE("Nucleoside")
	;
	
	private final String name;
	
	private NucleosideClusterTypes(final String name) {
		this.name = name;
	}
	
	public String fullName() {
		return name;
	}
	
}
