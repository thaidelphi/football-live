package n3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import e4.t;
/* compiled from: MediaPeriodInfo.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class b2 {

    /* renamed from: a  reason: collision with root package name */
    public final t.b f27887a;

    /* renamed from: b  reason: collision with root package name */
    public final long f27888b;

    /* renamed from: c  reason: collision with root package name */
    public final long f27889c;

    /* renamed from: d  reason: collision with root package name */
    public final long f27890d;

    /* renamed from: e  reason: collision with root package name */
    public final long f27891e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f27892f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f27893g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f27894h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f27895i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b2(t.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        a5.a.a(!z13 || z11);
        a5.a.a(!z12 || z11);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z14 = true;
        }
        a5.a.a(z14);
        this.f27887a = bVar;
        this.f27888b = j10;
        this.f27889c = j11;
        this.f27890d = j12;
        this.f27891e = j13;
        this.f27892f = z10;
        this.f27893g = z11;
        this.f27894h = z12;
        this.f27895i = z13;
    }

    public b2 a(long j10) {
        return j10 == this.f27889c ? this : new b2(this.f27887a, this.f27888b, j10, this.f27890d, this.f27891e, this.f27892f, this.f27893g, this.f27894h, this.f27895i);
    }

    public b2 b(long j10) {
        return j10 == this.f27888b ? this : new b2(this.f27887a, j10, this.f27889c, this.f27890d, this.f27891e, this.f27892f, this.f27893g, this.f27894h, this.f27895i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b2.class != obj.getClass()) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return this.f27888b == b2Var.f27888b && this.f27889c == b2Var.f27889c && this.f27890d == b2Var.f27890d && this.f27891e == b2Var.f27891e && this.f27892f == b2Var.f27892f && this.f27893g == b2Var.f27893g && this.f27894h == b2Var.f27894h && this.f27895i == b2Var.f27895i && a5.p0.c(this.f27887a, b2Var.f27887a);
    }

    public int hashCode() {
        return ((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f27887a.hashCode()) * 31) + ((int) this.f27888b)) * 31) + ((int) this.f27889c)) * 31) + ((int) this.f27890d)) * 31) + ((int) this.f27891e)) * 31) + (this.f27892f ? 1 : 0)) * 31) + (this.f27893g ? 1 : 0)) * 31) + (this.f27894h ? 1 : 0)) * 31) + (this.f27895i ? 1 : 0);
    }
}
