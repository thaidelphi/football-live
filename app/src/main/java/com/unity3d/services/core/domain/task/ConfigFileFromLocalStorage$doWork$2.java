package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.properties.SdkProperties;
import d9.o0;
import i8.o;
import i8.w;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import org.json.JSONObject;
import r8.k;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConfigFileFromLocalStorage.kt */
@f(c = "com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2", f = "ConfigFileFromLocalStorage.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ConfigFileFromLocalStorage$doWork$2 extends l implements p<o0, d<? super o<? extends Configuration>>, Object> {
    final /* synthetic */ ConfigFileFromLocalStorage.Params $params;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigFileFromLocalStorage$doWork$2(ConfigFileFromLocalStorage.Params params, d<? super ConfigFileFromLocalStorage$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new ConfigFileFromLocalStorage$doWork$2(this.$params, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super o<? extends Configuration>> dVar) {
        return ((ConfigFileFromLocalStorage$doWork$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object b10;
        String g10;
        Configuration configuration;
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            ConfigFileFromLocalStorage.Params params = this.$params;
            try {
                o.a aVar = o.f26626b;
                File file = new File(SdkProperties.getLocalConfigurationFilepath());
                if (!file.exists()) {
                    configuration = params.getDefaultConfiguration();
                } else {
                    g10 = k.g(file, null, 1, null);
                    configuration = new Configuration(new JSONObject(g10));
                }
                b10 = o.b(configuration);
            } catch (CancellationException e8) {
                throw e8;
            } catch (Throwable th) {
                o.a aVar2 = o.f26626b;
                b10 = o.b(i8.p.a(th));
            }
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
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
