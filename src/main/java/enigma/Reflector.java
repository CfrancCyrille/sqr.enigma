package enigma;

/** Class that represents a reflector in the enigma.
 *  @author
 */
//Creation d'une classe Reflector permettant d'attribuer une valeur � un charact�re
public class Reflector extends Rotor {
	
	int[] reflection;
	
	public static Reflector reflectorFactory(String str){
		char[] s = str.trim().replace(" ", "").toCharArray(); //on enl�ve les espaces dans le tableau de caract�res et on remplace chaque caract�re dans le tableau de caract�re 's'
		int[] cipher = new int[26];
		for (int i = 0; i< 26; i++){
			cipher[i] = toIndex(s[i]); // on a remplacer la valeur de cet index du tableau Cipher par la valeur obtenu par la fonction toIndex
		}
		return new Reflector(cipher);
	}
	
	Reflector(int[] r){
		super(r,0);
		reflection = r;
	}
        
    public int convertForward(int p) {
        return ((reflection[((p)%26+26)%26])%26+26)%26;
    }

    @Override
    public int convertBackward(int unused) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void advance() {
    }

}
