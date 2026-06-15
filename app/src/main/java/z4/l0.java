package z4;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: MCrypt.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l0 {

    /* renamed from: f  reason: collision with root package name */
    public static String f33541f = "http://api.appscdnfree.com/ads/api_v1/mediation/ads/metedata/config/";

    /* renamed from: g  reason: collision with root package name */
    public static String f33542g = "http://api.appscdn.com/ads/api_v1/mediation/ads/metedata/config/";

    /* renamed from: d  reason: collision with root package name */
    private Cipher f33546d;

    /* renamed from: a  reason: collision with root package name */
    private String f33543a = "g4fst5gpd5f5r7j4";

    /* renamed from: e  reason: collision with root package name */
    private String f33547e = "1g2j4d5rb56s39wc";

    /* renamed from: b  reason: collision with root package name */
    private IvParameterSpec f33544b = new IvParameterSpec(this.f33543a.getBytes());

    /* renamed from: c  reason: collision with root package name */
    private SecretKeySpec f33545c = new SecretKeySpec(this.f33547e.getBytes(), "AES");

    public l0() {
        try {
            this.f33546d = Cipher.getInstance("AES/CBC/NoPadding");
        } catch (NoSuchAlgorithmException e8) {
            e8.printStackTrace();
        } catch (NoSuchPaddingException e10) {
            e10.printStackTrace();
        }
    }

    public static byte[] b(String str) {
        if (str != null && str.length() >= 2) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) Integer.parseInt(str.substring(i11, i11 + 2), 16);
            }
            return bArr;
        }
        return null;
    }

    public byte[] a(String str) throws Exception {
        if (str != null && str.length() != 0) {
            try {
                this.f33546d.init(2, this.f33545c, this.f33544b);
                return this.f33546d.doFinal(b(str));
            } catch (Exception e8) {
                throw new Exception("[decrypt] " + e8.getMessage());
            }
        }
        throw new Exception("Empty string");
    }
}
