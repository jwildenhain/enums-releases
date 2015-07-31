package ca.mcmaster.magarveylab.enums;

/**
 * Enum for all possible orf types (PKS, NRPS, hybrid, modification, inactive, and null).
 */
public enum OrfTypes {
	PKS,
	TYPE_II_PKS,
	NRPS,
	HYBRID,
	SUGAR,
	MODIFICATION,
	TAILORING,
	RIBOSOMAL,
	RESISTANCE,
	REGULATOR,
	INACTIVE,
	BETA_LACTAM,
	PREREQUISITE,
	AMINOGLYCOSIDE,
	NUCLEOSIDE,
	NULL
	;
	
	/**
	 * Replace the default toString() with a lowercase version.
	 */
	@Override
	public String toString() {
		String initial = super.toString();
		return initial.toLowerCase();
	}
	
}