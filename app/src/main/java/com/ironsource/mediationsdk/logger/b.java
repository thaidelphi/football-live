package com.ironsource.mediationsdk.logger;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b extends IronSourceLogger {

    /* renamed from: e  reason: collision with root package name */
    private static final String f18899e = "publisher";

    /* renamed from: c  reason: collision with root package name */
    private LogListener f18900c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f18901d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f18902a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IronSourceLogger.IronSourceTag f18903b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f18904c;

        a(String str, IronSourceLogger.IronSourceTag ironSourceTag, int i10) {
            this.f18902a = str;
            this.f18903b = ironSourceTag;
            this.f18904c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f18900c == null || this.f18902a == null) {
                return;
            }
            b.this.f18900c.onLog(this.f18903b, this.f18902a, this.f18904c);
        }
    }

    private b() {
        super("publisher");
    }

    public b(LogListener logListener, int i10) {
        super("publisher", i10);
        this.f18900c = logListener;
        this.f18901d = false;
    }

    public void a(LogListener logListener) {
        this.f18900c = logListener;
    }

    public void a(boolean z10) {
        this.f18901d = z10;
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        a aVar = new a(str, ironSourceTag, i10);
        if (this.f18901d) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(aVar);
        } else {
            IronSourceThreadManager.INSTANCE.postPublisherCallback(aVar);
        }
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th != null) {
            log(ironSourceTag, th.getMessage(), 3);
        }
    }
}
