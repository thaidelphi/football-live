package c4;

import a5.b0;
import a5.c0;
import a5.p0;
import a5.t;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import y3.d;
import y3.f;
/* compiled from: Id3Decoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f5444b = new a() { // from class: c4.a
        @Override // c4.b.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            boolean z10;
            z10 = b.z(i10, i11, i12, i13, i14);
            return z10;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final a f5445a;

    /* compiled from: Id3Decoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Id3Decoder.java */
    /* renamed from: c4.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0110b {

        /* renamed from: a  reason: collision with root package name */
        private final int f5446a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f5447b;

        /* renamed from: c  reason: collision with root package name */
        private final int f5448c;

        public C0110b(int i10, boolean z10, int i11) {
            this.f5446a = i10;
            this.f5447b = z10;
            this.f5448c = i11;
        }
    }

    public b() {
        this(null);
    }

    private static int A(c0 c0Var, int i10) {
        byte[] d10 = c0Var.d();
        int e8 = c0Var.e();
        int i11 = e8;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= e8 + i10) {
                return i10;
            }
            if ((d10[i11] & 255) == 255 && d10[i12] == 0) {
                System.arraycopy(d10, i11 + 2, d10, i12, (i10 - (i11 - e8)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean B(a5.c0 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.e()
        L8:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.n()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.B()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.F()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.C()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.C()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.K(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.K(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = r4
            goto L74
        L73:
            r3 = r6
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L79
            goto L8b
        L79:
            r4 = r6
            goto L8b
        L7b:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L79
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L98
            r1.K(r2)
            return r6
        L98:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.K(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.L(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.K(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.K(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.b.B(a5.c0, int, int, boolean):boolean");
    }

    private static byte[] d(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return p0.f487f;
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    private static ApicFrame f(c0 c0Var, int i10, int i11) throws UnsupportedEncodingException {
        int y10;
        String str;
        int z10 = c0Var.z();
        String v10 = v(z10);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        c0Var.j(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + x5.a.e(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            y10 = 2;
        } else {
            y10 = y(bArr, 0);
            String e8 = x5.a.e(new String(bArr, 0, y10, "ISO-8859-1"));
            if (e8.indexOf(47) == -1) {
                str = "image/" + e8;
            } else {
                str = e8;
            }
        }
        int i13 = y10 + 2;
        int x10 = x(bArr, i13, z10);
        return new ApicFrame(str, new String(bArr, i13, x10 - i13, v10), bArr[y10 + 1] & 255, d(bArr, x10 + u(z10), i12));
    }

    private static BinaryFrame g(c0 c0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        c0Var.j(bArr, 0, i10);
        return new BinaryFrame(str, bArr);
    }

    private static ChapterFrame h(c0 c0Var, int i10, int i11, boolean z10, int i12, a aVar) throws UnsupportedEncodingException {
        int e8 = c0Var.e();
        int y10 = y(c0Var.d(), e8);
        String str = new String(c0Var.d(), e8, y10 - e8, "ISO-8859-1");
        c0Var.K(y10 + 1);
        int n10 = c0Var.n();
        int n11 = c0Var.n();
        long B = c0Var.B();
        long j10 = B == 4294967295L ? -1L : B;
        long B2 = c0Var.B();
        long j11 = B2 == 4294967295L ? -1L : B2;
        ArrayList arrayList = new ArrayList();
        int i13 = e8 + i10;
        while (c0Var.e() < i13) {
            Id3Frame k10 = k(i11, c0Var, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new ChapterFrame(str, n10, n11, j10, j11, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static ChapterTocFrame i(c0 c0Var, int i10, int i11, boolean z10, int i12, a aVar) throws UnsupportedEncodingException {
        int e8 = c0Var.e();
        int y10 = y(c0Var.d(), e8);
        String str = new String(c0Var.d(), e8, y10 - e8, "ISO-8859-1");
        c0Var.K(y10 + 1);
        int z11 = c0Var.z();
        boolean z12 = (z11 & 2) != 0;
        boolean z13 = (z11 & 1) != 0;
        int z14 = c0Var.z();
        String[] strArr = new String[z14];
        for (int i13 = 0; i13 < z14; i13++) {
            int e10 = c0Var.e();
            int y11 = y(c0Var.d(), e10);
            strArr[i13] = new String(c0Var.d(), e10, y11 - e10, "ISO-8859-1");
            c0Var.K(y11 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = e8 + i10;
        while (c0Var.e() < i14) {
            Id3Frame k10 = k(i11, c0Var, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new ChapterTocFrame(str, z12, z13, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static CommentFrame j(c0 c0Var, int i10) throws UnsupportedEncodingException {
        if (i10 < 4) {
            return null;
        }
        int z10 = c0Var.z();
        String v10 = v(z10);
        byte[] bArr = new byte[3];
        c0Var.j(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        c0Var.j(bArr2, 0, i11);
        int x10 = x(bArr2, 0, z10);
        String str2 = new String(bArr2, 0, x10, v10);
        int u10 = x10 + u(z10);
        return new CommentFrame(str, str2, p(bArr2, u10, x(bArr2, u10, z10), v10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0190, code lost:
        if (r13 == 67) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.exoplayer2.metadata.id3.Id3Frame k(int r19, a5.c0 r20, boolean r21, int r22, c4.b.a r23) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.b.k(int, a5.c0, boolean, int, c4.b$a):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    private static GeobFrame l(c0 c0Var, int i10) throws UnsupportedEncodingException {
        int z10 = c0Var.z();
        String v10 = v(z10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c0Var.j(bArr, 0, i11);
        int y10 = y(bArr, 0);
        String str = new String(bArr, 0, y10, "ISO-8859-1");
        int i12 = y10 + 1;
        int x10 = x(bArr, i12, z10);
        String p10 = p(bArr, i12, x10, v10);
        int u10 = x10 + u(z10);
        int x11 = x(bArr, u10, z10);
        return new GeobFrame(str, p10, p(bArr, u10, x11, v10), d(bArr, x11 + u(z10), i11));
    }

    private static C0110b m(c0 c0Var) {
        int C;
        if (c0Var.a() < 10) {
            t.i("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        boolean z10 = false;
        if (c0Var.C() != 4801587) {
            t.i("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(C)));
            return null;
        }
        int z11 = c0Var.z();
        c0Var.L(1);
        int z12 = c0Var.z();
        int y10 = c0Var.y();
        if (z11 == 2) {
            if ((z12 & 64) != 0) {
                t.i("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (z11 == 3) {
            if ((z12 & 64) != 0) {
                int n10 = c0Var.n();
                c0Var.L(n10);
                y10 -= n10 + 4;
            }
        } else if (z11 != 4) {
            t.i("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + z11);
            return null;
        } else {
            if ((z12 & 64) != 0) {
                int y11 = c0Var.y();
                c0Var.L(y11 - 4);
                y10 -= y11;
            }
            if ((z12 & 16) != 0) {
                y10 -= 10;
            }
        }
        if (z11 < 4 && (z12 & 128) != 0) {
            z10 = true;
        }
        return new C0110b(z11, z10, y10);
    }

    private static MlltFrame n(c0 c0Var, int i10) {
        int F = c0Var.F();
        int C = c0Var.C();
        int C2 = c0Var.C();
        int z10 = c0Var.z();
        int z11 = c0Var.z();
        b0 b0Var = new b0();
        b0Var.l(c0Var);
        int i11 = ((i10 - 10) * 8) / (z10 + z11);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int h10 = b0Var.h(z10);
            int h11 = b0Var.h(z11);
            iArr[i12] = h10;
            iArr2[i12] = h11;
        }
        return new MlltFrame(F, C, C2, iArr, iArr2);
    }

    private static PrivFrame o(c0 c0Var, int i10) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        c0Var.j(bArr, 0, i10);
        int y10 = y(bArr, 0);
        return new PrivFrame(new String(bArr, 0, y10, "ISO-8859-1"), d(bArr, y10 + 1, i10));
    }

    private static String p(byte[] bArr, int i10, int i11, String str) throws UnsupportedEncodingException {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    private static TextInformationFrame q(c0 c0Var, int i10, String str) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int z10 = c0Var.z();
        String v10 = v(z10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c0Var.j(bArr, 0, i11);
        return new TextInformationFrame(str, null, new String(bArr, 0, x(bArr, 0, z10), v10));
    }

    private static TextInformationFrame r(c0 c0Var, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int z10 = c0Var.z();
        String v10 = v(z10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c0Var.j(bArr, 0, i11);
        int x10 = x(bArr, 0, z10);
        String str = new String(bArr, 0, x10, v10);
        int u10 = x10 + u(z10);
        return new TextInformationFrame("TXXX", str, p(bArr, u10, x(bArr, u10, z10), v10));
    }

    private static UrlLinkFrame s(c0 c0Var, int i10, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        c0Var.j(bArr, 0, i10);
        return new UrlLinkFrame(str, null, new String(bArr, 0, y(bArr, 0), "ISO-8859-1"));
    }

    private static UrlLinkFrame t(c0 c0Var, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int z10 = c0Var.z();
        String v10 = v(z10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c0Var.j(bArr, 0, i11);
        int x10 = x(bArr, 0, z10);
        String str = new String(bArr, 0, x10, v10);
        int u10 = x10 + u(z10);
        return new UrlLinkFrame("WXXX", str, p(bArr, u10, y(bArr, u10), "ISO-8859-1"));
    }

    private static int u(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static String v(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static String w(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int x(byte[] bArr, int i10, int i11) {
        int y10 = y(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return y10;
        }
        while (y10 < bArr.length - 1) {
            if ((y10 - i10) % 2 == 0 && bArr[y10 + 1] == 0) {
                return y10;
            }
            y10 = y(bArr, y10 + 1);
        }
        return bArr.length;
    }

    private static int y(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean z(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // y3.f
    protected Metadata b(d dVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public Metadata e(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        c0 c0Var = new c0(bArr, i10);
        C0110b m7 = m(c0Var);
        if (m7 == null) {
            return null;
        }
        int e8 = c0Var.e();
        int i11 = m7.f5446a == 2 ? 6 : 10;
        int i12 = m7.f5448c;
        if (m7.f5447b) {
            i12 = A(c0Var, m7.f5448c);
        }
        c0Var.J(e8 + i12);
        boolean z10 = false;
        if (!B(c0Var, m7.f5446a, i11, false)) {
            if (m7.f5446a != 4 || !B(c0Var, 4, i11, true)) {
                t.i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m7.f5446a);
                return null;
            }
            z10 = true;
        }
        while (c0Var.a() >= i11) {
            Id3Frame k10 = k(m7.f5446a, c0Var, z10, i11, this.f5445a);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new Metadata(arrayList);
    }

    public b(a aVar) {
        this.f5445a = aVar;
    }
}
