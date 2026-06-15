package com.iab.omid.library.adcolony.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f15562a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f15563b;

    /* renamed from: c  reason: collision with root package name */
    private final a f15564c;

    /* renamed from: d  reason: collision with root package name */
    private final c f15565d;

    /* renamed from: e  reason: collision with root package name */
    private float f15566e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f15562a = context;
        this.f15563b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f15564c = aVar;
        this.f15565d = cVar;
    }

    private boolean a(float f10) {
        return f10 != this.f15566e;
    }

    private float c() {
        return this.f15564c.a(this.f15563b.getStreamVolume(3), this.f15563b.getStreamMaxVolume(3));
    }

    private void d() {
        this.f15565d.a(this.f15566e);
    }

    public void a() {
        this.f15566e = c();
        d();
        this.f15562a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void b() {
        this.f15562a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float c10 = c();
        if (a(c10)) {
            this.f15566e = c10;
            d();
        }
    }
}
