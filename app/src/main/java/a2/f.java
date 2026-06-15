package a2;

import a2.d;
import android.content.Context;
import java.io.File;
/* compiled from: InternalCacheDiskCacheFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f extends d {

    /* compiled from: InternalCacheDiskCacheFactory.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f214a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f215b;

        a(Context context, String str) {
            this.f214a = context;
            this.f215b = str;
        }

        @Override // a2.d.a
        public File a() {
            File cacheDir = this.f214a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f215b != null ? new File(cacheDir, this.f215b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
