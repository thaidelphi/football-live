package i1;

import android.content.Context;
import android.os.Build;
import androidx.work.p;
import androidx.work.q;
/* compiled from: NetworkNotRoamingController.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f extends c<h1.b> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f26430e = p.f("NetworkNotRoamingCtrlr");

    public f(Context context, n1.a aVar) {
        super(j1.g.c(context, aVar).d());
    }

    @Override // i1.c
    boolean b(l1.p pVar) {
        return pVar.f27441j.b() == q.NOT_ROAMING;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // i1.c
    /* renamed from: i */
    public boolean c(h1.b bVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            return (bVar.a() && bVar.c()) ? false : true;
        }
        p.c().a(f26430e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }
}
