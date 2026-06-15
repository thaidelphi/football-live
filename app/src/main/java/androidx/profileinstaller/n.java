package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
/* compiled from: ProfileVerifier.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final androidx.concurrent.futures.d<c> f3777a = androidx.concurrent.futures.d.t();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f3778b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static c f3779c = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProfileVerifier.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {
        static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* compiled from: ProfileVerifier.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f3780a;

        /* renamed from: b  reason: collision with root package name */
        final int f3781b;

        /* renamed from: c  reason: collision with root package name */
        final long f3782c;

        /* renamed from: d  reason: collision with root package name */
        final long f3783d;

        b(int i10, int i11, long j10, long j11) {
            this.f3780a = i10;
            this.f3781b = i11;
            this.f3782c = j10;
            this.f3783d = j11;
        }

        static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f3780a);
                dataOutputStream.writeInt(this.f3781b);
                dataOutputStream.writeLong(this.f3782c);
                dataOutputStream.writeLong(this.f3783d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3781b == bVar.f3781b && this.f3782c == bVar.f3782c && this.f3780a == bVar.f3780a && this.f3783d == bVar.f3783d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f3781b), Long.valueOf(this.f3782c), Integer.valueOf(this.f3780a), Long.valueOf(this.f3783d));
        }
    }

    /* compiled from: ProfileVerifier.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final int f3784a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f3785b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f3786c;

        c(int i10, boolean z10, boolean z11) {
            this.f3784a = i10;
            this.f3786c = z11;
            this.f3785b = z10;
        }
    }

    private static long a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return a.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i10, boolean z10, boolean z11) {
        c cVar = new c(i10, z10, z11);
        f3779c = cVar;
        f3777a.p(cVar);
        return f3779c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(20:14|(1:77)(1:18)|19|(1:76)(1:23)|24|25|26|(2:62|63)|28|(8:35|(1:39)|(1:46)|47|(2:54|55)|51|52|53)|(1:61)|(1:39)|(3:41|44|46)|47|(1:49)|54|55|51|52|53) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cc, code lost:
        r3 = 196608;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.profileinstaller.n.c c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.n.c(android.content.Context, boolean):androidx.profileinstaller.n$c");
    }
}
