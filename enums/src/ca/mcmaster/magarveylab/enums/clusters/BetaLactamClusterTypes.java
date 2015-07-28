package ca.mcmaster.magarveylab.enums.clusters;

public enum BetaLactamClusterTypes implements ClusterType {

	CARBAPENEM("Carbapenem"),
	CLAVAM("Clavam"),
	SULFAZECIN("Sulfazecin"),
	TABTOXIN("Tabtoxin"),
	PENICILLIN("Penicillin"),
	CEPHALOSPORIN("Cephalosporin"),
	;
	
	private final String name;
	
	private BetaLactamClusterTypes(final String name) {
		this.name = name;
	}
	
	public String fullName() {
		return name;
	}
	
}
