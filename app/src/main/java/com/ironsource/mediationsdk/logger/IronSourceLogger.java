package com.ironsource.mediationsdk.logger;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class IronSourceLogger {

    /* renamed from: a  reason: collision with root package name */
    int f18891a;

    /* renamed from: b  reason: collision with root package name */
    private String f18892b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int GENERAL = 4;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public IronSourceLogLevel() {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum IronSourceTag {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IronSourceLogger(String str) {
        this.f18892b = str;
        this.f18891a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IronSourceLogger(String str, int i10) {
        this.f18892b = str;
        this.f18891a = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.f18891a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f18892b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof IronSourceLogger)) {
            return false;
        }
        IronSourceLogger ironSourceLogger = (IronSourceLogger) obj;
        String str = this.f18892b;
        return str != null && str.equals(ironSourceLogger.f18892b);
    }

    public abstract void log(IronSourceTag ironSourceTag, String str, int i10);

    public abstract void logException(IronSourceTag ironSourceTag, String str, Throwable th);

    public void setDebugLevel(int i10) {
        this.f18891a = i10;
    }
}
