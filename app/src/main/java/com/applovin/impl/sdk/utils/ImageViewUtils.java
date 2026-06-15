package com.applovin.impl.sdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.d7;
import com.applovin.impl.l0;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.InputStream;
import java.net.URL;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ImageViewUtils {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(final j jVar, String str, final ImageView imageView, Uri uri) {
        if (((Boolean) jVar.a(o4.f8258y)).booleanValue()) {
            try {
                InputStream openStream = new URL(str).openStream();
                final Bitmap decodeStream = BitmapFactory.decodeStream(openStream);
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageViewUtils.a(j.this, decodeStream, imageView);
                    }
                });
                if (openStream != null) {
                    openStream.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                jVar.I();
                if (n.a()) {
                    n I = jVar.I();
                    I.a("ImageViewUtils", "Failed to fetch image: " + uri, th);
                }
                jVar.I().a("ImageViewUtils", th);
                jVar.D().a("ImageViewUtils", "setImageUri", th);
                return;
            }
        }
        InputStream inputStream = null;
        try {
            inputStream = new URL(str).openStream();
            final Bitmap decodeStream2 = BitmapFactory.decodeStream(inputStream);
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.f
                @Override // java.lang.Runnable
                public final void run() {
                    ImageViewUtils.b(j.this, decodeStream2, imageView);
                }
            });
        } catch (Throwable th2) {
            try {
                jVar.I();
                if (n.a()) {
                    n I2 = jVar.I();
                    I2.a("ImageViewUtils", "Failed to fetch image: " + uri, th2);
                }
            } finally {
                d7.a(inputStream, jVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(ImageView imageView, Uri uri) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        imageView.setImageURI(uri);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public static void setAndDownscaleBitmap(final ImageView imageView, final Uri uri) {
        if (uri == null || imageView == null) {
            return;
        }
        j jVar = j.f8884u0;
        if (jVar == null) {
            n.h("ImageViewUtils", "SDK has not been initialized");
        } else {
            jVar.i0().b().execute(new Runnable() { // from class: com.applovin.impl.sdk.utils.a
                @Override // java.lang.Runnable
                public final void run() {
                    ImageViewUtils.a(uri, imageView);
                }
            });
        }
    }

    public static void setAndDownscaleImageUri(final ImageView imageView, final Uri uri) {
        if (uri == null || imageView == null) {
            return;
        }
        if (imageView.getHeight() > 0 && imageView.getWidth() > 0) {
            setAndDownscaleBitmap(imageView, uri);
        } else {
            imageView.post(new Runnable() { // from class: com.applovin.impl.sdk.utils.c
                @Override // java.lang.Runnable
                public final void run() {
                    ImageViewUtils.setAndDownscaleBitmap(imageView, uri);
                }
            });
        }
    }

    public static void setImageUri(final ImageView imageView, final Uri uri, final j jVar) {
        if (imageView == null || uri == null) {
            return;
        }
        final String uri2 = uri.toString();
        if (URLUtil.isFileUrl(uri2) || URLUtil.isContentUrl(uri2)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.d
                @Override // java.lang.Runnable
                public final void run() {
                    ImageViewUtils.b(imageView, uri);
                }
            });
        } else if (jVar == null) {
        } else {
            jVar.I();
            if (n.a()) {
                n I = jVar.I();
                I.a("ImageViewUtils", "Fetching image: " + uri);
            }
            jVar.i0().b().execute(new Runnable() { // from class: com.applovin.impl.sdk.utils.g
                @Override // java.lang.Runnable
                public final void run() {
                    ImageViewUtils.a(j.this, uri2, imageView, uri);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(j jVar, Bitmap bitmap, ImageView imageView) {
        jVar.I();
        if (n.a()) {
            jVar.I().a("ImageViewUtils", "Image fetched");
        }
        imageView.setImageDrawable(new BitmapDrawable(j.m().getResources(), bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(j jVar, Bitmap bitmap, ImageView imageView) {
        jVar.I();
        if (n.a()) {
            jVar.I().a("ImageViewUtils", "Image fetched");
        }
        imageView.setImageDrawable(new BitmapDrawable(j.m().getResources(), bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Uri uri, final ImageView imageView) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i10 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri.getPath(), options);
        int height = imageView.getHeight();
        int width = imageView.getWidth();
        if (height <= 0 || width <= 0) {
            Point b10 = l0.b(imageView.getContext());
            height = Math.min(b10.x, b10.y);
            width = height;
        }
        int i11 = options.outHeight;
        int i12 = options.outWidth;
        if (i11 > height || i12 > width) {
            while (true) {
                int i13 = i10 * 2;
                if (i11 / i13 < height && i12 / i13 < width) {
                    break;
                }
                i10 = i13;
            }
        }
        options.inSampleSize = i10;
        options.inJustDecodeBounds = false;
        j.f8884u0.I();
        if (n.a()) {
            n I = j.f8884u0.I();
            I.a("ImageViewUtils", "Loading image: " + uri.getLastPathSegment() + "...");
        }
        final Bitmap decodeFile = BitmapFactory.decodeFile(uri.getPath(), options);
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.b
            @Override // java.lang.Runnable
            public final void run() {
                imageView.setImageBitmap(decodeFile);
            }
        });
    }
}
