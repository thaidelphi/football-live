package com.unity3d.ads.adplayer;

import d9.o0;
import d9.w0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import org.json.JSONArray;
import t8.p;
/* compiled from: CommonWebViewBridge.kt */
@f(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$1", f = "CommonWebViewBridge.kt", l = {109, 111, 112, 112, 118}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class CommonWebViewBridge$handleInvocation$1 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ String $callback;
    final /* synthetic */ String $location;
    final /* synthetic */ JSONArray $parameters;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CommonWebViewBridge.kt */
    @f(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$1$1", f = "CommonWebViewBridge.kt", l = {111}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$1$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class AnonymousClass1 extends l implements p<o0, d<? super w>, Object> {
        final /* synthetic */ Invocation $invocation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Invocation invocation, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$invocation = invocation;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<w> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$invocation, dVar);
        }

        @Override // t8.p
        public final Object invoke(o0 o0Var, d<? super w> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = n8.d.c();
            int i10 = this.label;
            if (i10 == 0) {
                i8.p.b(obj);
                w0<w> isHandled = this.$invocation.isHandled();
                this.label = 1;
                if (isHandled.C0(this) == c10) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonWebViewBridge$handleInvocation$1(String str, JSONArray jSONArray, CommonWebViewBridge commonWebViewBridge, String str2, d<? super CommonWebViewBridge$handleInvocation$1> dVar) {
        super(2, dVar);
        this.$location = str;
        this.$parameters = jSONArray;
        this.this$0 = commonWebViewBridge;
        this.$callback = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new CommonWebViewBridge$handleInvocation$1(this.$location, this.$parameters, this.this$0, this.$callback, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((CommonWebViewBridge$handleInvocation$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
