package com.ironsource.mediationsdk.logger;

import com.ironsource.kl;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public enum IronLog {
    API(IronSourceLogger.IronSourceTag.API),
    CALLBACK(IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(IronSourceLogger.IronSourceTag.EVENT);
    

    /* renamed from: a  reason: collision with root package name */
    IronSourceLogger.IronSourceTag f18888a;

    IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.f18888a = ironSourceTag;
    }

    public void error() {
        IronSourceLoggerManager.getLogger().a(this.f18888a, new kl("", 3));
    }

    public void error(String str) {
        IronSourceLoggerManager.getLogger().a(this.f18888a, new kl(str, 3));
    }

    public void general() {
        IronSourceLoggerManager.getLogger().a(this.f18888a, new kl("", 4));
    }

    public void general(String str) {
        IronSourceLoggerManager.getLogger().a(this.f18888a, new kl(str, 4));
    }

    public void info() {
        IronSourceLoggerManager.getLogger().a(this.f18888a, new kl("", 1));
    }

    public void info(String str) {
        IronSourceLoggerManager.getLogger().a(this.f18888a, new kl(str, 1));
    }

    public void verbose() {
        IronSourceLoggerManager.getLogger().a(this.f18888a, new kl("", 0));
    }

    public void verbose(String str) {
        IronSourceLoggerManager.getLogger().a(this.f18888a, new kl(str, 0));
    }

    public void warning() {
        IronSourceLoggerManager.getLogger().a(this.f18888a, new kl("", 2));
    }

    public void warning(String str) {
        IronSourceLoggerManager.getLogger().a(this.f18888a, new kl(str, 2));
    }
}
