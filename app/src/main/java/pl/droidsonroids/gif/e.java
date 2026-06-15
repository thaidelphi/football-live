package pl.droidsonroids.gif;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InvalidationHandler.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class e extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<a> f30025a;

    public e(a aVar) {
        super(Looper.getMainLooper());
        this.f30025a = new WeakReference<>(aVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar = this.f30025a.get();
        if (aVar == null) {
            return;
        }
        if (message.what == -1) {
            aVar.invalidateSelf();
            return;
        }
        Iterator<aa.a> it = aVar.f29980h.iterator();
        while (it.hasNext()) {
            it.next().a(message.what);
        }
    }
}
