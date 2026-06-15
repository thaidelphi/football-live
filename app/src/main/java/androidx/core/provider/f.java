package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.core.provider.g;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontRequestWorker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    static final androidx.collection.f<String, Typeface> f2706a = new androidx.collection.f<>(16);

    /* renamed from: b  reason: collision with root package name */
    private static final ExecutorService f2707b = h.a("fonts-androidx", 10, UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);

    /* renamed from: c  reason: collision with root package name */
    static final Object f2708c = new Object();

    /* renamed from: d  reason: collision with root package name */
    static final androidx.collection.h<String, ArrayList<androidx.core.util.b<e>>> f2709d = new androidx.collection.h<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Callable<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f2710a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f2711b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f2712c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f2713d;

        a(String str, Context context, androidx.core.provider.e eVar, int i10) {
            this.f2710a = str;
            this.f2711b = context;
            this.f2712c = eVar;
            this.f2713d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: b */
        public e call() {
            return f.c(this.f2710a, this.f2711b, this.f2712c, this.f2713d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements androidx.core.util.b<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.a f2714a;

        b(androidx.core.provider.a aVar) {
            this.f2714a = aVar;
        }

        @Override // androidx.core.util.b
        /* renamed from: a */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f2714a.b(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Callable<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f2715a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f2716b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f2717c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f2718d;

        c(String str, Context context, androidx.core.provider.e eVar, int i10) {
            this.f2715a = str;
            this.f2716b = context;
            this.f2717c = eVar;
            this.f2718d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: b */
        public e call() {
            try {
                return f.c(this.f2715a, this.f2716b, this.f2717c, this.f2718d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements androidx.core.util.b<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f2719a;

        d(String str) {
            this.f2719a = str;
        }

        @Override // androidx.core.util.b
        /* renamed from: a */
        public void accept(e eVar) {
            synchronized (f.f2708c) {
                androidx.collection.h<String, ArrayList<androidx.core.util.b<e>>> hVar = f.f2709d;
                ArrayList<androidx.core.util.b<e>> arrayList = hVar.get(this.f2719a);
                if (arrayList == null) {
                    return;
                }
                hVar.remove(this.f2719a);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(eVar);
                }
            }
        }
    }

    private static String a(androidx.core.provider.e eVar, int i10) {
        return eVar.d() + "-" + i10;
    }

    @SuppressLint({"WrongConstant"})
    private static int b(g.a aVar) {
        int i10 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] b10 = aVar.b();
        if (b10 != null && b10.length != 0) {
            i10 = 0;
            for (g.b bVar : b10) {
                int b11 = bVar.b();
                if (b11 != 0) {
                    if (b11 < 0) {
                        return -3;
                    }
                    return b11;
                }
            }
        }
        return i10;
    }

    static e c(String str, Context context, androidx.core.provider.e eVar, int i10) {
        androidx.collection.f<String, Typeface> fVar = f2706a;
        Typeface typeface = fVar.get(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a e8 = androidx.core.provider.d.e(context, eVar, null);
            int b10 = b(e8);
            if (b10 != 0) {
                return new e(b10);
            }
            Typeface b11 = androidx.core.graphics.e.b(context, null, e8.b(), i10);
            if (b11 != null) {
                fVar.put(str, b11);
                return new e(b11);
            }
            return new e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface d(Context context, androidx.core.provider.e eVar, int i10, Executor executor, androidx.core.provider.a aVar) {
        String a10 = a(eVar, i10);
        Typeface typeface = f2706a.get(a10);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f2708c) {
            androidx.collection.h<String, ArrayList<androidx.core.util.b<e>>> hVar = f2709d;
            ArrayList<androidx.core.util.b<e>> arrayList = hVar.get(a10);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<androidx.core.util.b<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            hVar.put(a10, arrayList2);
            c cVar = new c(a10, context, eVar, i10);
            if (executor == null) {
                executor = f2707b;
            }
            h.b(executor, cVar, new d(a10));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface e(Context context, androidx.core.provider.e eVar, androidx.core.provider.a aVar, int i10, int i11) {
        String a10 = a(eVar, i10);
        Typeface typeface = f2706a.get(a10);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        } else if (i11 == -1) {
            e c10 = c(a10, context, eVar, i10);
            aVar.b(c10);
            return c10.f2720a;
        } else {
            try {
                e eVar2 = (e) h.c(f2707b, new a(a10, context, eVar, i10), i11);
                aVar.b(eVar2);
                return eVar2.f2720a;
            } catch (InterruptedException unused) {
                aVar.b(new e(-3));
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        final Typeface f2720a;

        /* renamed from: b  reason: collision with root package name */
        final int f2721b;

        e(int i10) {
            this.f2720a = null;
            this.f2721b = i10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.f2721b == 0;
        }

        @SuppressLint({"WrongConstant"})
        e(Typeface typeface) {
            this.f2720a = typeface;
            this.f2721b = 0;
        }
    }
}
