package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.network.core.CronetClient;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.OkHttp3Client;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import d9.o;
import i8.o;
import java.io.File;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.n;
import n9.v;
import org.chromium.net.CronetEngine;
import r8.m;
/* compiled from: AndroidHttpClientProvider.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidHttpClientProvider implements HttpClientProvider {
    private final AlternativeFlowReader alternativeFlowReader;
    private final CleanupDirectory cleanupDirectory;
    private final ConfigFileFromLocalStorage configFileFromLocalStorage;
    private final Context context;
    private final CronetEngineBuilderFactory cronetEngineBuilderFactory;
    private final ISDKDispatchers dispatchers;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public AndroidHttpClientProvider(ConfigFileFromLocalStorage configFileFromLocalStorage, AlternativeFlowReader alternativeFlowReader, ISDKDispatchers dispatchers, SendDiagnosticEvent sendDiagnosticEvent, Context context, CronetEngineBuilderFactory cronetEngineBuilderFactory, SessionRepository sessionRepository, CleanupDirectory cleanupDirectory) {
        n.f(configFileFromLocalStorage, "configFileFromLocalStorage");
        n.f(alternativeFlowReader, "alternativeFlowReader");
        n.f(dispatchers, "dispatchers");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(context, "context");
        n.f(cronetEngineBuilderFactory, "cronetEngineBuilderFactory");
        n.f(sessionRepository, "sessionRepository");
        n.f(cleanupDirectory, "cleanupDirectory");
        this.configFileFromLocalStorage = configFileFromLocalStorage;
        this.alternativeFlowReader = alternativeFlowReader;
        this.dispatchers = dispatchers;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildCronetCachePath(Context context) {
        File n10;
        File filesDir = context.getFilesDir();
        n.e(filesDir, "context.filesDir");
        n10 = m.n(filesDir, UnityAdsConstants.DefaultUrls.HTTP_CACHE_DIR_NAME);
        if (!n10.exists()) {
            n10.mkdirs();
        }
        String absolutePath = n10.getAbsolutePath();
        n.e(absolutePath, "cacheDir.absolutePath");
        return absolutePath;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object buildNetworkClient(final Context context, final ISDKDispatchers iSDKDispatchers, m8.d<? super HttpClient> dVar) {
        m8.d b10;
        Object c10;
        b10 = n8.c.b(dVar);
        final o oVar = new o(b10, 1);
        oVar.C();
        CronetProviderInstaller.a(context).addOnCompleteListener(new OnCompleteListener() { // from class: com.unity3d.ads.core.domain.AndroidHttpClientProvider$buildNetworkClient$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task<Void> it) {
                SessionRepository sessionRepository;
                CleanupDirectory cleanupDirectory;
                AlternativeFlowReader alternativeFlowReader;
                SessionRepository sessionRepository2;
                long j10;
                SessionRepository sessionRepository3;
                CleanupDirectory cleanupDirectory2;
                AlternativeFlowReader alternativeFlowReader2;
                CronetEngineBuilderFactory cronetEngineBuilderFactory;
                String buildCronetCachePath;
                SessionRepository sessionRepository4;
                n.f(it, "it");
                if (it.isSuccessful()) {
                    sessionRepository2 = AndroidHttpClientProvider.this.sessionRepository;
                    if (sessionRepository2.getNativeConfiguration().hasCachedAssetsConfiguration()) {
                        sessionRepository4 = AndroidHttpClientProvider.this.sessionRepository;
                        long j11 = 1024;
                        j10 = sessionRepository4.getNativeConfiguration().getCachedAssetsConfiguration().getMaxCachedAssetSizeMb() * j11 * j11;
                    } else {
                        j10 = ServiceProvider.HTTP_CACHE_DISK_SIZE;
                    }
                    try {
                        cronetEngineBuilderFactory = AndroidHttpClientProvider.this.cronetEngineBuilderFactory;
                        CronetEngine.Builder createCronetEngineBuilder = cronetEngineBuilderFactory.createCronetEngineBuilder(context);
                        buildCronetCachePath = AndroidHttpClientProvider.this.buildCronetCachePath(context);
                        CronetEngine cronetEngine = createCronetEngineBuilder.setStoragePath(buildCronetCachePath).enableHttpCache(3, j10).enableQuic(true).addQuicHint(ServiceProvider.GATEWAY_HOST, 443, 443).addQuicHint(ServiceProvider.CDN_CREATIVES_HOST, 443, 443).build();
                        d9.n<HttpClient> nVar = oVar;
                        o.a aVar = i8.o.f26626b;
                        n.e(cronetEngine, "cronetEngine");
                        nVar.resumeWith(i8.o.b(new CronetClient(cronetEngine, iSDKDispatchers)));
                        return;
                    } catch (Throwable unused) {
                        d9.n<HttpClient> nVar2 = oVar;
                        o.a aVar2 = i8.o.f26626b;
                        ISDKDispatchers iSDKDispatchers2 = iSDKDispatchers;
                        v vVar = new v();
                        Context context2 = context;
                        sessionRepository3 = AndroidHttpClientProvider.this.sessionRepository;
                        cleanupDirectory2 = AndroidHttpClientProvider.this.cleanupDirectory;
                        alternativeFlowReader2 = AndroidHttpClientProvider.this.alternativeFlowReader;
                        nVar2.resumeWith(i8.o.b(new OkHttp3Client(iSDKDispatchers2, vVar, context2, sessionRepository3, cleanupDirectory2, alternativeFlowReader2)));
                        return;
                    }
                }
                d9.n<HttpClient> nVar3 = oVar;
                o.a aVar3 = i8.o.f26626b;
                ISDKDispatchers iSDKDispatchers3 = iSDKDispatchers;
                v vVar2 = new v();
                Context context3 = context;
                sessionRepository = AndroidHttpClientProvider.this.sessionRepository;
                cleanupDirectory = AndroidHttpClientProvider.this.cleanupDirectory;
                alternativeFlowReader = AndroidHttpClientProvider.this.alternativeFlowReader;
                nVar3.resumeWith(i8.o.b(new OkHttp3Client(iSDKDispatchers3, vVar2, context3, sessionRepository, cleanupDirectory, alternativeFlowReader)));
            }
        });
        Object z10 = oVar.z();
        c10 = n8.d.c();
        if (z10 == c10) {
            h.c(dVar);
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // com.unity3d.ads.core.domain.HttpClientProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(m8.d<? super com.unity3d.services.core.network.core.HttpClient> r22) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke(m8.d):java.lang.Object");
    }
}
