
package pe.com.pivo.seguridad.util;

import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class EncriptaUtils
{
	private static final String ALGORITHM = "DESede";
	private static final String SECRET_KEY = "pivoSecurity";

	public static String encriptar(String texto) throws Exception
	{

		String base64EncryptedString = "";

		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] digestOfPassword = md.digest(SECRET_KEY.getBytes("utf-8"));
		byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);

		SecretKey key = new SecretKeySpec(keyBytes, ALGORITHM);
		Cipher cipher = Cipher.getInstance(ALGORITHM);
		cipher.init(Cipher.ENCRYPT_MODE, key);

		byte[] plainTextBytes = texto.getBytes("utf-8");
		byte[] buf = cipher.doFinal(plainTextBytes);
		byte[] base64Bytes = Base64.encodeBase64(buf);
		base64EncryptedString = new String(base64Bytes);

		return base64EncryptedString;
	}

	public static String desencriptar(String textoEncriptado) throws Exception
	{
		String base64EncryptedString = "";
		byte[] message = Base64.decodeBase64(textoEncriptado.getBytes("utf-8"));
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] digestOfPassword = md.digest(SECRET_KEY.getBytes("utf-8"));
		byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
		SecretKey key = new SecretKeySpec(keyBytes, "DESede");

		Cipher decipher = Cipher.getInstance("DESede");
		decipher.init(Cipher.DECRYPT_MODE, key);

		byte[] plainText = decipher.doFinal(message);

		base64EncryptedString = new String(plainText, "UTF-8");

		return base64EncryptedString;
	}
	
	public static boolean esEcriptacionValida( String textoEncriptado )
	{
		try
		{
			desencriptar(textoEncriptado);
		}
		catch (Exception e)
		{
			return false;
		}
		
		return true;
	}
	
}
