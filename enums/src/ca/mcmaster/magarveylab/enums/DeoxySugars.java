package ca.mcmaster.magarveylab.enums;

import ca.mcmaster.magarveylab.enums.domains.DeoxySugarDomains;

/**
 * A list of natural product deoxysugars and the genes required to synthesize them.
 * @author skinnider
 *
 */
public enum DeoxySugars {
	
	L_ACULOSE("L-aculose", "CC1OC(I)C=CC1=O", new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, 
			DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_4_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, 
			DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE, DeoxySugarDomains.OXIDOREDUCTASE }),
	L_CINERULOSE_A("L-cinerulose A", "CC1OC(I)CCC1=O", new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, 
			DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_4_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, 
			DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE }),
	L_RHODINOSE("L-rhodinose", "OC1CCC(I)OC1C", new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, 
			DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_4_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, 
			DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE }),
	REDNOSE("Rednose", "CC1OC(C(N)=CC1=O)I", new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, 
			DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_4_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, 
			DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE }),
	L_CINERULOSE_B("L-cinerulose B", "CC1OC(I)C(O)CC1=O", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_4_DEHYDRATASE, 
			DeoxySugarDomains._3_KETOREDUCTASE, DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE }),
	O_METHYL_L_AMICETOSE("O-methyl-L-amicetose", "COC1CCC(I)OC1C", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_4_DEHYDRATASE, 
			DeoxySugarDomains._3_KETOREDUCTASE, DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE, 
			DeoxySugarDomains.O_METHYLTRANSFERASE }),
	_4_O_METHYL_L_RHODINOSE("4-O-methyl-L-rhodinose", "COC1CCC(I)OC1C", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_4_DEHYDRATASE, 
			DeoxySugarDomains._3_KETOREDUCTASE, DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE, 
			DeoxySugarDomains.O_METHYLTRANSFERASE }),
	L_DAUNOSAMINE("L-daunosamine", "OC1C(N)CC(I)OC1C", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE, 
			DeoxySugarDomains.EPIMERASE, DeoxySugarDomains._3_AMINOTRANSFERASE }), 
	L_RISTOSAMINE("L-ristosamine", "CC1OC(CC(C1O)N)I", new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE,
			DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE, 
			DeoxySugarDomains._4_AMINOTRANSFERASE }),
	D_DIGITOXOSE("D-digitoxose", "CC1OC(CC(C1O)O)I", new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, 
			DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, DeoxySugarDomains._4_KETOREDUCTASE }),
	L_DIGITOXOSE("L-digitoxose", "CC1OC(CC(C1O)O)I", new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE,  
			DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, DeoxySugarDomains._4_KETOREDUCTASE, 
			DeoxySugarDomains.EPIMERASE }),
	_2_DEOXY_L_FUCOSE("2-deoxy-L-fucose", "CC1OC(CC(C1O)O)I", new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, 
			DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, DeoxySugarDomains._4_KETOREDUCTASE, 
			DeoxySugarDomains.EPIMERASE }),
	D_OLIVOSE("D-olivose", "CC1OC(I)CC(O)C1O", new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, 
			DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, DeoxySugarDomains._4_KETOREDUCTASE, 
			DeoxySugarDomains.EPIMERASE }),
	D_OLIOSE("D-oliose", "CC1OC(I)CC(O)C1O", new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, 
			DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, DeoxySugarDomains._4_KETOREDUCTASE }),
	_4_OXO_L_VANCOSAMINE("4-oxo-L-vancosamine", "NC1(C)CC(I)OC(C)C1=O", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains.EPIMERASE, 
			DeoxySugarDomains._4_AMINOTRANSFERASE, DeoxySugarDomains.C_METHYLTRANSFERASE }),
	D_FOROSAMINE("D-forosamine", "CC1OC(I)CCC1N(C)C", new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, 
			DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_4_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, 
			DeoxySugarDomains._4_AMINOTRANSFERASE, DeoxySugarDomains.N_N_DIMETHYLTRANSFERASE }),//achiral
	L_ACTINOSAMINE("L-actinosamine", "COC1C(OC(CC1N)I)C", new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, 
			DeoxySugarDomains._2_3_DEHYDRATASE }),
	L_VANCOSAMINE("L-vancosamine", "OC1OC(C)C(I)C(N)(C)C1", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE, 
			DeoxySugarDomains.EPIMERASE, DeoxySugarDomains._3_AMINOTRANSFERASE, DeoxySugarDomains.C_METHYLTRANSFERASE }),
	L_VICENISAMINE("L-vicenisamine", "CNC1C(O)CC(I)OC1C", new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, 
			DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, DeoxySugarDomains._4_AMINOTRANSFERASE, 
			DeoxySugarDomains.N_METHYLTRANSFERASE }),
	D_CHALCOSE("D-chalcose", "COC1CC(C)OC(I)C1O", new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, 
			DeoxySugarDomains._3_KETOREDUCTASE, DeoxySugarDomains._4_AMINOTRANSFERASE, 
			DeoxySugarDomains.O_METHYLTRANSFERASE, DeoxySugarDomains.OXIDATIVE_DEAMINASE }),
	D_MYCAROSE("D-mycarose", "CC1OC(I)CC(O)(C)C1O", new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, 
			DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, DeoxySugarDomains._4_KETOREDUCTASE, 
			DeoxySugarDomains.EPIMERASE, DeoxySugarDomains.C_METHYLTRANSFERASE }),
	L_OLEANDROSE("L-oleandrose", "COC1CC(I)OC(C)[C@@H]1O", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, 
			DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE, DeoxySugarDomains.O_METHYLTRANSFERASE }),
	OLIVOMOSE("Olivomose", "COC1C(CC(OC1C)O)I", new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, 
			DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, DeoxySugarDomains._4_KETOREDUCTASE, 
			DeoxySugarDomains.O_METHYLTRANSFERASE }),
	D_MYCOSAMINE("D-mycosamine", "OC1C(N)C(O)C(I)OC1C", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._3_4_ISOMERASE, DeoxySugarDomains._3_AMINOTRANSFERASE, 
			DeoxySugarDomains.O_METHYLTRANSFERASE }),
	_4_DEOXY_4_THIO_D_DIGITOXOSE("4-deoxy-4-thio-D-digitoxose ", "CC1OC(I)CC(O)C1S", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE,
			DeoxySugarDomains.EPIMERASE, DeoxySugarDomains.THIOSUGAR_SYNTHASE }),
	D_FUCOFURANOSE("D-fucofuranose", "CC(O)C1C(O)C(O)C(I)O1", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE }),
	D_FUCOSE("D-fucose", "CC1OC(I)C(O)C(O)C1O", new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, 
			DeoxySugarDomains._4_KETOREDUCTASE }),		
	L_RHAMNOSE("L-rhamnose", "OC1C(O)C(O)C(I)OC1C", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE }),
	_4_N_ETHYL_4_AMINO_3_O_METHOXY_2_4_5_TRIDEOXYPENTOSE("4-N-ethyl-4-amino-3-O-methoxy-2,4,5-trideoxypentose", 
			"CCNC1COC(I)CC1OC", new DeoxySugarDomains[] { DeoxySugarDomains.UDP_DECARBOXYLASE, 
			DeoxySugarDomains.UDP_DEHYDROGENASE, DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, 
			DeoxySugarDomains._4_AMINOTRANSFERASE, DeoxySugarDomains.N_ETHYLTRANSFERASE }),
	D_3_N_METHYL_4_O_METHYL_L_RISTOSAMINE("D-3-N-methyl-4-O-methyl-L-ristosamine", "CNC1CC(I)OC(C)C1OC", 
			new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, 
			DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE, DeoxySugarDomains._4_AMINOTRANSFERASE,
			DeoxySugarDomains.N_METHYLTRANSFERASE, DeoxySugarDomains.O_METHYLTRANSFERASE }),
	N_N_DIMETHYL_L_PYRROLOSAMINE("N,N-dimethyl-L-pyrrolosamine", "CC1OC(CC(C1N(C)C)O)I", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, 
			DeoxySugarDomains._3_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE, DeoxySugarDomains._4_AMINOTRANSFERASE,
			DeoxySugarDomains.N_N_DIMETHYLTRANSFERASE }),	
	D_DESOSAMINE("D-desosamine", "CN(C1CC(C)OC(I)C1O)C", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._3_4_DEHYDRATASE, DeoxySugarDomains._3_AMINOTRANSFERASE, 
			DeoxySugarDomains.N_N_DIMETHYLTRANSFERASE, DeoxySugarDomains.OXIDATIVE_DEAMINASE }),
	L_MEGOSAMINE("L-megosamine", "CN(C1CC(I)OC(C)C1O)C", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE, 
			DeoxySugarDomains.EPIMERASE, DeoxySugarDomains._3_AMINOTRANSFERASE, DeoxySugarDomains.N_N_DIMETHYLTRANSFERASE }),
	NOGALAMINE("Nogalamine", "IC1OC(C)C(O)C(N(C)C)C1O", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE, 
			DeoxySugarDomains.EPIMERASE, DeoxySugarDomains._3_AMINOTRANSFERASE, DeoxySugarDomains.N_N_DIMETHYLTRANSFERASE }), 
			//same as megosamine!
	L_RHODOSAMINE("L-rhodosamine", "CC1OC(I)CC(C1O)N(C)C", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE, 
			DeoxySugarDomains.EPIMERASE, DeoxySugarDomains._3_AMINOTRANSFERASE, DeoxySugarDomains.N_N_DIMETHYLTRANSFERASE }),	
	D_ANGOLOSAMINE("D-angolosamine", "CN(C)C1CC(I)OC(C)C1O", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE, 
			DeoxySugarDomains._3_AMINOTRANSFERASE, DeoxySugarDomains.N_N_DIMETHYLTRANSFERASE }),
	KEDAROSAMINE("Kedarosamine", "IC1OC(C)C(N(C)C)C(O)C1", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, 
			DeoxySugarDomains._4_AMINOTRANSFERASE, DeoxySugarDomains.N_N_DIMETHYLTRANSFERASE }),
	L_NOVIOSE("L-noviose", "CC1(C(O)C(O)C(O)C(O1)I)C", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE, 
			DeoxySugarDomains.C_METHYLTRANSFERASE }),
	L_CLADINOSE("L-cladinose", "OC1C(C)OC(I)CC1(C)OC", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, 
			DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE, DeoxySugarDomains.C_METHYLTRANSFERASE, 
			DeoxySugarDomains.O_METHYLTRANSFERASE }),
	_2_N_METHYL_D_FUCOSAMINE("2'-N-methyl-D-fucosamine", "CNC1C(I)OC(C)C(O)C1O", 
			new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, 
			DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.N_METHYLTRANSFERASE }),
	D_DIGITALOSE("D-digitalose", "COC1C(O)C(C)OC(I)C1O", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.O_METHYLTRANSFERASE }),
	_3_O_METHYL_RHAMNOSE("3-O-methyl-rhamnose", "COC1C(O)C(C)OC(I)C1O", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE, 
			DeoxySugarDomains.O_METHYLTRANSFERASE }),
	_2_O_METHYL_RHAMNOSE("2-O-methyl-rhamnose", "COC1C(I)OC(C)C(O)C1O", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE, 
			DeoxySugarDomains.O_METHYLTRANSFERASE }),
	_6_DEOXY_3_C_METHYL_L_MANNOSE("6-deoxy-3-C-methyl-L-mannose", "OC1(C)C(O)C(I)OC(C)C1O", 
			new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE, 
			DeoxySugarDomains.EPIMERASE, DeoxySugarDomains.C_METHYLTRANSFERASE }),
	_4_6_DIDEOXY_4_HYDROXYLAMINO_D_GLUCOSE("4,6-dideoxy-4-hydroxylamino-D-glucose", "CC1OC(C(C(C1NO)O)O)I", 
			new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._4_AMINOTRANSFERASE }),
	_3_N_N_DIMETHYL_L_EREMOSAMINE("3-N,N-dimethyl-L-eremosamine", "IC1CC(C(O)C(C)O1)(C)N(C)C", 
			new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, 
			DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE, DeoxySugarDomains.C_METHYLTRANSFERASE, 
			DeoxySugarDomains.N_N_DIMETHYLTRANSFERASE }),
	CHROMOSE("Chromose (4-O-acetyl-beta-D-oliose)", "CC1OC(CC(C1OC(C)=O)O)I", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE,
			DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.ACETYLTRANSFERASE }), 
	D_RAVIDOSAMINE("D-ravidosamine", "CN(C1C(O)C(I)OC(C)C1O)C", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._3_4_ISOMERASE, DeoxySugarDomains._3_AMINOTRANSFERASE,
			DeoxySugarDomains.N_N_DIMETHYLTRANSFERASE }),
	MYCAMINOSE("3-N,N-dimethyl-D-mycosamine", "CN(C1C(O)C(I)OC(C)C1O)C", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._3_4_ISOMERASE, DeoxySugarDomains._3_AMINOTRANSFERASE,
			DeoxySugarDomains.N_N_DIMETHYLTRANSFERASE }),
	_2_3_O_DIMETHYL_L_RHAMNOSE("2,3-O-dimethyl-L-rhamnose", "COC1C(I)OC(C)C(O)C1OC", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE,
			DeoxySugarDomains.O_METHYLTRANSFERASE }),
	_2_4_O_DIMETHYL_L_RHAMNOSE("2,4-O-dimethyl-L-rhamnose", "COC1C(C)OC(I)C(OC)C1O", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE,
			DeoxySugarDomains.O_METHYLTRANSFERASE }),
	_3_4_O_DIMETHYL_L_RHAMNOSE("3,4-O-dimethyl-L-rhamnose", "COC1C(C)OC(I)C(O)C1OC", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE,
			DeoxySugarDomains.O_METHYLTRANSFERASE }),
//	_2_THIOGLUCOSE("2-thioglucose", "IC1C(S)C(O)C(O)C(CO)O1", new DeoxySugarDomains[] { 
//			DeoxySugarDomains.THIOSUGAR_SYNTHASE }),
	OLIVOMYCOSE("Olivomycose", "OC1(C)CC(I)OC(C)C1OC(C)=O", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, 
			DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE, DeoxySugarDomains.C_METHYLTRANSFERASE, 
			DeoxySugarDomains.ACETYLTRANSFERASE }),
	_4_N_N_DIMETHYLAMINO_4_DEOXY_5_C_METHYL_L_RHAMNOSE("4-N,N-dimethylamino-4-deoxy-5-C-methyl-l-rhamnose", 
			"CN(C1C(C(C(OC1(C)C)I)O)O)C", new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, 
			DeoxySugarDomains.EPIMERASE, DeoxySugarDomains._4_AMINOTRANSFERASE, DeoxySugarDomains.C_METHYLTRANSFERASE, 
			DeoxySugarDomains.N_N_DIMETHYLTRANSFERASE, DeoxySugarDomains.ACETYLTRANSFERASE }),
	_2_3_4_TRI_O_METHYLRHAMNOSE("2,3,4-tri-O-methylrhamnose", "COC1C(C)OC(I)C(OC)C1OC", 
			new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE, 
			DeoxySugarDomains.EPIMERASE, DeoxySugarDomains.O_METHYLTRANSFERASE }),
	_4_O_ACETYL_L_ARCANOSE("4-O-acetyl-L-arcanose", "IC1CC(OC)(C)C(OC(C)=O)C(C)O1", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, 
			DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE, DeoxySugarDomains.C_METHYLTRANSFERASE, 
			DeoxySugarDomains.O_METHYLTRANSFERASE, DeoxySugarDomains.ACETYLTRANSFERASE }),
	_3_N_ACETYL_D_RAVIDOSAMINE("3-N-acetyl-D-ravidosamine", "CC(N(C1C(O)C(I)OC(C)C1OC(C)=O)C)=O", 
			new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._3_4_ISOMERASE, 
			DeoxySugarDomains._3_AMINOTRANSFERASE,DeoxySugarDomains.N_N_DIMETHYLTRANSFERASE, 
			DeoxySugarDomains.ACETYLTRANSFERASE }),
	L_NOGALOSE("L-nogalose", "COC1C(OC(C(C1(OC)C)OC)I)C", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE,
			DeoxySugarDomains.C_METHYLTRANSFERASE, DeoxySugarDomains.O_METHYLTRANSFERASE }),
	_4_O_ACETYL_D_RAVIDOSAMINE("4-O-acetyl-D-ravidosamine", "CN(C1[C@@H](O)[C@@H](I)OC(C)C1OC(C)=O)C", 
			new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._3_4_ISOMERASE, 
			DeoxySugarDomains._3_AMINOTRANSFERASE,DeoxySugarDomains.N_N_DIMETHYLTRANSFERASE, 
			DeoxySugarDomains.ACETYLTRANSFERASE }),
	_4_O_METHYL_L_NOVIOSE("4-O-methyl-L-noviose", "CC1(C)[C@H](OC)C(O)C(O)C(I)O1", 
			new DeoxySugarDomains[] { DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._2_3_DEHYDRATASE, 
			DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.C_METHYLTRANSFERASE, DeoxySugarDomains.O_METHYLTRANSFERASE }),
	_3_N_ACETYL_4_O_ACETYL_D_RAVIDOSAMINE("3-N-acetyl-4-O-acetyl-D-ravidosamine", 
			"CC(N(C1[C@@H](O)[C@@H](I)OC(C)C1OC(C)=O)C)=O", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._3_4_ISOMERASE, DeoxySugarDomains._3_AMINOTRANSFERASE, 
			DeoxySugarDomains.N_N_DIMETHYLTRANSFERASE, DeoxySugarDomains.ACETYLTRANSFERASE }),
	_3_5_METHYL_2_PYRROLYLCARBONYL_4_O_METHYL_L_NOVIOSE("3-(5'-methyl-2'-pyrrolylcarbonyl-)4-O-methyl-L-noviose", 
			"COC1C(OC(C2=CC=C(C)N2)=O)C(O)C(I)OC1(C)C", new DeoxySugarDomains[] { 
			DeoxySugarDomains._4_6_DEHYDRATASE, DeoxySugarDomains._4_KETOREDUCTASE, DeoxySugarDomains.EPIMERASE, 
			DeoxySugarDomains.C_METHYLTRANSFERASE, DeoxySugarDomains.O_METHYLTRANSFERASE, 
			DeoxySugarDomains.PYRROLYLTRANSFERASE }),
	MADUROSE("Madurose", "IC1C(O)C(O)(C)C(N)CO1", new DeoxySugarDomains[] { DeoxySugarDomains.UDP_DECARBOXYLASE,
			DeoxySugarDomains.UDP_DEHYDROGENASE, DeoxySugarDomains._4_AMINOTRANSFERASE, DeoxySugarDomains.C_METHYLTRANSFERASE }),
	_4_N_METHYL_4_AMINO_3_O_METHOXY_2_4_5_TRIDEOXYPENTOSE("4-N-methyl-4-amino-3-O-methoxy-2,4,5-trideoxypentose", 
			"IC1CC(OC)[C@H](CO1)NC", new DeoxySugarDomains[] { DeoxySugarDomains.UDP_DECARBOXYLASE, 
			DeoxySugarDomains.UDP_DEHYDROGENASE, DeoxySugarDomains._2_3_DEHYDRATASE, DeoxySugarDomains._3_KETOREDUCTASE, 
			DeoxySugarDomains._4_AMINOTRANSFERASE, DeoxySugarDomains.N_METHYLTRANSFERASE });
				
	private final String name;
	private final String smiles;
	private final DeoxySugarDomains[] genes;
	
	private DeoxySugars(final String name, final String smiles, final DeoxySugarDomains[] genes) {
		this.name = name;
		this.smiles = smiles;
		this.genes = genes;
	}
	
	/**
	 * Get the HTML-friendly name of the sugar. 
	 */
	@Override
	public String toString() {
		return name;
	}
	
	/**
	 * Get the SMILES of a sugar.
	 * @return		sugar SMILES, with attachment site labelled with iodine 
	 */
	public String smiles() {
		return smiles;
	}
	
	/**
	 * Get the sugar biosynthesis gene types required to biosynthesize a particular sugar. 
	 * @return		biosynthetic gene functionalities required for biosynthesis 
	 */
	public DeoxySugarDomains[] genes() {
		return genes;
	}
	
}
