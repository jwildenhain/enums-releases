package ca.mcmaster.magarveylab.enums;

import java.awt.Color;

/**
 * Enum for all families of biosynthetic gene clusters. 
 */
public enum ClusterFamilies {
	
	NONRIBOSOMAL_PEPTIDE(Colors.RED),
	TYPE_I_POLYKETIDE(Colors.BLUE),
	TYPE_II_POLYKETIDE(Colors.YELLOW),
	BETA_LACTAM(Colors.PINK),
	AMINOGLYCOSIDE(Colors.TEAL),
	NUCLEOSIDE(Colors.BROWN),
	RIBOSOMAL(Colors.ORANGE),
	NULL(Colors.DARK_GREY),
	;

	private Colors color;
	
	private ClusterFamilies(Colors color) {
		this.color = color;
	}
	
	/**
	 * Get the color with which to graph this color on a circular genome graph.
	 * 
	 * @return the family color
	 */
	public Color color() {
		return Color.decode(color.hex());
	}
	
}
