package com.ironsource;

import java.io.UnsupportedEncodingException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class jm {

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f17961d = {Byte.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a  reason: collision with root package name */
    private b f17962a = new b();

    /* renamed from: b  reason: collision with root package name */
    private b f17963b = new b();

    /* renamed from: c  reason: collision with root package name */
    private int[] f17964c = new int[16];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f17965a;

        /* renamed from: b  reason: collision with root package name */
        private int[] f17966b;

        /* renamed from: c  reason: collision with root package name */
        private long f17967c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f17968d;

        private b() {
            this.f17965a = true;
            this.f17966b = new int[4];
            this.f17968d = new byte[64];
            a();
        }

        static /* synthetic */ long a(b bVar, long j10) {
            long j11 = bVar.f17967c + j10;
            bVar.f17967c = j11;
            return j11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            int[] iArr = this.f17966b;
            iArr[0] = 1732584193;
            iArr[1] = -271733879;
            iArr[2] = -1732584194;
            iArr[3] = 271733878;
            this.f17967c = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(b bVar) {
            byte[] bArr = bVar.f17968d;
            byte[] bArr2 = this.f17968d;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            int[] iArr = bVar.f17966b;
            int[] iArr2 = this.f17966b;
            System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            this.f17965a = bVar.f17965a;
            this.f17967c = bVar.f17967c;
        }
    }

    jm() {
        c();
    }

    private static int a(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i10 + ((i12 & i11) | (i13 & (~i11))) + i14 + i16;
        return ((i17 >>> (32 - i15)) | (i17 << i15)) + i11;
    }

    public static String a(String str) {
        jm jmVar = new jm();
        jmVar.b(str);
        return jmVar.b();
    }

    private static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            if (i10 < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i10));
        }
        return stringBuffer.toString();
    }

    private void a(b bVar, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        this.f17963b.f17965a = false;
        if (i11 + i10 > bArr.length) {
            i11 = bArr.length - i10;
        }
        int i13 = ((int) (bVar.f17967c >>> 3)) & 63;
        b.a(bVar, i11 << 3);
        int i14 = 64 - i13;
        if (i11 >= i14) {
            System.arraycopy(bArr, i10, bVar.f17968d, i13, i14);
            a(bVar, a(bVar.f17968d, 64, 0));
            while (i14 + 63 < i11) {
                a(bVar, a(bArr, 64, i14));
                i14 += 64;
            }
            i13 = 0;
            i12 = i14;
        }
        if (i12 < i11) {
            for (int i15 = i12; i15 < i11; i15++) {
                bVar.f17968d[(i13 + i15) - i12] = bArr[i15 + i10];
            }
        }
    }

    private static void a(b bVar, int[] iArr) {
        int i10 = bVar.f17966b[0];
        int i11 = bVar.f17966b[1];
        int i12 = bVar.f17966b[2];
        int i13 = bVar.f17966b[3];
        int a10 = a(i10, i11, i12, i13, iArr[0], 7, -680876936);
        int a11 = a(i13, a10, i11, i12, iArr[1], 12, -389564586);
        int a12 = a(i12, a11, a10, i11, iArr[2], 17, 606105819);
        int a13 = a(i11, a12, a11, a10, iArr[3], 22, -1044525330);
        int a14 = a(a10, a13, a12, a11, iArr[4], 7, -176418897);
        int a15 = a(a11, a14, a13, a12, iArr[5], 12, 1200080426);
        int a16 = a(a12, a15, a14, a13, iArr[6], 17, -1473231341);
        int a17 = a(a13, a16, a15, a14, iArr[7], 22, -45705983);
        int a18 = a(a14, a17, a16, a15, iArr[8], 7, 1770035416);
        int a19 = a(a15, a18, a17, a16, iArr[9], 12, -1958414417);
        int a20 = a(a16, a19, a18, a17, iArr[10], 17, -42063);
        int a21 = a(a17, a20, a19, a18, iArr[11], 22, -1990404162);
        int a22 = a(a18, a21, a20, a19, iArr[12], 7, 1804603682);
        int a23 = a(a19, a22, a21, a20, iArr[13], 12, -40341101);
        int a24 = a(a20, a23, a22, a21, iArr[14], 17, -1502002290);
        int a25 = a(a21, a24, a23, a22, iArr[15], 22, 1236535329);
        int b10 = b(a22, a25, a24, a23, iArr[1], 5, -165796510);
        int b11 = b(a23, b10, a25, a24, iArr[6], 9, -1069501632);
        int b12 = b(a24, b11, b10, a25, iArr[11], 14, 643717713);
        int b13 = b(a25, b12, b11, b10, iArr[0], 20, -373897302);
        int b14 = b(b10, b13, b12, b11, iArr[5], 5, -701558691);
        int b15 = b(b11, b14, b13, b12, iArr[10], 9, 38016083);
        int b16 = b(b12, b15, b14, b13, iArr[15], 14, -660478335);
        int b17 = b(b13, b16, b15, b14, iArr[4], 20, -405537848);
        int b18 = b(b14, b17, b16, b15, iArr[9], 5, 568446438);
        int b19 = b(b15, b18, b17, b16, iArr[14], 9, -1019803690);
        int b20 = b(b16, b19, b18, b17, iArr[3], 14, -187363961);
        int b21 = b(b17, b20, b19, b18, iArr[8], 20, 1163531501);
        int b22 = b(b18, b21, b20, b19, iArr[13], 5, -1444681467);
        int b23 = b(b19, b22, b21, b20, iArr[2], 9, -51403784);
        int b24 = b(b20, b23, b22, b21, iArr[7], 14, 1735328473);
        int b25 = b(b21, b24, b23, b22, iArr[12], 20, -1926607734);
        int c10 = c(b22, b25, b24, b23, iArr[5], 4, -378558);
        int c11 = c(b23, c10, b25, b24, iArr[8], 11, -2022574463);
        int c12 = c(b24, c11, c10, b25, iArr[11], 16, 1839030562);
        int c13 = c(b25, c12, c11, c10, iArr[14], 23, -35309556);
        int c14 = c(c10, c13, c12, c11, iArr[1], 4, -1530992060);
        int c15 = c(c11, c14, c13, c12, iArr[4], 11, 1272893353);
        int c16 = c(c12, c15, c14, c13, iArr[7], 16, -155497632);
        int c17 = c(c13, c16, c15, c14, iArr[10], 23, -1094730640);
        int c18 = c(c14, c17, c16, c15, iArr[13], 4, 681279174);
        int c19 = c(c15, c18, c17, c16, iArr[0], 11, -358537222);
        int c20 = c(c16, c19, c18, c17, iArr[3], 16, -722521979);
        int c21 = c(c17, c20, c19, c18, iArr[6], 23, 76029189);
        int c22 = c(c18, c21, c20, c19, iArr[9], 4, -640364487);
        int c23 = c(c19, c22, c21, c20, iArr[12], 11, -421815835);
        int c24 = c(c20, c23, c22, c21, iArr[15], 16, 530742520);
        int c25 = c(c21, c24, c23, c22, iArr[2], 23, -995338651);
        int d10 = d(c22, c25, c24, c23, iArr[0], 6, -198630844);
        int d11 = d(c23, d10, c25, c24, iArr[7], 10, 1126891415);
        int d12 = d(c24, d11, d10, c25, iArr[14], 15, -1416354905);
        int d13 = d(c25, d12, d11, d10, iArr[5], 21, -57434055);
        int d14 = d(d10, d13, d12, d11, iArr[12], 6, 1700485571);
        int d15 = d(d11, d14, d13, d12, iArr[3], 10, -1894986606);
        int d16 = d(d12, d15, d14, d13, iArr[10], 15, -1051523);
        int d17 = d(d13, d16, d15, d14, iArr[1], 21, -2054922799);
        int d18 = d(d14, d17, d16, d15, iArr[8], 6, 1873313359);
        int d19 = d(d15, d18, d17, d16, iArr[15], 10, -30611744);
        int d20 = d(d16, d19, d18, d17, iArr[6], 15, -1560198380);
        int d21 = d(d17, d20, d19, d18, iArr[13], 21, 1309151649);
        int d22 = d(d18, d21, d20, d19, iArr[4], 6, -145523070);
        int d23 = d(d19, d22, d21, d20, iArr[11], 10, -1120210379);
        int d24 = d(d20, d23, d22, d21, iArr[2], 15, 718787259);
        int d25 = d(d21, d24, d23, d22, iArr[9], 21, -343485551);
        int[] iArr2 = bVar.f17966b;
        iArr2[0] = iArr2[0] + d22;
        int[] iArr3 = bVar.f17966b;
        iArr3[1] = iArr3[1] + d25;
        int[] iArr4 = bVar.f17966b;
        iArr4[2] = iArr4[2] + d24;
        int[] iArr5 = bVar.f17966b;
        iArr5[3] = iArr5[3] + d23;
    }

    private static byte[] a(long j10) {
        return new byte[]{(byte) (j10 & 255), (byte) ((j10 >>> 8) & 255), (byte) ((j10 >>> 16) & 255), (byte) ((j10 >>> 24) & 255), (byte) ((j10 >>> 32) & 255), (byte) ((j10 >>> 40) & 255), (byte) ((j10 >>> 48) & 255), (byte) ((j10 >>> 56) & 255)};
    }

    private static byte[] a(int[] iArr, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12 += 4) {
            int i13 = iArr[i11];
            bArr[i12] = (byte) (i13 & 255);
            bArr[i12 + 1] = (byte) ((i13 >>> 8) & 255);
            bArr[i12 + 2] = (byte) ((i13 >>> 16) & 255);
            bArr[i12 + 3] = (byte) ((i13 >>> 24) & 255);
            i11++;
        }
        return bArr;
    }

    private int[] a(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13 += 4) {
            this.f17964c[i12] = (bArr[i13 + i11] & 255) | ((bArr[(i13 + 1) + i11] & 255) << 8) | ((bArr[(i13 + 2) + i11] & 255) << 16) | ((bArr[(i13 + 3) + i11] & 255) << 24);
            i12++;
        }
        return this.f17964c;
    }

    private static int b(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i10 + ((i12 & (~i13)) | (i11 & i13)) + i14 + i16;
        return ((i17 >>> (32 - i15)) | (i17 << i15)) + i11;
    }

    private static int c(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i10 + ((i12 ^ i11) ^ i13) + i14 + i16;
        return ((i17 >>> (32 - i15)) | (i17 << i15)) + i11;
    }

    private static int d(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i10 + (i12 ^ ((~i13) | i11)) + i14 + i16;
        return ((i17 >>> (32 - i15)) | (i17 << i15)) + i11;
    }

    public void a(byte b10) {
        a(new byte[]{b10}, 1);
    }

    public void a(String str, String str2) throws UnsupportedEncodingException {
        b(str.getBytes(str2));
    }

    public void a(byte[] bArr, int i10) {
        b(bArr, 0, i10);
    }

    public byte[] a() {
        if (!this.f17963b.f17965a) {
            this.f17963b.f(this.f17962a);
            long j10 = this.f17963b.f17967c;
            int i10 = (int) ((j10 >>> 3) & 63);
            a(this.f17963b, f17961d, 0, i10 < 56 ? 56 - i10 : 120 - i10);
            a(this.f17963b, a(j10), 0, 8);
            this.f17963b.f17965a = true;
        }
        return a(this.f17963b.f17966b, 16);
    }

    public String b() {
        return a(a());
    }

    public void b(String str) {
        b(str.getBytes());
    }

    public void b(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    public void b(byte[] bArr, int i10, int i11) {
        a(this.f17962a, bArr, i10, i11);
    }

    public void c() {
        this.f17962a.a();
        this.f17963b.f17965a = false;
    }

    public String toString() {
        return b();
    }
}
