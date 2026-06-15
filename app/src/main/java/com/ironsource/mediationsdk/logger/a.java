package com.ironsource.mediationsdk.logger;

import android.os.Looper;
import android.util.Log;
import com.ironsource.b9;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a extends IronSourceLogger {

    /* renamed from: c  reason: collision with root package name */
    public static final String f18897c = "console";

    /* renamed from: d  reason: collision with root package name */
    public static final String f18898d = "LevelPlaySDK: ";

    private a() {
        super("console");
    }

    public a(int i10) {
        super("console", i10);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        StringBuilder sb = new StringBuilder();
        sb.append("UIThread: ");
        sb.append(Looper.getMainLooper() == Looper.myLooper());
        sb.append(" ");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Activity: ");
        sb3.append(ContextProvider.getInstance().getCurrentActiveActivity() != null ? Integer.valueOf(ContextProvider.getInstance().getCurrentActiveActivity().hashCode()) : Boolean.FALSE);
        sb3.append(" ");
        String sb4 = sb3.toString();
        if (i10 == 0) {
            Log.v(f18898d + ironSourceTag, sb2 + sb4 + str);
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                Log.w(f18898d + ironSourceTag, str);
                return;
            } else if (i10 == 3) {
                Log.e(f18898d + ironSourceTag, str);
                return;
            } else if (i10 != 4) {
                return;
            }
        }
        Log.i(f18898d + ironSourceTag, str);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        log(ironSourceTag, str + ":stacktrace[" + Log.getStackTraceString(th) + b9.i.f16698e, 3);
    }
}
