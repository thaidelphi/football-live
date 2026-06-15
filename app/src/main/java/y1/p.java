package y1;
/* compiled from: EngineResource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class p<Z> implements v<Z> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f32997a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f32998b;

    /* renamed from: c  reason: collision with root package name */
    private final v<Z> f32999c;

    /* renamed from: d  reason: collision with root package name */
    private final a f33000d;

    /* renamed from: e  reason: collision with root package name */
    private final w1.f f33001e;

    /* renamed from: f  reason: collision with root package name */
    private int f33002f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f33003g;

    /* compiled from: EngineResource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    interface a {
        void d(w1.f fVar, p<?> pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(v<Z> vVar, boolean z10, boolean z11, w1.f fVar, a aVar) {
        this.f32999c = (v) s2.j.d(vVar);
        this.f32997a = z10;
        this.f32998b = z11;
        this.f33001e = fVar;
        this.f33000d = (a) s2.j.d(aVar);
    }

    @Override // y1.v
    public synchronized void a() {
        if (this.f33002f <= 0) {
            if (!this.f33003g) {
                this.f33003g = true;
                if (this.f32998b) {
                    this.f32999c.a();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    @Override // y1.v
    public Class<Z> b() {
        return this.f32999c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void c() {
        if (!this.f33003g) {
            this.f33002f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v<Z> d() {
        return this.f32999c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f32997a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f33002f;
            if (i10 > 0) {
                z10 = true;
                int i11 = i10 - 1;
                this.f33002f = i11;
                if (i11 != 0) {
                    z10 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z10) {
            this.f33000d.d(this.f33001e, this);
        }
    }

    @Override // y1.v
    public Z get() {
        return this.f32999c.get();
    }

    @Override // y1.v
    public int getSize() {
        return this.f32999c.getSize();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f32997a + ", listener=" + this.f33000d + ", key=" + this.f33001e + ", acquired=" + this.f33002f + ", isRecycled=" + this.f33003g + ", resource=" + this.f32999c + '}';
    }
}
