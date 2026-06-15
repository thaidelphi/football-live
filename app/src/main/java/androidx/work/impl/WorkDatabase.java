package androidx.work.impl;

import android.content.Context;
import androidx.room.n0;
import androidx.room.q0;
import androidx.work.impl.a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import l1.e;
import l1.k;
import l1.n;
import l1.q;
import l1.t;
import v0.g;
import v0.h;
import w0.c;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class WorkDatabase extends q0 {

    /* renamed from: a  reason: collision with root package name */
    private static final long f4661a = TimeUnit.DAYS.toMillis(1);

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements h.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f4662a;

        a(Context context) {
            this.f4662a = context;
        }

        @Override // v0.h.c
        public h a(h.b bVar) {
            h.b.a a10 = h.b.a(this.f4662a);
            a10.c(bVar.f31680b).b(bVar.f31681c).d(true);
            return new c().a(a10.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends q0.b {
        b() {
        }

        @Override // androidx.room.q0.b
        public void c(g gVar) {
            super.c(gVar);
            gVar.g();
            try {
                gVar.m(WorkDatabase.g());
                gVar.v();
            } finally {
                gVar.D();
            }
        }
    }

    public static WorkDatabase c(Context context, Executor executor, boolean z10) {
        q0.a a10;
        if (z10) {
            a10 = n0.c(context, WorkDatabase.class).c();
        } else {
            a10 = n0.a(context, WorkDatabase.class, e1.h.d());
            a10.f(new a(context));
        }
        return (WorkDatabase) a10.g(executor).a(e()).b(androidx.work.impl.a.f4671a).b(new a.h(context, 2, 3)).b(androidx.work.impl.a.f4672b).b(androidx.work.impl.a.f4673c).b(new a.h(context, 5, 6)).b(androidx.work.impl.a.f4674d).b(androidx.work.impl.a.f4675e).b(androidx.work.impl.a.f4676f).b(new a.i(context)).b(new a.h(context, 10, 11)).b(androidx.work.impl.a.f4677g).e().d();
    }

    static q0.b e() {
        return new b();
    }

    static long f() {
        return System.currentTimeMillis() - f4661a;
    }

    static String g() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + f() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract l1.b d();

    public abstract e h();

    public abstract l1.h i();

    public abstract k j();

    public abstract n k();

    public abstract q l();

    public abstract t m();
}
