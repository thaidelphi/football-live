package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.m;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.store.StoreError;
import com.unity3d.services.store.StoreEvent;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.n;
import org.json.JSONException;
/* compiled from: WebViewStoreExceptionHandler.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class WebViewStoreExceptionHandler implements StoreExceptionHandler {
    private final WebViewErrorHandler _webViewErrorHandler;

    public WebViewStoreExceptionHandler(WebViewErrorHandler _webViewErrorHandler) {
        n.f(_webViewErrorHandler, "_webViewErrorHandler");
        this._webViewErrorHandler = _webViewErrorHandler;
    }

    private final StoreError getStoreError(Exception exc) {
        return exc instanceof NoSuchMethodException ? StoreError.NO_SUCH_METHOD : exc instanceof IllegalAccessException ? StoreError.ILLEGAL_ACCESS : exc instanceof JSONException ? StoreError.JSON_ERROR : exc instanceof InvocationTargetException ? StoreError.INVOCATION_TARGET : exc instanceof ClassNotFoundException ? StoreError.CLASS_NOT_FOUND : StoreError.UNKNOWN_ERROR;
    }

    private final void sendErrorToWebView(StoreEvent storeEvent, StoreError storeError, int i10, Exception exc) {
        this._webViewErrorHandler.handleError((m) new StoreWebViewError(storeEvent, exc.getMessage(), Integer.valueOf(i10), storeError, exc.getMessage()));
    }

    @Override // com.unity3d.services.store.core.StoreExceptionHandler
    public void handleStoreException(StoreEvent storeEvent, int i10, Exception exception) {
        n.f(storeEvent, "storeEvent");
        n.f(exception, "exception");
        sendErrorToWebView(storeEvent, getStoreError(exception), i10, exception);
    }
}
