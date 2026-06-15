package i1;

import android.content.Context;
import android.os.Build;
import androidx.work.q;
import l1.p;
/* compiled from: NetworkUnmeteredController.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g extends c<h1.b> {
    public g(Context context, n1.a aVar) {
        super(j1.g.c(context, aVar).d());
    }

    @Override // i1.c
    boolean b(p pVar) {
        return pVar.f27441j.b() == q.UNMETERED || (Build.VERSION.SDK_INT >= 30 && pVar.f27441j.b() == q.TEMPORARILY_UNMETERED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // i1.c
    /* renamed from: i */
    public boolean c(h1.b bVar) {
        return !bVar.a() || bVar.b();
    }
}
