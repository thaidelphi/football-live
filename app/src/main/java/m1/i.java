package m1;

import androidx.work.z;
import java.util.List;
import l1.p;
/* compiled from: StatusRunnable.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class i<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<T> f27643a = androidx.work.impl.utils.futures.c.s();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatusRunnable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends i<List<z>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e1.i f27644b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f27645c;

        a(e1.i iVar, String str) {
            this.f27644b = iVar;
            this.f27645c = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m1.i
        /* renamed from: d */
        public List<z> c() {
            return p.f27431t.apply(this.f27644b.w().l().s(this.f27645c));
        }
    }

    public static i<List<z>> a(e1.i iVar, String str) {
        return new a(iVar, str);
    }

    public b6.a<T> b() {
        return this.f27643a;
    }

    abstract T c();

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f27643a.o(c());
        } catch (Throwable th) {
            this.f27643a.p(th);
        }
    }
}
