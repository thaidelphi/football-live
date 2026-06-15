package n3;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PlaylistTimeline.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u2 extends a {

    /* renamed from: f  reason: collision with root package name */
    private final int f28468f;

    /* renamed from: g  reason: collision with root package name */
    private final int f28469g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f28470h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f28471i;

    /* renamed from: j  reason: collision with root package name */
    private final l3[] f28472j;

    /* renamed from: k  reason: collision with root package name */
    private final Object[] f28473k;

    /* renamed from: l  reason: collision with root package name */
    private final HashMap<Object, Integer> f28474l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(Collection<? extends e2> collection, e4.g0 g0Var) {
        super(false, g0Var);
        int i10 = 0;
        int size = collection.size();
        this.f28470h = new int[size];
        this.f28471i = new int[size];
        this.f28472j = new l3[size];
        this.f28473k = new Object[size];
        this.f28474l = new HashMap<>();
        int i11 = 0;
        int i12 = 0;
        for (e2 e2Var : collection) {
            this.f28472j[i12] = e2Var.b();
            this.f28471i[i12] = i10;
            this.f28470h[i12] = i11;
            i10 += this.f28472j[i12].t();
            i11 += this.f28472j[i12].m();
            this.f28473k[i12] = e2Var.a();
            this.f28474l.put(this.f28473k[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f28468f = i10;
        this.f28469g = i11;
    }

    @Override // n3.a
    protected Object C(int i10) {
        return this.f28473k[i10];
    }

    @Override // n3.a
    protected int E(int i10) {
        return this.f28470h[i10];
    }

    @Override // n3.a
    protected int F(int i10) {
        return this.f28471i[i10];
    }

    @Override // n3.a
    protected l3 I(int i10) {
        return this.f28472j[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<l3> J() {
        return Arrays.asList(this.f28472j);
    }

    @Override // n3.l3
    public int m() {
        return this.f28469g;
    }

    @Override // n3.l3
    public int t() {
        return this.f28468f;
    }

    @Override // n3.a
    protected int x(Object obj) {
        Integer num = this.f28474l.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // n3.a
    protected int y(int i10) {
        return a5.p0.h(this.f28470h, i10 + 1, false, false);
    }

    @Override // n3.a
    protected int z(int i10) {
        return a5.p0.h(this.f28471i, i10 + 1, false, false);
    }
}
