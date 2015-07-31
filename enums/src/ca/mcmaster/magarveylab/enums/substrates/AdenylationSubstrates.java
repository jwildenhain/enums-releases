package ca.mcmaster.magarveylab.enums.substrates;

/**
 * Substrates, mostly alpha- or beta-amino acids, of adenylation domains. 
 * @author skinnider 
 *
 */
public enum AdenylationSubstrates implements SubstrateType {		
	_2_AMINO_ADIPIC_ACID("Khayatt_ref_aad_1.hmm", "2-amino-adipic acid", "Aad", "O=C(O)C(NF)CCCC(I)=O"),
	ALANINE_1("Khayatt_ref_ala_1.hmm", "Alanine (1)", "Ala", "IC(C(C)NF)=O"),
	ALANINE_2("Khayatt_ref_ala_2.hmm", "Alanine (2)", "Ala", "IC(C(C)NF)=O"),
	ALANINE_3("Khayatt_ref_ala_3.hmm", "Alanine (3)", "Ala", "IC(C(C)NF)=O"),
	BETA_ALANINE("Khayatt_ref_alabeta_1.hmm", "Beta-alanine", "&beta;-Ala", "O=C(C(C)CNF)I"),
	_3_HYDROXYANTHRANILATE("3-hydroxyanthranilate.hmm", "3-hydroxyanthranilic acid", 
			"3HA", "OC1=C(N)C(C(I)=O)=CC=C1"),
	AMINOCAPROLACTAM("aminocaprolactam.hmm", "L-aminocaprolactam", "ACL", "O=C1NCCCCC1NF"),
	ARGININE("Khayatt_ref_arg_1.hmm", "Arginine", "Arg", "IC(C(CCCNC(N)=N)NF)=O"),
	ASPARAGINE_1("Khayatt_ref_asn_1.hmm", "Asparagine (1)", "Asn", "O=C(C(CC(N)=O)NF)I"),
	ASPARAGINE_2("Khayatt_ref_asn_2.hmm", "Asparagine (2)", "Asn", "O=C(C(CC(N)=O)NF)I"),
	BETA_HYDROXY_ASPARAGINE("beta_hydroxy_asparagine.hmm", "&beta;-hydroxy-asparagine", "OHAsn", 
			"O=C(C(C(O)C(N)=O)NF)I"),
	BETA_HYDROXY_ASPARTATE("beta_hydroxy_aspartate.hmm", "&beta;-hydroxy-aspartic acid", "OHAsp", 
			"O=C(C(C(O)C(O)=O)NF)I"),
	ASPARTIC_ACID("Khayatt_ref_asp_1.hmm", "Aspartic acid", "Asp", "O=C(C(CC(O)=O)NF)I"),
	METHYL_ASPARTIC_ACID("Khayatt_ref_aspme_1.hmm", "Methyl aspartic acid", "MeAsp", 
			"O=C(C(C(C(O)=O)C)NF)I"),
	BETA_HYDROXYTYROSINE("Khayatt_ref_bh_1.hmm", "&beta;-hydroxytyrosine", "OHTyr", 
			"OC(C(C(I)=O)NF)c1ccc(O)cc1"),
	_4R_4E_2_BUTENYL_4_METHYL_L_THREONINE("Khayatt_ref_bm_1.hmm", "(4R)-4[(E)-2-butenyl]-4-methyl-L-threonine", "Bmt", 
			"IC(C(C(O)C(C)C/C=C/C)NF)=O"),
	CAPREOMYCIDINE("capreomycidine.hmm", "Capreomycidine", "Cap", "O=C(I)C(NF)C1NC(N)=NCC1"),
	CYSTEINE_1("Khayatt_ref_cys_1.hmm", "Cysteine (1)", "Cys", "IC(C(CS)NF)=O"),
	CYSTEINE_2("Khayatt_ref_cys_2.hmm", "Cysteine (2)", "Cys", "IC(C(CS)NF)=O"),
	DIAMINOPROPIONATE("diaminopropionate.hmm", "2,3-diaminopropionate", "Dap", "O=C(I)C(NF)CN"),
	_2_4_DIAMINO_BUTYRIC_ACID("Khayatt_ref_dab_1.hmm", "2,4-diamino-butyric acid", "Dab", "O=C(C(CCN)NF)I"),
	DHAB_AKA_DEHYDROTHREONINE("Khayatt_ref_dhab_dh_1.hmm", "2,3-dehydroaminobutyric acid", "Dhab", "C/C=C(C(I)=O)\\NF"), 
	DEHYDROAMINOBUTYRIC_ACID("dehydroaminobutyric_acid.hmm", "2,3-dehydroaminobutyric acid", "Dhab", "C/C=C(C(I)=O)\\NF"),
	_3_5_DIHYDROXYPHENYLGLYCINE("Khayatt_ref_dhpg_dpg_1.hmm", "3,5-dihydroxyphenylglycine", "Dhpg",
			"O=C(C(C1=CC(O)=CC(O)=C1)NF)I"),
	GLUTAMINE("Khayatt_ref_gln_1.hmm", "Glutamine", "Gln", "IC(C(CCC(N)=O)NF)=O"),
	GLUTAMATE("Khayatt_ref_glu_1.hmm", "Glutamate", "Glu", "IC(C(CCC(O)=O)NF)=O"),
	METHYL_GLUTAMATE("methyl-glutamate.hmm", "Methyl-glutamate", "MeGlu", "IC(C(C(CC(O)=O)C)NF)=O"),
	GLYCINE_1("Khayatt_ref_gly_1.hmm", "Glycine (1)", "Gly", "IC(CNF)=O"),
	GLYCINE_2("Khayatt_ref_gly_2.hmm", "Glycine (2)", "Gly", "IC(CNF)=O"),
	HISTIDINE_1("Khayatt_ref_his_1.hmm", "Histidine", "His", "IC(C(CC1=CN=CN1)NF)=O"),
	HISTIDINE_2("histidine.hmm", "Histidine", "His", "IC(C(CC1=CN=CN1)NF)=O"),
	HISTIDINE_3("histidine_3.hmm", "Histidine", "His", "IC(C(CC1=CN=CN1)NF)=O"),
	_4_HYDROXY_PHENYLGLYCINE("Khayatt_ref_hpg_hpg2Cl_1.hmm", 
			"Hydroxyphenylglycine", "Hpg", "OC(C=C1)=CC=C1C(C(I)=O)NF"),
	HYDROXYVALINE("Khayatt_ref_hyv_1.hmm", "Hydroxyvaline", "OHVal", "O=C(C(C(C)(C)O)NF)I"),
	ISOLEUCINE("Khayatt_ref_ile_1.hmm", "Isoleucine", "Ile", "IC(C(C(C)CC)NF)=O"),
	AMINOBUTYRIC_ACID("Khayatt_ref_iva_abu_1.hmm", "2-amino-butyric acid", "Abu", "CCC(NF)C(I)=O"),
	BETA_HYDROXY_LEUCINE("beta_hydroxy_leucine.hmm", "&beta;-hydroxy-leucine", "OHLeu", 
			"IC(C(C(O)C(C)C)NF)=O"),
	LEUCINE_1("Khayatt_ref_leu_1.hmm", "Leucine (1)", "Leu", "IC(C(CC(C)C)NF)=O"),
	LEUCINE_2("Khayatt_ref_leu_2.hmm", "Leucine (2)", "Leu", "IC(C(CC(C)C)NF)=O"),
	LEUCINE_3("Khayatt_ref_leu_3.hmm", "Leucine (3)", "Leu", "IC(C(CC(C)C)NF)=O"),
	LYSINE("Khayatt_ref_lys_1.hmm", "Lysine", "Lys", "IC(C(CCCCN)NF)=O"),
	BETA_LYSINE("Khayatt_ref_lysbeta_1.hmm", "Beta-lysine", "&beta;-Lys", "O=C(I)CC(NF)CCCN"),
	METHIONINE("methionine.hmm", "Methionine", "Met", "CSCCC(NF)C(I)=O"),
	ORNITHINE("Khayatt_ref_orn_1.hmm", "Ornithine", "Orn", "O=C(I)C(NF)CCCN"),
	N5_HYDROXYORNITHINE("Khayatt_ref_ornfn5h_1.hmm", "N5-hydroxyornithine", "OHOrn", "O=C(I)C(NF)CCCNO"),
	HYDROXY_ACETYL_ORNITHINE("Khayatt_ref_ornha_1.hmm", "Hydroxyacetyl-ornithine", "HAOrn",
			"O=C(I)C(NF)CCCN(C(C)=O)O"),
	BETA_PHENYLALANINE("beta_phenylalanine.hmm", "&beta;-phenylalanine", "&beta;-Phe", 
			"IC(CC(NF)C1=CC=CC=C1)=O"),
	BETA_METHYL_PHENYLALANINE("beta_methyl_phenylalanine.hmm", "&beta;-methyl-phenylalanine", "MePhe", 
			"IC(C(C(C)C1=CC=CC=C1)NF)=O"),
	BETA_HYDROXY_PHENYLALANINE("beta_hydroxy_phenylalanine.hmm", "&beta;-hydroxy-phenylalanine", "OHPhe", 
			"IC(C(C(O)C1=CC=CC=C1)NF)=O"),
	PHENYLALANINE("Khayatt_ref_phe_1.hmm", "Phenylalanine", "Phe", "IC(C(CC1=CC=CC=C1)NF)=O"),
	PIPECOLIC_ACID("Khayatt_ref_pip_1.hmm", "Pipecolic acid (1)", "Pip", "O=C(I)C1N(F)CCCC1"),
	HYDROXYPIPECOLIC_ACID("pipecolic_acid_2.hmm", "3-hydroxypipecolic acid", "OHPip", "O=C(C1N(CCCC1O)F)I"),
	PIPERAZIC_ACID("piperazic_acid.hmm", "Piperazic acid", "Piz", "O=C(C1N(NCCC1)F)I"),
	PROLINE_1("Khayatt_ref_pro_1.hmm", "Proline (1)", "Pro", "O=C(C1N(F)CCC1)I"),
	PROLINE_2("Khayatt_ref_pro_2.hmm", "Proline (2)", "Pro", "O=C(C1N(F)CCC1)I"),
	PROLINE_3("proline_3.hmm", "Proline (3)", "Pro", "O=C(C1N(F)CCC1)I"),
	METHYL_PROLINE("Khayatt_ref_prom_1.hmm", "Methyl-proline", "MePro", "O=C(C1N(F)CC(C1)C)I" ),
	SERINE("Khayatt_ref_ser_1.hmm", "Serine", "Ser", "OCC(C(I)=O)NF"),
	THREONINE_1("Khayatt_ref_thr_1.hmm", "Threonine (1)", "Thr", "OC(C)C(C(I)=O)NF"),
	THREONINE_2("Khayatt_ref_thr_2.hmm", "Threonine (2)", "Thr", "OC(C)C(C(I)=O)NF"),
	ALLO_THREONINE("Khayatt_ref_thrallo_1.hmm", "Allo-threonine", "Thr", "OC(C)C(C(I)=O)NF"),
	TRYPTOPHAN("Khayatt_ref_trp_1.hmm", "Tryptophan", "Trp", "IC(C(CC1=CNC2=C1C=CC=C2)NF)=O"),
	TYROSINE_1("Khayatt_ref_tyr_1.hmm", "Tyrosine (1)", "Tyr", "OC(C=C1)=CC=C1CC(C(I)=O)NF"),
	TYROSINE_2("Khayatt_ref_tyr_2.hmm", "Tyrosine (2)", "Tyr", "OC(C=C1)=CC=C1CC(C(I)=O)NF"),
	VALINE_1("Khayatt_ref_val_1.hmm", "Valine (1)", "Val", "CC(C)C(C(I)=O)NF"),
	VALINE_2("Khayatt_ref_val_2.hmm", "Valine (2)", "Val", "CC(C)C(C(I)=O)NF"),
	VALINE_3("Khayatt_ref_val_3.hmm", "Valine (3)", "Val", "CC(C)C(C(I)=O)NF"),
	
	QUINOMYCIN_STARTER_UNIT_BIOSYNTHESIS("hydroxyquinaldic_acid_biosynthesis.hmm", "Hydroxyquinaldic acid biosynthesis", 
			"Dock", ""),
	GLYCOPEPTIDE_STARTER_UNIT_BIOSYNTHESIS("beta_hydroxytyrosine_biosynthesis.hmm", "Beta-hydroxytyrosine biosynthesis", 
			"Dock", "")
	;
	
	private final String hmm;
	private final String name;
	private final String abbreviation;
	private final String smiles;
	
	private AdenylationSubstrates(final String hmm, final String name, final String abbreviation, 
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
