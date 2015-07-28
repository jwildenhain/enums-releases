package ca.mcmaster.magarveylab.enums;

/**
 * A list of natural product hexose sugars, common bacterial primary metabolites.
 * @author skinnider
 *
 */
public enum HexoseSugars {
	
	GLUCOSE("Glucose", "OC[C@H]1OC([C@@H]([C@H]([C@@H]1O)O)O)I"),
	GLCNAC("N-acetylglucosamine", "O=C(C)N[C@@H]1[C@H]([C@@H]([C@@H](CO)OC1I)O)O"),
	MANNOSE("Mannose", "IC(O1)[C@@H](O)[C@@H](O)[C@H](O)[C@H]1CO"),
	GULOSE("Gulose", "O[C@H](C(I)O1)[C@@H](O)[C@H](O)[C@@H]1CO");
	
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
