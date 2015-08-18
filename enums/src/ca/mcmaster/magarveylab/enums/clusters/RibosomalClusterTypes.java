package ca.mcmaster.magarveylab.enums.clusters;

/**
 * Enum for all ribosomal cluster subtypes.
 */
public enum RibosomalClusterTypes implements ClusterType {
	AUTO_INDUCING_PEPTIDE("auto-inducing peptide"),
	BACTERIAL_HEAD_TO_TAIL_CYCLIZED("bacterial head-to-tail cyclized peptide"),
	BOTTROMYCIN("bottromycin"),
	COMX("ComX"),
	CYANOBACTIN("cyanobactin"),
	GLYOCIN("glyocin"),
	LANTIPEPTIDE("lantipeptide"),
	LASSOPEPTIDE("lassopeptide"),
	LINARDIN("linardin"),
	LINEAR_AZOLE_CONTAINING("linear azole-containing peptide"),
	MICROVIRIDIN("microviridin"),
	PROTEUSIN("proteusin"),
	SACTIPEPTIDE("sactipeptide"),
	THIOPEPTIDE("thiopeptide"),
	TRIFOLITOXIN("trifolitoxin-family peptide"),
	THIOVIRIDAMIDE("thioviridamide-family peptide"),
	YM216391("YM-216391-family peptide"),
	;
	
	private final String name;
	
	private RibosomalClusterTypes(final String name) {
		this.name = name;
	}
	
	public String fullName() {
		return name;
	}
	
}