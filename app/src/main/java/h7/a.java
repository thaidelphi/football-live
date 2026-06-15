package h7;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Objects;
/* compiled from: JsonReader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a implements Closeable {

    /* renamed from: p  reason: collision with root package name */
    private static final char[] f26229p = ")]}'\n".toCharArray();

    /* renamed from: a  reason: collision with root package name */
    private final Reader f26230a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f26231b = false;

    /* renamed from: c  reason: collision with root package name */
    private final char[] f26232c = new char[1024];

    /* renamed from: d  reason: collision with root package name */
    private int f26233d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f26234e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f26235f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f26236g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f26237h = 0;

    /* renamed from: i  reason: collision with root package name */
    private long f26238i;

    /* renamed from: j  reason: collision with root package name */
    private int f26239j;

    /* renamed from: k  reason: collision with root package name */
    private String f26240k;

    /* renamed from: l  reason: collision with root package name */
    private int[] f26241l;

    /* renamed from: m  reason: collision with root package name */
    private int f26242m;

    /* renamed from: n  reason: collision with root package name */
    private String[] f26243n;

    /* renamed from: o  reason: collision with root package name */
    private int[] f26244o;

    /* compiled from: JsonReader.java */
    /* renamed from: h7.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class C0296a extends d7.d {
        C0296a() {
        }

        @Override // d7.d
        public void a(a aVar) throws IOException {
            if (aVar instanceof com.google.gson.internal.bind.a) {
                ((com.google.gson.internal.bind.a) aVar).T0();
                return;
            }
            int i10 = aVar.f26237h;
            if (i10 == 0) {
                i10 = aVar.k();
            }
            if (i10 == 13) {
                aVar.f26237h = 9;
            } else if (i10 == 12) {
                aVar.f26237h = 8;
            } else if (i10 == 14) {
                aVar.f26237h = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + aVar.C0() + aVar.J());
            }
        }
    }

    static {
        d7.d.f24364a = new C0296a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f26241l = iArr;
        this.f26242m = 0;
        this.f26242m = 0 + 1;
        iArr[0] = 6;
        this.f26243n = new String[32];
        this.f26244o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f26230a = reader;
    }

    private int D0() throws IOException {
        int i10;
        String str;
        String str2;
        char c10 = this.f26232c[this.f26233d];
        if (c10 == 't' || c10 == 'T') {
            i10 = 5;
            str = com.ironsource.mediationsdk.metadata.a.f18924g;
            str2 = "TRUE";
        } else if (c10 == 'f' || c10 == 'F') {
            i10 = 6;
            str = "false";
            str2 = "FALSE";
        } else if (c10 != 'n' && c10 != 'N') {
            return 0;
        } else {
            i10 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f26233d + i11 >= this.f26234e && !z(i11 + 1)) {
                return 0;
            }
            char c11 = this.f26232c[this.f26233d + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f26233d + length < this.f26234e || z(length + 1)) && G(this.f26232c[this.f26233d + length])) {
            return 0;
        }
        this.f26233d += length;
        this.f26237h = i10;
        return i10;
    }

    private boolean G(char c10) throws IOException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        f();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
        if (G(r14) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0093, code lost:
        if (r9 != 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
        if (r10 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
        if (r11 != Long.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009d, code lost:
        if (r13 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:
        if (r11 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
        if (r13 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a7, code lost:
        if (r13 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00aa, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ab, code lost:
        r18.f26238i = r11;
        r18.f26233d += r8;
        r18.f26237h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b6, code lost:
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b7, code lost:
        if (r9 == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ba, code lost:
        if (r9 == 4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bd, code lost:
        if (r9 != 7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c0, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c2, code lost:
        r18.f26239j = r8;
        r18.f26237h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c8, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c9, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int G0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.a.G0():int");
    }

    private void H0(int i10) {
        int i11 = this.f26242m;
        int[] iArr = this.f26241l;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[i11 * 2];
            int[] iArr3 = new int[i11 * 2];
            String[] strArr = new String[i11 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            System.arraycopy(this.f26244o, 0, iArr3, 0, this.f26242m);
            System.arraycopy(this.f26243n, 0, strArr, 0, this.f26242m);
            this.f26241l = iArr2;
            this.f26244o = iArr3;
            this.f26243n = strArr;
        }
        int[] iArr4 = this.f26241l;
        int i12 = this.f26242m;
        this.f26242m = i12 + 1;
        iArr4[i12] = i10;
    }

    private char I0() throws IOException {
        int i10;
        int i11;
        if (this.f26233d == this.f26234e && !z(1)) {
            throw P0("Unterminated escape sequence");
        }
        char[] cArr = this.f26232c;
        int i12 = this.f26233d;
        int i13 = i12 + 1;
        this.f26233d = i13;
        char c10 = cArr[i12];
        if (c10 == '\n') {
            this.f26235f++;
            this.f26236g = i13;
        } else if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
            if (c10 != 'b') {
                if (c10 != 'f') {
                    if (c10 != 'n') {
                        if (c10 != 'r') {
                            if (c10 != 't') {
                                if (c10 == 'u') {
                                    if (i13 + 4 > this.f26234e && !z(4)) {
                                        throw P0("Unterminated escape sequence");
                                    }
                                    char c11 = 0;
                                    int i14 = this.f26233d;
                                    int i15 = i14 + 4;
                                    while (i14 < i15) {
                                        char c12 = this.f26232c[i14];
                                        char c13 = (char) (c11 << 4);
                                        if (c12 < '0' || c12 > '9') {
                                            if (c12 >= 'a' && c12 <= 'f') {
                                                i10 = c12 - 'a';
                                            } else if (c12 < 'A' || c12 > 'F') {
                                                throw new NumberFormatException("\\u" + new String(this.f26232c, this.f26233d, 4));
                                            } else {
                                                i10 = c12 - 'A';
                                            }
                                            i11 = i10 + 10;
                                        } else {
                                            i11 = c12 - '0';
                                        }
                                        c11 = (char) (c13 + i11);
                                        i14++;
                                    }
                                    this.f26233d += 4;
                                    return c11;
                                }
                                throw P0("Invalid escape sequence");
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\n';
                }
                return '\f';
            }
            return '\b';
        }
        return c10;
    }

    private void K0(char c10) throws IOException {
        char[] cArr = this.f26232c;
        do {
            int i10 = this.f26233d;
            int i11 = this.f26234e;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f26233d = i12;
                    return;
                } else if (c11 == '\\') {
                    this.f26233d = i12;
                    I0();
                    i10 = this.f26233d;
                    i11 = this.f26234e;
                } else {
                    if (c11 == '\n') {
                        this.f26235f++;
                        this.f26236g = i12;
                    }
                    i10 = i12;
                }
            }
            this.f26233d = i10;
        } while (z(1));
        throw P0("Unterminated string");
    }

    private boolean L0(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.f26233d + length > this.f26234e && !z(length)) {
                return false;
            }
            char[] cArr = this.f26232c;
            int i10 = this.f26233d;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f26232c[this.f26233d + i11] != str.charAt(i11)) {
                        break;
                    }
                }
                return true;
            }
            this.f26235f++;
            this.f26236g = i10 + 1;
            this.f26233d++;
        }
    }

    private void M0() throws IOException {
        char c10;
        do {
            if (this.f26233d >= this.f26234e && !z(1)) {
                return;
            }
            char[] cArr = this.f26232c;
            int i10 = this.f26233d;
            int i11 = i10 + 1;
            this.f26233d = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f26235f++;
                this.f26236g = i11;
                return;
            }
        } while (c10 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        f();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void N0() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f26233d
            int r2 = r1 + r0
            int r3 = r4.f26234e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f26232c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.f()
        L4b:
            int r1 = r4.f26233d
            int r1 = r1 + r0
            r4.f26233d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f26233d = r1
            r0 = 1
            boolean r0 = r4.z(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.a.N0():void");
    }

    private IOException P0(String str) throws IOException {
        throw new d(str + J());
    }

    private int X(boolean z10) throws IOException {
        char[] cArr = this.f26232c;
        int i10 = this.f26233d;
        int i11 = this.f26234e;
        while (true) {
            if (i10 == i11) {
                this.f26233d = i10;
                if (!z(1)) {
                    if (z10) {
                        throw new EOFException("End of input" + J());
                    }
                    return -1;
                }
                i10 = this.f26233d;
                i11 = this.f26234e;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f26235f++;
                this.f26236g = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f26233d = i12;
                    if (i12 == i11) {
                        this.f26233d = i12 - 1;
                        boolean z11 = z(2);
                        this.f26233d++;
                        if (!z11) {
                            return c10;
                        }
                    }
                    f();
                    int i13 = this.f26233d;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f26233d = i13 + 1;
                        if (L0("*/")) {
                            i10 = this.f26233d + 2;
                            i11 = this.f26234e;
                        } else {
                            throw P0("Unterminated comment");
                        }
                    } else if (c11 != '/') {
                        return c10;
                    } else {
                        this.f26233d = i13 + 1;
                        M0();
                        i10 = this.f26233d;
                        i11 = this.f26234e;
                    }
                } else if (c10 == '#') {
                    this.f26233d = i12;
                    f();
                    M0();
                    i10 = this.f26233d;
                    i11 = this.f26234e;
                } else {
                    this.f26233d = i12;
                    return c10;
                }
            }
            i10 = i12;
        }
    }

    private void f() throws IOException {
        if (!this.f26231b) {
            throw P0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void j() throws IOException {
        X(true);
        int i10 = this.f26233d - 1;
        this.f26233d = i10;
        char[] cArr = f26229p;
        if (i10 + cArr.length > this.f26234e && !z(cArr.length)) {
            return;
        }
        int i11 = 0;
        while (true) {
            char[] cArr2 = f26229p;
            if (i11 < cArr2.length) {
                if (this.f26232c[this.f26233d + i11] != cArr2[i11]) {
                    return;
                }
                i11++;
            } else {
                this.f26233d += cArr2.length;
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        r1.append(r0, r3, r2 - r3);
        r9.f26233d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String o0(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f26232c
            r1 = 0
        L3:
            int r2 = r9.f26233d
            int r3 = r9.f26234e
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5c
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.f26233d = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L20
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L20:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L28:
            r8 = 92
            if (r2 != r8) goto L4f
            r9.f26233d = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L40
            int r1 = r7 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L40:
            r1.append(r0, r3, r7)
            char r2 = r9.I0()
            r1.append(r2)
            int r2 = r9.f26233d
            int r3 = r9.f26234e
            goto L7
        L4f:
            r5 = 10
            if (r2 != r5) goto L5a
            int r2 = r9.f26235f
            int r2 = r2 + r6
            r9.f26235f = r2
            r9.f26236g = r7
        L5a:
            r2 = r7
            goto L9
        L5c:
            if (r1 != 0) goto L6c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f26233d = r2
            boolean r2 = r9.z(r6)
            if (r2 == 0) goto L7a
            goto L3
        L7a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.P0(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.a.o0(char):java.lang.String");
    }

    private boolean z(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f26232c;
        int i13 = this.f26236g;
        int i14 = this.f26233d;
        this.f26236g = i13 - i14;
        int i15 = this.f26234e;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f26234e = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f26234e = 0;
        }
        this.f26233d = 0;
        do {
            Reader reader = this.f26230a;
            int i17 = this.f26234e;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f26234e + read;
            this.f26234e = i11;
            if (this.f26235f == 0 && (i12 = this.f26236g) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f26233d++;
                this.f26236g = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        f();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String z0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r6.f26233d
            int r4 = r3 + r2
            int r5 = r6.f26234e
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f26232c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.f()
            goto L5c
        L4e:
            char[] r3 = r6.f26232c
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.z(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f26232c
            int r4 = r6.f26233d
            r1.append(r3, r4, r2)
            int r3 = r6.f26233d
            int r3 = r3 + r2
            r6.f26233d = r3
            r2 = 1
            boolean r2 = r6.z(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f26232c
            int r3 = r6.f26233d
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f26232c
            int r3 = r6.f26233d
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f26233d
            int r2 = r2 + r0
            r6.f26233d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.a.z0():java.lang.String");
    }

    public b C0() throws IOException {
        int i10 = this.f26237h;
        if (i10 == 0) {
            i10 = k();
        }
        switch (i10) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public boolean E() throws IOException {
        int i10 = this.f26237h;
        if (i10 == 0) {
            i10 = k();
        }
        return (i10 == 2 || i10 == 4) ? false : true;
    }

    public final boolean F() {
        return this.f26231b;
    }

    String J() {
        return " at line " + (this.f26235f + 1) + " column " + ((this.f26233d - this.f26236g) + 1) + " path " + M();
    }

    public final void J0(boolean z10) {
        this.f26231b = z10;
    }

    public boolean K() throws IOException {
        int i10 = this.f26237h;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 5) {
            this.f26237h = 0;
            int[] iArr = this.f26244o;
            int i11 = this.f26242m - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f26237h = 0;
            int[] iArr2 = this.f26244o;
            int i12 = this.f26242m - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + C0() + J());
        }
    }

    public double L() throws IOException {
        int i10 = this.f26237h;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 15) {
            this.f26237h = 0;
            int[] iArr = this.f26244o;
            int i11 = this.f26242m - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f26238i;
        }
        if (i10 == 16) {
            this.f26240k = new String(this.f26232c, this.f26233d, this.f26239j);
            this.f26233d += this.f26239j;
        } else if (i10 == 8 || i10 == 9) {
            this.f26240k = o0(i10 == 8 ? '\'' : '\"');
        } else if (i10 == 10) {
            this.f26240k = z0();
        } else if (i10 != 11) {
            throw new IllegalStateException("Expected a double but was " + C0() + J());
        }
        this.f26237h = 11;
        double parseDouble = Double.parseDouble(this.f26240k);
        if (!this.f26231b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new d("JSON forbids NaN and infinities: " + parseDouble + J());
        }
        this.f26240k = null;
        this.f26237h = 0;
        int[] iArr2 = this.f26244o;
        int i12 = this.f26242m - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return parseDouble;
    }

    public String M() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i10 = this.f26242m;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f26241l[i11];
            if (i12 == 1 || i12 == 2) {
                sb.append('[');
                sb.append(this.f26244o[i11]);
                sb.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb.append('.');
                String[] strArr = this.f26243n;
                if (strArr[i11] != null) {
                    sb.append(strArr[i11]);
                }
            }
        }
        return sb.toString();
    }

    public void O0() throws IOException {
        int i10 = 0;
        do {
            int i11 = this.f26237h;
            if (i11 == 0) {
                i11 = k();
            }
            if (i11 == 3) {
                H0(1);
            } else if (i11 == 1) {
                H0(3);
            } else {
                if (i11 == 4) {
                    this.f26242m--;
                } else if (i11 == 2) {
                    this.f26242m--;
                } else {
                    if (i11 == 14 || i11 == 10) {
                        N0();
                    } else if (i11 == 8 || i11 == 12) {
                        K0('\'');
                    } else if (i11 == 9 || i11 == 13) {
                        K0('\"');
                    } else if (i11 == 16) {
                        this.f26233d += this.f26239j;
                    }
                    this.f26237h = 0;
                }
                i10--;
                this.f26237h = 0;
            }
            i10++;
            this.f26237h = 0;
        } while (i10 != 0);
        int[] iArr = this.f26244o;
        int i12 = this.f26242m;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f26243n[i12 - 1] = "null";
    }

    public int P() throws IOException {
        int i10 = this.f26237h;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 15) {
            long j10 = this.f26238i;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f26237h = 0;
                int[] iArr = this.f26244o;
                int i12 = this.f26242m - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f26238i + J());
        }
        if (i10 == 16) {
            this.f26240k = new String(this.f26232c, this.f26233d, this.f26239j);
            this.f26233d += this.f26239j;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            throw new IllegalStateException("Expected an int but was " + C0() + J());
        } else {
            if (i10 == 10) {
                this.f26240k = z0();
            } else {
                this.f26240k = o0(i10 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f26240k);
                this.f26237h = 0;
                int[] iArr2 = this.f26244o;
                int i13 = this.f26242m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f26237h = 11;
        double parseDouble = Double.parseDouble(this.f26240k);
        int i14 = (int) parseDouble;
        if (i14 == parseDouble) {
            this.f26240k = null;
            this.f26237h = 0;
            int[] iArr3 = this.f26244o;
            int i15 = this.f26242m - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        throw new NumberFormatException("Expected an int but was " + this.f26240k + J());
    }

    public long R() throws IOException {
        int i10 = this.f26237h;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 15) {
            this.f26237h = 0;
            int[] iArr = this.f26244o;
            int i11 = this.f26242m - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f26238i;
        }
        if (i10 == 16) {
            this.f26240k = new String(this.f26232c, this.f26233d, this.f26239j);
            this.f26233d += this.f26239j;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            throw new IllegalStateException("Expected a long but was " + C0() + J());
        } else {
            if (i10 == 10) {
                this.f26240k = z0();
            } else {
                this.f26240k = o0(i10 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f26240k);
                this.f26237h = 0;
                int[] iArr2 = this.f26244o;
                int i12 = this.f26242m - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f26237h = 11;
        double parseDouble = Double.parseDouble(this.f26240k);
        long j10 = (long) parseDouble;
        if (j10 == parseDouble) {
            this.f26240k = null;
            this.f26237h = 0;
            int[] iArr3 = this.f26244o;
            int i13 = this.f26242m - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j10;
        }
        throw new NumberFormatException("Expected a long but was " + this.f26240k + J());
    }

    public String S() throws IOException {
        String o02;
        int i10 = this.f26237h;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 14) {
            o02 = z0();
        } else if (i10 == 12) {
            o02 = o0('\'');
        } else if (i10 == 13) {
            o02 = o0('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + C0() + J());
        }
        this.f26237h = 0;
        this.f26243n[this.f26242m - 1] = o02;
        return o02;
    }

    public void a() throws IOException {
        int i10 = this.f26237h;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 3) {
            H0(1);
            this.f26244o[this.f26242m - 1] = 0;
            this.f26237h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + C0() + J());
    }

    public void b() throws IOException {
        int i10 = this.f26237h;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 1) {
            H0(3);
            this.f26237h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + C0() + J());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f26237h = 0;
        this.f26241l[0] = 8;
        this.f26242m = 1;
        this.f26230a.close();
    }

    int k() throws IOException {
        int X;
        int[] iArr = this.f26241l;
        int i10 = this.f26242m;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int X2 = X(true);
            if (X2 != 44) {
                if (X2 != 59) {
                    if (X2 == 93) {
                        this.f26237h = 4;
                        return 4;
                    }
                    throw P0("Unterminated array");
                }
                f();
            }
        } else if (i11 == 3 || i11 == 5) {
            iArr[i10 - 1] = 4;
            if (i11 == 5 && (X = X(true)) != 44) {
                if (X != 59) {
                    if (X == 125) {
                        this.f26237h = 2;
                        return 2;
                    }
                    throw P0("Unterminated object");
                }
                f();
            }
            int X3 = X(true);
            if (X3 == 34) {
                this.f26237h = 13;
                return 13;
            } else if (X3 == 39) {
                f();
                this.f26237h = 12;
                return 12;
            } else if (X3 == 125) {
                if (i11 != 5) {
                    this.f26237h = 2;
                    return 2;
                }
                throw P0("Expected name");
            } else {
                f();
                this.f26233d--;
                if (G((char) X3)) {
                    this.f26237h = 14;
                    return 14;
                }
                throw P0("Expected name");
            }
        } else if (i11 == 4) {
            iArr[i10 - 1] = 5;
            int X4 = X(true);
            if (X4 != 58) {
                if (X4 == 61) {
                    f();
                    if (this.f26233d < this.f26234e || z(1)) {
                        char[] cArr = this.f26232c;
                        int i12 = this.f26233d;
                        if (cArr[i12] == '>') {
                            this.f26233d = i12 + 1;
                        }
                    }
                } else {
                    throw P0("Expected ':'");
                }
            }
        } else if (i11 == 6) {
            if (this.f26231b) {
                j();
            }
            this.f26241l[this.f26242m - 1] = 7;
        } else if (i11 == 7) {
            if (X(false) == -1) {
                this.f26237h = 17;
                return 17;
            }
            f();
            this.f26233d--;
        } else if (i11 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int X5 = X(true);
        if (X5 == 34) {
            this.f26237h = 9;
            return 9;
        } else if (X5 == 39) {
            f();
            this.f26237h = 8;
            return 8;
        } else {
            if (X5 != 44 && X5 != 59) {
                if (X5 == 91) {
                    this.f26237h = 3;
                    return 3;
                } else if (X5 != 93) {
                    if (X5 != 123) {
                        this.f26233d--;
                        int D0 = D0();
                        if (D0 != 0) {
                            return D0;
                        }
                        int G0 = G0();
                        if (G0 != 0) {
                            return G0;
                        }
                        if (G(this.f26232c[this.f26233d])) {
                            f();
                            this.f26237h = 10;
                            return 10;
                        }
                        throw P0("Expected value");
                    }
                    this.f26237h = 1;
                    return 1;
                } else if (i11 == 1) {
                    this.f26237h = 4;
                    return 4;
                }
            }
            if (i11 != 1 && i11 != 2) {
                throw P0("Unexpected value");
            }
            f();
            this.f26233d--;
            this.f26237h = 7;
            return 7;
        }
    }

    public void n0() throws IOException {
        int i10 = this.f26237h;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 7) {
            this.f26237h = 0;
            int[] iArr = this.f26244o;
            int i11 = this.f26242m - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + C0() + J());
    }

    public void t() throws IOException {
        int i10 = this.f26237h;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 4) {
            int i11 = this.f26242m - 1;
            this.f26242m = i11;
            int[] iArr = this.f26244o;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f26237h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + C0() + J());
    }

    public String toString() {
        return getClass().getSimpleName() + J();
    }

    public void w() throws IOException {
        int i10 = this.f26237h;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 2) {
            int i11 = this.f26242m - 1;
            this.f26242m = i11;
            this.f26243n[i11] = null;
            int[] iArr = this.f26244o;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f26237h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + C0() + J());
    }

    public String y0() throws IOException {
        String str;
        int i10 = this.f26237h;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 10) {
            str = z0();
        } else if (i10 == 8) {
            str = o0('\'');
        } else if (i10 == 9) {
            str = o0('\"');
        } else if (i10 == 11) {
            str = this.f26240k;
            this.f26240k = null;
        } else if (i10 == 15) {
            str = Long.toString(this.f26238i);
        } else if (i10 == 16) {
            str = new String(this.f26232c, this.f26233d, this.f26239j);
            this.f26233d += this.f26239j;
        } else {
            throw new IllegalStateException("Expected a string but was " + C0() + J());
        }
        this.f26237h = 0;
        int[] iArr = this.f26244o;
        int i11 = this.f26242m - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }
}
