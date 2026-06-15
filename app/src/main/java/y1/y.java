package y1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: ResourceRecycler.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class y {

    /* renamed from: a  reason: collision with root package name */
    private boolean f33043a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f33044b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((v) message.obj).a();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(v<?> vVar, boolean z10) {
        if (!this.f33043a && !z10) {
            this.f33043a = true;
            vVar.a();
            this.f33043a = false;
        }
        this.f33044b.obtainMessage(1, vVar).sendToTarget();
    }
}
