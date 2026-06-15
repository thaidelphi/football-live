package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class fb extends Handler {

    /* renamed from: b  reason: collision with root package name */
    private static final String f17393b = "DownloadHandler";

    /* renamed from: a  reason: collision with root package name */
    po f17394a;

    public fb(Looper looper) {
        super(looper);
    }

    public void a() {
        this.f17394a = null;
    }

    public void a(po poVar) {
        if (poVar == null) {
            throw new IllegalArgumentException();
        }
        this.f17394a = poVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        po poVar = this.f17394a;
        if (poVar == null) {
            Logger.i(f17393b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i10 = message.what;
            if (i10 == 1016) {
                poVar.a((nh) message.obj);
                return;
            }
            this.f17394a.a((nh) message.obj, new fh(i10, jv.a(i10)));
        } catch (Throwable th) {
            o9.d().a(th);
            Logger.i(f17393b, "handleMessage | Got exception: " + th.getMessage());
            IronLog.INTERNAL.error(th.toString());
        }
    }
}
