package com.unity3d.ironsourceads;

import com.unity3d.ironsourceads.IronSourceAds;
import j8.q;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitRequest {

    /* renamed from: a  reason: collision with root package name */
    private final String f23702a;

    /* renamed from: b  reason: collision with root package name */
    private final List<IronSourceAds.AdFormat> f23703b;

    /* renamed from: c  reason: collision with root package name */
    private final LogLevel f23704c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final String f23705a;

        /* renamed from: b  reason: collision with root package name */
        private List<? extends IronSourceAds.AdFormat> f23706b;

        /* renamed from: c  reason: collision with root package name */
        private LogLevel f23707c;

        public Builder(String appKey) {
            n.f(appKey, "appKey");
            this.f23705a = appKey;
        }

        public final InitRequest build() {
            String str = this.f23705a;
            List<? extends IronSourceAds.AdFormat> list = this.f23706b;
            if (list == null) {
                list = q.d();
            }
            LogLevel logLevel = this.f23707c;
            if (logLevel == null) {
                logLevel = LogLevel.NONE;
            }
            return new InitRequest(str, list, logLevel, null);
        }

        public final String getAppKey() {
            return this.f23705a;
        }

        public final Builder withLegacyAdFormats(List<? extends IronSourceAds.AdFormat> legacyAdFormats) {
            n.f(legacyAdFormats, "legacyAdFormats");
            this.f23706b = legacyAdFormats;
            return this;
        }

        public final Builder withLogLevel(LogLevel logLevel) {
            n.f(logLevel, "logLevel");
            this.f23707c = logLevel;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InitRequest(String str, List<? extends IronSourceAds.AdFormat> list, LogLevel logLevel) {
        this.f23702a = str;
        this.f23703b = list;
        this.f23704c = logLevel;
    }

    public /* synthetic */ InitRequest(String str, List list, LogLevel logLevel, h hVar) {
        this(str, list, logLevel);
    }

    public final String getAppKey() {
        return this.f23702a;
    }

    public final List<IronSourceAds.AdFormat> getLegacyAdFormats() {
        return this.f23703b;
    }

    public final LogLevel getLogLevel() {
        return this.f23704c;
    }
}
