package i1;

import android.content.Context;
import android.os.Build;
import androidx.work.q;
import l1.p;
/* compiled from: NetworkConnectedController.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d extends c<h1.b> {
    public d(Context context, n1.a aVar) {
        super(j1.g.c(context, aVar).d());
    }

    @Override // i1.c
    boolean b(p pVar) {
        return pVar.f27441j.b() == q.CONNECTED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // i1.c
    /* renamed from: i */
    public boolean c(h1.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (bVar.a() && bVar.d()) ? false : true;
        }
        return !bVar.a();
    }
}
