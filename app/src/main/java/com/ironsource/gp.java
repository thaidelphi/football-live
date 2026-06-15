package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class gp {

    /* renamed from: a  reason: collision with root package name */
    private hp f17606a;

    /* renamed from: b  reason: collision with root package name */
    private long f17607b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17608c;

    public gp() {
        this(false, 1, null);
    }

    public gp(boolean z10) {
        this.f17608c = z10;
    }

    public /* synthetic */ gp(boolean z10, int i10, kotlin.jvm.internal.h hVar) {
        this((i10 & 1) != 0 ? false : z10);
    }

    public final hp a() {
        return this.f17606a;
    }

    public final void a(hp hpVar) {
        this.f17606a = hpVar;
    }

    public final void a(boolean z10) {
        this.f17608c = z10;
        if (!z10) {
            hp hpVar = this.f17606a;
            if (hpVar != null) {
                hpVar.b(this);
                return;
            }
            return;
        }
        this.f17607b = System.currentTimeMillis();
        hp hpVar2 = this.f17606a;
        if (hpVar2 != null) {
            hpVar2.a(this);
        }
    }

    public abstract String b();

    public final long c() {
        return this.f17607b;
    }

    public final boolean d() {
        return this.f17608c;
    }
}
