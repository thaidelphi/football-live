package com.google.android.exoplayer2.source.dash;

import a5.p0;
import e4.e0;
import i4.f;
import java.io.IOException;
import n3.m1;
import n3.n1;
import q3.g;
/* compiled from: EventSampleStream.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class d implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final m1 f10754a;

    /* renamed from: c  reason: collision with root package name */
    private long[] f10756c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10757d;

    /* renamed from: e  reason: collision with root package name */
    private f f10758e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10759f;

    /* renamed from: g  reason: collision with root package name */
    private int f10760g;

    /* renamed from: b  reason: collision with root package name */
    private final a4.b f10755b = new a4.b();

    /* renamed from: h  reason: collision with root package name */
    private long f10761h = -9223372036854775807L;

    public d(f fVar, m1 m1Var, boolean z10) {
        this.f10754a = m1Var;
        this.f10758e = fVar;
        this.f10756c = fVar.f26550b;
        d(fVar, z10);
    }

    @Override // e4.e0
    public void a() throws IOException {
    }

    public String b() {
        return this.f10758e.a();
    }

    public void c(long j10) {
        boolean z10 = true;
        int e8 = p0.e(this.f10756c, j10, true, false);
        this.f10760g = e8;
        if (!this.f10757d || e8 != this.f10756c.length) {
            z10 = false;
        }
        if (!z10) {
            j10 = -9223372036854775807L;
        }
        this.f10761h = j10;
    }

    public void d(f fVar, boolean z10) {
        int i10 = this.f10760g;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f10756c[i10 - 1];
        this.f10757d = z10;
        this.f10758e = fVar;
        long[] jArr = fVar.f26550b;
        this.f10756c = jArr;
        long j11 = this.f10761h;
        if (j11 != -9223372036854775807L) {
            c(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f10760g = p0.e(jArr, j10, false, false);
        }
    }

    @Override // e4.e0
    public int f(n1 n1Var, g gVar, int i10) {
        int i11 = this.f10760g;
        boolean z10 = i11 == this.f10756c.length;
        if (z10 && !this.f10757d) {
            gVar.o(4);
            return -4;
        } else if ((i10 & 2) != 0 || !this.f10759f) {
            n1Var.f28250b = this.f10754a;
            this.f10759f = true;
            return -5;
        } else if (z10) {
            return -3;
        } else {
            if ((i10 & 1) == 0) {
                this.f10760g = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] a10 = this.f10755b.a(this.f10758e.f26549a[i11]);
                gVar.q(a10.length);
                gVar.f30091c.put(a10);
            }
            gVar.f30093e = this.f10756c[i11];
            gVar.o(1);
            return -4;
        }
    }

    @Override // e4.e0
    public boolean isReady() {
        return true;
    }

    @Override // e4.e0
    public int o(long j10) {
        int max = Math.max(this.f10760g, p0.e(this.f10756c, j10, true, false));
        int i10 = max - this.f10760g;
        this.f10760g = max;
        return i10;
    }
}
