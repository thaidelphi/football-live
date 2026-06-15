package m1;

import android.text.TextUtils;
import androidx.work.e;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.p;
import androidx.work.s;
import java.util.List;
/* compiled from: EnqueueRunnable.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    private static final String f27627c = p.f("EnqueueRunnable");

    /* renamed from: a  reason: collision with root package name */
    private final e1.g f27628a;

    /* renamed from: b  reason: collision with root package name */
    private final e1.c f27629b = new e1.c();

    public b(e1.g gVar) {
        this.f27628a = gVar;
    }

    private static boolean c(e1.g gVar) {
        boolean d10 = d(gVar.i(), gVar.h(), (String[]) e1.g.n(gVar).toArray(new String[0]), gVar.f(), gVar.d());
        gVar.m();
        return d10;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e1 A[LOOP:5: B:125:0x01db->B:127:0x01e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean d(e1.i r19, java.util.List<? extends androidx.work.b0> r20, java.lang.String[] r21, java.lang.String r22, androidx.work.h r23) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.b.d(e1.i, java.util.List, java.lang.String[], java.lang.String, androidx.work.h):boolean");
    }

    private static boolean f(e1.g gVar) {
        List<e1.g> g10 = gVar.g();
        boolean z10 = false;
        if (g10 != null) {
            boolean z11 = false;
            for (e1.g gVar2 : g10) {
                if (!gVar2.l()) {
                    z11 |= f(gVar2);
                } else {
                    p.c().h(f27627c, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar2.e())), new Throwable[0]);
                }
            }
            z10 = z11;
        }
        return c(gVar) | z10;
    }

    private static void h(l1.p pVar) {
        androidx.work.c cVar = pVar.f27441j;
        String str = pVar.f27434c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (cVar.f() || cVar.i()) {
            e.a aVar = new e.a();
            aVar.c(pVar.f27436e).f("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f27434c = ConstraintTrackingWorker.class.getName();
            pVar.f27436e = aVar.a();
        }
    }

    private static boolean i(e1.i iVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (e1.e eVar : iVar.v()) {
                if (cls.isAssignableFrom(eVar.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public boolean b() {
        WorkDatabase w10 = this.f27628a.i().w();
        w10.beginTransaction();
        try {
            boolean f10 = f(this.f27628a);
            w10.setTransactionSuccessful();
            return f10;
        } finally {
            w10.endTransaction();
        }
    }

    public s e() {
        return this.f27629b;
    }

    public void g() {
        e1.i i10 = this.f27628a.i();
        e1.f.b(i10.q(), i10.w(), i10.v());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!this.f27628a.j()) {
                if (b()) {
                    d.a(this.f27628a.i().p(), RescheduleReceiver.class, true);
                    g();
                }
                this.f27629b.a(s.f4822a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f27628a));
        } catch (Throwable th) {
            this.f27629b.a(new s.b.a(th));
        }
    }
}
