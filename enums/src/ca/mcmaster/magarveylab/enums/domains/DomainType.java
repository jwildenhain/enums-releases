package ca.mcmaster.magarveylab.enums.domains;

import ca.mcmaster.magarveylab.enums.DomainFamilies;

public interface DomainType {
	
	/**
	 * Get the abbreviation of this gene, for biosynthetic assembly graphs. 
	 * @return		abbreviation of this gene  
	 */
	public String abbreviation();
	
	/**
	 * Get the name of the hidden Markov model file corresponding to this gene. 
	 * @return		filename of the .hmm file including extension
	 */
	public String hmm();
	

	/**
	 * Get the full name of this gene.
	 */
	public String fullName();
	
	
	public String name();
	
	/**
	 * Get the bitscore cutoff for this hidden Markov model. 
	 * @return		appropriate hidden Markov model cutoff 
	 */
	public double cutoff();
		
	/**
	 * Get the parent domain family of this particular domain type.
	 * @return		the domain family (e.g., thiotemplated or sugar)
	 */
	
	public DomainFamilies family();
	
}
