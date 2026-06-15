package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import d9.o0;
import g9.a0;
import g9.g;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* compiled from: AndroidScarManager.kt */
@f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2", f = "AndroidScarManager.kt", l = {42}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidScarManager$getVersion$2 extends l implements p<o0, d<? super String>, Object> {
    int label;
    final /* synthetic */ AndroidScarManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidScarManager.kt */
    @f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass1 extends l implements p<g9.f<? super String>, d<? super w>, Object> {
        int label;
        final /* synthetic */ AndroidScarManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AndroidScarManager androidScarManager, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = androidScarManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<w> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // t8.p
        public final Object invoke(g9.f<? super String> fVar, d<? super w> dVar) {
            return ((AnonymousClass1) create(fVar, dVar)).invokeSuspend(w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            GMAScarAdapterBridge gMAScarAdapterBridge;
            n8.d.c();
            if (this.label == 0) {
                i8.p.b(obj);
                gMAScarAdapterBridge = this.this$0.gmaBridge;
                gMAScarAdapterBridge.getVersion();
                return w.f26638a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidScarManager$getVersion$2(AndroidScarManager androidScarManager, d<? super AndroidScarManager$getVersion$2> dVar) {
        super(2, dVar);
        this.this$0 = androidScarManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidScarManager$getVersion$2(this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super String> dVar) {
        return ((AndroidScarManager$getVersion$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        CommonScarEventReceiver commonScarEventReceiver;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            commonScarEventReceiver = this.this$0.scarEventReceiver;
            a0 B = g.B(commonScarEventReceiver.getVersionFlow(), new AnonymousClass1(this.this$0, null));
            this.label = 1;
            obj = g.r(B, this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        return obj;
    }
}
