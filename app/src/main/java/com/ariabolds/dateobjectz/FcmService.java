package com.ariabolds.dateobjectz;

import android.app.NotificationManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import r1.e;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class FcmService extends FirebaseMessagingService {

    /* renamed from: g  reason: collision with root package name */
    private SharedPreferences f10149g;

    /* renamed from: h  reason: collision with root package name */
    Bitmap f10150h;

    /* renamed from: i  reason: collision with root package name */
    String f10151i;

    /* renamed from: j  reason: collision with root package name */
    String f10152j = "";

    /* renamed from: k  reason: collision with root package name */
    Intent f10153k;

    /* renamed from: l  reason: collision with root package name */
    Date f10154l;

    /* renamed from: m  reason: collision with root package name */
    long f10155m;

    /* renamed from: n  reason: collision with root package name */
    String f10156n;

    /* renamed from: o  reason: collision with root package name */
    String f10157o;

    /* renamed from: p  reason: collision with root package name */
    int f10158p;

    /* renamed from: q  reason: collision with root package name */
    boolean f10159q;

    /* renamed from: r  reason: collision with root package name */
    NotificationManager f10160r;

    /* renamed from: s  reason: collision with root package name */
    String f10161s;

    /* renamed from: t  reason: collision with root package name */
    String f10162t;

    /* renamed from: u  reason: collision with root package name */
    String f10163u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements r1.c {
        a() {
        }

        @Override // r1.c
        public void a(String str, String str2, String str3) {
            Log.e("EX LINK OPEN", String.valueOf(str));
        }

        @Override // r1.c
        public void onError(String str, String str2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements r1.c {
        b() {
        }

        @Override // r1.c
        public void a(String str, String str2, String str3) {
            Log.e("DDDDDDDDDDDDDDDDD", String.valueOf(str));
        }

        @Override // r1.c
        public void onError(String str, String str2) {
        }
    }

    public FcmService() {
        Date date = new Date();
        this.f10154l = date;
        this.f10155m = date.getTime();
        this.f10157o = "";
        this.f10158p = 60;
        this.f10159q = true;
        this.f10161s = "";
        this.f10162t = "";
        this.f10163u = "FCMS";
    }

    private void v() {
        new e(getApplicationContext(), this.f10161s, this.f10162t, new a()).execute(new Void[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void x(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, android.graphics.Bitmap r25, android.graphics.Bitmap r26) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ariabolds.dateobjectz.FcmService.x(java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.graphics.Bitmap, android.graphics.Bitmap):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02fc  */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(com.google.firebase.messaging.RemoteMessage r21) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ariabolds.dateobjectz.FcmService.q(com.google.firebase.messaging.RemoteMessage):void");
    }

    public Bitmap w(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
        } catch (Exception e8) {
            Log.e("awesome", "Error in getting notification image: " + e8.getLocalizedMessage());
            return null;
        }
    }
}
