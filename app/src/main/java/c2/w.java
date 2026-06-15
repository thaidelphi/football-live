package c2;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import c2.n;
import com.ironsource.b9;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: UriLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class w<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f5408b = Collections.unmodifiableSet(new HashSet(Arrays.asList(b9.h.f16640b, "android.resource", "content")));

    /* renamed from: a  reason: collision with root package name */
    private final c<Data> f5409a;

    /* compiled from: UriLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f5410a;

        public a(ContentResolver contentResolver) {
            this.f5410a = contentResolver;
        }

        @Override // c2.w.c
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f5410a, uri);
        }

        @Override // c2.o
        public n<Uri, AssetFileDescriptor> b(r rVar) {
            return new w(this);
        }
    }

    /* compiled from: UriLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f5411a;

        public b(ContentResolver contentResolver) {
            this.f5411a = contentResolver;
        }

        @Override // c2.w.c
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f5411a, uri);
        }

        @Override // c2.o
        public n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new w(this);
        }
    }

    /* compiled from: UriLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    /* compiled from: UriLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f5412a;

        public d(ContentResolver contentResolver) {
            this.f5412a = contentResolver;
        }

        @Override // c2.w.c
        public com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f5412a, uri);
        }

        @Override // c2.o
        public n<Uri, InputStream> b(r rVar) {
            return new w(this);
        }
    }

    public w(c<Data> cVar) {
        this.f5409a = cVar;
    }

    @Override // c2.n
    /* renamed from: c */
    public n.a<Data> b(Uri uri, int i10, int i11, w1.h hVar) {
        return new n.a<>(new r2.d(uri), this.f5409a.a(uri));
    }

    @Override // c2.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return f5408b.contains(uri.getScheme());
    }
}
