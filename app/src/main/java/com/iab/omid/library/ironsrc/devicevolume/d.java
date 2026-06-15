package com.iab.omid.library.ironsrc.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f15831a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f15832b;

    /* renamed from: c  reason: collision with root package name */
    private final a f15833c;

    /* renamed from: d  reason: collision with root package name */
    private final c f15834d;

    /* renamed from: e  reason: collision with root package name */
    private float f15835e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f15831a = context;
        this.f15832b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f15833c = aVar;
        this.f15834d = cVar;
    }

    private float a() {
        return this.f15833c.a(this.f15832b.getStreamVolume(3), this.f15832b.getStreamMaxVolume(3));
    }

    private boolean a(float f10) {
        return f10 != this.f15835e;
    }

    private void b() {
        this.f15834d.a(this.f15835e);
    }

    public void c() {
        this.f15835e = a();
        b();
        this.f15831a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f15831a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float a10 = a();
        if (a(a10)) {
            this.f15835e = a10;
            b();
        }
    }
}
