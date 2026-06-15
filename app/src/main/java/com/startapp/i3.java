package com.startapp;

import android.graphics.Bitmap;
import com.startapp.b1;
import com.startapp.sdk.adsbase.adinformation.ImageResourceConfig;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i3 implements b1.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImageResourceConfig f22085a;

    public i3(ImageResourceConfig imageResourceConfig) {
        this.f22085a = imageResourceConfig;
    }

    @Override // com.startapp.b1.b
    public final void a(Bitmap bitmap, int i10) {
        ImageResourceConfig imageResourceConfig = this.f22085a;
        imageResourceConfig.f22974a = bitmap;
        if (bitmap != null) {
            imageResourceConfig.f22976c = bitmap;
        }
    }
}
