package com.startapp.sdk.ads.video;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.ads.video.d;
import com.startapp.sdk.ads.video.f;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.net.URL;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22813a;

    /* renamed from: b  reason: collision with root package name */
    public final URL f22814b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22815c;

    /* renamed from: d  reason: collision with root package name */
    public final b f22816d;

    /* renamed from: e  reason: collision with root package name */
    public final d.a f22817e;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22818a;

        public a(String str) {
            this.f22818a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = i.this.f22816d;
            if (bVar != null) {
                bVar.a(this.f22818a);
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(String str);
    }

    public i(Context context, URL url, String str, f.a aVar, f.b bVar) {
        this.f22813a = context;
        this.f22814b = url;
        this.f22815c = str;
        this.f22816d = aVar;
        this.f22817e = bVar;
    }

    public final void a() {
        String str;
        try {
            if (AdsCommonMetaData.f22889h.G().q()) {
                str = d.b.f22797a.a(this.f22813a, this.f22814b, this.f22815c, this.f22817e);
            } else {
                str = VideoUtil.a(this.f22813a, this.f22814b, this.f22815c);
            }
        } catch (Exception unused) {
            str = null;
        }
        new Handler(Looper.getMainLooper()).post(new a(str));
    }
}
