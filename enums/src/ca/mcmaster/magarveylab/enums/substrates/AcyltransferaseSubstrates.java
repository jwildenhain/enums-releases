package ca.mcmaster.magarveylab.enums.substrates;

/**
 * Enum for each HMM used to predict acyltransferase domain substrate specificity
 * Notation: I (iodine) symbolizes the site at which an extender unit is added to a growing polyketide chain.
 * F (fluorine) symbolizes the site at which a growing polyketide chain reacts with an extender unit. 
 */
public enum AcyltransferaseSubstrates implements SubstrateType {		
	_2_METHYLBUTERYL_COA("2MBuC_1.hmm", "2-Methylbuteryl-CoA", "MeBu", "IC(C(CC)(C)F)=O"),
	BENZOYL_COA("BzC_1.hmm", "Benzoyl-CoA", "Bz", "IC(C(F)c1ccccc1)=O"),
	ETHYLMALONYL_COA_1("EMC_1.hmm", "Ethylmalonyl-CoA (1)", "EtM", "IC(C(CC)F)=O"),
	ETHYLMALONYL_COA_2("EMC_2.hmm", "Ethylmalonyl-CoA (2)", "EtM", "IC(C(CC)F)=O"),
	ETHYLMALONYL_COA_3("EMC_3.hmm", "Ethylmalonyl-CoA (3)", "EtM", "IC(C(CC)F)=O"),
	ISOBUTERYL_COA("IBuC_1.hmm", "Isobuteryl-CoA", "iBu", "IC(C(C)(C)F)=O"),
	MALONYL_COA_1("MC_1.hmm", "Malonyl-CoA (1)", "Mal", "IC(CF)=O"),
	MALONYL_COA_2("MC_2.hmm", "Malonyl-CoA (2)", "Mal", "IC(CF)=O"),
	METHYLMALONYL_COA_1("MMC_1.hmm", "Methylmalonyl-CoA (1)", "MeM", "IC(C(C)F)=O"),
	METHYLMALONYL_COA_2("MMC_2.hmm", "Methylmalonyl-CoA (2)", "MeM", "IC(C(C)F)=O"),
	METHYLMALONYL_COA_3("MMC_3.hmm", "Methylmalonyl-CoA (3)", "MeM", "IC(C(C)F)=O"),
	METHYLMALONYL_COA_4("MMC_4.hmm", "Methylmalonyl-CoA (4)", "MeM", "IC(C(C)F)=O"),
	METHOXYLMALONYL_COA_1("MOMC_1.hmm", "Methoxymalonyl-CoA (1)", "OMeMal", "IC(C(OC)F)=O"),
	METHOXYLMALONYL_COA_2("MOMC_2.hmm", "Methoxymalonyl-CoA (2)", "OMeMal", "IC(C(OC)F)=O"),
	PROPIONYL_COA_1("PC_1.hmm", "Propionyl-CoA", "Pr", "IC(C(CC)F)=O");  

	private final String hmm;
	private final String name;
	private final String abbreviation;
	private final String smiles;
	
	private AcyltransferaseSubstrates(final String hmm, final String name, final String abbreviation,
			final String smiles) {
		this.hmm = hmm;
		this.smiles = smiles;
		this.name = name;
		this.abbreviation = abbreviation;
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
	
	public String smiles() { 
		return smiles; 
	}
	
}