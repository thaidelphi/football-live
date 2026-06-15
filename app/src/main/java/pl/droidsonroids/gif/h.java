package pl.droidsonroids.gif;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RenderTask.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class h extends i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public h(a aVar) {
        super(aVar);
    }

    @Override // pl.droidsonroids.gif.i
    public void b() {
        a aVar = this.f30029a;
        long o10 = aVar.f29979g.o(aVar.f29978f);
        if (o10 >= 0) {
            this.f30029a.f29975c = SystemClock.uptimeMillis() + o10;
            if (this.f30029a.isVisible() && this.f30029a.f29974b) {
                a aVar2 = this.f30029a;
                if (!aVar2.f29984l) {
                    aVar2.f29973a.remove(this);
                    a aVar3 = this.f30029a;
                    aVar3.f29988p = aVar3.f29973a.schedule(this, o10, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f30029a.f29980h.isEmpty() && this.f30029a.b() == this.f30029a.f29979g.h() - 1) {
                a aVar4 = this.f30029a;
                aVar4.f29985m.sendEmptyMessageAtTime(aVar4.c(), this.f30029a.f29975c);
            }
        } else {
            a aVar5 = this.f30029a;
            aVar5.f29975c = Long.MIN_VALUE;
            aVar5.f29974b = false;
        }
        if (!this.f30029a.isVisible() || this.f30029a.f29985m.hasMessages(-1)) {
            return;
        }
        this.f30029a.f29985m.sendEmptyMessageAtTime(-1, 0L);
    }
}
