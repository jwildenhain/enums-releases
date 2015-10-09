package ca.mcmaster.magarveylab.enums.clusters;

public enum BetaLactamClusterTypes implements ClusterType {

	CARBAPENEM("carbapenem"),
	CLAVAM("clavam"),
	SULFAZECIN("sulfazecin"),
	TABTOXIN("tabtoxin"),
	PENICILLIN("penicillin"),
	CEPHALOSPORIN("cephalosporin"),
	;
	
	private final String name;
	
	private BetaLactamClusterTypes(final String name) {
		this.name = name;
	}
	
	public String fullName() {
		return name;
	}
	
}
