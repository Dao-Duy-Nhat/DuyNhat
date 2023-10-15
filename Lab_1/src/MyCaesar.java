
public class MyCaesar {
    public static final char[] ALPHABET = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
        'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    private int n;

    public MyCaesar(int soBuocDich) {
        this.n = soBuocDich;
    }

 // Encrypt a character according to the given shif steps.
 // Encrypt: En(x) = (x + n) mod 26. x represents the index of c in the ALPHABET
 // array
    public char encryptChar(char c) {
        if (Character.isLetter(c)) {
            char upperC = Character.toUpperCase(c);
            int index = (upperC - 'A' + n) % 26; // 
            if (index < 0) {
                index += 26; // Xá»­ lÃ½ giÃ¡ trá»‹ Ã¢m
            }
            return ALPHABET[index];
        } else {
            return c; // Tráº£ láº¡i cÃ¡c kÃ½ tá»± khÃ´ng pháº£i chá»¯ cÃ¡i nguyÃªn váº¹n
        }
    }

 // Encrypt a text using the above function for encrypting a charater.

    public String encrypt(String input) {
        StringBuilder MaHoa = new StringBuilder();
        for (char c : input.toCharArray()) {
            MaHoa.append(encryptChar(c));
        }
        return MaHoa.toString();
    }

 // Decrypt a character according to the given shif steps.
 // Decrypt: Dn(x) = (x â€“ n) mod 26. x represents the index of c in the ALPHABET array

    public char decryptChar(char c) {
        if (Character.isLetter(c)) {
            char upperC = Character.toUpperCase(c);
            int index = (upperC - 'A' - n) % 26;
            if (index < 0) {
                index += 26; 
            }
            return ALPHABET[index];
        } else {
            return c; 
        }
    }

 // Decrypt a encrypted text using the above function for decrypting a charater.

    public String decrypt(String input) {
        StringBuilder GiaiMa = new StringBuilder();
        for (char c : input.toCharArray()) {
            GiaiMa.append(decryptChar(c));
        }
        return GiaiMa.toString();
    }

	public static void main(String[] args) {
		MyCaesar caesar = new MyCaesar(9);

		// Kiá»ƒm tra mÃ£ hÃ³a
		String vanBanGoc = "HELLO WORLD";
		String MaHoa = caesar.encrypt(vanBanGoc);
		System.out.println("Văn bản được mã hóa: " + MaHoa);

		// Kiá»ƒm tra giáº£i mÃ£
		String GiaiMa = caesar.decrypt(MaHoa);
		System.out.println("Văn bản được giải mã: " + GiaiMa);
	}
}
