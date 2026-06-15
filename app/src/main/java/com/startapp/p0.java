package com.startapp;

import com.google.android.gms.common.api.Api;
import com.ironsource.b9;
import com.startapp.s0;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class p0 extends s0 {

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f22366f = {13, 10};

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f22367g = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f22368h = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f22369c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f22370d;

    /* renamed from: e  reason: collision with root package name */
    public final int f22371e;

    public p0(int i10, byte[] bArr) {
        super(i10, bArr.length);
        if (!a(bArr)) {
            if (i10 > 0) {
                this.f22371e = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.f22370d = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.f22371e = 4;
                this.f22370d = null;
            }
            this.f22369c = f22367g;
            return;
        }
        String a10 = r8.a(bArr);
        throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + a10 + b9.i.f16698e);
    }

    public static String b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            p0 p0Var = new p0(0, f22366f);
            long length = (((bArr.length + 3) - 1) / 3) * 4;
            int i10 = p0Var.f22482a;
            if (i10 > 0) {
                long j10 = i10;
                length += (((length + j10) - 1) / j10) * p0Var.f22483b;
            }
            if (length <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
                if (bArr.length != 0) {
                    s0.a aVar = new s0.a();
                    p0Var.a(bArr, bArr.length, aVar);
                    p0Var.a(bArr, -1, aVar);
                    int i11 = aVar.f22486c - aVar.f22487d;
                    byte[] bArr2 = new byte[i11];
                    if (aVar.f22485b != null) {
                        int min = Math.min(i11, i11);
                        System.arraycopy(aVar.f22485b, aVar.f22487d, bArr2, 0, min);
                        int i12 = aVar.f22487d + min;
                        aVar.f22487d = i12;
                        if (i12 >= aVar.f22486c) {
                            aVar.f22485b = null;
                        }
                    }
                    bArr = bArr2;
                }
            } else {
                throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + length + ") than the specified maximum size of 2147483647");
            }
        }
        return r8.a(bArr);
    }

    public final void a(byte[] bArr, int i10, s0.a aVar) {
        if (aVar.f22488e) {
            return;
        }
        if (i10 >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = this.f22371e;
                byte[] bArr2 = aVar.f22485b;
                if (bArr2 == null || bArr2.length < aVar.f22486c + i13) {
                    if (bArr2 == null) {
                        aVar.f22485b = new byte[8192];
                        aVar.f22486c = 0;
                        aVar.f22487d = 0;
                    } else {
                        byte[] bArr3 = new byte[bArr2.length * 2];
                        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                        aVar.f22485b = bArr3;
                    }
                    bArr2 = aVar.f22485b;
                }
                int i14 = (aVar.f22490g + 1) % 3;
                aVar.f22490g = i14;
                int i15 = i12 + 1;
                int i16 = bArr[i12];
                if (i16 < 0) {
                    i16 += 256;
                }
                int i17 = (aVar.f22484a << 8) + i16;
                aVar.f22484a = i17;
                if (i14 == 0) {
                    int i18 = aVar.f22486c;
                    int i19 = i18 + 1;
                    byte[] bArr4 = this.f22369c;
                    bArr2[i18] = bArr4[(i17 >> 18) & 63];
                    int i20 = i19 + 1;
                    bArr2[i19] = bArr4[(i17 >> 12) & 63];
                    int i21 = i20 + 1;
                    bArr2[i20] = bArr4[(i17 >> 6) & 63];
                    int i22 = i21 + 1;
                    aVar.f22486c = i22;
                    bArr2[i21] = bArr4[i17 & 63];
                    int i23 = aVar.f22489f + 4;
                    aVar.f22489f = i23;
                    int i24 = this.f22482a;
                    if (i24 > 0 && i24 <= i23) {
                        byte[] bArr5 = this.f22370d;
                        System.arraycopy(bArr5, 0, bArr2, i22, bArr5.length);
                        aVar.f22486c += this.f22370d.length;
                        aVar.f22489f = 0;
                    }
                }
                i11++;
                i12 = i15;
            }
            return;
        }
        aVar.f22488e = true;
        if (aVar.f22490g == 0 && this.f22482a == 0) {
            return;
        }
        int i25 = this.f22371e;
        byte[] bArr6 = aVar.f22485b;
        if (bArr6 == null || bArr6.length < aVar.f22486c + i25) {
            if (bArr6 == null) {
                aVar.f22485b = new byte[8192];
                aVar.f22486c = 0;
                aVar.f22487d = 0;
            } else {
                byte[] bArr7 = new byte[bArr6.length * 2];
                System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
                aVar.f22485b = bArr7;
            }
            bArr6 = aVar.f22485b;
        }
        int i26 = aVar.f22486c;
        int i27 = aVar.f22490g;
        if (i27 != 0) {
            if (i27 == 1) {
                int i28 = i26 + 1;
                byte[] bArr8 = this.f22369c;
                int i29 = aVar.f22484a;
                bArr6[i26] = bArr8[(i29 >> 2) & 63];
                int i30 = i28 + 1;
                aVar.f22486c = i30;
                bArr6[i28] = bArr8[(i29 << 4) & 63];
                if (bArr8 == f22367g) {
                    int i31 = i30 + 1;
                    bArr6[i30] = 61;
                    aVar.f22486c = i31 + 1;
                    bArr6[i31] = 61;
                }
            } else if (i27 == 2) {
                int i32 = i26 + 1;
                byte[] bArr9 = this.f22369c;
                int i33 = aVar.f22484a;
                bArr6[i26] = bArr9[(i33 >> 10) & 63];
                int i34 = i32 + 1;
                bArr6[i32] = bArr9[(i33 >> 4) & 63];
                int i35 = i34 + 1;
                aVar.f22486c = i35;
                bArr6[i34] = bArr9[(i33 << 2) & 63];
                if (bArr9 == f22367g) {
                    aVar.f22486c = i35 + 1;
                    bArr6[i35] = 61;
                }
            } else {
                throw new IllegalStateException("Impossible modulus " + aVar.f22490g);
            }
        }
        int i36 = aVar.f22489f;
        int i37 = aVar.f22486c;
        int i38 = (i37 - i26) + i36;
        aVar.f22489f = i38;
        if (this.f22482a <= 0 || i38 <= 0) {
            return;
        }
        byte[] bArr10 = this.f22370d;
        System.arraycopy(bArr10, 0, bArr6, i37, bArr10.length);
        aVar.f22486c += this.f22370d.length;
    }
}
