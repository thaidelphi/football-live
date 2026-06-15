package com.ironsource.mediationsdk.logger;

import com.ironsource.kl;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class IronSourceLoggerManager extends IronSourceLogger implements LogListener {

    /* renamed from: d  reason: collision with root package name */
    private static IronSourceLoggerManager f18895d;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<IronSourceLogger> f18896c;

    private IronSourceLoggerManager(String str) {
        super(str);
        this.f18896c = new ArrayList<>();
        c();
    }

    private IronSourceLoggerManager(String str, int i10) {
        super(str, i10);
        this.f18896c = new ArrayList<>();
        c();
    }

    private IronSourceLogger a(String str) {
        Iterator<IronSourceLogger> it = this.f18896c.iterator();
        while (it.hasNext()) {
            IronSourceLogger next = it.next();
            if (next.b().equals(str)) {
                return next;
            }
        }
        return null;
    }

    private void a(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        Iterator<IronSourceLogger> it = this.f18896c.iterator();
        while (it.hasNext()) {
            IronSourceLogger next = it.next();
            if (next.a() <= i10) {
                next.log(ironSourceTag, str, i10);
            }
        }
    }

    private boolean a(int i10) {
        return i10 < this.f18891a;
    }

    private void c() {
        this.f18896c.add(new a(0));
    }

    public static synchronized IronSourceLoggerManager getLogger() {
        IronSourceLoggerManager ironSourceLoggerManager;
        synchronized (IronSourceLoggerManager.class) {
            if (f18895d == null) {
                f18895d = new IronSourceLoggerManager(IronSourceLoggerManager.class.getSimpleName());
            }
            ironSourceLoggerManager = f18895d;
        }
        return ironSourceLoggerManager;
    }

    public static synchronized IronSourceLoggerManager getLogger(int i10) {
        IronSourceLoggerManager ironSourceLoggerManager;
        synchronized (IronSourceLoggerManager.class) {
            IronSourceLoggerManager ironSourceLoggerManager2 = f18895d;
            if (ironSourceLoggerManager2 == null) {
                f18895d = new IronSourceLoggerManager(IronSourceLoggerManager.class.getSimpleName());
            } else {
                ironSourceLoggerManager2.f18891a = i10;
            }
            ironSourceLoggerManager = f18895d;
        }
        return ironSourceLoggerManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(IronSourceLogger.IronSourceTag ironSourceTag, kl klVar) {
        if (a(klVar.a())) {
            return;
        }
        a(ironSourceTag, klVar.c(), klVar.a());
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.f18896c.add(ironSourceLogger);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    @Deprecated(forRemoval = true, since = "8.3.0")
    public synchronized void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        if (a(i10)) {
            return;
        }
        a(ironSourceTag, str, i10);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public synchronized void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th == null) {
            Iterator<IronSourceLogger> it = this.f18896c.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
        } else {
            Iterator<IronSourceLogger> it2 = this.f18896c.iterator();
            while (it2.hasNext()) {
                it2.next().logException(ironSourceTag, str, th);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.logger.LogListener
    public synchronized void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        log(ironSourceTag, str, i10);
    }

    public void setLoggerDebugLevel(String str, int i10) {
        if (str == null) {
            return;
        }
        IronSourceLogger a10 = a(str);
        if (a10 == null) {
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            log(ironSourceTag, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + ")", 0);
        } else if (i10 < 0 || i10 > 3) {
            this.f18896c.remove(a10);
        } else {
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NATIVE;
            log(ironSourceTag2, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + ")", 0);
            a10.setDebugLevel(i10);
        }
    }
}
