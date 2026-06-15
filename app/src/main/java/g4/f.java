package g4;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import n3.m1;
import z4.j0;
import z4.r0;
/* compiled from: Chunk.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class f implements j0.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f25735a = e4.l.a();

    /* renamed from: b  reason: collision with root package name */
    public final z4.p f25736b;

    /* renamed from: c  reason: collision with root package name */
    public final int f25737c;

    /* renamed from: d  reason: collision with root package name */
    public final m1 f25738d;

    /* renamed from: e  reason: collision with root package name */
    public final int f25739e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f25740f;

    /* renamed from: g  reason: collision with root package name */
    public final long f25741g;

    /* renamed from: h  reason: collision with root package name */
    public final long f25742h;

    /* renamed from: i  reason: collision with root package name */
    protected final r0 f25743i;

    public f(z4.l lVar, z4.p pVar, int i10, m1 m1Var, int i11, Object obj, long j10, long j11) {
        this.f25743i = new r0(lVar);
        this.f25736b = (z4.p) a5.a.e(pVar);
        this.f25737c = i10;
        this.f25738d = m1Var;
        this.f25739e = i11;
        this.f25740f = obj;
        this.f25741g = j10;
        this.f25742h = j11;
    }

    public final long c() {
        return this.f25743i.o();
    }

    public final long d() {
        return this.f25742h - this.f25741g;
    }

    public final Map<String, List<String>> e() {
        return this.f25743i.q();
    }

    public final Uri f() {
        return this.f25743i.p();
    }
}
