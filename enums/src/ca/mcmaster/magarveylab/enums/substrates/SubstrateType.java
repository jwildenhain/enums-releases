package ca.mcmaster.magarveylab.enums.substrates;

/**
 * A substrate activated by a biosynthetic domain.
 * 
 * @author skinnider
 *
 */
public interface SubstrateType {

	/**
	 * Get the name of the hidden Markov model (.hmm) file associated with this
	 * domain substrate.
	 * 
	 * @return the name of the .hmm file
	 */
	public String hmm();

	/**
	 * Get the full name of this domain substrate.
	 * 
	 * @return the substrate's full name
	 */
	public String fullName();

	/**
	 * Get the abbreviation associated with this substrate for use in output.
	 * 
	 * @return the abbreviation of the substrate
	 */
	public String abbreviation();

	/**
	 * Get the SMILES representing this domain substrate(s). The SMILES may be
	 * tagged with unusual atoms (e.g., fluorine and iodine in ketide monomers)
	 * for use in scaffold construction!
	 * 
	 * @return the SMILES of this substrate(s)
	 */
	public String smiles();

}
