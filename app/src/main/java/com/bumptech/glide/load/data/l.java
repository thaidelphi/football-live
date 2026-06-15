package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: LocalUriFetcher.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f10365a;

    /* renamed from: b  reason: collision with root package name */
    private final ContentResolver f10366b;

    /* renamed from: c  reason: collision with root package name */
    private T f10367c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f10366b = contentResolver;
        this.f10365a = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t10 = this.f10367c;
        if (t10 != null) {
            try {
                c(t10);
            } catch (IOException unused) {
            }
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
    public final void e(com.bumptech.glide.g gVar, d.a<? super T> aVar) {
        try {
            T f10 = f(this.f10365a, this.f10366b);
            this.f10367c = f10;
            aVar.f(f10);
        } catch (FileNotFoundException e8) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e8);
            }
            aVar.c(e8);
        }
    }

    protected abstract T f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
