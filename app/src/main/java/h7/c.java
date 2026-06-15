package h7;

import com.ironsource.b9;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;
/* compiled from: JsonWriter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c implements Closeable, Flushable {

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f26256j = new String[128];

    /* renamed from: k  reason: collision with root package name */
    private static final String[] f26257k;

    /* renamed from: a  reason: collision with root package name */
    private final Writer f26258a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f26259b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    private int f26260c = 0;

    /* renamed from: d  reason: collision with root package name */
    private String f26261d;

    /* renamed from: e  reason: collision with root package name */
    private String f26262e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f26263f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f26264g;

    /* renamed from: h  reason: collision with root package name */
    private String f26265h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f26266i;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f26256j[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f26256j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f26257k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        R(6);
        this.f26262e = ":";
        this.f26266i = true;
        Objects.requireNonNull(writer, "out == null");
        this.f26258a = writer;
    }

    private void J() throws IOException {
        if (this.f26261d == null) {
            return;
        }
        this.f26258a.write("\n");
        int i10 = this.f26260c;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f26258a.write(this.f26261d);
        }
    }

    private void J0() throws IOException {
        if (this.f26265h != null) {
            a();
            z0(this.f26265h);
            this.f26265h = null;
        }
    }

    private c L(int i10, String str) throws IOException {
        b();
        R(i10);
        this.f26258a.write(str);
        return this;
    }

    private int P() {
        int i10 = this.f26260c;
        if (i10 != 0) {
            return this.f26259b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void R(int i10) {
        int i11 = this.f26260c;
        int[] iArr = this.f26259b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[i11 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f26259b = iArr2;
        }
        int[] iArr3 = this.f26259b;
        int i12 = this.f26260c;
        this.f26260c = i12 + 1;
        iArr3[i12] = i10;
    }

    private void S(int i10) {
        this.f26259b[this.f26260c - 1] = i10;
    }

    private void a() throws IOException {
        int P = P();
        if (P == 5) {
            this.f26258a.write(44);
        } else if (P != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        J();
        S(4);
    }

    private void b() throws IOException {
        int P = P();
        if (P == 1) {
            S(2);
            J();
        } else if (P == 2) {
            this.f26258a.append(',');
            J();
        } else if (P != 4) {
            if (P != 6) {
                if (P == 7) {
                    if (!this.f26263f) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                } else {
                    throw new IllegalStateException("Nesting problem.");
                }
            }
            S(7);
        } else {
            this.f26258a.append((CharSequence) this.f26262e);
            S(5);
        }
    }

    private c k(int i10, int i11, String str) throws IOException {
        int P = P();
        if (P != i11 && P != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f26265h == null) {
            this.f26260c--;
            if (P == i11) {
                J();
            }
            this.f26258a.write(str);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f26265h);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void z0(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f26264g
            if (r0 == 0) goto L7
            java.lang.String[] r0 = h7.c.f26257k
            goto L9
        L7:
            java.lang.String[] r0 = h7.c.f26256j
        L9:
            java.io.Writer r1 = r8.f26258a
            java.lang.String r2 = "\""
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f26258a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f26258a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f26258a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f26258a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.c.z0(java.lang.String):void");
    }

    public c C0(long j10) throws IOException {
        J0();
        b();
        this.f26258a.write(Long.toString(j10));
        return this;
    }

    public c D0(Boolean bool) throws IOException {
        if (bool == null) {
            return K();
        }
        J0();
        b();
        this.f26258a.write(bool.booleanValue() ? com.ironsource.mediationsdk.metadata.a.f18924g : "false");
        return this;
    }

    public final boolean E() {
        return this.f26264g;
    }

    public boolean F() {
        return this.f26263f;
    }

    public c G(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f26265h == null) {
            if (this.f26260c != 0) {
                this.f26265h = str;
                return this;
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new IllegalStateException();
    }

    public c G0(Number number) throws IOException {
        if (number == null) {
            return K();
        }
        J0();
        String obj = number.toString();
        if (!this.f26263f && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        b();
        this.f26258a.append((CharSequence) obj);
        return this;
    }

    public c H0(String str) throws IOException {
        if (str == null) {
            return K();
        }
        J0();
        b();
        z0(str);
        return this;
    }

    public c I0(boolean z10) throws IOException {
        J0();
        b();
        this.f26258a.write(z10 ? com.ironsource.mediationsdk.metadata.a.f18924g : "false");
        return this;
    }

    public c K() throws IOException {
        if (this.f26265h != null) {
            if (this.f26266i) {
                J0();
            } else {
                this.f26265h = null;
                return this;
            }
        }
        b();
        this.f26258a.write("null");
        return this;
    }

    public final void X(boolean z10) {
        this.f26264g = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f26258a.close();
        int i10 = this.f26260c;
        if (i10 <= 1 && (i10 != 1 || this.f26259b[i10 - 1] == 7)) {
            this.f26260c = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c f() throws IOException {
        J0();
        return L(1, b9.i.f16696d);
    }

    public void flush() throws IOException {
        if (this.f26260c != 0) {
            this.f26258a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c j() throws IOException {
        J0();
        return L(3, "{");
    }

    public final void n0(String str) {
        if (str.length() == 0) {
            this.f26261d = null;
            this.f26262e = ":";
            return;
        }
        this.f26261d = str;
        this.f26262e = ": ";
    }

    public final void o0(boolean z10) {
        this.f26263f = z10;
    }

    public c t() throws IOException {
        return k(1, 2, b9.i.f16698e);
    }

    public c w() throws IOException {
        return k(3, 5, "}");
    }

    public final void y0(boolean z10) {
        this.f26266i = z10;
    }

    public final boolean z() {
        return this.f26266i;
    }
}
