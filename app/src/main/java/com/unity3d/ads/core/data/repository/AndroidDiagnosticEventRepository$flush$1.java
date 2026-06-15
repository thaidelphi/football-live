package com.unity3d.ads.core.data.repository;

import d9.o0;
import g9.v;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import i8.w;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidDiagnosticEventRepository.kt */
@f(c = "com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$1", f = "AndroidDiagnosticEventRepository.kt", l = {68}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidDiagnosticEventRepository$flush$1 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ List<DiagnosticEventRequestOuterClass.DiagnosticEvent> $events;
    int label;
    final /* synthetic */ AndroidDiagnosticEventRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDiagnosticEventRepository$flush$1(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list, d<? super AndroidDiagnosticEventRepository$flush$1> dVar) {
        super(2, dVar);
        this.this$0 = androidDiagnosticEventRepository;
        this.$events = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidDiagnosticEventRepository$flush$1(this.this$0, this.$events, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((AndroidDiagnosticEventRepository$flush$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        v vVar;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            vVar = this.this$0._diagnosticEvents;
            List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list = this.$events;
            this.label = 1;
            if (vVar.emit(list, this) == c10) {
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
