package c2;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import c2.n;
import java.io.File;
import java.io.InputStream;
/* compiled from: StringLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class u<Data> implements n<String, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final n<Uri, Data> f5404a;

    /* compiled from: StringLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements o<String, AssetFileDescriptor> {
        @Override // c2.o
        public n<String, AssetFileDescriptor> b(r rVar) {
            return new u(rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b implements o<String, ParcelFileDescriptor> {
        @Override // c2.o
        public n<String, ParcelFileDescriptor> b(r rVar) {
            return new u(rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c implements o<String, InputStream> {
        @Override // c2.o
        public n<String, InputStream> b(r rVar) {
            return new u(rVar.d(Uri.class, InputStream.class));
        }
    }

    public u(n<Uri, Data> nVar) {
        this.f5404a = nVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? f(str) : parse;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // c2.n
    /* renamed from: c */
    public n.a<Data> b(String str, int i10, int i11, w1.h hVar) {
        Uri e8 = e(str);
        if (e8 == null || !this.f5404a.a(e8)) {
            return null;
        }
        return this.f5404a.b(e8, i10, i11, hVar);
    }

    @Override // c2.n
    /* renamed from: d */
    public boolean a(String str) {
        return true;
    }
}
