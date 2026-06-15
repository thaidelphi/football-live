package androidx.emoji2.text;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.g;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: EmojiCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d {

    /* renamed from: n  reason: collision with root package name */
    private static final Object f3042n = new Object();

    /* renamed from: o  reason: collision with root package name */
    private static final Object f3043o = new Object();

    /* renamed from: p  reason: collision with root package name */
    private static volatile d f3044p;

    /* renamed from: b  reason: collision with root package name */
    private final Set<e> f3046b;

    /* renamed from: e  reason: collision with root package name */
    private final b f3049e;

    /* renamed from: f  reason: collision with root package name */
    final g f3050f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f3051g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f3052h;

    /* renamed from: i  reason: collision with root package name */
    final int[] f3053i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f3054j;

    /* renamed from: k  reason: collision with root package name */
    private final int f3055k;

    /* renamed from: l  reason: collision with root package name */
    private final int f3056l;

    /* renamed from: m  reason: collision with root package name */
    private final InterfaceC0056d f3057m;

    /* renamed from: a  reason: collision with root package name */
    private final ReadWriteLock f3045a = new ReentrantReadWriteLock();

    /* renamed from: c  reason: collision with root package name */
    private volatile int f3047c = 3;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f3048d = new Handler(Looper.getMainLooper());

    /* compiled from: EmojiCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        private volatile androidx.emoji2.text.g f3058b;

        /* renamed from: c  reason: collision with root package name */
        private volatile l f3059c;

        /* compiled from: EmojiCompat.java */
        /* renamed from: androidx.emoji2.text.d$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0055a extends h {
            C0055a() {
            }

            @Override // androidx.emoji2.text.d.h
            public void a(Throwable th) {
                a.this.f3061a.m(th);
            }

            @Override // androidx.emoji2.text.d.h
            public void b(l lVar) {
                a.this.d(lVar);
            }
        }

        a(d dVar) {
            super(dVar);
        }

        @Override // androidx.emoji2.text.d.b
        void a() {
            try {
                this.f3061a.f3050f.a(new C0055a());
            } catch (Throwable th) {
                this.f3061a.m(th);
            }
        }

        @Override // androidx.emoji2.text.d.b
        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f3058b.h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.d.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f3059c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f3061a.f3051g);
        }

        void d(l lVar) {
            if (lVar == null) {
                this.f3061a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f3059c = lVar;
            l lVar2 = this.f3059c;
            i iVar = new i();
            InterfaceC0056d interfaceC0056d = this.f3061a.f3057m;
            d dVar = this.f3061a;
            this.f3058b = new androidx.emoji2.text.g(lVar2, iVar, interfaceC0056d, dVar.f3052h, dVar.f3053i);
            this.f3061a.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final d f3061a;

        b(d dVar) {
            this.f3061a = dVar;
        }

        void a() {
            this.f3061a.n();
        }

        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return charSequence;
        }

        void c(EditorInfo editorInfo) {
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final g f3062a;

        /* renamed from: b  reason: collision with root package name */
        boolean f3063b;

        /* renamed from: c  reason: collision with root package name */
        boolean f3064c;

        /* renamed from: d  reason: collision with root package name */
        int[] f3065d;

        /* renamed from: e  reason: collision with root package name */
        Set<e> f3066e;

        /* renamed from: f  reason: collision with root package name */
        boolean f3067f;

        /* renamed from: g  reason: collision with root package name */
        int f3068g = -16711936;

        /* renamed from: h  reason: collision with root package name */
        int f3069h = 0;

        /* renamed from: i  reason: collision with root package name */
        InterfaceC0056d f3070i = new g.b();

        /* JADX INFO: Access modifiers changed from: protected */
        public c(g gVar) {
            androidx.core.util.i.g(gVar, "metadataLoader cannot be null.");
            this.f3062a = gVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final g a() {
            return this.f3062a;
        }

        public c b(int i10) {
            this.f3069h = i10;
            return this;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* renamed from: androidx.emoji2.text.d$d  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0056d {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class e {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final List<e> f3071a;

        /* renamed from: b  reason: collision with root package name */
        private final Throwable f3072b;

        /* renamed from: c  reason: collision with root package name */
        private final int f3073c;

        f(e eVar, int i10) {
            this(Arrays.asList((e) androidx.core.util.i.g(eVar, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3071a.size();
            int i10 = 0;
            if (this.f3073c != 1) {
                while (i10 < size) {
                    this.f3071a.get(i10).a(this.f3072b);
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                this.f3071a.get(i10).b();
                i10++;
            }
        }

        f(Collection<e> collection, int i10) {
            this(collection, i10, null);
        }

        f(Collection<e> collection, int i10, Throwable th) {
            androidx.core.util.i.g(collection, "initCallbacks cannot be null");
            this.f3071a = new ArrayList(collection);
            this.f3073c = i10;
            this.f3072b = th;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface g {
        void a(h hVar);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(l lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmojiCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class i {
        i() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public androidx.emoji2.text.h a(androidx.emoji2.text.f fVar) {
            return new n(fVar);
        }
    }

    private d(c cVar) {
        this.f3051g = cVar.f3063b;
        this.f3052h = cVar.f3064c;
        this.f3053i = cVar.f3065d;
        this.f3054j = cVar.f3067f;
        this.f3055k = cVar.f3068g;
        this.f3050f = cVar.f3062a;
        this.f3056l = cVar.f3069h;
        this.f3057m = cVar.f3070i;
        androidx.collection.b bVar = new androidx.collection.b();
        this.f3046b = bVar;
        Set<e> set = cVar.f3066e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f3066e);
        }
        this.f3049e = Build.VERSION.SDK_INT < 19 ? new b(this) : new a(this);
        l();
    }

    public static d b() {
        d dVar;
        synchronized (f3042n) {
            dVar = f3044p;
            androidx.core.util.i.h(dVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return dVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        if (Build.VERSION.SDK_INT >= 19) {
            return androidx.emoji2.text.g.c(inputConnection, editable, i10, i11, z10);
        }
        return false;
    }

    public static boolean f(Editable editable, int i10, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return androidx.emoji2.text.g.d(editable, i10, keyEvent);
        }
        return false;
    }

    public static d g(c cVar) {
        d dVar = f3044p;
        if (dVar == null) {
            synchronized (f3042n) {
                dVar = f3044p;
                if (dVar == null) {
                    dVar = new d(cVar);
                    f3044p = dVar;
                }
            }
        }
        return dVar;
    }

    public static boolean h() {
        return f3044p != null;
    }

    private boolean j() {
        return d() == 1;
    }

    private void l() {
        this.f3045a.writeLock().lock();
        try {
            if (this.f3056l == 0) {
                this.f3047c = 0;
            }
            this.f3045a.writeLock().unlock();
            if (d() == 0) {
                this.f3049e.a();
            }
        } catch (Throwable th) {
            this.f3045a.writeLock().unlock();
            throw th;
        }
    }

    public int c() {
        return this.f3055k;
    }

    public int d() {
        this.f3045a.readLock().lock();
        try {
            return this.f3047c;
        } finally {
            this.f3045a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.f3054j;
    }

    public void k() {
        androidx.core.util.i.h(this.f3056l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (j()) {
            return;
        }
        this.f3045a.writeLock().lock();
        try {
            if (this.f3047c == 0) {
                return;
            }
            this.f3047c = 0;
            this.f3045a.writeLock().unlock();
            this.f3049e.a();
        } finally {
            this.f3045a.writeLock().unlock();
        }
    }

    void m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f3045a.writeLock().lock();
        try {
            this.f3047c = 2;
            arrayList.addAll(this.f3046b);
            this.f3046b.clear();
            this.f3045a.writeLock().unlock();
            this.f3048d.post(new f(arrayList, this.f3047c, th));
        } catch (Throwable th2) {
            this.f3045a.writeLock().unlock();
            throw th2;
        }
    }

    void n() {
        ArrayList arrayList = new ArrayList();
        this.f3045a.writeLock().lock();
        try {
            this.f3047c = 1;
            arrayList.addAll(this.f3046b);
            this.f3046b.clear();
            this.f3045a.writeLock().unlock();
            this.f3048d.post(new f(arrayList, this.f3047c));
        } catch (Throwable th) {
            this.f3045a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        return p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence p(CharSequence charSequence, int i10, int i11) {
        return q(charSequence, i10, i11, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11, int i12) {
        return r(charSequence, i10, i11, i12, 0);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        androidx.core.util.i.h(j(), "Not initialized yet");
        androidx.core.util.i.d(i10, "start cannot be negative");
        androidx.core.util.i.d(i11, "end cannot be negative");
        androidx.core.util.i.d(i12, "maxEmojiCount cannot be negative");
        androidx.core.util.i.a(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        androidx.core.util.i.a(i10 <= charSequence.length(), "start should be < than charSequence length");
        androidx.core.util.i.a(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f3051g : false;
        } else {
            z10 = true;
        }
        return this.f3049e.b(charSequence, i10, i11, i12, z10);
    }

    public void s(e eVar) {
        androidx.core.util.i.g(eVar, "initCallback cannot be null");
        this.f3045a.writeLock().lock();
        try {
            if (this.f3047c != 1 && this.f3047c != 2) {
                this.f3046b.add(eVar);
            }
            this.f3048d.post(new f(eVar, this.f3047c));
        } finally {
            this.f3045a.writeLock().unlock();
        }
    }

    public void t(e eVar) {
        androidx.core.util.i.g(eVar, "initCallback cannot be null");
        this.f3045a.writeLock().lock();
        try {
            this.f3046b.remove(eVar);
        } finally {
            this.f3045a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (!j() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f3049e.c(editorInfo);
    }
}
