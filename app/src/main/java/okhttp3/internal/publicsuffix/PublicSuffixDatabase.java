package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import o9.c;
import v9.g;
import y9.e;
import y9.j;
import y9.l;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f29493e = {42};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f29494f = new String[0];

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f29495g = {"*"};

    /* renamed from: h  reason: collision with root package name */
    private static final PublicSuffixDatabase f29496h = new PublicSuffixDatabase();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f29497a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final CountDownLatch f29498b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    private byte[] f29499c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f29500d;

    private static String a(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = (i14 + length) / 2;
            while (i15 > -1 && bArr[i15] != 10) {
                i15--;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i11 = i16 + i17;
                if (bArr[i11] == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i11 - i16;
            int i19 = i10;
            boolean z11 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z11) {
                    i12 = 46;
                    z10 = false;
                } else {
                    z10 = z11;
                    i12 = bArr2[i19][i20] & 255;
                }
                i13 = i12 - (bArr[i16 + i21] & 255);
                if (i13 == 0) {
                    i21++;
                    i20++;
                    if (i21 == i18) {
                        break;
                    } else if (bArr2[i19].length != i20) {
                        z11 = z10;
                    } else if (i19 == bArr2.length - 1) {
                        break;
                    } else {
                        i19++;
                        i20 = -1;
                        z11 = true;
                    }
                } else {
                    break;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i22 = i18 - i21;
                    int length2 = bArr2[i19].length - i20;
                    while (true) {
                        i19++;
                        if (i19 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i19].length;
                    }
                    if (length2 >= i22) {
                        if (length2 <= i22) {
                            return new String(bArr, i16, i18, c.f29481j);
                        }
                    }
                }
                i14 = i11 + 1;
            }
            length = i16 - 1;
        }
        return null;
    }

    private String[] b(String[] strArr) {
        String str;
        String str2;
        String str3;
        String[] strArr2;
        String[] strArr3;
        int i10 = 0;
        if (!this.f29497a.get() && this.f29497a.compareAndSet(false, true)) {
            f();
        } else {
            try {
                this.f29498b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        synchronized (this) {
            if (this.f29499c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            bArr[i11] = strArr[i11].getBytes(c.f29481j);
        }
        int i12 = 0;
        while (true) {
            str = null;
            if (i12 >= length) {
                str2 = null;
                break;
            }
            str2 = a(this.f29499c, bArr, i12);
            if (str2 != null) {
                break;
            }
            i12++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i13 = 0; i13 < bArr2.length - 1; i13++) {
                bArr2[i13] = f29493e;
                str3 = a(this.f29499c, bArr2, i13);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i10 >= length - 1) {
                    break;
                }
                String a10 = a(this.f29500d, bArr, i10);
                if (a10 != null) {
                    str = a10;
                    break;
                }
                i10++;
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        } else if (str2 == null && str3 == null) {
            return f29495g;
        } else {
            if (str2 != null) {
                strArr2 = str2.split("\\.");
            } else {
                strArr2 = f29494f;
            }
            if (str3 != null) {
                strArr3 = str3.split("\\.");
            } else {
                strArr3 = f29494f;
            }
            return strArr2.length > strArr3.length ? strArr2 : strArr3;
        }
    }

    public static PublicSuffixDatabase c() {
        return f29496h;
    }

    private void e() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        e d10 = l.d(new j(l.k(resourceAsStream)));
        try {
            byte[] bArr = new byte[d10.readInt()];
            d10.readFully(bArr);
            byte[] bArr2 = new byte[d10.readInt()];
            d10.readFully(bArr2);
            synchronized (this) {
                this.f29499c = bArr;
                this.f29500d = bArr2;
            }
            this.f29498b.countDown();
        } finally {
            c.g(d10);
        }
    }

    private void f() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    e();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e8) {
                    g.l().t(5, "Failed to read public suffix list", e8);
                    if (z10) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public String d(String str) {
        int length;
        int length2;
        Objects.requireNonNull(str, "domain == null");
        String[] split = IDN.toUnicode(str).split("\\.");
        String[] b10 = b(split);
        if (split.length != b10.length || b10[0].charAt(0) == '!') {
            if (b10[0].charAt(0) == '!') {
                length = split.length;
                length2 = b10.length;
            } else {
                length = split.length;
                length2 = b10.length + 1;
            }
            StringBuilder sb = new StringBuilder();
            String[] split2 = str.split("\\.");
            for (int i10 = length - length2; i10 < split2.length; i10++) {
                sb.append(split2[i10]);
                sb.append('.');
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        return null;
    }
}
