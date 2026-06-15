package com.ironsource.mediationsdk.ads.nativead.interfaces;

import android.graphics.drawable.Drawable;
import android.net.Uri;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface NativeAdDataInterface {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class Image {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable f18528a;

        /* renamed from: b  reason: collision with root package name */
        private final Uri f18529b;

        public Image(Drawable drawable, Uri uri) {
            this.f18528a = drawable;
            this.f18529b = uri;
        }

        public final Drawable getDrawable() {
            return this.f18528a;
        }

        public final Uri getUri() {
            return this.f18529b;
        }
    }

    String getAdvertiser();

    String getBody();

    String getCallToAction();

    Image getIcon();

    String getTitle();
}
