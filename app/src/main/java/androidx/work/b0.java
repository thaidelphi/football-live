package androidx.work;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
/* compiled from: WorkRequest.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    private UUID f4615a;

    /* renamed from: b  reason: collision with root package name */
    private l1.p f4616b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f4617c;

    /* compiled from: WorkRequest.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class a<B extends a<?, ?>, W extends b0> {

        /* renamed from: c  reason: collision with root package name */
        l1.p f4620c;

        /* renamed from: e  reason: collision with root package name */
        Class<? extends ListenableWorker> f4622e;

        /* renamed from: a  reason: collision with root package name */
        boolean f4618a = false;

        /* renamed from: d  reason: collision with root package name */
        Set<String> f4621d = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        UUID f4619b = UUID.randomUUID();

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Class<? extends ListenableWorker> cls) {
            this.f4622e = cls;
            this.f4620c = new l1.p(this.f4619b.toString(), cls.getName());
            a(cls.getName());
        }

        public final B a(String str) {
            this.f4621d.add(str);
            return d();
        }

        public final W b() {
            W c10 = c();
            c cVar = this.f4620c.f27441j;
            int i10 = Build.VERSION.SDK_INT;
            boolean z10 = (i10 >= 24 && cVar.e()) || cVar.f() || cVar.g() || (i10 >= 23 && cVar.h());
            l1.p pVar = this.f4620c;
            if (pVar.f27448q) {
                if (!z10) {
                    if (pVar.f27438g > 0) {
                        throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                    }
                } else {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
            }
            this.f4619b = UUID.randomUUID();
            l1.p pVar2 = new l1.p(this.f4620c);
            this.f4620c = pVar2;
            pVar2.f27432a = this.f4619b.toString();
            return c10;
        }

        abstract W c();

        abstract B d();

        public final B e(c cVar) {
            this.f4620c.f27441j = cVar;
            return d();
        }

        public B f(long j10, TimeUnit timeUnit) {
            this.f4620c.f27438g = timeUnit.toMillis(j10);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f4620c.f27438g) {
                return d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final B g(e eVar) {
            this.f4620c.f27436e = eVar;
            return d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b0(UUID uuid, l1.p pVar, Set<String> set) {
        this.f4615a = uuid;
        this.f4616b = pVar;
        this.f4617c = set;
    }

    public String a() {
        return this.f4615a.toString();
    }

    public Set<String> b() {
        return this.f4617c;
    }

    public l1.p c() {
        return this.f4616b;
    }
}
