package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.d7;
import com.applovin.impl.h2;
import com.applovin.impl.l2;
import com.applovin.impl.sdk.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class FullscreenAdService extends Service {
    public static final String DATA_KEY_RAW_FULL_AD_RESPONSE = "raw_full_ad_response";
    private static final String TAG = "FullscreenAdService";

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class b extends Handler {
        private b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                h2 h2Var = AppLovinFullscreenActivity.parentInterstitialWrapper;
                if (h2Var == null) {
                    if (!d7.a(1.0d)) {
                        super.handleMessage(message);
                        return;
                    }
                    throw new RuntimeException("parentWrapper is null for " + message.what);
                }
                com.applovin.impl.sdk.ad.b f10 = h2Var.f();
                int i10 = message.what;
                c cVar = c.AD;
                if (i10 == cVar.b()) {
                    Bundle bundle = new Bundle();
                    bundle.putString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE, f10.getRawFullResponse());
                    Message obtain = Message.obtain((Handler) null, cVar.b());
                    obtain.setData(bundle);
                    try {
                        message.replyTo.send(obtain);
                    } catch (RemoteException e8) {
                        n.c(FullscreenAdService.TAG, "Failed to respond to Fullscreen Activity in another process with ad", e8);
                    }
                } else if (message.what == c.AD_DISPLAYED.b()) {
                    l2.a(h2Var.c(), f10);
                } else if (message.what == c.AD_CLICKED.b()) {
                    l2.a(h2Var.b(), f10);
                } else if (message.what == c.AD_VIDEO_STARTED.b()) {
                    l2.a(h2Var.d(), f10);
                } else if (message.what == c.AD_VIDEO_ENDED.b()) {
                    Bundle data = message.getData();
                    l2.a(h2Var.d(), f10, data.getDouble("percent_viewed"), data.getBoolean("fully_watched"));
                } else if (message.what == c.AD_HIDDEN.b()) {
                    l2.b(h2Var.c(), f10);
                } else {
                    super.handleMessage(message);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum c {
        AD(0),
        AD_DISPLAYED(1),
        AD_CLICKED(2),
        AD_VIDEO_STARTED(3),
        AD_VIDEO_ENDED(4),
        AD_HIDDEN(5);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f6581a;

        c(int i10) {
            this.f6581a = i10;
        }

        public int b() {
            return this.f6581a;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new Messenger(new b()).getBinder();
    }
}
