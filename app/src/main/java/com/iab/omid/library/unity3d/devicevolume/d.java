package com.iab.omid.library.unity3d.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f16095a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f16096b;

    /* renamed from: c  reason: collision with root package name */
    private final a f16097c;

    /* renamed from: d  reason: collision with root package name */
    private final c f16098d;

    /* renamed from: e  reason: collision with root package name */
    private float f16099e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f16095a = context;
        this.f16096b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f16097c = aVar;
        this.f16098d = cVar;
    }

    private float a() {
        return this.f16097c.a(this.f16096b.getStreamVolume(3), this.f16096b.getStreamMaxVolume(3));
    }

    private boolean a(float f10) {
        return f10 != this.f16099e;
    }

    private void b() {
        this.f16098d.a(this.f16099e);
    }

    public void c() {
        this.f16099e = a();
        b();
        this.f16095a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f16095a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float a10 = a();
        if (a(a10)) {
            this.f16099e = a10;
            b();
        }
    }
}
