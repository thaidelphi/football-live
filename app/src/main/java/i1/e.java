package i1;

import android.content.Context;
import android.os.Build;
import androidx.work.p;
import androidx.work.q;
/* compiled from: NetworkMeteredController.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e extends c<h1.b> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f26429e = p.f("NetworkMeteredCtrlr");

    public e(Context context, n1.a aVar) {
        super(j1.g.c(context, aVar).d());
    }

    @Override // i1.c
    boolean b(l1.p pVar) {
        return pVar.f27441j.b() == q.METERED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // i1.c
    /* renamed from: i */
    public boolean c(h1.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (bVar.a() && bVar.b()) ? false : true;
        }
        p.c().a(f26429e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }
}
