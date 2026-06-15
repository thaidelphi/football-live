package com.unity3d.services.core.di;

import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import i8.w;
import kotlin.jvm.internal.o;
import t8.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnityAdsModule.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class UnityAdsModule$publicApiJob$1$1 extends o implements l<Throwable, w> {
    final /* synthetic */ DiagnosticEventRepository $diagnosticEventRepository;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsModule$publicApiJob$1$1(DiagnosticEventRepository diagnosticEventRepository) {
        super(1);
        this.$diagnosticEventRepository = diagnosticEventRepository;
    }

    @Override // t8.l
    public /* bridge */ /* synthetic */ w invoke(Throwable th) {
        invoke2(th);
        return w.f26638a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$diagnosticEventRepository.flush();
    }
}
