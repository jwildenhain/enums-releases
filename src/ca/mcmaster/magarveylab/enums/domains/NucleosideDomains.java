package ca.mcmaster.magarveylab.enums.domains;

import ca.mcmaster.magarveylab.enums.DomainFamilies;

/**
 * Biosynthetic domains for the biosynthesis of nucleoside antibiotics.<br>
 * <br>
 * See reviews by Niu and Tan (Trends in Microbiology, 2015) and Winn et al.
 * (Natural Product Reports, 2010) for details. Also see references in
 * NucleosideClusterAnalyzer.
 * 
 * @author skinnider
 *
 */
public enum NucleosideDomains implements DomainType {
	
	// Capuramycin
	CapK("O-methyltransferase", "CapK.hmm", "OMT", 200.0),
	CapS("Carboxy methyltransferase", "CapS.hmm", "CapS", 250.0),
	CapW("Aminocaprolactam N-acyltransferase", "CapW.hmm", "CapW", 500.0),

	// Uridyl lipopeptides (liposidomycin)
	LipK("PLP-dependent L-threonine:uridine-5'-aldehyde transaldolase", "LipK.hmm", "LipK", 400.0),
	LipL("Non-heme iron (II)-dependent dioxygenase (uridine-5'-aldehyde biosynthesis)", "LipL.hmm", "LipL", 100.0),
	LipM("Nucleotidyltransferase", "LipM.hmm", "LipM", 150.0),
	LipN("Glycosyltransferase", "LipN.hmm", "LipN", 450.0),
	LipO("L-methionine:uridine-5'-aldehyde aminotransferase", "LipO.hmm", "LipO", 265.0),
	LipP("Pyrimidine-nucleoside phosphorylase", "LipP.hmm", "LipP", 500.0),
	
	// Nikkomycin
	NikA("Acetaldehyde dehydrogenase", "NikA.hmm", "NikA", 300.0),
	NikB("Aldolase (4-pyridyl-2-oxo-4-hydroxyisovalerate biosynthesis)", "NikB.hmm", "NikB", 600.0),
	NikC("L-lysine 2-aminotransferase", "NikC.hmm", "NikC", 600.0),
	NikD("FAD-dependent oxidase (picolinic acid biosynthesis)", "NikD.hmm", "NikD", 525.0),
	NikF("Cytochrome P450 (hydroxypyridyl homothreonine biosynthesis)", "NikF.hmm", "NikF", 500.0),
	NikJ("", "NikJ.hmm", "PolH", 0),
	NikL("Phosphatase", "NikL.hmm", "PolJ", 150.0),
	NikO("Uridine-5'-monophoshpate enolpyruvyltransferase", "NikO.hmm", "PolA", 350.0),
	NikS("ATP-grasp protein", "NikS.hmm", "NikS", 200.0),
	NikT("Aminotransferase (pyridylhomothreonine biosynthesis)", "NikT.hmm", "NikT", 350.0),
	NikQ("Heme-dependent hydrolase (imidazolone biosynthesis)", "NikQ.hmm", "NikQ", 500.0),
	
	// Uridyl peptides (pacidamycin) 
	PacB("tRNA-dependent aminoacyltransferase", "PacB.hmm", "PacB", 50.0),
	PacE("PLP-dependent aminotransferase (3'-deoxy-4',5'-enamino-uridine biosynthesis)", "PacE.hmm", "PacE", 800.0),
	PacK("Flavin-dependent dehydrogenase (uridine-5'-aldehyde biosynthesis)", "PacK.hmm", "PacK", 750.0),
	PacM("Cupin family enzyme (uridine-5'-aldehyde dehydratase)", "PacM.hmm", "PacM", 200.0),
	
	// Uridyl liposaccharides (tunicamycin) 
	TunA("UDP-GlcNAc 5,6-dehydratase", "TunA.hmm", "TunA", 150.0),
	TunF("UDP-GlcNAc 4-epimerase", "TunF.hmm", "TunF", 300.0),
	TunG("UMP phosphatase", "TunG.hmm", "TunG", 50.0),
	TunN("UTP pyrophosphatase", "TunN.hmm", "TunN", 100.0), 
	;

	private final String name;
	private final String hmm;
	private final String abbreviation;
	private final double cutoff;

	private NucleosideDomains(final String name, final String hmm, final String abbreviation, final double cutoff) {
		this.name = name;
		this.hmm = hmm;
		this.abbreviation = abbreviation;
		this.cutoff = cutoff;
	}

	public String fullName() {
		return name;
	}

	public String abbreviation() {
		return abbreviation;
	}

	public String hmm() {
		return hmm;
	}

	public double cutoff() {
		return cutoff;
	}

	public DomainFamilies family() {
		return DomainFamilies.NUCLEOSIDE;
	}

}
