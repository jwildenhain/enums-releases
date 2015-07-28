package ca.mcmaster.magarveylab.enums.clusters;

/**
 * Enediynes are synthesized by iterative type I polyketide synthases. They have a defining C-terminal PPTase domain
 * and their ketosynthase domains assort with PUFA synthases. Enediynes can be either 9- or 10-membered rings. 
 * @author skinnider
 *
 */
public enum EnediyneClusterTypes implements ClusterType {

	_9_MEMBERED_RING("Enediyne (9-membered ring)"),
	_10_MEMBERED_RING("Enediyne (10-membered ring)"),
	;
	
	private final String name;
	
	private EnediyneClusterTypes(final String name) {
		this.name = name;
	}
	
	public String fullName() {
		return name;
	}
	
}
