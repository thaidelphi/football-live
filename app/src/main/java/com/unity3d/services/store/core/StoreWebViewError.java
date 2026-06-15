package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.m;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.Arrays;
import kotlin.jvm.internal.n;
/* compiled from: StoreWebViewError.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class StoreWebViewError extends m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreWebViewError(Enum<?> r22, String str, Object... errorArguments) {
        super(r22, str, Arrays.copyOf(errorArguments, errorArguments.length));
        n.f(errorArguments, "errorArguments");
    }

    @Override // com.unity3d.scar.adapter.common.m
    public String getDomain() {
        return WebViewEventCategory.STORE.name();
    }
}
