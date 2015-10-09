package ca.mcmaster.magarveylab.enums.domains;

import ca.mcmaster.magarveylab.enums.DomainFamilies;

public enum TypeIIPolyketideDomains implements DomainType {
	
	// min pks
	KSA("Ketosynthase &alpha;", "KSa.hmm", "KS<sub>&alpha;</sub>", 500.0d),
	CLF("Chain length factor (KS<sub>&beta;</sub>)", "CLF.hmm", "CLF", 400.0d),

	// cyclases
	CYCLASE_CLADE_1("Type II polyketide cyclase, clade 1 (tetracenomycins/pentangular polyphenols, 3rd ring)", 
			"cyclase_clade_I.hmm", "Cyc", 207.8d),
	CYCLASE_CLADE_2("Type II polyketide cyclase, clade 2 (anthracyclines/tetracyclines/aureolic acids, 3rd ring)", 
			"cyclase_clade_II.hmm", "Cyc", 208.4d),
	CYCLASE_CLADE_3("Type II polyketide cyclase, clade 3 (benzoisochromanequinones, pyran ring)", 
			"cyclase_clade_III.hmm", "Cyc", 429.2d),
	CYCLASE_CLADE_4("Type II polyketide cyclase, clade 4 (angucyclines, 3rd/4th ring)", "cyclase_clade_IV.hmm", "Cyc", 100.0d),
	CYCLASE_CLADE_5a("Type II polyketide cyclase, clade 5a (pentangular polyphenols, 4th/5th rings)", 
			"cyclase_clade_Va.hmm", "Cyc", 100.0d),
	CYCLASE_CLADE_5b("Type II polyketide cyclase, clade 5b (tetracenomycins, 4th ring)", "cyclase_clade_Vb.hmm", "Cyc", 99.7d),
	CYCLASE_CLADE_6a("Type II polyketide cyclase, clade 6a (anthracyclines, 4th ring)", "cyclase_clade_VIa.hmm", "Cyc", 100.0d),
	CYCLASE_CLADE_6b("Type II polyketide cyclase, clade 6b (heterogeneous clade)", 
			"cyclase_clade_VIb.hmm", "Cyc", 188.1d),
	CYCLASE_CLADE_6b_SUBTYPE_1("Type II polyketide cyclase, clade 6b subtype 1 (anthracyclines, 4th ring)", 
			"", "Cyc", 25.0d),
	CYCLASE_CLADE_6b_SUBTYPE_2("Type II polyketide cyclase, clade 6b subtype 2 (tetracyclines/aureolic acids, 4th ring)", 
			"", "Cyc", 25.0d),
	CYCLASE_CLADE_7("Type II polyketide cyclase, clade 7 (tetracenomycins/pentangular polyphenols, 1st/2nd/3rd rings)", 
			"cyclase_clade_VII.hmm", "Cyc", 103.4d),
	CYCLASE_CLADE_8_9("Type II polyketide cyclase, clades 8/9 (multi-family, 1st/2nd/3rd rings)", 
			"cyclase_clade_VIII_IX.hmm", "Cyc", 162.6d),
	CYCLASE_CLADE_8a("Type II polyketide cyclase, clade 8a (benzoisochromanequinones, 1st/2nd rings)",
			"cyclase_clade_VIIIa.hmm", "Cyc", 100.0), //fix?
	CYCLASE_CLADE_10("Type II polyketide cyclase, clade 10 (angucyclines, 1st/2nd rings)", 
			"cyclase_clade_X.hmm", "Cyc", 150.0d), 

	// misc. tailoring 
	C2AMT("C-2 aminotransferase", "C2AmT.hmm", "AmT", 600.0d),
	ABM("Anthrone-type oxygenase", "ABM.hmm", "Ox", 22.2d), 
	C6OX("C-6 monooxygenase", "C6Ox.hmm", "Ox", 700.0d), 
	FAVORSKIIASE("Favorskiiase", "favorskiiase.hmm", "EncM", 700.0d),
	BVMO("Baeyer-Villiger monooxygenase", "BVMO.hmm", "BVMO", 600.0d), 

	// ketoreductases
	C9KR("C9 ketoreductase", "C9KR.hmm", "C9KR", 300.0d),
	C11KR("C11 ketoreductase", "C11KR.hmm", "C11KR", 400.0d),
	C15KR("C15 ketoreductase", "C15KR.hmm", "C15KR", 475.0d),
	C17KR("C17 ketoreductase", "C17KR.hmm", "C17KR", 400.0d),
	C19KR("C19 ketoreductase", "C19KR.hmm", "C19KR", 350.0d),
	
	// methyltransferases 
	CARBOXY_OMT("Carboxy-O-methyltransferase", "carboxy_OMT.hmm", "OMT", 300.0d),
	C2MT("D-ring O-/N-methyltransferase", "C2MT.hmm", "MT", 350.0d),
	C6CMT("C-6 C-methyltransferase", "C6CMT.hmm", "CMT", 450.0d),
	C8CMT("C-8 C-methyltransferase", "", "CMT", 300.0d),
	C10CMT("C-10 C-methyltransferase", "C10CMT.hmm", "CMT", 300.0d),
	C11OMT_1("C-11 O-methyltransferase (1)", "C11OMT.hmm", "OMT", 225.0d),
	C11OMT_2("C-11 O-methyltransferase (2)", "C11OMT_2.hmm", "OMT", 275.0d),
	
	// starter unit biosynthesis
	AMIDOTRANSFERASE("Amidotransferase", "amidotransferase.hmm", "GATase", 861.0d),
	PAL("Phenylalanine ammonia lyase", "PAL.hmm", "PAL", 700.0d),
	PRIMING_AT("Type II polyketide priming acyltransferase", "priming_AT.hmm", "AT", 300.0),
	KSIII("Ketosynthase III", "KSIII.hmm", "KSIII", 350.0d),
	;
	
	private final String name;
	private final String hmm;
	private final String abbreviation;
	private final double cutoff;
	
	private TypeIIPolyketideDomains(final String name, final String hmm, final String abbreviation, final double cutoff) {
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
		return DomainFamilies.TYPE_II_POLYKETIDE;
	}

}
