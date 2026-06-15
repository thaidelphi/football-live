package com.unity3d.services;

import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import d9.o0;
import i8.s;
import i8.w;
import j8.j0;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SDKErrorHandler.kt */
@f(c = "com.unity3d.services.SDKErrorHandler$sendDiagnostic$1", f = "SDKErrorHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class SDKErrorHandler$sendDiagnostic$1 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ String $name;
    final /* synthetic */ String $reason;
    final /* synthetic */ String $scopeName;
    final /* synthetic */ String $stackTrace;
    int label;
    final /* synthetic */ SDKErrorHandler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SDKErrorHandler$sendDiagnostic$1(SDKErrorHandler sDKErrorHandler, String str, String str2, String str3, String str4, d<? super SDKErrorHandler$sendDiagnostic$1> dVar) {
        super(2, dVar);
        this.this$0 = sDKErrorHandler;
        this.$name = str;
        this.$reason = str2;
        this.$stackTrace = str3;
        this.$scopeName = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new SDKErrorHandler$sendDiagnostic$1(this.this$0, this.$name, this.$reason, this.$stackTrace, this.$scopeName, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((SDKErrorHandler$sendDiagnostic$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SendDiagnosticEvent sendDiagnosticEvent;
        Map g10;
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
            String str = this.$name;
            g10 = j0.g(s.a("reason", this.$reason), s.a("reason_debug", this.$stackTrace), s.a("coroutine_name", this.$scopeName));
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, null, g10, null, null, 26, null);
            return w.f26638a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
