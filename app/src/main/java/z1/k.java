package z1;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: LruBitmapPool.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k implements e {

    /* renamed from: k  reason: collision with root package name */
    private static final Bitmap.Config f33440k = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    private final l f33441a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Bitmap.Config> f33442b;

    /* renamed from: c  reason: collision with root package name */
    private final long f33443c;

    /* renamed from: d  reason: collision with root package name */
    private final a f33444d;

    /* renamed from: e  reason: collision with root package name */
    private long f33445e;

    /* renamed from: f  reason: collision with root package name */
    private long f33446f;

    /* renamed from: g  reason: collision with root package name */
    private int f33447g;

    /* renamed from: h  reason: collision with root package name */
    private int f33448h;

    /* renamed from: i  reason: collision with root package name */
    private int f33449i;

    /* renamed from: j  reason: collision with root package name */
    private int f33450j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LruBitmapPool.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    /* compiled from: LruBitmapPool.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b implements a {
        b() {
        }

        @Override // z1.k.a
        public void a(Bitmap bitmap) {
        }

        @Override // z1.k.a
        public void b(Bitmap bitmap) {
        }
    }

    k(long j10, l lVar, Set<Bitmap.Config> set) {
        this.f33443c = j10;
        this.f33445e = j10;
        this.f33441a = lVar;
        this.f33442b = set;
        this.f33444d = new b();
    }

    @TargetApi(26)
    private static void f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    private static Bitmap g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f33440k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        Log.v("LruBitmapPool", "Hits=" + this.f33447g + ", misses=" + this.f33448h + ", puts=" + this.f33449i + ", evictions=" + this.f33450j + ", currentSize=" + this.f33446f + ", maxSize=" + this.f33445e + "\nStrategy=" + this.f33441a);
    }

    private void j() {
        q(this.f33445e);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            hashSet.add(null);
        }
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static l l() {
        if (Build.VERSION.SDK_INT >= 19) {
            return new n();
        }
        return new c();
    }

    private synchronized Bitmap m(int i10, int i11, Bitmap.Config config) {
        Bitmap d10;
        f(config);
        d10 = this.f33441a.d(i10, i11, config != null ? config : f33440k);
        if (d10 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f33441a.e(i10, i11, config));
            }
            this.f33448h++;
        } else {
            this.f33447g++;
            this.f33446f -= this.f33441a.f(d10);
            this.f33444d.a(d10);
            p(d10);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f33441a.e(i10, i11, config));
        }
        h();
        return d10;
    }

    @TargetApi(19)
    private static void o(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j10) {
        while (this.f33446f > j10) {
            Bitmap b10 = this.f33441a.b();
            if (b10 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    i();
                }
                this.f33446f = 0L;
                return;
            }
            this.f33444d.a(b10);
            this.f33446f -= this.f33441a.f(b10);
            this.f33450j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f33441a.a(b10));
            }
            h();
            b10.recycle();
        }
    }

    @Override // z1.e
    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || (Build.VERSION.SDK_INT >= 23 && i10 >= 20)) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            q(n() / 2);
        }
    }

    @Override // z1.e
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        q(0L);
    }

    @Override // z1.e
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && this.f33441a.f(bitmap) <= this.f33445e && this.f33442b.contains(bitmap.getConfig())) {
                        int f10 = this.f33441a.f(bitmap);
                        this.f33441a.c(bitmap);
                        this.f33444d.b(bitmap);
                        this.f33449i++;
                        this.f33446f += f10;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f33441a.a(bitmap));
                        }
                        h();
                        j();
                        return;
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f33441a.a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f33442b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // z1.e
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap m7 = m(i10, i11, config);
        if (m7 != null) {
            m7.eraseColor(0);
            return m7;
        }
        return g(i10, i11, config);
    }

    @Override // z1.e
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap m7 = m(i10, i11, config);
        return m7 == null ? g(i10, i11, config) : m7;
    }

    public long n() {
        return this.f33445e;
    }

    public k(long j10) {
        this(j10, l(), k());
    }
}
