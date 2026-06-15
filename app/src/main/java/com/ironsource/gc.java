package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class gc {

    /* renamed from: a  reason: collision with root package name */
    static final String f17559a = "ironbeast";

    /* renamed from: b  reason: collision with root package name */
    static final String f17560b = "outcome";

    /* renamed from: c  reason: collision with root package name */
    static final int f17561c = 3;

    /* renamed from: d  reason: collision with root package name */
    static final int f17562d = 2;

    /* renamed from: e  reason: collision with root package name */
    static final int f17563e = 0;

    gc() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e a(String str, int i10) {
        if (f17559a.equals(str)) {
            return new lk(i10);
        }
        if (f17560b.equals(str)) {
            return new wo(i10);
        }
        if (i10 == 2) {
            return new lk(i10);
        }
        if (i10 == 3) {
            return new wo(i10);
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        logger.log(ironSourceTag, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i10 + ")", 2);
        return null;
    }
}
