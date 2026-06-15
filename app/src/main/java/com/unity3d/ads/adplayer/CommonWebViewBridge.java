package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.log.DeviceLog;
import d9.j0;
import d9.k;
import d9.n0;
import d9.o0;
import d9.p0;
import g9.a0;
import g9.c0;
import g9.g;
import g9.l0;
import g9.v;
import g9.w;
import i8.n;
import java.util.Set;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import org.json.JSONArray;
import t8.p;
/* compiled from: CommonWebViewBridge.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class CommonWebViewBridge implements WebViewBridge {
    private final v<Invocation> _onInvocation;
    private final w<Set<n<String, d9.w<Object[]>>>> callbacks;
    private final a0<Invocation> onInvocation;
    private final o0 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final WebViewContainer webViewContainer;

    /* compiled from: CommonWebViewBridge.kt */
    @f(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$1", f = "CommonWebViewBridge.kt", l = {30}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class AnonymousClass1 extends l implements p<o0, d<? super i8.w>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<i8.w> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(dVar);
        }

        @Override // t8.p
        public final Object invoke(o0 o0Var, d<? super i8.w> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = n8.d.c();
            int i10 = this.label;
            if (i10 == 0) {
                i8.p.b(obj);
                WebViewContainer webViewContainer = CommonWebViewBridge.this.webViewContainer;
                CommonWebViewBridge commonWebViewBridge = CommonWebViewBridge.this;
                this.label = 1;
                if (webViewContainer.addJavascriptInterface(commonWebViewBridge, "webviewbridge", this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i8.p.b(obj);
            }
            return i8.w.f26638a;
        }
    }

    public CommonWebViewBridge(j0 dispatcher, WebViewContainer webViewContainer, o0 adPlayerScope, SendDiagnosticEvent sendDiagnosticEvent) {
        Set b10;
        kotlin.jvm.internal.n.f(dispatcher, "dispatcher");
        kotlin.jvm.internal.n.f(webViewContainer, "webViewContainer");
        kotlin.jvm.internal.n.f(adPlayerScope, "adPlayerScope");
        kotlin.jvm.internal.n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.webViewContainer = webViewContainer;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        o0 h10 = p0.h(p0.h(adPlayerScope, dispatcher), new n0("CommonWebViewBridge"));
        this.scope = h10;
        b10 = j8.o0.b();
        this.callbacks = l0.a(b10);
        v<Invocation> b11 = c0.b(0, 0, null, 7, null);
        this._onInvocation = b11;
        this.onInvocation = g.a(b11);
        k.d(h10, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object execute(HandlerType handlerType, String str, d<? super i8.w> dVar) {
        Object c10;
        WebViewContainer webViewContainer = this.webViewContainer;
        Object evaluateJavascript = webViewContainer.evaluateJavascript("window.nativebridge." + handlerType.getJsPath() + '(' + str + ");", dVar);
        c10 = n8.d.c();
        return evaluateJavascript == c10 ? evaluateJavascript : i8.w.f26638a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object respond(String str, String str2, Object[] objArr, d<? super i8.w> dVar) {
        Object c10;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(new JSONArray(objArr));
        HandlerType handlerType = HandlerType.CALLBACK;
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(jSONArray);
        sb.append(']');
        Object execute = execute(handlerType, sb.toString(), dVar);
        c10 = n8.d.c();
        return execute == c10 ? execute : i8.w.f26638a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public a0<Invocation> getOnInvocation() {
        return this.onInvocation;
    }

    public final o0 getScope() {
        return this.scope;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
        if (r14.equals("OK") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
        if (r14.equals("success") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b5, code lost:
        r13.L(r15);
     */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleCallback(java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            r12 = this;
            java.lang.String r0 = "callbackId"
            kotlin.jvm.internal.n.f(r13, r0)
            java.lang.String r0 = "callbackStatus"
            kotlin.jvm.internal.n.f(r14, r0)
            java.lang.String r0 = "rawParameters"
            kotlin.jvm.internal.n.f(r15, r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r15)
            java.lang.Object[] r15 = com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.toTypedArray(r0)
            g9.w<java.util.Set<i8.n<java.lang.String, d9.w<java.lang.Object[]>>>> r0 = r12.callbacks
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            r2 = r1
            i8.n r2 = (i8.n) r2
            java.lang.Object r2 = r2.a()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = kotlin.jvm.internal.n.a(r2, r13)
            if (r2 == 0) goto L24
            goto L3f
        L3e:
            r1 = 0
        L3f:
            i8.n r1 = (i8.n) r1
            if (r1 != 0) goto L44
            return
        L44:
            java.lang.Object r13 = r1.b()
            d9.w r13 = (d9.w) r13
            java.lang.String r0 = "success"
            java.lang.String r2 = "error"
            java.lang.String[] r3 = new java.lang.String[]{r0, r2}
            java.util.Set r3 = j8.m0.d(r3)
            boolean r3 = r3.contains(r14)
            if (r3 == 0) goto L6a
            com.unity3d.ads.core.domain.SendDiagnosticEvent r4 = r12.sendDiagnosticEvent
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 30
            r11 = 0
            java.lang.String r5 = "old_callback_status"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r4, r5, r6, r7, r8, r9, r10, r11)
        L6a:
            int r3 = r14.hashCode()
            r4 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            if (r3 == r4) goto Lae
            r0 = 2524(0x9dc, float:3.537E-42)
            if (r3 == r0) goto La5
            r0 = 66247144(0x3f2d9e8, float:1.42735105E-36)
            if (r3 == r0) goto L89
            r0 = 96784904(0x5c4d208, float:1.8508905E-35)
            if (r3 == r0) goto L82
            goto Lb8
        L82:
            boolean r14 = r14.equals(r2)
            if (r14 != 0) goto L92
            goto Lb8
        L89:
            java.lang.String r0 = "ERROR"
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto L92
            goto Lb8
        L92:
            java.lang.Exception r14 = new java.lang.Exception
            r0 = 0
            r15 = r15[r0]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.n.d(r15, r0)
            java.lang.String r15 = (java.lang.String) r15
            r14.<init>(r15)
            r13.J(r14)
            goto Lb8
        La5:
            java.lang.String r0 = "OK"
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto Lb5
            goto Lb8
        Lae:
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto Lb5
            goto Lb8
        Lb5:
            r13.L(r15)
        Lb8:
            g9.w<java.util.Set<i8.n<java.lang.String, d9.w<java.lang.Object[]>>>> r13 = r12.callbacks
        Lba:
            java.lang.Object r14 = r13.getValue()
            r15 = r14
            java.util.Set r15 = (java.util.Set) r15
            java.util.Set r15 = j8.m0.e(r15, r1)
            boolean r14 = r13.i(r14, r15)
            if (r14 == 0) goto Lba
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.handleCallback(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleInvocation(String message) {
        kotlin.jvm.internal.n.f(message, "message");
        JSONArray jSONArray = new JSONArray(message);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            Object obj2 = jSONArray2.get(0);
            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = jSONArray2.get(1);
            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Object obj4 = jSONArray2.get(2);
            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray3 = (JSONArray) obj4;
            Object obj5 = jSONArray2.get(3);
            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) obj5;
            DeviceLog.debug("Unity Ads WebView calling for: " + str + '.' + str2 + '(' + jSONArray3 + ')');
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('.');
            sb.append(str2);
            k.d(this.scope, null, null, new CommonWebViewBridge$handleInvocation$1(sb.toString(), jSONArray3, this, str3, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f A[PHI: r14 
      PHI: (r14v4 java.lang.Object) = (r14v3 java.lang.Object), (r14v1 java.lang.Object) binds: [B:27:0x009c, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object request(java.lang.String r11, java.lang.String r12, java.lang.Object[] r13, m8.d<? super java.lang.Object[]> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.adplayer.CommonWebViewBridge$request$1
            if (r0 == 0) goto L13
            r0 = r14
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r0 = (com.unity3d.ads.adplayer.CommonWebViewBridge$request$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r0 = new com.unity3d.ads.adplayer.CommonWebViewBridge$request$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            i8.p.b(r14)
            goto L9f
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            java.lang.Object r11 = r0.L$0
            d9.w r11 = (d9.w) r11
            i8.p.b(r14)
            goto L94
        L3d:
            i8.p.b(r14)
            d9.w r14 = d9.y.b(r4, r5, r4)
            int r2 = r14.hashCode()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            g9.w<java.util.Set<i8.n<java.lang.String, d9.w<java.lang.Object[]>>>> r6 = r10.callbacks
        L4e:
            java.lang.Object r7 = r6.getValue()
            r8 = r7
            java.util.Set r8 = (java.util.Set) r8
            i8.n r9 = i8.s.a(r2, r14)
            java.util.Set r8 = j8.m0.f(r8, r9)
            boolean r7 = r6.i(r7, r8)
            if (r7 == 0) goto L4e
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            r6.put(r11)
            r6.put(r12)
            r6.put(r2)
            r11 = 0
            int r12 = r13.length
        L73:
            if (r11 >= r12) goto L7d
            r2 = r13[r11]
            r6.put(r2)
            int r11 = r11 + 1
            goto L73
        L7d:
            com.unity3d.ads.adplayer.HandlerType r11 = com.unity3d.ads.adplayer.HandlerType.INVOCATION
            java.lang.String r12 = r6.toString()
            java.lang.String r13 = "arguments.toString()"
            kotlin.jvm.internal.n.e(r12, r13)
            r0.L$0 = r14
            r0.label = r5
            java.lang.Object r11 = r10.execute(r11, r12, r0)
            if (r11 != r1) goto L93
            return r1
        L93:
            r11 = r14
        L94:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r14 = r11.C0(r0)
            if (r14 != r1) goto L9f
            return r1
        L9f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.request(java.lang.String, java.lang.String, java.lang.Object[], m8.d):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public Object sendEvent(WebViewEvent webViewEvent, d<? super i8.w> dVar) {
        Object c10;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(webViewEvent.getCategory());
        jSONArray.put(webViewEvent.getName());
        for (Object obj : webViewEvent.getParameters()) {
            jSONArray.put(obj);
        }
        HandlerType handlerType = HandlerType.EVENT;
        String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.n.e(jSONArray2, "arguments.toString()");
        Object execute = execute(handlerType, jSONArray2, dVar);
        c10 = n8.d.c();
        return execute == c10 ? execute : i8.w.f26638a;
    }
}
