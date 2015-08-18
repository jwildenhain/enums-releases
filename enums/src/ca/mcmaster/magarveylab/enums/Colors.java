package ca.mcmaster.magarveylab.enums;

public enum Colors {
	
	LIGHT_GREY("#bbbbbb"),
	DARK_GREY("#696969"),
	WHITE("#ffffff"),
	BLACK("#21252B"),
	RED("#FF0000"),
	BLUE("#1D7CF2"),
	YELLOW("#F2A71D"),
	PINK("#E80074"),
	TEAL("#00B1B2"),
	BROWN("#652600"),
	ORANGE("#FF6103"),
	;
	
	private String hex;
	
	private Colors(String hex) {
		this.hex = hex;
	}
	
	public String hex() {
		return hex;
	}

}
