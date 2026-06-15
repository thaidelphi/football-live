package com.adcolony.sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.ironsource.ug;
import com.unity3d.services.core.device.MimeTypes;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class i extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private AudioManager f6028a;

    /* renamed from: b  reason: collision with root package name */
    private AdColonyInterstitial f6029b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Handler handler, AdColonyInterstitial adColonyInterstitial) {
        super(handler);
        Context a10 = a.a();
        if (a10 != null) {
            this.f6028a = (AudioManager) a10.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            this.f6029b = adColonyInterstitial;
            a10.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Context a10 = a.a();
        if (a10 != null) {
            a10.getApplicationContext().getContentResolver().unregisterContentObserver(this);
        }
        this.f6029b = null;
        this.f6028a = null;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        AdColonyInterstitial adColonyInterstitial;
        if (this.f6028a == null || (adColonyInterstitial = this.f6029b) == null || adColonyInterstitial.d() == null) {
            return;
        }
        f1 b10 = c0.b();
        c0.a(b10, "audio_percentage", (this.f6028a.getStreamVolume(3) / 15.0f) * 100.0f);
        c0.a(b10, "ad_session_id", this.f6029b.d().a());
        c0.b(b10, ug.f21009x, this.f6029b.d().c());
        new h0("AdContainer.on_audio_change", this.f6029b.d().k(), b10).c();
    }
}
