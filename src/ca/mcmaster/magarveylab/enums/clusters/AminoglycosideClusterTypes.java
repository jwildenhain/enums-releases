package ca.mcmaster.magarveylab.enums.clusters;

/**
 * Aminoglycoside cluster subtypes developed by Michael Ranieri. 
 * @author skinnider
 *
 */
public enum AminoglycosideClusterTypes implements ClusterType {

	// 2-DOI-derived
	_2_DEOXY_STREPTAMINE("2-deoxy-streptamine derived aminoglycoside"),
	NEAMINE_PAROMAMINE("neamine- or paromamine derived aminoglycoside"),
	KANAMYCIN("kanamycin family aminoglycoside"),
	NEOMYCIN_RIBOSTAMYCIN("neomycin/ribostamycin family aminoglycoside"),
	BUTIROSIN("butirosin family aminoglycisode"),
	PAROMAMYCIN("paromamycin family aminoglycoside"),
	LIVIDOMYCIN("lividomycin family aminoglycoside"),
	TOBRAMYCIN("tobramycin family aminoglycoside"),
	GENTAMICIN("gentamicin family aminoglycoside"),
	FORTIMICIN("fortimicin family aminoglycoside"),
	ISTAMYCIN("istamycin family aminoglycoside"),
	APRAMYCIN("apramycin family aminoglycoside"),
	
	// myo-inositol-derived
	SCYLLO_INOSOSE("scyllo-inosose derived aminoglycoside"),
	MYO_INOSOSE_5("myo-inosose-5 derived aminoglycoside"),
	MYO_INOSOSE("D- or L-myo-inosose derived aminoglycoside"),
	KASUGAMYCIN("kasugamycin family aminoglycoside"),
	;
	
	private final String name;
	
	private AminoglycosideClusterTypes(final String name) {
		this.name = name;
	}
	
	public String fullName() {
		return name;
	}
	
}
