package ca.mcmaster.magarveylab.enums.domains;

import ca.mcmaster.magarveylab.enums.DomainFamilies;

public enum BetaLactamDomains implements DomainType {
	
	// nonribosomal peptide beta-lactams 
	IAT("Isopenicillin N acyltransferase", "IAT.hmm", "IAT", 175.9d),
	IPNS("Isopenicillin N synthase", "IPNS.hmm", "IPNS", 250.0d),
	DOACS("Deacetoxycephalosporin C synthase", "DOACS.hmm", "DOACS", 158.5d), 
//	DAC_AT("Deacetoxycephalosporin C acetyltransferase", "DAC-AT.hmm", "DAC-AT", 0.0d),

	// other beta lactam genes 
	CarA("Carbapenem CarA", "CarA.hmm", "CarA", 453.0d),
	PCAH("Clavam PCAH", "PCAH.hmm", "PCAH", 423.0d),
	SulfCAS("Sulfazecin CAS", "SulfCAS.hmm", "SulfCAS", 416.0d),
	TblS("Tabtoxin TblS", "TblS.hmm", "TblS", 850.0d),
	Sulfazecin_Thioesterase("Sulfazecin thioesterase", "TE_Sulfazecin.hmm", "TE", 155.0d),
	APSK("APSK", "APSK.hmm", "APSK", 50.0d),
	SbnB("2,3-diaminopropionate synthase", "SbnB.hmm", "SbnB", 326.0d),
	CBS("Cystathione &beta;-synthase", "CBS.hmm", "CBS", 200.0d),
	HAD_IIIC("Haloacid dehalogenase-like hydratase", "HAD_IIIC.hmm", "HAD<sub>IIIC</sub>", 35.0d),
	;
	
	private final String hmm;
	private final String abbreviation;
	private final String name;
	private final double cutoff;
	private BetaLactamDomains(final String name, final String hmm, final String abbreviation, final double cutoff) {
		this.name = name;
		this.hmm = hmm;
		this.abbreviation = abbreviation;
		this.cutoff = cutoff;
	}

	
	public String hmm() {
		return this.hmm; 
	}
	
	public String fullName() {
		return this.name;
	}
	
	public double cutoff() {
		return this.cutoff;
	}
	
	public String abbreviation() {
		return this.abbreviation;
	}
	
	public DomainFamilies family() {
		return DomainFamilies.BETA_LACTAM;
	}

}
