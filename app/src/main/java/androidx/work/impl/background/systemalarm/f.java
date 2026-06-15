package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.p;
/* compiled from: SystemAlarmScheduler.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f implements e1.e {

    /* renamed from: b  reason: collision with root package name */
    private static final String f4726b = p.f("SystemAlarmScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f4727a;

    public f(Context context) {
        this.f4727a = context.getApplicationContext();
    }

    private void b(l1.p pVar) {
        p.c().a(f4726b, String.format("Scheduling work with workSpecId %s", pVar.f27432a), new Throwable[0]);
        this.f4727a.startService(b.f(this.f4727a, pVar.f27432a));
    }

    @Override // e1.e
    public void a(l1.p... pVarArr) {
        for (l1.p pVar : pVarArr) {
            b(pVar);
        }
    }

    @Override // e1.e
    public void c(String str) {
        this.f4727a.startService(b.g(this.f4727a, str));
    }

    @Override // e1.e
    public boolean d() {
        return true;
    }
}
