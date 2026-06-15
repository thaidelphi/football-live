package com.startapp;

import java.util.Arrays;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class s0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f22482a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22483b;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f22484a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f22485b;

        /* renamed from: c  reason: collision with root package name */
        public int f22486c;

        /* renamed from: d  reason: collision with root package name */
        public int f22487d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f22488e;

        /* renamed from: f  reason: collision with root package name */
        public int f22489f;

        /* renamed from: g  reason: collision with root package name */
        public int f22490g;

        public final String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", a.class.getSimpleName(), Arrays.toString(this.f22485b), Integer.valueOf(this.f22489f), Boolean.valueOf(this.f22488e), Integer.valueOf(this.f22484a), 0L, Integer.valueOf(this.f22490g), Integer.valueOf(this.f22486c), Integer.valueOf(this.f22487d));
        }
    }

    public s0(int i10, int i11) {
        this.f22482a = i10 > 0 && i11 > 0 ? (i10 / 4) * 4 : 0;
        this.f22483b = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f A[LOOP:0: B:3:0x0003->B:15:0x001f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0022 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(byte[] r8) {
        /*
            r7 = this;
            int r0 = r8.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L23
            r3 = r8[r2]
            r4 = 61
            r5 = 1
            if (r4 == r3) goto L22
            if (r3 < 0) goto L1b
            byte[] r4 = com.startapp.p0.f22368h
            r6 = 123(0x7b, float:1.72E-43)
            if (r3 >= r6) goto L1b
            r3 = r4[r3]
            r4 = -1
            if (r3 == r4) goto L1b
            r3 = r5
            goto L1c
        L1b:
            r3 = r1
        L1c:
            if (r3 == 0) goto L1f
            goto L22
        L1f:
            int r2 = r2 + 1
            goto L3
        L22:
            return r5
        L23:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.s0.a(byte[]):boolean");
    }
}
