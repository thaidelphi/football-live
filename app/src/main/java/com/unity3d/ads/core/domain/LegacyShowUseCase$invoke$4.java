package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.ShowEvent;
import g9.f;
import i8.w;
import t8.t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LegacyShowUseCase.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LegacyShowUseCase$invoke$4<T> implements f {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ String $placement;
    final /* synthetic */ t<String, UnityAds.UnityAdsShowError, String, Integer, String, m8.d<? super w>, Object> $reportShowError;
    final /* synthetic */ long $startTime;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyShowUseCase$invoke$4(LegacyShowUseCase legacyShowUseCase, long j10, String str, Listeners listeners, AdObject adObject, t<? super String, ? super UnityAds.UnityAdsShowError, ? super String, ? super Integer, ? super String, ? super m8.d<? super w>, ? extends Object> tVar) {
        this.this$0 = legacyShowUseCase;
        this.$startTime = j10;
        this.$placement = str;
        this.$listeners = listeners;
        this.$adObject = adObject;
        this.$reportShowError = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(com.unity3d.ads.core.data.model.ShowEvent r9, m8.d<? super i8.w> r10) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4.emit(com.unity3d.ads.core.data.model.ShowEvent, m8.d):java.lang.Object");
    }

    @Override // g9.f
    public /* bridge */ /* synthetic */ Object emit(Object obj, m8.d dVar) {
        return emit((ShowEvent) obj, (m8.d<? super w>) dVar);
    }
}
