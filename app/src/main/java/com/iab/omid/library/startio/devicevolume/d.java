package com.iab.omid.library.startio.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f15967a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f15968b;

    /* renamed from: c  reason: collision with root package name */
    private final a f15969c;

    /* renamed from: d  reason: collision with root package name */
    private final c f15970d;

    /* renamed from: e  reason: collision with root package name */
    private float f15971e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f15967a = context;
        this.f15968b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f15969c = aVar;
        this.f15970d = cVar;
    }

    private float a() {
        return this.f15969c.a(this.f15968b.getStreamVolume(3), this.f15968b.getStreamMaxVolume(3));
    }

    private boolean a(float f10) {
        return f10 != this.f15971e;
    }

    private void b() {
        this.f15970d.a(this.f15971e);
    }

    public void c() {
        this.f15971e = a();
        b();
        this.f15967a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f15967a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float a10 = a();
        if (a(a10)) {
            this.f15971e = a10;
            b();
        }
    }
}
