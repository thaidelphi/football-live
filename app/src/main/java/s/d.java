package s;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import r.i;
import t.o;
/* compiled from: ConstraintAnchor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private int f30508b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f30509c;

    /* renamed from: d  reason: collision with root package name */
    public final e f30510d;

    /* renamed from: e  reason: collision with root package name */
    public final b f30511e;

    /* renamed from: f  reason: collision with root package name */
    public d f30512f;

    /* renamed from: i  reason: collision with root package name */
    r.i f30515i;

    /* renamed from: a  reason: collision with root package name */
    private HashSet<d> f30507a = null;

    /* renamed from: g  reason: collision with root package name */
    public int f30513g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f30514h = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintAnchor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30516a;

        static {
            int[] iArr = new int[b.values().length];
            f30516a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30516a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30516a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30516a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30516a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30516a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30516a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30516a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30516a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: ConstraintAnchor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f30510d = eVar;
        this.f30511e = bVar;
    }

    public boolean a(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            p();
            return true;
        } else if (z10 || o(dVar)) {
            this.f30512f = dVar;
            if (dVar.f30507a == null) {
                dVar.f30507a = new HashSet<>();
            }
            HashSet<d> hashSet = this.f30512f.f30507a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            if (i10 > 0) {
                this.f30513g = i10;
            } else {
                this.f30513g = 0;
            }
            this.f30514h = i11;
            return true;
        } else {
            return false;
        }
    }

    public void b(int i10, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f30507a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                t.i.a(it.next().f30510d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet<d> c() {
        return this.f30507a;
    }

    public int d() {
        if (this.f30509c) {
            return this.f30508b;
        }
        return 0;
    }

    public int e() {
        d dVar;
        if (this.f30510d.Q() == 8) {
            return 0;
        }
        if (this.f30514h > -1 && (dVar = this.f30512f) != null && dVar.f30510d.Q() == 8) {
            return this.f30514h;
        }
        return this.f30513g;
    }

    public final d f() {
        switch (a.f30516a[this.f30511e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f30510d.J;
            case 3:
                return this.f30510d.H;
            case 4:
                return this.f30510d.K;
            case 5:
                return this.f30510d.I;
            default:
                throw new AssertionError(this.f30511e.name());
        }
    }

    public e g() {
        return this.f30510d;
    }

    public r.i h() {
        return this.f30515i;
    }

    public d i() {
        return this.f30512f;
    }

    public b j() {
        return this.f30511e;
    }

    public boolean k() {
        HashSet<d> hashSet = this.f30507a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().n()) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f30507a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean m() {
        return this.f30509c;
    }

    public boolean n() {
        return this.f30512f != null;
    }

    public boolean o(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return false;
        }
        b j10 = dVar.j();
        b bVar = this.f30511e;
        if (j10 == bVar) {
            return bVar != b.BASELINE || (dVar.g().U() && g().U());
        }
        switch (a.f30516a[bVar.ordinal()]) {
            case 1:
                return (j10 == b.BASELINE || j10 == b.CENTER_X || j10 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z11 = j10 == b.LEFT || j10 == b.RIGHT;
                if (dVar.g() instanceof g) {
                    if (z11 || j10 == b.CENTER_X) {
                        z10 = true;
                    }
                    return z10;
                }
                return z11;
            case 4:
            case 5:
                boolean z12 = j10 == b.TOP || j10 == b.BOTTOM;
                if (dVar.g() instanceof g) {
                    if (z12 || j10 == b.CENTER_Y) {
                        z10 = true;
                    }
                    return z10;
                }
                return z12;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f30511e.name());
        }
    }

    public void p() {
        HashSet<d> hashSet;
        d dVar = this.f30512f;
        if (dVar != null && (hashSet = dVar.f30507a) != null) {
            hashSet.remove(this);
            if (this.f30512f.f30507a.size() == 0) {
                this.f30512f.f30507a = null;
            }
        }
        this.f30507a = null;
        this.f30512f = null;
        this.f30513g = 0;
        this.f30514h = -1;
        this.f30509c = false;
        this.f30508b = 0;
    }

    public void q() {
        this.f30509c = false;
        this.f30508b = 0;
    }

    public void r(r.c cVar) {
        r.i iVar = this.f30515i;
        if (iVar == null) {
            this.f30515i = new r.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public void s(int i10) {
        this.f30508b = i10;
        this.f30509c = true;
    }

    public String toString() {
        return this.f30510d.r() + ":" + this.f30511e.toString();
    }
}
