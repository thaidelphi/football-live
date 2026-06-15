package com.ironsource;

import androidx.lifecycle.i;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.v3;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class v3 implements n4 {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements androidx.lifecycle.m {

        /* renamed from: a  reason: collision with root package name */
        private final nk f21097a;

        /* renamed from: com.ironsource.v3$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public /* synthetic */ class C0240a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f21098a;

            static {
                int[] iArr = new int[i.a.values().length];
                try {
                    iArr[i.a.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i.a.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[i.a.ON_PAUSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[i.a.ON_STOP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f21098a = iArr;
            }
        }

        public a(nk listener) {
            kotlin.jvm.internal.n.f(listener, "listener");
            this.f21097a = listener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(i.a event, a this$0) {
            kotlin.jvm.internal.n.f(event, "$event");
            kotlin.jvm.internal.n.f(this$0, "this$0");
            int i10 = C0240a.f21098a[event.ordinal()];
            if (i10 == 1) {
                this$0.f21097a.c();
            } else if (i10 == 2) {
                this$0.f21097a.a();
            } else if (i10 == 3) {
                this$0.f21097a.d();
            } else if (i10 != 4) {
            } else {
                this$0.f21097a.b();
            }
        }

        public boolean equals(Object obj) {
            nk nkVar = this.f21097a;
            a aVar = obj instanceof a ? (a) obj : null;
            return kotlin.jvm.internal.n.a(nkVar, aVar != null ? aVar.f21097a : null);
        }

        public int hashCode() {
            return this.f21097a.hashCode();
        }

        @Override // androidx.lifecycle.m
        public void onStateChanged(androidx.lifecycle.p source, final i.a event) {
            kotlin.jvm.internal.n.f(source, "source");
            kotlin.jvm.internal.n.f(event, "event");
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.x10
                @Override // java.lang.Runnable
                public final void run() {
                    v3.a.a(i.a.this, this);
                }
            }, 0L, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(nk observer) {
        kotlin.jvm.internal.n.f(observer, "$observer");
        androidx.lifecycle.a0.f3588i.a().getLifecycle().a(new a(observer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(nk observer) {
        kotlin.jvm.internal.n.f(observer, "$observer");
        androidx.lifecycle.a0.f3588i.a().getLifecycle().d(new a(observer));
    }

    @Override // com.ironsource.n4
    public void a(final nk observer) {
        kotlin.jvm.internal.n.f(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.v10
            @Override // java.lang.Runnable
            public final void run() {
                v3.c(nk.this);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.n4
    public void b(final nk observer) {
        kotlin.jvm.internal.n.f(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.w10
            @Override // java.lang.Runnable
            public final void run() {
                v3.d(nk.this);
            }
        }, 0L, 2, null);
    }
}
