package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import java.util.Date;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class yl implements SegmentListener {

    /* renamed from: a  reason: collision with root package name */
    private SegmentListener f21556a;

    /* renamed from: b  reason: collision with root package name */
    private final b f21557b;

    /* renamed from: c  reason: collision with root package name */
    protected long f21558c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private Handler f21559a;

        private b() {
        }

        public Handler a() {
            return this.f21559a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.f21559a = new Handler();
            Looper.loop();
        }
    }

    public yl() {
        b bVar = new b();
        this.f21557b = bVar;
        bVar.start();
        this.f21558c = new Date().getTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f21556a.onSegmentReceived(str);
    }

    public void a(SegmentListener segmentListener) {
        this.f21556a = segmentListener;
    }

    protected void a(Runnable runnable) {
        Handler a10;
        b bVar = this.f21557b;
        if (bVar == null || (a10 = bVar.a()) == null) {
            return;
        }
        a10.post(runnable);
    }

    protected boolean a(Object obj) {
        return (obj == null || this.f21557b == null) ? false : true;
    }

    @Override // com.ironsource.mediationsdk.sdk.SegmentListener
    public void onSegmentReceived(final String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onSegmentReceived(" + str + ")", 1);
        if (a((Object) this.f21556a)) {
            a(new Runnable() { // from class: com.ironsource.f30
                @Override // java.lang.Runnable
                public final void run() {
                    yl.this.a(str);
                }
            });
        }
    }
}
