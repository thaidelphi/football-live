package y9;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
/* compiled from: Buffer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class c implements e, d, Cloneable, ByteChannel {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f33352c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a  reason: collision with root package name */
    o f33353a;

    /* renamed from: b  reason: collision with root package name */
    long f33354b;

    /* compiled from: Buffer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.f33354b, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            c cVar = c.this;
            if (cVar.f33354b > 0) {
                return cVar.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return c.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            return c.this.G(bArr, i10, i11);
        }
    }

    @Override // y9.r
    public void A(c cVar, long j10) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar != this) {
            u.b(cVar.f33354b, 0L, j10);
            while (j10 > 0) {
                o oVar = cVar.f33353a;
                if (j10 < oVar.f33388c - oVar.f33387b) {
                    o oVar2 = this.f33353a;
                    o oVar3 = oVar2 != null ? oVar2.f33392g : null;
                    if (oVar3 != null && oVar3.f33390e) {
                        if ((oVar3.f33388c + j10) - (oVar3.f33389d ? 0 : oVar3.f33387b) <= 8192) {
                            oVar.f(oVar3, (int) j10);
                            cVar.f33354b -= j10;
                            this.f33354b += j10;
                            return;
                        }
                    }
                    cVar.f33353a = oVar.e((int) j10);
                }
                o oVar4 = cVar.f33353a;
                long j11 = oVar4.f33388c - oVar4.f33387b;
                cVar.f33353a = oVar4.b();
                o oVar5 = this.f33353a;
                if (oVar5 == null) {
                    this.f33353a = oVar4;
                    oVar4.f33392g = oVar4;
                    oVar4.f33391f = oVar4;
                } else {
                    oVar5.f33392g.c(oVar4).a();
                }
                cVar.f33354b -= j11;
                this.f33354b += j11;
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // y9.e
    public boolean B0(long j10, f fVar) {
        return F(j10, fVar, 0, fVar.r());
    }

    @Override // y9.d
    /* renamed from: C0 */
    public c t0(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = i11;
            u.b(bArr.length, i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                o o02 = o0(1);
                int min = Math.min(i12 - i10, 8192 - o02.f33388c);
                System.arraycopy(bArr, i10, o02.f33386a, o02.f33388c, min);
                i10 += min;
                o02.f33388c += min;
            }
            this.f33354b += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public long D0(s sVar) throws IOException {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j10 = 0;
        while (true) {
            long H = sVar.H(this, 8192L);
            if (H == -1) {
                return j10;
            }
            j10 += H;
        }
    }

    public long E(byte b10, long j10, long j11) {
        o oVar;
        long j12 = 0;
        if (j10 >= 0 && j11 >= j10) {
            long j13 = this.f33354b;
            long j14 = j11 > j13 ? j13 : j11;
            if (j10 == j14 || (oVar = this.f33353a) == null) {
                return -1L;
            }
            if (j13 - j10 < j10) {
                while (j13 > j10) {
                    oVar = oVar.f33392g;
                    j13 -= oVar.f33388c - oVar.f33387b;
                }
            } else {
                while (true) {
                    long j15 = (oVar.f33388c - oVar.f33387b) + j12;
                    if (j15 >= j10) {
                        break;
                    }
                    oVar = oVar.f33391f;
                    j12 = j15;
                }
                j13 = j12;
            }
            long j16 = j10;
            while (j13 < j14) {
                byte[] bArr = oVar.f33386a;
                int min = (int) Math.min(oVar.f33388c, (oVar.f33387b + j14) - j13);
                for (int i10 = (int) ((oVar.f33387b + j16) - j13); i10 < min; i10++) {
                    if (bArr[i10] == b10) {
                        return (i10 - oVar.f33387b) + j13;
                    }
                }
                j13 += oVar.f33388c - oVar.f33387b;
                oVar = oVar.f33391f;
                j16 = j13;
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f33354b), Long.valueOf(j10), Long.valueOf(j11)));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5 A[EDGE_INSN: B:42:0x00a5->B:38:0x00a5 ?: BREAK  , SYNTHETIC] */
    @Override // y9.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long E0() {
        /*
            r14 = this;
            long r0 = r14.f33354b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lac
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            y9.o r6 = r14.f33353a
            byte[] r7 = r6.f33386a
            int r8 = r6.f33387b
            int r9 = r6.f33388c
        L13:
            if (r8 >= r9) goto L91
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L3a
        L22:
            r11 = 97
            if (r10 < r11) goto L2f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2f
            int r11 = r10 + (-97)
        L2c:
            int r11 = r11 + 10
            goto L3a
        L2f:
            r11 = 65
            if (r10 < r11) goto L72
            r11 = 70
            if (r10 > r11) goto L72
            int r11 = r10 + (-65)
            goto L2c
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L4a:
            y9.c r0 = new y9.c
            r0.<init>()
            y9.c r0 = r0.u0(r4)
            y9.c r0 = r0.j0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.L()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L72:
            if (r0 == 0) goto L76
            r1 = 1
            goto L91
        L76:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L91:
            if (r8 != r9) goto L9d
            y9.o r7 = r6.b()
            r14.f33353a = r7
            y9.p.a(r6)
            goto L9f
        L9d:
            r6.f33387b = r8
        L9f:
            if (r1 != 0) goto La5
            y9.o r6 = r14.f33353a
            if (r6 != 0) goto Lb
        La5:
            long r1 = r14.f33354b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f33354b = r1
            return r4
        Lac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.c.E0():long");
    }

    public boolean F(long j10, f fVar, int i10, int i11) {
        if (j10 < 0 || i10 < 0 || i11 < 0 || this.f33354b - j10 < i11 || fVar.r() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (z(i12 + j10) != fVar.j(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // y9.e
    public InputStream F0() {
        return new a();
    }

    public int G(byte[] bArr, int i10, int i11) {
        u.b(bArr.length, i10, i11);
        o oVar = this.f33353a;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(i11, oVar.f33388c - oVar.f33387b);
        System.arraycopy(oVar.f33386a, oVar.f33387b, bArr, i10, min);
        int i12 = oVar.f33387b + min;
        oVar.f33387b = i12;
        this.f33354b -= min;
        if (i12 == oVar.f33388c) {
            this.f33353a = oVar.b();
            p.a(oVar);
        }
        return min;
    }

    @Override // y9.d
    /* renamed from: G0 */
    public c j0(int i10) {
        o o02 = o0(1);
        byte[] bArr = o02.f33386a;
        int i11 = o02.f33388c;
        o02.f33388c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f33354b++;
        return this;
    }

    @Override // y9.s
    public long H(c cVar, long j10) {
        if (cVar != null) {
            if (j10 >= 0) {
                long j11 = this.f33354b;
                if (j11 == 0) {
                    return -1L;
                }
                if (j10 > j11) {
                    j10 = j11;
                }
                cVar.A(this, j10);
                return j10;
            }
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // y9.d
    /* renamed from: H0 */
    public c Z(long j10) {
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0) {
            return j0(48);
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return B("-9223372036854775808");
            }
            z10 = true;
        }
        if (j10 >= 100000000) {
            i11 = j10 < 1000000000000L ? j10 < 10000000000L ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i11 = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i11 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i11 = 2;
        }
        if (z10) {
            i11++;
        }
        o o02 = o0(i11);
        byte[] bArr = o02.f33386a;
        int i12 = o02.f33388c + i11;
        while (j10 != 0) {
            i12--;
            bArr[i12] = f33352c[(int) (j10 % 10)];
            j10 /= 10;
        }
        if (z10) {
            bArr[i12 - 1] = 45;
        }
        o02.f33388c += i11;
        this.f33354b += i11;
        return this;
    }

    @Override // y9.e
    public String I() throws EOFException {
        return u(Long.MAX_VALUE);
    }

    @Override // y9.d
    /* renamed from: I0 */
    public c u0(long j10) {
        if (j10 == 0) {
            return j0(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        o o02 = o0(numberOfTrailingZeros);
        byte[] bArr = o02.f33386a;
        int i10 = o02.f33388c;
        for (int i11 = (i10 + numberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = f33352c[(int) (15 & j10)];
            j10 >>>= 4;
        }
        o02.f33388c += numberOfTrailingZeros;
        this.f33354b += numberOfTrailingZeros;
        return this;
    }

    public f J() {
        return new f(h0());
    }

    @Override // y9.d
    /* renamed from: J0 */
    public c o(int i10) {
        o o02 = o0(4);
        byte[] bArr = o02.f33386a;
        int i11 = o02.f33388c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        o02.f33388c = i14 + 1;
        this.f33354b += 4;
        return this;
    }

    public String K(long j10, Charset charset) throws EOFException {
        u.b(this.f33354b, 0L, j10);
        if (charset != null) {
            if (j10 > 2147483647L) {
                throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
            } else if (j10 == 0) {
                return "";
            } else {
                o oVar = this.f33353a;
                int i10 = oVar.f33387b;
                if (i10 + j10 > oVar.f33388c) {
                    return new String(N(j10), charset);
                }
                String str = new String(oVar.f33386a, i10, (int) j10, charset);
                int i11 = (int) (oVar.f33387b + j10);
                oVar.f33387b = i11;
                this.f33354b -= j10;
                if (i11 == oVar.f33388c) {
                    this.f33353a = oVar.b();
                    p.a(oVar);
                }
                return str;
            }
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // y9.d
    /* renamed from: K0 */
    public c e0(int i10) {
        o o02 = o0(2);
        byte[] bArr = o02.f33386a;
        int i11 = o02.f33388c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        o02.f33388c = i12 + 1;
        this.f33354b += 2;
        return this;
    }

    public String L() {
        try {
            return K(this.f33354b, u.f33401a);
        } catch (EOFException e8) {
            throw new AssertionError(e8);
        }
    }

    public c L0(String str, int i10, int i11, Charset charset) {
        if (str != null) {
            if (i10 < 0) {
                throw new IllegalAccessError("beginIndex < 0: " + i10);
            } else if (i11 >= i10) {
                if (i11 <= str.length()) {
                    if (charset != null) {
                        if (charset.equals(u.f33401a)) {
                            return N0(str, i10, i11);
                        }
                        byte[] bytes = str.substring(i10, i11).getBytes(charset);
                        return t0(bytes, 0, bytes.length);
                    }
                    throw new IllegalArgumentException("charset == null");
                }
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            } else {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    @Override // y9.d
    /* renamed from: M0 */
    public c B(String str) {
        return N0(str, 0, str.length());
    }

    @Override // y9.e
    public byte[] N(long j10) throws EOFException {
        u.b(this.f33354b, 0L, j10);
        if (j10 <= 2147483647L) {
            byte[] bArr = new byte[(int) j10];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
    }

    public c N0(String str, int i10, int i11) {
        if (str != null) {
            if (i10 < 0) {
                throw new IllegalArgumentException("beginIndex < 0: " + i10);
            } else if (i11 >= i10) {
                if (i11 > str.length()) {
                    throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
                }
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt < 128) {
                        o o02 = o0(1);
                        byte[] bArr = o02.f33386a;
                        int i12 = o02.f33388c - i10;
                        int min = Math.min(i11, 8192 - i12);
                        int i13 = i10 + 1;
                        bArr[i10 + i12] = (byte) charAt;
                        while (i13 < min) {
                            char charAt2 = str.charAt(i13);
                            if (charAt2 >= 128) {
                                break;
                            }
                            bArr[i13 + i12] = (byte) charAt2;
                            i13++;
                        }
                        int i14 = o02.f33388c;
                        int i15 = (i12 + i13) - i14;
                        o02.f33388c = i14 + i15;
                        this.f33354b += i15;
                        i10 = i13;
                    } else {
                        if (charAt < 2048) {
                            j0((charAt >> 6) | 192);
                            j0((charAt & '?') | 128);
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i16 = i10 + 1;
                            char charAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                            if (charAt <= 56319 && charAt3 >= 56320 && charAt3 <= 57343) {
                                int i17 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                                j0((i17 >> 18) | 240);
                                j0(((i17 >> 12) & 63) | 128);
                                j0(((i17 >> 6) & 63) | 128);
                                j0((i17 & 63) | 128);
                                i10 += 2;
                            } else {
                                j0(63);
                                i10 = i16;
                            }
                        } else {
                            j0((charAt >> '\f') | 224);
                            j0(((charAt >> 6) & 63) | 128);
                            j0((charAt & '?') | 128);
                        }
                        i10++;
                    }
                }
                return this;
            } else {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    public c O0(int i10) {
        if (i10 < 128) {
            j0(i10);
        } else if (i10 < 2048) {
            j0((i10 >> 6) | 192);
            j0((i10 & 63) | 128);
        } else if (i10 < 65536) {
            if (i10 >= 55296 && i10 <= 57343) {
                j0(63);
            } else {
                j0((i10 >> 12) | 224);
                j0(((i10 >> 6) & 63) | 128);
                j0((i10 & 63) | 128);
            }
        } else if (i10 <= 1114111) {
            j0((i10 >> 18) | 240);
            j0(((i10 >> 12) & 63) | 128);
            j0(((i10 >> 6) & 63) | 128);
            j0((i10 & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
        }
        return this;
    }

    public String P(long j10) throws EOFException {
        return K(j10, u.f33401a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String R(long j10) throws EOFException {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (z(j11) == 13) {
                String P = P(j11);
                c(2L);
                return P;
            }
        }
        String P2 = P(j10);
        c(1L);
        return P2;
    }

    public final long S() {
        return this.f33354b;
    }

    @Override // y9.e
    public short T() {
        return u.d(readShort());
    }

    public final f X() {
        long j10 = this.f33354b;
        if (j10 <= 2147483647L) {
            return n0((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f33354b);
    }

    @Override // y9.e
    public void Y(long j10) throws EOFException {
        if (this.f33354b < j10) {
            throw new EOFException();
        }
    }

    @Override // y9.e
    public long b0(byte b10) {
        return E(b10, 0L, Long.MAX_VALUE);
    }

    @Override // y9.e
    public void c(long j10) throws EOFException {
        o oVar;
        while (j10 > 0) {
            if (this.f33353a != null) {
                int min = (int) Math.min(j10, oVar.f33388c - oVar.f33387b);
                long j11 = min;
                this.f33354b -= j11;
                j10 -= j11;
                o oVar2 = this.f33353a;
                int i10 = oVar2.f33387b + min;
                oVar2.f33387b = i10;
                if (i10 == oVar2.f33388c) {
                    this.f33353a = oVar2.b();
                    p.a(oVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // y9.e
    public f c0(long j10) throws EOFException {
        return new f(N(j10));
    }

    @Override // y9.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // y9.e, y9.d
    public c d() {
        return this;
    }

    @Override // y9.s
    public t e() {
        return t.f33397d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            long j10 = this.f33354b;
            if (j10 != cVar.f33354b) {
                return false;
            }
            long j11 = 0;
            if (j10 == 0) {
                return true;
            }
            o oVar = this.f33353a;
            o oVar2 = cVar.f33353a;
            int i10 = oVar.f33387b;
            int i11 = oVar2.f33387b;
            while (j11 < this.f33354b) {
                long min = Math.min(oVar.f33388c - i10, oVar2.f33388c - i11);
                int i12 = 0;
                while (i12 < min) {
                    int i13 = i10 + 1;
                    int i14 = i11 + 1;
                    if (oVar.f33386a[i10] != oVar2.f33386a[i11]) {
                        return false;
                    }
                    i12++;
                    i10 = i13;
                    i11 = i14;
                }
                if (i10 == oVar.f33388c) {
                    oVar = oVar.f33391f;
                    i10 = oVar.f33387b;
                }
                if (i11 == oVar2.f33388c) {
                    oVar2 = oVar2.f33391f;
                    i11 = oVar2.f33387b;
                }
                j11 += min;
            }
            return true;
        }
        return false;
    }

    public final void f() {
        try {
            c(this.f33354b);
        } catch (EOFException e8) {
            throw new AssertionError(e8);
        }
    }

    @Override // y9.d, y9.r, java.io.Flushable
    public void flush() {
    }

    @Override // y9.e
    public byte[] h0() {
        try {
            return N(this.f33354b);
        } catch (EOFException e8) {
            throw new AssertionError(e8);
        }
    }

    public int hashCode() {
        o oVar = this.f33353a;
        if (oVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = oVar.f33388c;
            for (int i12 = oVar.f33387b; i12 < i11; i12++) {
                i10 = (i10 * 31) + oVar.f33386a[i12];
            }
            oVar = oVar.f33391f;
        } while (oVar != this.f33353a);
        return i10;
    }

    @Override // y9.e
    public boolean i0() {
        return this.f33354b == 0;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public c clone() {
        c cVar = new c();
        if (this.f33354b == 0) {
            return cVar;
        }
        o d10 = this.f33353a.d();
        cVar.f33353a = d10;
        d10.f33392g = d10;
        d10.f33391f = d10;
        o oVar = this.f33353a;
        while (true) {
            oVar = oVar.f33391f;
            if (oVar != this.f33353a) {
                cVar.f33353a.f33392g.c(oVar.d());
            } else {
                cVar.f33354b = this.f33354b;
                return cVar;
            }
        }
    }

    public final long k() {
        long j10 = this.f33354b;
        if (j10 == 0) {
            return 0L;
        }
        o oVar = this.f33353a.f33392g;
        int i10 = oVar.f33388c;
        return (i10 >= 8192 || !oVar.f33390e) ? j10 : j10 - (i10 - oVar.f33387b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
        r1 = new y9.c().H0(r3).G0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r8 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
        throw new java.lang.NumberFormatException("Number too large: " + r1.L());
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
        r17.f33354b -= r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
        if (r8 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
        return -r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    @Override // y9.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long l0() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f33354b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto Lc3
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            r5 = -7
            r7 = 0
            r8 = r7
            r9 = r8
        L14:
            y9.o r10 = r0.f33353a
            byte[] r11 = r10.f33386a
            int r12 = r10.f33387b
            int r13 = r10.f33388c
        L1c:
            if (r12 >= r13) goto L9c
            r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L69
            r14 = 57
            if (r15 > r14) goto L69
            int r14 = 48 - r15
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 < 0) goto L3c
            if (r16 != 0) goto L36
            long r1 = (long) r14
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L36
            goto L3c
        L36:
            r1 = 10
            long r3 = r3 * r1
            long r1 = (long) r14
            long r3 = r3 + r1
            goto L73
        L3c:
            y9.c r1 = new y9.c
            r1.<init>()
            y9.c r1 = r1.Z(r3)
            y9.c r1 = r1.j0(r15)
            if (r8 != 0) goto L4e
            r1.readByte()
        L4e:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.L()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L69:
            r1 = 45
            if (r15 != r1) goto L7d
            if (r7 != 0) goto L7d
            r1 = 1
            long r5 = r5 - r1
            r8 = 1
        L73:
            int r12 = r12 + 1
            int r7 = r7 + 1
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L1c
        L7d:
            if (r7 == 0) goto L81
            r9 = 1
            goto L9c
        L81:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r15)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L9c:
            if (r12 != r13) goto La8
            y9.o r1 = r10.b()
            r0.f33353a = r1
            y9.p.a(r10)
            goto Laa
        La8:
            r10.f33387b = r12
        Laa:
            if (r9 != 0) goto Lb8
            y9.o r1 = r0.f33353a
            if (r1 != 0) goto Lb1
            goto Lb8
        Lb1:
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L14
        Lb8:
            long r1 = r0.f33354b
            long r5 = (long) r7
            long r1 = r1 - r5
            r0.f33354b = r1
            if (r8 == 0) goto Lc1
            goto Lc2
        Lc1:
            long r3 = -r3
        Lc2:
            return r3
        Lc3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.c.l0():long");
    }

    public final f n0(int i10) {
        if (i10 == 0) {
            return f.f33357e;
        }
        return new q(this, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o o0(int i10) {
        if (i10 >= 1 && i10 <= 8192) {
            o oVar = this.f33353a;
            if (oVar == null) {
                o b10 = p.b();
                this.f33353a = b10;
                b10.f33392g = b10;
                b10.f33391f = b10;
                return b10;
            }
            o oVar2 = oVar.f33392g;
            return (oVar2.f33388c + i10 > 8192 || !oVar2.f33390e) ? oVar2.c(p.b()) : oVar2;
        }
        throw new IllegalArgumentException();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        o oVar = this.f33353a;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), oVar.f33388c - oVar.f33387b);
        byteBuffer.put(oVar.f33386a, oVar.f33387b, min);
        int i10 = oVar.f33387b + min;
        oVar.f33387b = i10;
        this.f33354b -= min;
        if (i10 == oVar.f33388c) {
            this.f33353a = oVar.b();
            p.a(oVar);
        }
        return min;
    }

    @Override // y9.e
    public byte readByte() {
        long j10 = this.f33354b;
        if (j10 != 0) {
            o oVar = this.f33353a;
            int i10 = oVar.f33387b;
            int i11 = oVar.f33388c;
            int i12 = i10 + 1;
            byte b10 = oVar.f33386a[i10];
            this.f33354b = j10 - 1;
            if (i12 == i11) {
                this.f33353a = oVar.b();
                p.a(oVar);
            } else {
                oVar.f33387b = i12;
            }
            return b10;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // y9.e
    public void readFully(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int G = G(bArr, i10, bArr.length - i10);
            if (G == -1) {
                throw new EOFException();
            }
            i10 += G;
        }
    }

    @Override // y9.e
    public int readInt() {
        long j10 = this.f33354b;
        if (j10 >= 4) {
            o oVar = this.f33353a;
            int i10 = oVar.f33387b;
            int i11 = oVar.f33388c;
            if (i11 - i10 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = oVar.f33386a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
            int i15 = i13 + 1;
            int i16 = i14 | ((bArr[i13] & 255) << 8);
            int i17 = i15 + 1;
            int i18 = i16 | (bArr[i15] & 255);
            this.f33354b = j10 - 4;
            if (i17 == i11) {
                this.f33353a = oVar.b();
                p.a(oVar);
            } else {
                oVar.f33387b = i17;
            }
            return i18;
        }
        throw new IllegalStateException("size < 4: " + this.f33354b);
    }

    @Override // y9.e
    public short readShort() {
        long j10 = this.f33354b;
        if (j10 >= 2) {
            o oVar = this.f33353a;
            int i10 = oVar.f33387b;
            int i11 = oVar.f33388c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = oVar.f33386a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
            this.f33354b = j10 - 2;
            if (i13 == i11) {
                this.f33353a = oVar.b();
                p.a(oVar);
            } else {
                oVar.f33387b = i13;
            }
            return (short) i14;
        }
        throw new IllegalStateException("size < 2: " + this.f33354b);
    }

    @Override // y9.e
    public String s0(Charset charset) {
        try {
            return K(this.f33354b, charset);
        } catch (EOFException e8) {
            throw new AssertionError(e8);
        }
    }

    public final c t(c cVar, long j10, long j11) {
        if (cVar != null) {
            u.b(this.f33354b, j10, j11);
            if (j11 == 0) {
                return this;
            }
            cVar.f33354b += j11;
            o oVar = this.f33353a;
            while (true) {
                int i10 = oVar.f33388c;
                int i11 = oVar.f33387b;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= i10 - i11;
                oVar = oVar.f33391f;
            }
            while (j11 > 0) {
                o d10 = oVar.d();
                int i12 = (int) (d10.f33387b + j10);
                d10.f33387b = i12;
                d10.f33388c = Math.min(i12 + ((int) j11), d10.f33388c);
                o oVar2 = cVar.f33353a;
                if (oVar2 == null) {
                    d10.f33392g = d10;
                    d10.f33391f = d10;
                    cVar.f33353a = d10;
                } else {
                    oVar2.f33392g.c(d10);
                }
                j11 -= d10.f33388c - d10.f33387b;
                oVar = oVar.f33391f;
                j10 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public String toString() {
        return X().toString();
    }

    @Override // y9.e
    public String u(long j10) throws EOFException {
        if (j10 >= 0) {
            long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
            long E = E((byte) 10, 0L, j11);
            if (E != -1) {
                return R(E);
            }
            if (j11 < S() && z(j11 - 1) == 13 && z(j11) == 10) {
                return R(j11);
            }
            c cVar = new c();
            t(cVar, 0L, Math.min(32L, S()));
            throw new EOFException("\\n not found: limit=" + Math.min(S(), j10) + " content=" + cVar.J().k() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j10);
    }

    @Override // y9.d
    /* renamed from: w */
    public c s() {
        return this;
    }

    @Override // y9.e
    public int w0() {
        return u.c(readInt());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i10 = remaining;
            while (i10 > 0) {
                o o02 = o0(1);
                int min = Math.min(i10, 8192 - o02.f33388c);
                byteBuffer.get(o02.f33386a, o02.f33388c, min);
                i10 -= min;
                o02.f33388c += min;
            }
            this.f33354b += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public c y0(f fVar) {
        if (fVar != null) {
            fVar.x(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public final byte z(long j10) {
        int i10;
        u.b(this.f33354b, j10, 1L);
        long j11 = this.f33354b;
        if (j11 - j10 > j10) {
            o oVar = this.f33353a;
            while (true) {
                int i11 = oVar.f33388c;
                int i12 = oVar.f33387b;
                long j12 = i11 - i12;
                if (j10 < j12) {
                    return oVar.f33386a[i12 + ((int) j10)];
                }
                j10 -= j12;
                oVar = oVar.f33391f;
            }
        } else {
            long j13 = j10 - j11;
            o oVar2 = this.f33353a;
            do {
                oVar2 = oVar2.f33392g;
                int i13 = oVar2.f33388c;
                i10 = oVar2.f33387b;
                j13 += i13 - i10;
            } while (j13 < 0);
            return oVar2.f33386a[i10 + ((int) j13)];
        }
    }

    @Override // y9.d
    /* renamed from: z0 */
    public c O(byte[] bArr) {
        if (bArr != null) {
            return t0(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }
}
