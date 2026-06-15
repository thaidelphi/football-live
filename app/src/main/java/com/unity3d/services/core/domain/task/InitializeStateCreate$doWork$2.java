package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
import d9.o0;
import i8.o;
import i8.w;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializeStateCreate.kt */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$2", f = "InitializeStateCreate.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializeStateCreate$doWork$2 extends l implements p<o0, d<? super o<? extends Configuration>>, Object> {
    final /* synthetic */ InitializeStateCreate.Params $params;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateCreate$doWork$2(InitializeStateCreate.Params params, d<? super InitializeStateCreate$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateCreate$doWork$2(this.$params, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super o<? extends Configuration>> dVar) {
        return ((InitializeStateCreate$doWork$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object b10;
        Configuration config;
        ErrorState create;
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            InitializeStateCreate.Params params = this.$params;
            try {
                o.a aVar = o.f26626b;
                DeviceLog.debug("Unity Ads init: creating webapp");
                config = params.getConfig();
                config.setWebViewData(params.getWebViewData());
                try {
                    create = WebViewApp.create(config, false);
                } catch (IllegalThreadStateException e8) {
                    DeviceLog.exception("Illegal Thread", e8);
                    throw new InitializationException(ErrorState.CreateWebApp, e8, config);
                }
            } catch (CancellationException e10) {
                throw e10;
            } catch (Throwable th) {
                o.a aVar2 = o.f26626b;
                b10 = o.b(i8.p.a(th));
            }
            if (create == null) {
                b10 = o.b(config);
                if (o.g(b10)) {
                    o.a aVar3 = o.f26626b;
                    b10 = o.b(b10);
                } else {
                    Throwable d10 = o.d(b10);
                    if (d10 != null) {
                        o.a aVar4 = o.f26626b;
                        b10 = o.b(i8.p.a(d10));
                    }
                }
                return o.a(b10);
            }
            String webAppFailureMessage = WebViewApp.getCurrentApp().getWebAppFailureMessage() != null ? WebViewApp.getCurrentApp().getWebAppFailureMessage() : "Unity Ads WebApp creation failed";
            DeviceLog.error(webAppFailureMessage);
            throw new InitializationException(create, new Exception(webAppFailureMessage), config);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
