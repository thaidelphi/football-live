package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface ng<T> {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class a<ListenerType> implements ng<ListenerType> {

        /* renamed from: a  reason: collision with root package name */
        private ListenerType f19405a;

        /* renamed from: com.ironsource.ng$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class C0228a extends hr {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Runnable f19406a;

            C0228a(Runnable runnable) {
                this.f19406a = runnable;
            }

            @Override // com.ironsource.hr
            public void a() {
                this.f19406a.run();
            }
        }

        public static /* synthetic */ void a(a aVar, Runnable runnable, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            aVar.a(runnable, z10);
        }

        public final ListenerType a() {
            return this.f19405a;
        }

        @Override // com.ironsource.ng
        public void a(ListenerType listenertype) {
            this.f19405a = listenertype;
        }

        public final void a(Runnable runnable, boolean z10) {
            kotlin.jvm.internal.n.f(runnable, "runnable");
            if (z10) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new C0228a(runnable), 0L, 2, null);
            }
        }

        public final void a(String instanceId, String message) {
            kotlin.jvm.internal.n.f(instanceId, "instanceId");
            kotlin.jvm.internal.n.f(message, "message");
            IronLog ironLog = IronLog.CALLBACK;
            ironLog.info(message + " instanceId=" + instanceId);
        }

        public final void b(ListenerType listenertype) {
            this.f19405a = listenertype;
        }
    }

    void a(T t10);
}
