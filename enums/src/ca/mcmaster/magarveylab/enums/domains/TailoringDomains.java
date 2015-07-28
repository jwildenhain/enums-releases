package ca.mcmaster.magarveylab.enums.domains;

import ca.mcmaster.magarveylab.enums.DomainFamilies;

/**
 * Natural product scaffold tailoring reactions that are not specific to any single
 * biosynthetic family.  
 * @author skinnider
 *
 */
public enum TailoringDomains implements DomainType {

	GLYCOSYLTRANSFERASE("Glycosyltransferase", "glycosyltransferase.hmm", "GTr", 89.3d),
	C_GLYCOSYLTRANSFERASE("C-glycosyltransferase", "C-GTr.hmm", "C-GT", 200.0d),
	CHLORINATION("Chlorination", "chlorinase.hmm", "Cl", 110.8d),
	SULFOTRANSFERASE("Sulfotransferase", "sulfotransferase.hmm", "ST", 25.6d),
	CARBAMOYLTRANSFERASE("Carbamoyltransferase", "carbamoyltransferase.hmm", "CarbT", 46.1d),
	TRYPTOPHAN_DIOXYGENASE("Tryptophan dioxygenase", "kynurenine.hmm", "Kyn", 69.8d),
	PROLINE_DEHYDROGENASE("Proline dehydrogenase", "proline_dehydrogenase.hmm", "DHO", 413.2d),
	P450A("P450A", "P450A.hmm", "P450", 249.6d),
	P450B("P450B", "P450B.hmm", "P450", 217.6d),
	P450C("P450C", "P450C.hmm", "P450", 241.5d),
	P450D("P450D", "P450D.hmm", "P450", 270.1d),
	PHOSPHOTRANSFERASE_1("Phosphotransferase (1)", "phosphotransferase_1.hmm", "PO<sub>4</sub>", 290.0),
	PHOSPHOTRANSFERASE_2("Phosphotransferase (2)", "phosphotransferase_2.hmm", "PO<sub>4</sub>", 245.0),
	FORMYLTRANSFERASE("Formyltransferase", "FT.hmm", "F", 50.0),
	;

	private final String name;
	private final String hmm;
	private final String abbreviation;
	private final double cutoff;

	private TailoringDomains(final String name, final String hmm, final String abbreviation, final double cutoff) {
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

	public boolean tailoring() {
		return true;
	}

	public DomainFamilies family() {
		return DomainFamilies.TAILORING;
	}
	
}
