package com.unity3d.services.ads.token;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.GameSessionIdReader;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import g9.l0;
import g9.w;
import i8.g;
import i8.i;
import i8.k;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: InMemoryTokenStorage.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InMemoryTokenStorage implements TokenStorage, IServiceComponent {
    private final g asyncTokenStorage$delegate;
    private final ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
    private final w<Integer> accessCounter = l0.a(-1);
    private final w<String> initToken = l0.a(null);
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();

    public InMemoryTokenStorage() {
        g a10;
        a10 = i.a(k.NONE, new InMemoryTokenStorage$special$$inlined$inject$default$1(this, ""));
        this.asyncTokenStorage$delegate = a10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_nativeGeneratedToken_$lambda$2(String str) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_NATIVE_DATA, str);
    }

    private final AsyncTokenStorage getAsyncTokenStorage() {
        return (AsyncTokenStorage) this.asyncTokenStorage$delegate.getValue();
    }

    private final void triggerTokenAvailable(boolean z10) {
        InitializeEventsMetricSender.getInstance().sdkTokenDidBecomeAvailableWithConfig(z10);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void appendTokens(JSONArray tokens) throws JSONException {
        n.f(tokens, "tokens");
        this.accessCounter.i(-1, 0);
        int length = tokens.length();
        for (int i10 = 0; i10 < length; i10++) {
            this.queue.add(tokens.getString(i10));
        }
        if (length > 0) {
            triggerTokenAvailable(false);
            getAsyncTokenStorage().onTokenAvailable();
        }
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void createTokens(JSONArray tokens) throws JSONException {
        n.f(tokens, "tokens");
        deleteTokens();
        appendTokens(tokens);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void deleteTokens() {
        Integer value;
        this.queue.clear();
        w<Integer> wVar = this.accessCounter;
        do {
            value = wVar.getValue();
            value.intValue();
        } while (!wVar.i(value, -1));
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public i8.w getNativeGeneratedToken() {
        new NativeTokenGenerator(this.executorService, new DeviceInfoReaderBuilder(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance()), null).generateToken(new INativeTokenGeneratorListener() { // from class: com.unity3d.services.ads.token.a
            @Override // com.unity3d.services.ads.token.INativeTokenGeneratorListener
            public final void onReady(String str) {
                InMemoryTokenStorage._get_nativeGeneratedToken_$lambda$2(str);
            }
        });
        return i8.w.f26638a;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public String getToken() {
        Integer value;
        Integer num;
        if (this.accessCounter.getValue().intValue() == -1) {
            return this.initToken.getValue();
        }
        if (this.queue.isEmpty()) {
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.QUEUE_EMPTY, new Object[0]);
            return null;
        }
        w<Integer> wVar = this.accessCounter;
        do {
            value = wVar.getValue();
            num = value;
        } while (!wVar.i(value, Integer.valueOf(num.intValue() + 1)));
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_ACCESS, Integer.valueOf(num.intValue()));
        return this.queue.poll();
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void setInitToken(String str) {
        if (str == null) {
            return;
        }
        w<String> wVar = this.initToken;
        do {
        } while (!wVar.i(wVar.getValue(), str));
        triggerTokenAvailable(true);
        getAsyncTokenStorage().onTokenAvailable();
    }
}
