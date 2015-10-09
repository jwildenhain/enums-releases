package ca.mcmaster.magarveylab.enums;

import ca.mcmaster.magarveylab.enums.domains.DomainType;
import ca.mcmaster.magarveylab.enums.domains.ThiotemplatedDomains;
import ca.mcmaster.magarveylab.enums.substrates.AcylAdenylatingSubstrates;
import ca.mcmaster.magarveylab.enums.substrates.AcyltransferaseSubstrates;
import ca.mcmaster.magarveylab.enums.substrates.AdenylationSubstrates;
import ca.mcmaster.magarveylab.enums.substrates.SubstrateType;

public enum SubstrateDomainSearches {

	ADENYLATION(ThiotemplatedDomains.ADENYLATION, AdenylationSubstrates.values()),
	ACYL_ADENYLATING(ThiotemplatedDomains.ACYL_ADENYLATING, AcylAdenylatingSubstrates.values()),
	ACYLTRANSFERASE(ThiotemplatedDomains.ACYLTRANSFERASE, AcyltransferaseSubstrates.values()),
	;
	
	private DomainType type;
	private SubstrateType[] substrates;
	
	private SubstrateDomainSearches(DomainType type, SubstrateType[] substrates) {
		this.type = type;
		this.substrates = substrates;
	}
	
	public DomainType type() {
		return type;
	}
	
	public SubstrateType[] substrates() {
		return substrates;
	}
	
}
