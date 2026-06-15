package x4;

import e4.k0;
import e4.t;
import java.util.List;
import n3.l3;
import n3.m1;
/* compiled from: ExoTrackSelection.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface s extends v {

    /* compiled from: ExoTrackSelection.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final k0 f32678a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f32679b;

        /* renamed from: c  reason: collision with root package name */
        public final int f32680c;

        public a(k0 k0Var, int... iArr) {
            this(k0Var, iArr, 0);
        }

        public a(k0 k0Var, int[] iArr, int i10) {
            if (iArr.length == 0) {
                a5.t.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f32678a = k0Var;
            this.f32679b = iArr;
            this.f32680c = i10;
        }
    }

    /* compiled from: ExoTrackSelection.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        s[] a(a[] aVarArr, z4.f fVar, t.b bVar, l3 l3Var);
    }

    int a();

    boolean c(int i10, long j10);

    boolean d(int i10, long j10);

    void e();

    boolean h(long j10, g4.f fVar, List<? extends g4.n> list);

    void i(float f10);

    Object j();

    void k();

    void m(long j10, long j11, long j12, List<? extends g4.n> list, g4.o[] oVarArr);

    void o(boolean z10);

    void p();

    int q(long j10, List<? extends g4.n> list);

    int r();

    m1 s();

    int t();

    void u();
}
