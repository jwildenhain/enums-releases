package ca.mcmaster.magarveylab.enums;

/**
 * A list of natural product hexose sugars, common bacterial primary metabolites.
 * @author skinnider
 *
 */
public enum HexoseSugars implements Structure {
	
	GLUCOSE("Glucose", "OCC1OC(I)C(O)C(O)C1O"),
	GLCNAC("N-acetylglucosamine", "O=C(NC1C(O)C(O)C(CO)OC1I)C"),
	MANNOSE("Mannose", "OCC1OC(I)C(O)C(O)C1O"),
	GULOSE("Gulose", "OCC1OC(I)C(O)C(O)C1O");
	
	private final String smiles;
	private final String name;
	
	private HexoseSugars(final String name, final String smiles) {
		this.name = name;
		this.smiles = smiles;
	}
	
	/**
	 * Get the HTML-friendly name of the sugar. 
	 */
	@Override
	public String toString() {
		return name;
	}
	
	/**
	 * Get the SMILES of this hexose sugar. 
	 * @return	hexose sugar structure, with attachment site labelled as iodine 
	 */
	public String smiles() {
		return smiles;
	}
	
}
