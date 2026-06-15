package z1;

import android.graphics.Bitmap;
import com.ironsource.b9;
/* compiled from: AttributeStrategy.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class c implements l {

    /* renamed from: a  reason: collision with root package name */
    private final b f33418a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final h<a, Bitmap> f33419b = new h<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeStrategy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements m {

        /* renamed from: a  reason: collision with root package name */
        private final b f33420a;

        /* renamed from: b  reason: collision with root package name */
        private int f33421b;

        /* renamed from: c  reason: collision with root package name */
        private int f33422c;

        /* renamed from: d  reason: collision with root package name */
        private Bitmap.Config f33423d;

        public a(b bVar) {
            this.f33420a = bVar;
        }

        @Override // z1.m
        public void a() {
            this.f33420a.c(this);
        }

        public void b(int i10, int i11, Bitmap.Config config) {
            this.f33421b = i10;
            this.f33422c = i11;
            this.f33423d = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f33421b == aVar.f33421b && this.f33422c == aVar.f33422c && this.f33423d == aVar.f33423d;
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f33421b * 31) + this.f33422c) * 31;
            Bitmap.Config config = this.f33423d;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return c.g(this.f33421b, this.f33422c, this.f33423d);
        }
    }

    /* compiled from: AttributeStrategy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class b extends d<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // z1.d
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        a e(int i10, int i11, Bitmap.Config config) {
            a b10 = b();
            b10.b(i10, i11, config);
            return b10;
        }
    }

    static String g(int i10, int i11, Bitmap.Config config) {
        return b9.i.f16696d + i10 + "x" + i11 + "], " + config;
    }

    private static String h(Bitmap bitmap) {
        return g(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // z1.l
    public String a(Bitmap bitmap) {
        return h(bitmap);
    }

    @Override // z1.l
    public Bitmap b() {
        return this.f33419b.f();
    }

    @Override // z1.l
    public void c(Bitmap bitmap) {
        this.f33419b.d(this.f33418a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // z1.l
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        return this.f33419b.a(this.f33418a.e(i10, i11, config));
    }

    @Override // z1.l
    public String e(int i10, int i11, Bitmap.Config config) {
        return g(i10, i11, config);
    }

    @Override // z1.l
    public int f(Bitmap bitmap) {
        return s2.k.g(bitmap);
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f33419b;
    }
}
