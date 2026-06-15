package m1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.p;
import androidx.work.v;
import androidx.work.z;
import java.util.UUID;
/* compiled from: WorkProgressUpdater.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n implements v {

    /* renamed from: c  reason: collision with root package name */
    static final String f27672c = p.f("WorkProgressUpdater");

    /* renamed from: a  reason: collision with root package name */
    final WorkDatabase f27673a;

    /* renamed from: b  reason: collision with root package name */
    final n1.a f27674b;

    /* compiled from: WorkProgressUpdater.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UUID f27675a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.work.e f27676b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f27677c;

        a(UUID uuid, androidx.work.e eVar, androidx.work.impl.utils.futures.c cVar) {
            this.f27675a = uuid;
            this.f27676b = eVar;
            this.f27677c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l1.p g10;
            String uuid = this.f27675a.toString();
            p c10 = p.c();
            String str = n.f27672c;
            c10.a(str, String.format("Updating progress for %s (%s)", this.f27675a, this.f27676b), new Throwable[0]);
            n.this.f27673a.beginTransaction();
            try {
                g10 = n.this.f27673a.l().g(uuid);
            } finally {
                try {
                    return;
                } finally {
                }
            }
            if (g10 != null) {
                if (g10.f27433b == z.a.RUNNING) {
                    n.this.f27673a.k().c(new l1.m(uuid, this.f27676b));
                } else {
                    p.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid), new Throwable[0]);
                }
                this.f27677c.o(null);
                n.this.f27673a.setTransactionSuccessful();
                return;
            }
            throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
    }

    public n(WorkDatabase workDatabase, n1.a aVar) {
        this.f27673a = workDatabase;
        this.f27674b = aVar;
    }

    @Override // androidx.work.v
    public b6.a<Void> a(Context context, UUID uuid, androidx.work.e eVar) {
        androidx.work.impl.utils.futures.c s10 = androidx.work.impl.utils.futures.c.s();
        this.f27674b.b(new a(uuid, eVar, s10));
        return s10;
    }
}
