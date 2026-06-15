package androidx.work;

import android.os.Build;
import androidx.work.b0;
import java.util.concurrent.TimeUnit;
/* compiled from: PeriodicWorkRequest.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u extends b0 {

    /* compiled from: PeriodicWorkRequest.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a extends b0.a<a, u> {
        public a(Class<? extends ListenableWorker> cls, long j10, TimeUnit timeUnit) {
            super(cls);
            this.f4620c.e(timeUnit.toMillis(j10));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.b0.a
        /* renamed from: h */
        public u c() {
            if (this.f4618a && Build.VERSION.SDK_INT >= 23 && this.f4620c.f27441j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (!this.f4620c.f27448q) {
                return new u(this);
            }
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.b0.a
        /* renamed from: i */
        public a d() {
            return this;
        }
    }

    u(a aVar) {
        super(aVar.f4619b, aVar.f4620c, aVar.f4621d);
    }
}
