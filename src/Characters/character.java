package Characters;

public class character {
	// HP > STR > DEX > CON > INT > WIS > AC > FORT > REFL > SAVE > PERCEPTION 
	private String chName;
	private int HP;
	private int chSTR;
	private int chDEX;
	private int chCON;
	private int chINT;
	private int chWIS;
	private int chAC;
	private int chFORT;
	private int chREFL;
	private int chSAVE;
	private int chPERC;
	private int level;
	private int xp;
	
	public character(String name, int HP, int STR, int DEX, int CON, int INT, int WIS, int AC,
			int FORT, int REFL, int SAVE, int PERC, int level, int xp) {
		chName = name;
		this.HP = HP;
		chSTR = STR;
		chDEX = DEX; 
		chCON = CON;
		chINT = INT;
		chWIS = WIS;
		chAC = AC;
		chFORT = FORT;
		chREFL = REFL; 
		chSAVE = SAVE;
		chPERC = PERC;
		this.level = level;
		this.xp = xp;
	}

	public String getChName() {
		return chName;
	}

	public void setChName(String chName) {
		this.chName = chName;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getChSTR() {
		return chSTR;
	}

	public void setChSTR(int chSTR) {
		this.chSTR = chSTR;
	}

	public int getChDEX() {
		return chDEX;
	}

	public void setChDEX(int chDEX) {
		this.chDEX = chDEX;
	}

	public int getChCON() {
		return chCON;
	}

	public void setChCON(int chCON) {
		this.chCON = chCON;
	}

	public int getChINT() {
		return chINT;
	}

	public void setChINT(int chINT) {
		this.chINT = chINT;
	}

	public int getChWIS() {
		return chWIS;
	}

	public void setChWIS(int chWIS) {
		this.chWIS = chWIS;
	}

	public int getChAC() {
		return chAC;
	}

	public void setChAC(int chAC) {
		this.chAC = chAC;
	}

	public int getChFORT() {
		return chFORT;
	}

	public void setChFORT(int chFORT) {
		this.chFORT = chFORT;
	}

	public int getChREFL() {
		return chREFL;
	}

	public void setChREFL(int chREFL) {
		this.chREFL = chREFL;
	}

	public int getChSAVE() {
		return chSAVE;
	}

	public void setChSAVE(int chSAVE) {
		this.chSAVE = chSAVE;
	}

	public int getChPERC() {
		return chPERC;
	}

	public void setChPERC(int chPERC) {
		this.chPERC = chPERC;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}
	

}
