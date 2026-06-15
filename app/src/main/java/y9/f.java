package y9;

import com.ironsource.b9;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
/* compiled from: ByteString.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class f implements Serializable, Comparable<f> {

    /* renamed from: d  reason: collision with root package name */
    static final char[] f33356d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: e  reason: collision with root package name */
    public static final f f33357e = m(new byte[0]);

    /* renamed from: a  reason: collision with root package name */
    final byte[] f33358a;

    /* renamed from: b  reason: collision with root package name */
    transient int f33359b;

    /* renamed from: c  reason: collision with root package name */
    transient String f33360c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(byte[] bArr) {
        this.f33358a = bArr;
    }

    static int b(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            if (i12 == i10) {
                return i11;
            }
            int codePointAt = str.codePointAt(i11);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i12++;
            i11 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    public static f d(String str) {
        if (str != null) {
            byte[] a10 = b.a(str);
            if (a10 != null) {
                return new f(a10);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    public static f f(String str) {
        if (str != null) {
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    bArr[i10] = (byte) ((g(str.charAt(i11)) << 4) + g(str.charAt(i11 + 1)));
                }
                return m(bArr);
            }
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
        throw new IllegalArgumentException("hex == null");
    }

    private static int g(char c10) {
        if (c10 < '0' || c10 > '9') {
            char c11 = 'a';
            if (c10 < 'a' || c10 > 'f') {
                c11 = 'A';
                if (c10 < 'A' || c10 > 'F') {
                    throw new IllegalArgumentException("Unexpected hex digit: " + c10);
                }
            }
            return (c10 - c11) + 10;
        }
        return c10 - '0';
    }

    private f h(String str) {
        try {
            return m(MessageDigest.getInstance(str).digest(this.f33358a));
        } catch (NoSuchAlgorithmException e8) {
            throw new AssertionError(e8);
        }
    }

    public static f i(String str) {
        if (str != null) {
            f fVar = new f(str.getBytes(u.f33401a));
            fVar.f33360c = str;
            return fVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static f m(byte... bArr) {
        if (bArr != null) {
            return new f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String a() {
        return b.b(this.f33358a);
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(f fVar) {
        int r10 = r();
        int r11 = fVar.r();
        int min = Math.min(r10, r11);
        for (int i10 = 0; i10 < min; i10++) {
            int j10 = j(i10) & 255;
            int j11 = fVar.j(i10) & 255;
            if (j10 != j11) {
                return j10 < j11 ? -1 : 1;
            }
        }
        if (r10 == r11) {
            return 0;
        }
        return r10 < r11 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int r10 = fVar.r();
            byte[] bArr = this.f33358a;
            if (r10 == bArr.length && fVar.o(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f33359b;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.f33358a);
        this.f33359b = hashCode;
        return hashCode;
    }

    public byte j(int i10) {
        return this.f33358a[i10];
    }

    public String k() {
        byte[] bArr = this.f33358a;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f33356d;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public f l() {
        return h("MD5");
    }

    public boolean n(int i10, f fVar, int i11, int i12) {
        return fVar.o(i11, this.f33358a, i10, i12);
    }

    public boolean o(int i10, byte[] bArr, int i11, int i12) {
        if (i10 >= 0) {
            byte[] bArr2 = this.f33358a;
            if (i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && u.a(bArr2, i10, bArr, i11, i12)) {
                return true;
            }
        }
        return false;
    }

    public f p() {
        return h(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    public f q() {
        return h("SHA-256");
    }

    public int r() {
        return this.f33358a.length;
    }

    public final boolean s(f fVar) {
        return n(0, fVar, 0, fVar.r());
    }

    public f t(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.f33358a;
            if (i11 > bArr.length) {
                throw new IllegalArgumentException("endIndex > length(" + this.f33358a.length + ")");
            }
            int i12 = i11 - i10;
            if (i12 >= 0) {
                if (i10 == 0 && i11 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i10, bArr2, 0, i12);
                return new f(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public String toString() {
        if (this.f33358a.length == 0) {
            return "[size=0]";
        }
        String w10 = w();
        int b10 = b(w10, 64);
        if (b10 == -1) {
            if (this.f33358a.length <= 64) {
                return "[hex=" + k() + b9.i.f16698e;
            }
            return "[size=" + this.f33358a.length + " hex=" + t(0, 64).k() + "…]";
        }
        String replace = w10.substring(0, b10).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (b10 < w10.length()) {
            return "[size=" + this.f33358a.length + " text=" + replace + "…]";
        }
        return "[text=" + replace + b9.i.f16698e;
    }

    public f u() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f33358a;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArr2.length; i11++) {
                    byte b11 = bArr2[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArr2[i11] = (byte) (b11 + 32);
                    }
                }
                return new f(bArr2);
            }
            i10++;
        }
    }

    public byte[] v() {
        return (byte[]) this.f33358a.clone();
    }

    public String w() {
        String str = this.f33360c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f33358a, u.f33401a);
        this.f33360c = str2;
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(c cVar) {
        byte[] bArr = this.f33358a;
        cVar.t0(bArr, 0, bArr.length);
    }
}
