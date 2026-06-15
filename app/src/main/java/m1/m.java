package m1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.p;
import androidx.work.z;
import java.util.UUID;
import l1.q;
/* compiled from: WorkForegroundUpdater.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m implements androidx.work.j {

    /* renamed from: d  reason: collision with root package name */
    private static final String f27663d = p.f("WMFgUpdater");

    /* renamed from: a  reason: collision with root package name */
    private final n1.a f27664a;

    /* renamed from: b  reason: collision with root package name */
    final k1.a f27665b;

    /* renamed from: c  reason: collision with root package name */
    final q f27666c;

    /* compiled from: WorkForegroundUpdater.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f27667a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UUID f27668b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.work.i f27669c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f27670d;

        a(androidx.work.impl.utils.futures.c cVar, UUID uuid, androidx.work.i iVar, Context context) {
            this.f27667a = cVar;
            this.f27668b = uuid;
            this.f27669c = iVar;
            this.f27670d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f27667a.isCancelled()) {
                    String uuid = this.f27668b.toString();
                    z.a f10 = m.this.f27666c.f(uuid);
                    if (f10 != null && !f10.a()) {
                        m.this.f27665b.b(uuid, this.f27669c);
                        this.f27670d.startService(androidx.work.impl.foreground.a.a(this.f27670d, uuid, this.f27669c));
                    } else {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                }
                this.f27667a.o(null);
            } catch (Throwable th) {
                this.f27667a.p(th);
            }
        }
    }

    public m(WorkDatabase workDatabase, k1.a aVar, n1.a aVar2) {
        this.f27665b = aVar;
        this.f27664a = aVar2;
        this.f27666c = workDatabase.l();
    }

    @Override // androidx.work.j
    public b6.a<Void> a(Context context, UUID uuid, androidx.work.i iVar) {
        androidx.work.impl.utils.futures.c s10 = androidx.work.impl.utils.futures.c.s();
        this.f27664a.b(new a(s10, uuid, iVar, context));
        return s10;
    }
}
