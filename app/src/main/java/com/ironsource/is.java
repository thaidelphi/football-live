package com.ironsource;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class is {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f17857a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f17858b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f17859c;

        a(String str, boolean z10, int i10) {
            this.f17857a = str;
            this.f17858b = z10;
            this.f17859c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            is.c(this.f17857a, this.f17858b, this.f17859c);
        }
    }

    public static void b(String str, boolean z10, int i10) {
        Thread thread = new Thread(new a(str, z10, i10), "callAsyncRequestURL");
        thread.setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.d());
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, boolean z10, int i10) {
        try {
            new JSONObject(HttpFunctions.getStringFromURL(ServerURL.getRequestURL(str, z10, i10)));
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NETWORK;
            logger.log(ironSourceTag, "callRequestURL(reqUrl:" + str + ", hit:" + z10 + ")", 1);
        } catch (Throwable th) {
            o9.d().a(th);
            StringBuilder sb = new StringBuilder("callRequestURL(reqUrl:");
            if (str == null) {
                str = "null";
            }
            sb.append(str);
            sb.append(", hit:");
            sb.append(z10);
            sb.append(")");
            IronSourceLoggerManager logger2 = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NETWORK;
            logger2.log(ironSourceTag2, sb.toString() + ", e:" + Log.getStackTraceString(th), 0);
        }
    }
}
