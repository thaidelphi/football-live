package c2;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import c2.n;
import com.ironsource.b9;
import java.io.InputStream;
/* compiled from: AssetUriLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a<Data> implements n<Uri, Data> {

    /* renamed from: c  reason: collision with root package name */
    private static final int f5322c = 22;

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f5323a;

    /* renamed from: b  reason: collision with root package name */
    private final InterfaceC0105a<Data> f5324b;

    /* compiled from: AssetUriLoader.java */
    /* renamed from: c2.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0105a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, InterfaceC0105a<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final AssetManager f5325a;

        public b(AssetManager assetManager) {
            this.f5325a = assetManager;
        }

        @Override // c2.a.InterfaceC0105a
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // c2.o
        public n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new a(this.f5325a, this);
        }
    }

    /* compiled from: AssetUriLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c implements o<Uri, InputStream>, InterfaceC0105a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final AssetManager f5326a;

        public c(AssetManager assetManager) {
            this.f5326a = assetManager;
        }

        @Override // c2.a.InterfaceC0105a
        public com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // c2.o
        public n<Uri, InputStream> b(r rVar) {
            return new a(this.f5326a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0105a<Data> interfaceC0105a) {
        this.f5323a = assetManager;
        this.f5324b = interfaceC0105a;
    }

    @Override // c2.n
    /* renamed from: c */
    public n.a<Data> b(Uri uri, int i10, int i11, w1.h hVar) {
        return new n.a<>(new r2.d(uri), this.f5324b.a(this.f5323a, uri.toString().substring(f5322c)));
    }

    @Override // c2.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return b9.h.f16640b.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
