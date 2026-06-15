package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.graphics.Bitmap;
import com.startapp.a1;
import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ImageResourceConfig implements Serializable {
    private static final long serialVersionUID = -8927634568015374287L;

    /* renamed from: a  reason: collision with root package name */
    public transient Bitmap f22974a;

    /* renamed from: b  reason: collision with root package name */
    public transient Bitmap f22975b;
    private String name;
    private String imageUrlSecured = "";
    private String imageFallbackUrl = "";

    /* renamed from: c  reason: collision with root package name */
    public transient Bitmap f22976c = null;
    private int width = 1;
    private int height = 1;

    private ImageResourceConfig() {
    }

    public final Bitmap a(Context context) {
        if (this.f22976c == null) {
            Bitmap bitmap = this.f22974a;
            this.f22976c = bitmap;
            if (bitmap == null) {
                if (this.f22975b == null) {
                    String str = this.imageFallbackUrl;
                    Bitmap b10 = a1.b(context, str);
                    if (b10 == null) {
                        b10 = a1.b(context, str);
                    }
                    this.f22975b = b10;
                }
                this.f22976c = this.f22975b;
            }
        }
        return this.f22976c;
    }

    public final void b(int i10) {
        this.width = i10;
    }

    public final String c() {
        return this.name;
    }

    public final int d() {
        return this.width;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageResourceConfig imageResourceConfig = (ImageResourceConfig) obj;
        return this.width == imageResourceConfig.width && this.height == imageResourceConfig.height && o9.a(this.imageUrlSecured, imageResourceConfig.imageUrlSecured) && o9.a(this.imageFallbackUrl, imageResourceConfig.imageFallbackUrl) && o9.a(this.name, imageResourceConfig.name);
    }

    public final int hashCode() {
        Object[] objArr = {this.imageUrlSecured, this.imageFallbackUrl, Integer.valueOf(this.width), Integer.valueOf(this.height), this.name};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public final String b() {
        String str = this.imageUrlSecured;
        return str != null ? str : "";
    }

    public final void b(String str) {
        this.imageFallbackUrl = str;
    }

    public final int a() {
        return this.height;
    }

    public final void a(int i10) {
        this.height = i10;
    }

    public static ImageResourceConfig a(String str) {
        ImageResourceConfig imageResourceConfig = new ImageResourceConfig();
        imageResourceConfig.name = str;
        return imageResourceConfig;
    }
}
