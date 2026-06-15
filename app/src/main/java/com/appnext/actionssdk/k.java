package com.appnext.actionssdk;

import android.os.Handler;
import com.appnext.actionssdk.ActionSDK;
import com.appnext.actionssdk.callback.OnActionsLoaded;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k {
    private static k bX;
    private Moment aO;
    private ActionSDK.MomentsCallback aU;
    private ArrayList<ActionData> bY = new ArrayList<>();
    private Runnable bZ = new Runnable() { // from class: com.appnext.actionssdk.k.3
        @Override // java.lang.Runnable
        public final void run() {
            if (k.this.f10012i == null) {
                return;
            }
            k.this.f10012i.a(k.this.aO, new OnActionsLoaded() { // from class: com.appnext.actionssdk.k.3.1
                @Override // com.appnext.actionssdk.callback.OnActionsLoaded
                public final void onActionsLoaded(ArrayList<ActionData> arrayList) {
                    Iterator it = k.this.bY.iterator();
                    while (it.hasNext()) {
                        if (((ActionData) it.next()).getExpireMillis() < System.currentTimeMillis()) {
                            it.remove();
                        }
                    }
                    Iterator<ActionData> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        boolean z10 = false;
                        ActionData next = it2.next();
                        Iterator it3 = k.this.bY.iterator();
                        while (it3.hasNext()) {
                            if (((ActionData) it3.next()).getActionParam().equals(next.getActionParam())) {
                                z10 = true;
                            }
                        }
                        if (z10) {
                            it2.remove();
                        }
                    }
                    if (arrayList.size() > 0) {
                        k.this.bY.addAll(arrayList);
                        k.this.aU.onReceive(arrayList);
                    }
                }
            });
            k.this.handler.postDelayed(k.this.bZ, Long.parseLong(f.y().get("polling_sample")));
        }
    };
    private Handler handler = new Handler();

    /* renamed from: i  reason: collision with root package name */
    private ActionSDK f10012i;

    private k() {
    }

    public static k i(ActionSDK actionSDK) {
        if (bX == null) {
            bX = new k();
        }
        k kVar = bX;
        kVar.f10012i = actionSDK;
        return kVar;
    }

    public final void stop() {
        this.handler.removeCallbacks(this.bZ);
    }

    public final void a(Moment moment, final ActionSDK.MomentsCallback momentsCallback) {
        Moment moment2 = new Moment(moment);
        this.aO = moment2;
        moment2.setOnAdClosedCallback(null);
        this.aO.setOnAdClickedCallback(null);
        this.aO.setOnAdErrorCallback(null);
        this.aO.setOnAdErrorCallback(new OnAdError() { // from class: com.appnext.actionssdk.k.1
            @Override // com.appnext.core.callbacks.OnAdError
            public final void adError(String str) {
            }
        });
        this.aO.setOnAdOpenedCallback(null);
        this.aO.setOnAdLoadedCallback(null);
        this.handler.removeCallbacks(this.bZ);
        new Thread(new Runnable() { // from class: com.appnext.actionssdk.k.2
            @Override // java.lang.Runnable
            public final void run() {
                f.y().a(new p.a() { // from class: com.appnext.actionssdk.k.2.1
                    public final void a(HashMap<String, Object> hashMap) {
                        if (f.y().get("polling_status").equals("on")) {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            k.this.aU = momentsCallback;
                            k.this.handler.post(k.this.bZ);
                        }
                    }

                    public final void error(String str) {
                        if (f.y().get("polling_status").equals("on")) {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            k.this.aU = momentsCallback;
                            k.this.handler.post(k.this.bZ);
                        }
                    }
                });
            }
        }).start();
    }
}
