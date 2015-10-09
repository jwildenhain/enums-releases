package ca.mcmaster.magarveylab.enums.domains;

import ca.mcmaster.magarveylab.enums.DomainFamilies;

/**
 * Enzyme domains for the biosynthesis of aminoglycoside antibiotics.
 * 
 * @author skinnider
 *
 */
public enum AminoglycosideDomains implements DomainType {

	// 2-DOI-derived
	LGln_2DOI_AT("LGln_2DOI_AT.hmm", "LGln 2DOI aminotransferase", "DOI AmT", 506.0d),
	_2DOIA_dehydrogenase("2DOIA_dehydrogenase.hmm", "2DOIA dehydrogenase", "DOIA DH", 226.0d),
	_2_N_acetylparomamine_deacetylase("2-N-acetylparomamine_deacetylase.hmm", 
			"2-N-acetylparomamine deacetylase", "2NAPd", 92.0d),
	
	// myo-inositol-derived
	Hyg17("Hyg17.hmm", "Hyg17-like dehydrogenase", "Hyg17", 221.0d),		
	KasQ("KasQ.hmm", "KasQ 2-epimerase", "KasQ", 25.0d),
	SpcB("SpcB.hmm", "SpcB-family dehydrogenase", "SpcB", 60.0d),
	StrI("StrI.hmm", "StrI-family dehydrogenase", "StrI", 206.0d),
	INOSITOL_PHOSPHATE_MONOPHOSPHATASE("myo-inositol_1-phosphate_monophosphatase.hmm", 
			"Inositol phosphate monophosphatase", "IPM", 36.0d),
			
	// 2-DOI-derived, subfamilies
	AprH("AprH.hmm", "AprH-family glycosyltransferase", "AprH", 106.0d),
	BtrG("BtrG.hmm", "BtrG-family &gamma;-L-glutamyl butirosin "
			+ "&gamma;-glutamyl cyclotransferase", "BtrG", 41.3d),
	ForX("ForX.hmm", "ForX-family carboxymuconolactone decarboxylase", "ForX", 95.0d),
	GenD1("GenD1.hmm", "GenD1-family radical SAM protein", "GenD1", 82.5d),
	ImrA("ImrA.hmm", "ImrA-family 16s rRNA methyltransferase", "ImrA", 182.0d),
	KanE("KanE.hmm", "KanE-family glycosyltransferase", "KanE", 570.0d),
	LivW("LivW.hmm", "LivW-family Fe-S oxidoreductase", "LivW", 80.0d),
	NeoF("NeoF.hmm", "NeoF-family ribostamycin GlcNAc transferase", "NeoF", 500.0d),
	ParK("ParK.hmm", "ParK-family extracellular phosphate phosphatase", "ParK", 705.0d),
	TobZ("TobZ.hmm", "TobZ-family carbamoyltransferase", "TobZ", 660.0d),
	;
	
	private final String hmm;
	private final String name;
	private final String abbreviation;
	private final double cutoff;
	
	private AminoglycosideDomains(final String hmm, final String name, 
			final String abbreviation, final double cutoff) {
		this.hmm = hmm;
		this.name = name;
		this.abbreviation = abbreviation;
		this.cutoff = cutoff;
	}
	
	public String hmm() {
		return hmm;
	}
	
	public String fullName() {
		return name;
	}
	
	public String abbreviation() {
		return abbreviation;
	}
	
	public double cutoff() {
		return cutoff;
	}
	
	public DomainFamilies family() {
		return DomainFamilies.AMINOGLYCOSIDE;
	}
	
}
