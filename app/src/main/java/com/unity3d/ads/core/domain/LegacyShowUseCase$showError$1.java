package com.unity3d.ads.core.domain;

import c9.i;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import d9.j0;
import d9.o0;
import i8.w;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.p;
import t8.t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LegacyShowUseCase.kt */
@f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1", f = "LegacyShowUseCase.kt", l = {276}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LegacyShowUseCase$showError$1 extends l implements t<String, UnityAds.UnityAdsShowError, String, Integer, String, m8.d<? super w>, Object> {
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ String $placement;
    final /* synthetic */ i $startTime;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LegacyShowUseCase.kt */
    @f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1$1", f = "LegacyShowUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass1 extends l implements p<o0, m8.d<? super w>, Object> {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $message;
        final /* synthetic */ String $placement;
        final /* synthetic */ UnityAds.UnityAdsShowError $reason;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Listeners listeners, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2, m8.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$listeners = listeners;
            this.$placement = str;
            this.$reason = unityAdsShowError;
            this.$message = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<w> create(Object obj, m8.d<?> dVar) {
            return new AnonymousClass1(this.$listeners, this.$placement, this.$reason, this.$message, dVar);
        }

        @Override // t8.p
        public final Object invoke(o0 o0Var, m8.d<? super w> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            n8.d.c();
            if (this.label == 0) {
                i8.p.b(obj);
                this.$listeners.onError(this.$placement, this.$reason, this.$message);
                return w.f26638a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyShowUseCase$showError$1(String str, LegacyShowUseCase legacyShowUseCase, i iVar, Listeners listeners, m8.d<? super LegacyShowUseCase$showError$1> dVar) {
        super(6, dVar);
        this.$placement = str;
        this.this$0 = legacyShowUseCase;
        this.$startTime = iVar;
        this.$listeners = listeners;
    }

    @Override // t8.t
    public final Object invoke(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2, Integer num, String str3, m8.d<? super w> dVar) {
        LegacyShowUseCase$showError$1 legacyShowUseCase$showError$1 = new LegacyShowUseCase$showError$1(this.$placement, this.this$0, this.$startTime, this.$listeners, dVar);
        legacyShowUseCase$showError$1.L$0 = str;
        legacyShowUseCase$showError$1.L$1 = unityAdsShowError;
        legacyShowUseCase$showError$1.L$2 = str2;
        legacyShowUseCase$showError$1.L$3 = num;
        legacyShowUseCase$showError$1.L$4 = str3;
        return legacyShowUseCase$showError$1.invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        SendDiagnosticEvent sendDiagnosticEvent;
        Map tags;
        AdObject adObject;
        j0 j0Var;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            UnityAds.UnityAdsShowError unityAdsShowError = (UnityAds.UnityAdsShowError) this.L$1;
            String str = (String) this.L$2;
            DeviceLog.debug("Unity Ads Show Failed for placement " + this.$placement);
            sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
            Double b10 = kotlin.coroutines.jvm.internal.b.b(TimeExtensionsKt.elapsedMillis(this.$startTime));
            tags = this.this$0.getTags((String) this.L$0, (Integer) this.L$3, (String) this.L$4);
            adObject = this.this$0.adObject;
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_show_failure_time", b10, tags, null, adObject, 8, null);
            j0Var = this.this$0.dispatcher;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$listeners, this.$placement, unityAdsShowError, str, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            if (d9.i.g(j0Var, anonymousClass1, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        return w.f26638a;
    }
}
