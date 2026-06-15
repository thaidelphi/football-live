package com.unity3d.ads.core.data.model;

import b0.a;
import b0.k;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import i8.w;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: WebViewConfigurationStoreSerializer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class WebViewConfigurationStoreSerializer implements k<WebviewConfigurationStore.WebViewConfigurationStore> {
    private final WebviewConfigurationStore.WebViewConfigurationStore defaultValue;

    public WebViewConfigurationStoreSerializer() {
        WebviewConfigurationStore.WebViewConfigurationStore defaultInstance = WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance();
        n.e(defaultInstance, "getDefaultInstance()");
        this.defaultValue = defaultInstance;
    }

    @Override // b0.k
    public Object readFrom(InputStream inputStream, d<? super WebviewConfigurationStore.WebViewConfigurationStore> dVar) {
        try {
            WebviewConfigurationStore.WebViewConfigurationStore parseFrom = WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(inputStream);
            n.e(parseFrom, "parseFrom(input)");
            return parseFrom;
        } catch (InvalidProtocolBufferException e8) {
            throw new a("Cannot read proto.", e8);
        }
    }

    @Override // b0.k
    public /* bridge */ /* synthetic */ Object writeTo(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, OutputStream outputStream, d dVar) {
        return writeTo2(webViewConfigurationStore, outputStream, (d<? super w>) dVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // b0.k
    public WebviewConfigurationStore.WebViewConfigurationStore getDefaultValue() {
        return this.defaultValue;
    }

    /* renamed from: writeTo  reason: avoid collision after fix types in other method */
    public Object writeTo2(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, OutputStream outputStream, d<? super w> dVar) {
        webViewConfigurationStore.writeTo(outputStream);
        return w.f26638a;
    }
}
