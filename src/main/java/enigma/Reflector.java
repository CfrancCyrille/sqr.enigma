package enigma;

/** Class that represents a reflector in the enigma.
 *  @author
 */
//Creation d'une classe Reflector permettant d'attribuer une valeur à un charactère
public class Reflector extends Rotor {
	
	int[] reflection;
	
	public static Reflector reflectorFactory(String str){
		char[] s = str.trim().replace(" ", "").toCharArray(); //on enlève les espaces dans le tableau de caractères et on remplace chaque caractère dans le tableau de caractère 's'
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
