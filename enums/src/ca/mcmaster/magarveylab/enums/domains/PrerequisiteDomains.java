package ca.mcmaster.magarveylab.enums.domains;

import ca.mcmaster.magarveylab.enums.DomainFamilies;

public enum PrerequisiteDomains implements DomainType {

	// methoxymalonate
	_3_HYDROXYACYL_COA_DEHYDROGENASE("3-hydroxyacyl-CoA dehydrogenase (methoxymalonate biosynthesis)", 
			"3-hydroxyacyl-CoA_dehydrogenase.hmm", "HADH", 362.9d),
	ACYL_COA_DEHYDROGENASE("Acyl-CoA dehydrogenase (methoxymalonate biosynthesis)", 
			"Acyl-CoA_dehydrogenase.hmm", "ADH", 290.1d),
	METHOXYMALONATE_O_METHYLTRANSFERASE("O-methyltransferase (methoxymalonate biosynthesis)", 
			"methoxymalonate_O_methyltransferase.hmm", "OMT", 176.7d),
	// enduracididine
	PLP_DEPENDENT_AMINOTRANSFERASE_1("PLP-dependent aminotransferase (MppP)", 
			"110_PLPdep_aminotransferase.hmm", "MppP", 193),
	PLP_DEPENDENT_AMINOTRANSFERASE_2("PLP-dependent aminotransferase (MppQ)", 
			"130_PLPdep_aminotransferase.hmm", "MppQ", 233),
	// capreomycidine
	CAPREOMYCIDINE_SYNTHASE_1("L-arginine hydroxylase", 
			"capreomycidine_synthase_1.hmm", "CmnC", 100),
	CAPREOMYCIDINE_SYNTHASE_2("Capreomycidine synthase", 
			"capreomycidine_synthase_2.hmm", "CmnD", 100),
	//2,3-DAP
	DIAMINOPROPIONATE_SYNTHASE("2,3-diaminopropionate synthase", 
			"diaminopropionate_synthase.hmm", "CmnB", 150.0d),
	// pipecolic acid
	PIPECOLIC_ACID_SYNTHASE_1("Cyclodeaminase (pipecolic acid biosynthesis)", 
			"pipc_synthase_1.hmm", "GetD", 300.0d),
	PIPECOLIC_ACID_SYNTHASE_2("Hydroxylase (pipecolic acid biosynthesis)", 
			"pipc_synthase_2.hmm", "GetF", 200.0d),
	// 3-hydroxyanthranilate
	TRYPTOPHAN_DIOXYGENASE("Tryptophan dioxygenase", "trp_dioxygenase.hmm", "SibP", 100.0d),
	ARYL_FORMAMIDASE("Aryl formamidase", "aryl_formamidase.hmm", "SibK", 150.0d),
	;

	private final String name;
	private final String hmm;
	private final String abbreviation;
	private final double cutoff;

	private PrerequisiteDomains(final String name, final String hmm, final String abbreviation, final double cutoff) {
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
		return DomainFamilies.PREREQUISITE;
	}

}
