package ca.mcmaster.magarveylab.enums.domains;

import ca.mcmaster.magarveylab.enums.DomainFamilies;

/**
 * List of biochemical functionalities of genes implicated in deoxysugar
 * biosynthesis. Based on supplemental information file #2 from Kersten et al.'s
 * "glycogenomics" paper (PNAS, 2013).
 * 
 * @author skinnider
 *
 */
public enum DeoxySugarDomains implements DomainType {
	
	_4_6_DEHYDRATASE(		"4_6_dehydratase.hmm", "4,6-dehydratase", "4,6DH", 400.0d),
	_2_3_DEHYDRATASE(		"2_3_dehydratase.hmm", "2,3-dehydratase", "2,3DH", 100.0d),
	_3_4_DEHYDRATASE(		"3_4_dehydratase.hmm", "3,4-dehydratase", "3,4DH", 600.0d),
	_3_KETOREDUCTASE(		"3_ketoreductase.hmm", "3-ketoreductase", "3KR", 200.0d),
	_4_KETOREDUCTASE(		"4_ketoreductase.hmm", "4-ketoreductase", "4KR", 190.0d),
	EPIMERASE(				"epimerase.hmm", "Epimerase", "E", 160.0d),
	_3_4_ISOMERASE(			"3_4_ketoisomerase.hmm", "3,4-isomerase", "3,4IM", 150.0d),
	_3_AMINOTRANSFERASE(	"3_aminotransferase.hmm", "3-aminotransferase", "3-AmT", 451.0d),
	_4_AMINOTRANSFERASE(	"4_aminotransferase.hmm", "4-aminotransferase", "4-AmT", 350.0d),
	C_METHYLTRANSFERASE(	"sugar_c_methyltransferase.hmm", "C-methyltransferase", "CMT", 400.0d),
	N_METHYLTRANSFERASE(	"sugar_n_methyltransferase.hmm", "N-methyltransferase", "NMT", 180.0d),
	N_N_DIMETHYLTRANSFERASE("n_n_dimethyltransferase.hmm", "N,N-dimethyltransferase", "N,N-MT", 200.0d),
	O_METHYLTRANSFERASE(	"sugar_o_methyltransferase.hmm", "O-methyltransferase", "OMT", 147.0d),
	N_ETHYLTRANSFERASE(		"n_ethyltransferase.hmm", "N-ethyltransferase", "N-ET", 500.0d),
	ACETYLTRANSFERASE(		"acetyltransferase.hmm", "Acetyltransferase", "AcT", 160.0d),
	PYRROLYLTRANSFERASE(	"pyrrolyltransferase.hmm", "Pyrrolyltransferase", "PyT", 350.0d),
	OXIDOREDUCTASE(			"oxidoreductase.hmm", "Oxidoreductase", "Ox", 500.0d),
	OXIDATIVE_DEAMINASE(	"oxidative_deaminase.hmm", "Oxidative deaminase", "OxDA", 500.0d),
	THIOSUGAR_SYNTHASE(		"thiosugar_synthase.hmm", "Thiosugar synthase", "ThiS", 300.0d),
	UDP_DECARBOXYLASE(		"decarboxylase_epimerase.hmm", "UDP-sugar decarboxylase", "UDP-DC", 400.0),
	UDP_DEHYDROGENASE(		"pentose_dehydrogenase.hmm", "UDP-sugar dehydrogenase", "UDP-DH", 400.0);
	
	private final String hmm;
	private final String name;
	private final String abbreviation;
	private final double cutoff;
	
	private DeoxySugarDomains(final String hmm, final String name, final String abbreviation, final double cutoff) {
		this.hmm = hmm;
		this.name = name;
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
		return DomainFamilies.SUGAR;
	}
	
}
