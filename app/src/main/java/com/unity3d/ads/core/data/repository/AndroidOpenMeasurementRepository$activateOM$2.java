package com.unity3d.ads.core.data.repository;

import android.content.Context;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* compiled from: AndroidOpenMeasurementRepository.kt */
@f(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidOpenMeasurementRepository$activateOM$2 extends l implements p<o0, d<? super OMResult>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ AndroidOpenMeasurementRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOpenMeasurementRepository$activateOM$2(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, Context context, d<? super AndroidOpenMeasurementRepository$activateOM$2> dVar) {
        super(2, dVar);
        this.this$0 = androidOpenMeasurementRepository;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidOpenMeasurementRepository$activateOM$2(this.this$0, this.$context, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super OMResult> dVar) {
        return ((AndroidOpenMeasurementRepository$activateOM$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        OmidManager omidManager;
        OmidManager omidManager2;
        Object failure;
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            if (!this.this$0.isOMActive()) {
                try {
                    omidManager = this.this$0.omidManager;
                    omidManager.activate(this.$context);
                    AndroidOpenMeasurementRepository androidOpenMeasurementRepository = this.this$0;
                    omidManager2 = androidOpenMeasurementRepository.omidManager;
                    androidOpenMeasurementRepository.setOMActive(omidManager2.isActive());
                    if (this.this$0.isOMActive()) {
                        failure = OMResult.Success.INSTANCE;
                    } else {
                        failure = new OMResult.Failure("om_activate_failure_time", null, 2, null);
                    }
                    return failure;
                } catch (Throwable th) {
                    return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null));
                }
            }
            return new OMResult.Failure("om_already_active", null, 2, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
