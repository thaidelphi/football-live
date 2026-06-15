package y1;
/* compiled from: DiskCacheStrategy.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f32924a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final j f32925b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final j f32926c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final j f32927d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final j f32928e = new e();

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends j {
        a() {
        }

        @Override // y1.j
        public boolean a() {
            return true;
        }

        @Override // y1.j
        public boolean b() {
            return true;
        }

        @Override // y1.j
        public boolean c(w1.a aVar) {
            return aVar == w1.a.REMOTE;
        }

        @Override // y1.j
        public boolean d(boolean z10, w1.a aVar, w1.c cVar) {
            return (aVar == w1.a.RESOURCE_DISK_CACHE || aVar == w1.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b extends j {
        b() {
        }

        @Override // y1.j
        public boolean a() {
            return false;
        }

        @Override // y1.j
        public boolean b() {
            return false;
        }

        @Override // y1.j
        public boolean c(w1.a aVar) {
            return false;
        }

        @Override // y1.j
        public boolean d(boolean z10, w1.a aVar, w1.c cVar) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c extends j {
        c() {
        }

        @Override // y1.j
        public boolean a() {
            return true;
        }

        @Override // y1.j
        public boolean b() {
            return false;
        }

        @Override // y1.j
        public boolean c(w1.a aVar) {
            return (aVar == w1.a.DATA_DISK_CACHE || aVar == w1.a.MEMORY_CACHE) ? false : true;
        }

        @Override // y1.j
        public boolean d(boolean z10, w1.a aVar, w1.c cVar) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class d extends j {
        d() {
        }

        @Override // y1.j
        public boolean a() {
            return false;
        }

        @Override // y1.j
        public boolean b() {
            return true;
        }

        @Override // y1.j
        public boolean c(w1.a aVar) {
            return false;
        }

        @Override // y1.j
        public boolean d(boolean z10, w1.a aVar, w1.c cVar) {
            return (aVar == w1.a.RESOURCE_DISK_CACHE || aVar == w1.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class e extends j {
        e() {
        }

        @Override // y1.j
        public boolean a() {
            return true;
        }

        @Override // y1.j
        public boolean b() {
            return true;
        }

        @Override // y1.j
        public boolean c(w1.a aVar) {
            return aVar == w1.a.REMOTE;
        }

        @Override // y1.j
        public boolean d(boolean z10, w1.a aVar, w1.c cVar) {
            return ((z10 && aVar == w1.a.DATA_DISK_CACHE) || aVar == w1.a.LOCAL) && cVar == w1.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(w1.a aVar);

    public abstract boolean d(boolean z10, w1.a aVar, w1.c cVar);
}
