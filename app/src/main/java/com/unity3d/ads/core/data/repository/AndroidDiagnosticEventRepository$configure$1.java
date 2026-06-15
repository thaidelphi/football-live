package com.unity3d.ads.core.data.repository;

import i8.w;
import kotlin.jvm.internal.o;
import t8.a;
/* compiled from: AndroidDiagnosticEventRepository.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidDiagnosticEventRepository$configure$1 extends o implements a<w> {
    final /* synthetic */ AndroidDiagnosticEventRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDiagnosticEventRepository$configure$1(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        super(0);
        this.this$0 = androidDiagnosticEventRepository;
    }

    @Override // t8.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f26638a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.flush();
    }
}
