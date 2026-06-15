package com.applovin.impl.sdk.nativeAd;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.n;
import com.applovin.impl.z4;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a extends z4 {

    /* renamed from: g  reason: collision with root package name */
    private final AppLovinNativeAdImpl f9004g;

    /* renamed from: h  reason: collision with root package name */
    private final InterfaceC0137a f9005h;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0137a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, com.applovin.impl.sdk.j jVar, InterfaceC0137a interfaceC0137a) {
        super("TaskCacheNativeAd", jVar);
        this.f9004g = appLovinNativeAdImpl;
        this.f9005h = interfaceC0137a;
    }

    private float a(Uri uri) {
        FileInputStream fileInputStream;
        int i10;
        int i11;
        File file = new File(uri.getPath());
        if (file.exists()) {
            try {
                fileInputStream = new FileInputStream(file);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(fileInputStream, null, options);
                i10 = options.outWidth;
                i11 = options.outHeight;
            } catch (IOException e8) {
                if (n.a()) {
                    this.f9829c.a(this.f9828b, "Failed to calculate aspect ratio", e8);
                }
            }
            if (i10 > 0 && i11 > 0) {
                float f10 = i10 / i11;
                fileInputStream.close();
                return f10;
            }
            fileInputStream.close();
            return -1.0f;
        }
        return -1.0f;
    }

    private Uri b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (n.a()) {
            n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.a(str, "Attempting to cache resource: " + uri);
        }
        String a10 = this.f9827a.A().a(a(), uri.toString(), this.f9004g.getCachePrefix(), Collections.emptyList(), false, false, 1);
        if (TextUtils.isEmpty(a10)) {
            if (n.a()) {
                n nVar2 = this.f9829c;
                String str2 = this.f9828b;
                nVar2.b(str2, "Unable to cache resource for uri: " + uri);
            }
            return null;
        }
        File a11 = this.f9827a.A().a(a10, a());
        if (a11 == null) {
            if (n.a()) {
                n nVar3 = this.f9829c;
                String str3 = this.f9828b;
                nVar3.b(str3, "Unable to retrieve File from cached image filename = " + a10);
            }
            return null;
        }
        Uri fromFile = Uri.fromFile(a11);
        if (fromFile == null) {
            if (n.a()) {
                this.f9829c.b(this.f9828b, "Unable to extract Uri from image file");
            }
            return null;
        }
        return fromFile;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (n.a()) {
            n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.a(str, "Begin caching ad #" + this.f9004g.getAdIdNumber() + "...");
        }
        Uri b10 = b(this.f9004g.getIconUri());
        if (b10 != null) {
            this.f9004g.setIconUri(b10);
        }
        Uri b11 = b(this.f9004g.getMainImageUri());
        if (b11 != null) {
            this.f9004g.setMainImageUri(b11);
            float a10 = a(b11);
            if (a10 > 0.0f) {
                this.f9004g.setMainImageAspectRatio(a10);
            }
        }
        Uri b12 = b(this.f9004g.getPrivacyIconUri());
        if (b12 != null) {
            this.f9004g.setPrivacyIconUri(b12);
        }
        if (n.a()) {
            n nVar2 = this.f9829c;
            String str2 = this.f9828b;
            nVar2.a(str2, "Finished caching ad #" + this.f9004g.getAdIdNumber());
        }
        this.f9005h.a(this.f9004g);
    }
}
