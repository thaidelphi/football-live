package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
/* compiled from: AssetPathFetcher.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f10341a;

    /* renamed from: b  reason: collision with root package name */
    private final AssetManager f10342b;

    /* renamed from: c  reason: collision with root package name */
    private T f10343c;

    public b(AssetManager assetManager, String str) {
        this.f10342b = assetManager;
        this.f10341a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t10 = this.f10343c;
        if (t10 == null) {
            return;
        }
        try {
            c(t10);
        } catch (IOException unused) {
        }
    }

    protected abstract void c(T t10) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public w1.a d() {
        return w1.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a<? super T> aVar) {
        try {
            T f10 = f(this.f10342b, this.f10341a);
            this.f10343c = f10;
            aVar.f(f10);
        } catch (IOException e8) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e8);
            }
            aVar.c(e8);
        }
    }

    protected abstract T f(AssetManager assetManager, String str) throws IOException;
}
