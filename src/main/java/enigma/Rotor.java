package enigma;

public class Rotor {

    private int position;
    private int[] cipher = new int[26];
    private int[] bcipher = new int[26];
    private int notch1 = -1;
    private int notch2 = -1;

    public int getPosition() {
        return position;
    }

    // Defini la position du Rotor
    public void setPosition(int posn) {
        position = posn;
    }
    
	public static Rotor rotorFactory(String str, String notches){
		char[] s = str.trim().replace(" ", "").toCharArray();  //on enlève les espaces dans le tableau de caractères et on remplace chaque caractère dans le tableau de caractère 's'
		int[] cipher = new int[26];
		for (int i = 0; i< 26; i++){
			cipher[i] = toIndex(s[i]);
		}
		s = notches.trim().replace(" and ", "").toCharArray();//On enlève les 'and' du string et on remplace les caractères  dans le tableau de caractères
		if (s.length == 2){
			return new Rotor(cipher, toIndex(s[0]), toIndex(s[1])); //Si le tableau de chaine de caractère à une taille de 2  
		} else {
			return new Rotor(cipher, toIndex(s[0]));
		}
		
	}
	
	Rotor(int[] c, int notch1, int notch2) {
		this.notch1 = notch1;
		this.notch2 = notch2;
		cipher = c;
		createBCipher();
	}
	
	Rotor(int[] c, int notch1) {
		this.notch1 = notch1;
		cipher = c;
		createBCipher();
	}

    public int convertForward(int p) {
        return ((cipher[((p+position)%26+26)%26]-position)%26+26)%26; //convertie la position en avant
    }

    public int convertBackward(int e) {
        return ((bcipher[((e+position)%26+26)%26]-position)%26+26)%26; //convertie la position en arrière
    }
    
    public void advance() {
        position = (position+1) % 26;
    }
    
    protected boolean atNotch() {
        return (position == notch1 || position == notch2);
    }

    protected static char toLetter(int p) {
        return (char)(p + 'A');
    }

    protected static int toIndex(char c) {
        return c - 'A';
    }
    
	private void createBCipher() {
		for(int i =0; i<26; i++)
			bcipher[cipher[i]] = i;
	}



}
