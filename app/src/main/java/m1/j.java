package m1;

import androidx.work.impl.WorkDatabase;
import androidx.work.p;
import androidx.work.z;
import l1.q;
/* compiled from: StopWorkRunnable.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private static final String f27646d = p.f("StopWorkRunnable");

    /* renamed from: a  reason: collision with root package name */
    private final e1.i f27647a;

    /* renamed from: b  reason: collision with root package name */
    private final String f27648b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f27649c;

    public j(e1.i iVar, String str, boolean z10) {
        this.f27647a = iVar;
        this.f27648b = str;
        this.f27649c = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean o10;
        WorkDatabase w10 = this.f27647a.w();
        e1.d u10 = this.f27647a.u();
        q l10 = w10.l();
        w10.beginTransaction();
        try {
            boolean h10 = u10.h(this.f27648b);
            if (this.f27649c) {
                o10 = this.f27647a.u().n(this.f27648b);
            } else {
                if (!h10 && l10.f(this.f27648b) == z.a.RUNNING) {
                    l10.b(z.a.ENQUEUED, this.f27648b);
                }
                o10 = this.f27647a.u().o(this.f27648b);
            }
            p.c().a(f27646d, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f27648b, Boolean.valueOf(o10)), new Throwable[0]);
            w10.setTransactionSuccessful();
        } finally {
            w10.endTransaction();
        }
    }
}
