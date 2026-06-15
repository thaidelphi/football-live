package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import android.os.Bundle;
import com.startapp.e3;
import com.startapp.l3;
import com.startapp.m4;
import com.startapp.p2;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.jobs.b;
import com.startapp.x8;
import com.startapp.y8;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d extends com.startapp.sdk.jobs.b {
    protected static final String LOG_TAG = "d";

    public d(Context context, b.a aVar, Bundle bundle) {
        super(context, aVar, bundle);
    }

    private void sendMetaDataRequest(Context context) {
        AdPreferences adPreferences = new AdPreferences();
        a aVar = new a(this, context, adPreferences, context, adPreferences);
        com.startapp.sdk.components.a a10 = com.startapp.sdk.components.a.a(context);
        a10.f23249y.a().execute(new p2(aVar, a10));
    }

    @Override // com.startapp.sdk.jobs.b, java.lang.Runnable
    public void run() {
        try {
            y8 a10 = com.startapp.sdk.components.a.a(this.context).f23230f.a();
            a10.f23621b.a().execute(new x8(a10));
            MetaData.c(this.context);
            if (MetaData.f23158k.a0()) {
                sendMetaDataRequest(this.context);
            } else {
                this.callback.a(false);
            }
        } catch (Throwable th) {
            l3.a(th);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends com.startapp.sdk.adsbase.remoteconfig.a {

        /* renamed from: l  reason: collision with root package name */
        public MetaData f23209l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Context f23210m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ AdPreferences f23211n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ d f23212o;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(com.startapp.sdk.adsbase.remoteconfig.d r2, android.content.Context r3, com.startapp.sdk.adsbase.model.AdPreferences r4, android.content.Context r5, com.startapp.sdk.adsbase.model.AdPreferences r6) {
            /*
                r1 = this;
                com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason r0 = com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest.RequestReason.PERIODIC
                r1.f23212o = r2
                r1.f23210m = r5
                r1.f23211n = r6
                r1.<init>(r3, r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.remoteconfig.d.a.<init>(com.startapp.sdk.adsbase.remoteconfig.d, android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences, android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences):void");
        }

        @Override // com.startapp.sdk.adsbase.remoteconfig.a
        public final Boolean a() {
            try {
                SimpleTokenUtils.c(this.f23210m);
                MetaDataRequest metaDataRequest = new MetaDataRequest(this.f23210m, com.startapp.sdk.components.a.a(this.f23210m).E.a(), MetaDataRequest.RequestReason.PERIODIC);
                metaDataRequest.a(this.f23210m, this.f23211n);
                e3 a10 = com.startapp.sdk.adsbase.remoteconfig.a.a(this.f23210m, metaDataRequest);
                if (a10 != null) {
                    MetaData metaData = (MetaData) m4.a(MetaData.class, a10.f21903b);
                    this.f23209l = metaData;
                    return Boolean.valueOf(metaData != null);
                }
            } catch (Throwable th) {
                l3.a(th);
            }
            return Boolean.FALSE;
        }

        @Override // com.startapp.sdk.adsbase.remoteconfig.a
        public final void a(Boolean bool) {
            MetaData metaData;
            Context context;
            try {
                if (bool.booleanValue() && (metaData = this.f23209l) != null && (context = this.f23210m) != null) {
                    MetaData.a(context, metaData, MetaDataRequest.RequestReason.PERIODIC, this.f23205k);
                }
                ((com.startapp.sdk.jobs.b) this.f23212o).callback.a(false);
            } catch (Throwable th) {
                l3.a(th);
            }
        }
    }
}
