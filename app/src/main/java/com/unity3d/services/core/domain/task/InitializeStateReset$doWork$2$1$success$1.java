package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import d9.i;
import d9.j0;
import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* compiled from: InitializeStateReset.kt */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1", f = "InitializeStateReset.kt", l = {42}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class InitializeStateReset$doWork$2$1$success$1 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ WebViewApp $currentApp;
    int label;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InitializeStateReset.kt */
    @f(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1$1", f = "InitializeStateReset.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass1 extends l implements p<o0, d<? super w>, Object> {
        final /* synthetic */ WebViewApp $currentApp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WebViewApp webViewApp, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$currentApp = webViewApp;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<w> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$currentApp, dVar);
        }

        @Override // t8.p
        public final Object invoke(o0 o0Var, d<? super w> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            n8.d.c();
            if (this.label == 0) {
                i8.p.b(obj);
                WebView webView = this.$currentApp.getWebView();
                if (webView != null) {
                    webView.destroy();
                }
                this.$currentApp.setWebView(null);
                return w.f26638a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$2$1$success$1(InitializeStateReset initializeStateReset, WebViewApp webViewApp, d<? super InitializeStateReset$doWork$2$1$success$1> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateReset;
        this.$currentApp = webViewApp;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateReset$doWork$2$1$success$1(this.this$0, this.$currentApp, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((InitializeStateReset$doWork$2$1$success$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        ISDKDispatchers iSDKDispatchers;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            iSDKDispatchers = this.this$0.dispatchers;
            j0 main = iSDKDispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentApp, null);
            this.label = 1;
            if (i.g(main, anonymousClass1, this) == c10) {
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
