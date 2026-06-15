package x4;

import e4.k0;
import java.util.List;
/* compiled from: FixedTrackSelection.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class t extends c {

    /* renamed from: h  reason: collision with root package name */
    private final int f32681h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f32682i;

    public t(k0 k0Var, int i10, int i11) {
        this(k0Var, i10, i11, 0, null);
    }

    @Override // x4.s
    public int a() {
        return 0;
    }

    @Override // x4.s
    public Object j() {
        return this.f32682i;
    }

    @Override // x4.s
    public void m(long j10, long j11, long j12, List<? extends g4.n> list, g4.o[] oVarArr) {
    }

    @Override // x4.s
    public int t() {
        return this.f32681h;
    }

    public t(k0 k0Var, int i10, int i11, int i12, Object obj) {
        super(k0Var, new int[]{i10}, i11);
        this.f32681h = i12;
        this.f32682i = obj;
    }
}
