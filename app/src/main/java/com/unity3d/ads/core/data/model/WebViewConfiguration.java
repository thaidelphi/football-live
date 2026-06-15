package com.unity3d.ads.core.data.model;

import java.util.List;
import kotlin.jvm.internal.n;
/* compiled from: WebViewConfiguration.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class WebViewConfiguration {
    private final List<String> additionalFiles;
    private final String entryPoint;
    private final int version;

    public WebViewConfiguration(int i10, String entryPoint, List<String> additionalFiles) {
        n.f(entryPoint, "entryPoint");
        n.f(additionalFiles, "additionalFiles");
        this.version = i10;
        this.entryPoint = entryPoint;
        this.additionalFiles = additionalFiles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebViewConfiguration copy$default(WebViewConfiguration webViewConfiguration, int i10, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = webViewConfiguration.version;
        }
        if ((i11 & 2) != 0) {
            str = webViewConfiguration.entryPoint;
        }
        if ((i11 & 4) != 0) {
            list = webViewConfiguration.additionalFiles;
        }
        return webViewConfiguration.copy(i10, str, list);
    }

    public final int component1() {
        return this.version;
    }

    public final String component2() {
        return this.entryPoint;
    }

    public final List<String> component3() {
        return this.additionalFiles;
    }

    public final WebViewConfiguration copy(int i10, String entryPoint, List<String> additionalFiles) {
        n.f(entryPoint, "entryPoint");
        n.f(additionalFiles, "additionalFiles");
        return new WebViewConfiguration(i10, entryPoint, additionalFiles);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WebViewConfiguration) {
            WebViewConfiguration webViewConfiguration = (WebViewConfiguration) obj;
            return this.version == webViewConfiguration.version && n.a(this.entryPoint, webViewConfiguration.entryPoint) && n.a(this.additionalFiles, webViewConfiguration.additionalFiles);
        }
        return false;
    }

    public final List<String> getAdditionalFiles() {
        return this.additionalFiles;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((this.version * 31) + this.entryPoint.hashCode()) * 31) + this.additionalFiles.hashCode();
    }

    public String toString() {
        return "WebViewConfiguration(version=" + this.version + ", entryPoint=" + this.entryPoint + ", additionalFiles=" + this.additionalFiles + ')';
    }
}
