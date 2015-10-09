package ca.mcmaster.magarveylab.enums.clusters;

/**
 * Nucleoside cluster subtypes. 
 * @author skinnider
 *
 */
public enum NucleosideClusterTypes implements ClusterType {

	URIDYL_PEPTIDE("uridyl peptide (pacidamycin-type) nucleoside"),
	URIDYL_LIPOPEPTIDE("uridyl lipopeptide (liposidomycin-type) nucleoside"),
	URIDYL_LIPOSACCHARIDE("uridyl liposaccharide (tunicamycin-type) nucleoside"),
	URIDYL_GLYCOSYLPEPTIDE("uridyl glycosylpeptide (capuramycin-type) nucleoside"),
	NIKKOMYCIN("nikkomycin-type nucleoside"),
	POLYOXIN("polyoxin-type nucleoside"), 
	BLASTICIDIN("blasticidin-type nucleoside"),
	GOUGEROTIN("gougerotin-type nucleoside"),
	
	// default
	NUCLEOSIDE("nucleoside")
	;
	
	private final String name;
	
	private NucleosideClusterTypes(final String name) {
		this.name = name;
	}
	
	public String fullName() {
		return name;
	}
	
}
