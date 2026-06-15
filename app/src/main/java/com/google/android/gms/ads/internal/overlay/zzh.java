package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzau;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class zzh extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    final zzau f11324a;

    /* renamed from: b  reason: collision with root package name */
    boolean f11325b;

    public zzh(Context context, String str, String str2, String str3) {
        super(context);
        zzau zzauVar = new zzau(context, str);
        this.f11324a = zzauVar;
        zzauVar.zzo(str2);
        zzauVar.zzn(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f11325b) {
            return false;
        }
        this.f11324a.zzm(motionEvent);
        return false;
    }
}
