package ca.mcmaster.magarveylab.enums.domains;

import ca.mcmaster.magarveylab.enums.DomainFamilies;

/**
 * Enum containing a list of all nonribosomal peptide or polyketide domains used in a Prism genome search.
 */
public enum ThiotemplatedDomains implements DomainType {
	NULL("Error: could not identify domain type!", "", "NULL", 0),
	
	ADENYLATION("Adenylation", "adenylation.hmm", "A", 108.4d),
	ACYL_ADENYLATING("Acyl adenylating enzyme", "acyl_adenylating.hmm", "A", 163.2d),
	ACYLTRANSFERASE("Acyltransferase", "acyltransferase.hmm", "AT", 65.2d),
	
	CONDENSATION("Condensation", "condensation.hmm", "C", 26.5d),
	THIOLATION("Thiolation", "thiolation.hmm", "T", 10.0d), 
	THIOESTERASE("Thioesterase", "thioesterase.hmm", "TE", 11.0d),
	KETOSYNTHASE("Ketosynthase", "ketosynthase.hmm", "KS", /* 43.1d */ 0.0),
	O_METHYLTRANSFERASE("O-methyltransferase", "oMT.hmm", "OMT", 95.5d),
	N_METHYLTRANSFERASE("N-methyltransferase", "nMT.hmm", "NMT", 62.3d),
	C_METHYLTRANSFERASE("C-methyltransferase", "cMT.hmm", "CMT", 58.1d),
	DEHYDRATASE("Dehydratase", "dehydratase.hmm", "DH", 12.6d),
	ENOYLREDUCTASE("Enoylreductase", "enoylreductase.hmm", "ER", 50.2d),
	KETOREDUCTASE("Ketoreductase", "ketoreductase.hmm", "KR", 25.9d),
	NITROREDUCTASE("Nitroreductase", "nitroreductase.hmm", "NR", 13.0d),
	REDUCTASE("Reductase", "reductase.hmm", "Re", 100.0d),
	PPTASE("Phosphopantetheinyltransferase", "PPTase.hmm", "PPTase", 21.1d),
	ENEDIYNE_PPTASE("Enediyne C-terminal phosphopantetheinyltransferase", 
			"enediyne_PPTase.hmm", "PPTase", 100.0d),
			
	// iterative type I
	PRODUCT_TEMPLATE_I("Product template, clade I (C2/C7 cyclization PKS)", "PT_I.hmm", "PT", 75.0),
	PRODUCT_TEMPLATE_II("Product template, clade II (tetrahydroxynaphthalene synthase)", "PT_II.hmm", "PT", 200.0),
	PRODUCT_TEMPLATE_III("Product template, clade III (C2/C7, C1/C10 cyclization)", "PT_III.hmm", "PT", 300.0),
	PRODUCT_TEMPLATE_IV("Product template, clade IV (C4/C9, C2/C11 cyclization)", "PT_IV.hmm", "PT", 200.0),
	PRODUCT_TEMPLATE_V("Product template, clade V (C6/C11, C4/C13 cyclization", "PT_V.hmm", "PT", 300.0),
	SAT_C2("Starter unit-acyl carrier protein transacylase (C2)", "SAT_C2.hmm", "SAT", 40.0),
	SAT_C6("Starter unit-acyl carrier protein transacylase (C6)", "SAT_C6.hmm", "SAT", 200.0),
//	CLAISEN_CYCLASE("Claisen cyclase", "Claisen_cyclase.hmm", "Cyc", 0.0),
	;
	
	private final String name;
	private final String hmm;
	private final String abbreviation;
	private final double cutoff;
	
	private ThiotemplatedDomains(final String name, final String hmm, final String abbreviation, final double cutoff) {
		this.name = name;
		this.hmm = hmm;
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
		return DomainFamilies.THIOTEMPLATED;
	}
	
}
