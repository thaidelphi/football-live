package c2;

import java.util.Queue;
/* compiled from: ModelCache.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m<A, B> {

    /* renamed from: a  reason: collision with root package name */
    private final s2.g<b<A>, B> f5366a;

    /* compiled from: ModelCache.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends s2.g<b<A>, B> {
        a(long j10) {
            super(j10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // s2.g
        /* renamed from: n */
        public void j(b<A> bVar, B b10) {
            bVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModelCache.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b<A> {

        /* renamed from: d  reason: collision with root package name */
        private static final Queue<b<?>> f5368d = s2.k.e(0);

        /* renamed from: a  reason: collision with root package name */
        private int f5369a;

        /* renamed from: b  reason: collision with root package name */
        private int f5370b;

        /* renamed from: c  reason: collision with root package name */
        private A f5371c;

        private b() {
        }

        static <A> b<A> a(A a10, int i10, int i11) {
            b<A> bVar;
            Queue<b<?>> queue = f5368d;
            synchronized (queue) {
                bVar = (b<A>) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a10, i10, i11);
            return bVar;
        }

        private void b(A a10, int i10, int i11) {
            this.f5371c = a10;
            this.f5370b = i10;
            this.f5369a = i11;
        }

        public void c() {
            Queue<b<?>> queue = f5368d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f5370b == bVar.f5370b && this.f5369a == bVar.f5369a && this.f5371c.equals(bVar.f5371c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f5369a * 31) + this.f5370b) * 31) + this.f5371c.hashCode();
        }
    }

    public m(long j10) {
        this.f5366a = new a(j10);
    }

    public B a(A a10, int i10, int i11) {
        b<A> a11 = b.a(a10, i10, i11);
        B g10 = this.f5366a.g(a11);
        a11.c();
        return g10;
    }

    public void b(A a10, int i10, int i11, B b10) {
        this.f5366a.k(b.a(a10, i10, i11), b10);
    }
}
