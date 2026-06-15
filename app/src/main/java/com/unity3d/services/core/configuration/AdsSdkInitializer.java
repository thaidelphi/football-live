package com.unity3d.services.core.configuration;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.net.CronetProviderInstaller;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import i8.w;
import j8.q;
import java.util.List;
import kotlin.jvm.internal.n;
import x0.a;
/* compiled from: AdsSdkInitializer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AdsSdkInitializer implements a<w> {
    @Override // x0.a
    public /* bridge */ /* synthetic */ w create(Context context) {
        create2(context);
        return w.f26638a;
    }

    @Override // x0.a
    public List<Class<? extends a<?>>> dependencies() {
        List<Class<? extends a<?>>> d10;
        d10 = q.d();
        return d10;
    }

    /* renamed from: create  reason: avoid collision after fix types in other method */
    public void create2(Context context) {
        n.f(context, "context");
        ClientProperties.setApplicationContext(context.getApplicationContext());
        if (context instanceof Application) {
            ClientProperties.setApplication((Application) context);
        } else if (context.getApplicationContext() instanceof Application) {
            Context applicationContext = context.getApplicationContext();
            n.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ClientProperties.setApplication((Application) applicationContext);
        }
        SdkProperties.setAppInitializationTimeSinceEpoch(System.currentTimeMillis());
        try {
            CronetProviderInstaller.a(context);
        } catch (Throwable unused) {
        }
    }
}
