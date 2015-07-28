package ca.mcmaster.magarveylab.enums.clusters;

/**
 * Aminoglycoside cluster subtypes developed by Michael Ranieri. 
 * @author skinnider
 *
 */
public enum AminoglycosideClusterTypes implements ClusterType {

	// 2-DOI-derived
	_2_DEOXY_STREPTAMINE("2-deoxy-streptamine derived aminoglycoside"),
	NEAMINE_PAROMAMINE("Neamine- or paromamine derived aminoglycoside"),
	KANAMYCIN("Kanamycin family aminoglycoside"),
	NEOMYCIN_RIBOSTAMYCIN("Neomycin/ribostamycin family aminoglycoside"),
	BUTIROSIN("Butirosin family aminoglycisode"),
	PAROMAMYCIN("Paromamycin family aminoglycoside"),
	LIVIDOMYCIN("Lividomycin family aminoglycoside"),
	TOBRAMYCIN("Tobramycin family aminoglycoside"),
	GENTAMICIN("Gentamicin family aminoglycoside"),
	FORTIMICIN("Fortimicin family aminoglycoside"),
	ISTAMYCIN("Istamycin family aminoglycoside"),
	APRAMYCIN("Apramycin family aminoglycoside"),
	
	// myo-inositol-derived
	SCYLLO_INOSOSE("Scyllo-inosose derived aminoglycoside"),
	MYO_INOSOSE_5("myo-Inosose-5 derived aminoglycoside"),
	MYO_INOSOSE("D- or L-myo-Inosose derived aminoglycoside"),
	KASUGAMYCIN("Kasugamycin family aminoglycoside"),
	;
	
	private final String name;
	
	private AminoglycosideClusterTypes(final String name) {
		this.name = name;
	}
	
	public String fullName() {
		return name;
	}
	
}
