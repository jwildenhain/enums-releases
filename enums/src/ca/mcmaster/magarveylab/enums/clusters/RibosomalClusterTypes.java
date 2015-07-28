package ca.mcmaster.magarveylab.enums.clusters;

/**
 * Enum for all ribosomal cluster subtypes.
 */
public enum RibosomalClusterTypes implements ClusterType {
	AUTO_INDUCING_PEPTIDE("Auto-inducing peptide"),
	BACTERIAL_HEAD_TO_TAIL_CYCLIZED("Bacterial head-to-tail cyclized peptide"),
	BOTTROMYCIN("Bottromycin"),
	COMX("ComX"),
	CYANOBACTIN("Cyanobactin"),
	GLYOCIN("Glyocin"),
	LANTIPEPTIDE("Lantipeptide"),
	LASSOPEPTIDE("Lassopeptide"),
	LINARDIN("Linardin"),
	LINEAR_AZOLE_CONTAINING("Linear azole-containing peptide"),
	MICROVIRIDIN("Microviridin"),
	PROTEUSIN("Proteusin"),
	SACTIPEPTIDE("Sactipeptide"),
	THIOPEPTIDE("Thiopeptide"),
	TRIFOLITOXIN("Trifolitoxin-family peptide"),
	THIOVIRIDAMIDE("Thioviridamide-family peptide"),
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