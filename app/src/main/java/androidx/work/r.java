package androidx.work;

import android.os.Build;
import androidx.work.b0;
/* compiled from: OneTimeWorkRequest.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class r extends b0 {

    /* compiled from: OneTimeWorkRequest.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a extends b0.a<a, r> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f4620c.f27435d = OverwritingInputMerger.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.b0.a
        /* renamed from: h */
        public r c() {
            if (this.f4618a && Build.VERSION.SDK_INT >= 23 && this.f4620c.f27441j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new r(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.b0.a
        /* renamed from: i */
        public a d() {
            return this;
        }
    }

    r(a aVar) {
        super(aVar.f4619b, aVar.f4620c, aVar.f4621d);
    }

    public static r d(Class<? extends ListenableWorker> cls) {
        return new a(cls).b();
    }
}
