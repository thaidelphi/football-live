package c2;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import c2.n;
import java.io.InputStream;
/* compiled from: ResourceLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class s<Data> implements n<Integer, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final n<Uri, Data> f5397a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f5398b;

    /* compiled from: ResourceLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f5399a;

        public a(Resources resources) {
            this.f5399a = resources;
        }

        @Override // c2.o
        public n<Integer, AssetFileDescriptor> b(r rVar) {
            return new s(this.f5399a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f5400a;

        public b(Resources resources) {
            this.f5400a = resources;
        }

        @Override // c2.o
        public n<Integer, ParcelFileDescriptor> b(r rVar) {
            return new s(this.f5400a, rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c implements o<Integer, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f5401a;

        public c(Resources resources) {
            this.f5401a = resources;
        }

        @Override // c2.o
        public n<Integer, InputStream> b(r rVar) {
            return new s(this.f5401a, rVar.d(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d implements o<Integer, Uri> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f5402a;

        public d(Resources resources) {
            this.f5402a = resources;
        }

        @Override // c2.o
        public n<Integer, Uri> b(r rVar) {
            return new s(this.f5402a, v.c());
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f5398b = resources;
        this.f5397a = nVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f5398b.getResourcePackageName(num.intValue()) + '/' + this.f5398b.getResourceTypeName(num.intValue()) + '/' + this.f5398b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e8) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e8);
                return null;
            }
            return null;
        }
    }

    @Override // c2.n
    /* renamed from: c */
    public n.a<Data> b(Integer num, int i10, int i11, w1.h hVar) {
        Uri d10 = d(num);
        if (d10 == null) {
            return null;
        }
        return this.f5397a.b(d10, i10, i11, hVar);
    }

    @Override // c2.n
    /* renamed from: e */
    public boolean a(Integer num) {
        return true;
    }
}
