package t;

import s.d;
import s.e;
/* compiled from: WidgetRun.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f30896a;

    /* renamed from: b  reason: collision with root package name */
    s.e f30897b;

    /* renamed from: c  reason: collision with root package name */
    m f30898c;

    /* renamed from: d  reason: collision with root package name */
    protected e.b f30899d;

    /* renamed from: e  reason: collision with root package name */
    g f30900e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f30901f = 0;

    /* renamed from: g  reason: collision with root package name */
    boolean f30902g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f30903h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f30904i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    protected b f30905j = b.NONE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WidgetRun.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30906a;

        static {
            int[] iArr = new int[d.b.values().length];
            f30906a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30906a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30906a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30906a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30906a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: WidgetRun.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(s.e eVar) {
        this.f30897b = eVar;
    }

    private void l(int i10, int i11) {
        int i12;
        int i13 = this.f30896a;
        if (i13 == 0) {
            this.f30900e.d(g(i11, i10));
        } else if (i13 == 1) {
            this.f30900e.d(Math.min(g(this.f30900e.f30866m, i10), i11));
        } else if (i13 == 2) {
            s.e I = this.f30897b.I();
            if (I != null) {
                g gVar = (i10 == 0 ? I.f30535e : I.f30537f).f30900e;
                if (gVar.f30854j) {
                    s.e eVar = this.f30897b;
                    this.f30900e.d(g((int) ((gVar.f30851g * (i10 == 0 ? eVar.f30567u : eVar.f30573x)) + 0.5f), i10));
                }
            }
        } else if (i13 != 3) {
        } else {
            s.e eVar2 = this.f30897b;
            p pVar = eVar2.f30535e;
            e.b bVar = pVar.f30899d;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && pVar.f30896a == 3) {
                n nVar = eVar2.f30537f;
                if (nVar.f30899d == bVar2 && nVar.f30896a == 3) {
                    return;
                }
            }
            if (i10 == 0) {
                pVar = eVar2.f30537f;
            }
            if (pVar.f30900e.f30854j) {
                float t10 = eVar2.t();
                if (i10 == 1) {
                    i12 = (int) ((pVar.f30900e.f30851g / t10) + 0.5f);
                } else {
                    i12 = (int) ((t10 * pVar.f30900e.f30851g) + 0.5f);
                }
                this.f30900e.d(i12);
            }
        }
    }

    @Override // t.d
    public void a(d dVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(f fVar, f fVar2, int i10) {
        fVar.f30856l.add(fVar2);
        fVar.f30850f = i10;
        fVar2.f30855k.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f30856l.add(fVar2);
        fVar.f30856l.add(this.f30900e);
        fVar.f30852h = i10;
        fVar.f30853i = gVar;
        fVar2.f30855k.add(fVar);
        gVar.f30855k.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int g(int i10, int i11) {
        int max;
        if (i11 == 0) {
            s.e eVar = this.f30897b;
            int i12 = eVar.f30565t;
            max = Math.max(eVar.f30563s, i10);
            if (i12 > 0) {
                max = Math.min(i12, i10);
            }
            if (max == i10) {
                return i10;
            }
        } else {
            s.e eVar2 = this.f30897b;
            int i13 = eVar2.f30571w;
            max = Math.max(eVar2.f30569v, i10);
            if (i13 > 0) {
                max = Math.min(i13, i10);
            }
            if (max == i10) {
                return i10;
            }
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f h(s.d dVar) {
        s.d dVar2 = dVar.f30512f;
        if (dVar2 == null) {
            return null;
        }
        s.e eVar = dVar2.f30510d;
        int i10 = a.f30906a[dVar2.f30511e.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        return eVar.f30537f.f30904i;
                    }
                    return eVar.f30537f.f30878k;
                }
                return eVar.f30537f.f30903h;
            }
            return eVar.f30535e.f30904i;
        }
        return eVar.f30535e.f30903h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f i(s.d dVar, int i10) {
        s.d dVar2 = dVar.f30512f;
        if (dVar2 == null) {
            return null;
        }
        s.e eVar = dVar2.f30510d;
        p pVar = i10 == 0 ? eVar.f30535e : eVar.f30537f;
        int i11 = a.f30906a[dVar2.f30511e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f30904i;
        }
        return pVar.f30903h;
    }

    public long j() {
        g gVar = this.f30900e;
        if (gVar.f30854j) {
            return gVar.f30851g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f30902g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean m();

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(d dVar, s.d dVar2, s.d dVar3, int i10) {
        f h10 = h(dVar2);
        f h11 = h(dVar3);
        if (h10.f30854j && h11.f30854j) {
            int e8 = h10.f30851g + dVar2.e();
            int e10 = h11.f30851g - dVar3.e();
            int i11 = e10 - e8;
            if (!this.f30900e.f30854j && this.f30899d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f30900e;
            if (gVar.f30854j) {
                if (gVar.f30851g == i11) {
                    this.f30903h.d(e8);
                    this.f30904i.d(e10);
                    return;
                }
                s.e eVar = this.f30897b;
                float w10 = i10 == 0 ? eVar.w() : eVar.M();
                if (h10 == h11) {
                    e8 = h10.f30851g;
                    e10 = h11.f30851g;
                    w10 = 0.5f;
                }
                this.f30903h.d((int) (e8 + 0.5f + (((e10 - e8) - this.f30900e.f30851g) * w10)));
                this.f30904i.d(this.f30903h.f30851g + this.f30900e.f30851g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(d dVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(d dVar) {
    }
}
