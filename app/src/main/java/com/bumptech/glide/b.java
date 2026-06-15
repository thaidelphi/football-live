package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import c2.a;
import c2.b;
import c2.d;
import c2.e;
import c2.f;
import c2.k;
import c2.s;
import c2.u;
import c2.v;
import c2.w;
import c2.x;
import com.bumptech.glide.c;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import d2.a;
import d2.b;
import d2.c;
import d2.d;
import d2.e;
import f2.b0;
import f2.c0;
import f2.m;
import f2.t;
import f2.v;
import f2.x;
import f2.z;
import g2.a;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l2.p;
/* compiled from: Glide.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b implements ComponentCallbacks2 {

    /* renamed from: l  reason: collision with root package name */
    private static volatile b f10245l;

    /* renamed from: m  reason: collision with root package name */
    private static volatile boolean f10246m;

    /* renamed from: a  reason: collision with root package name */
    private final y1.k f10247a;

    /* renamed from: b  reason: collision with root package name */
    private final z1.e f10248b;

    /* renamed from: c  reason: collision with root package name */
    private final a2.h f10249c;

    /* renamed from: d  reason: collision with root package name */
    private final d f10250d;

    /* renamed from: e  reason: collision with root package name */
    private final i f10251e;

    /* renamed from: f  reason: collision with root package name */
    private final z1.b f10252f;

    /* renamed from: g  reason: collision with root package name */
    private final p f10253g;

    /* renamed from: h  reason: collision with root package name */
    private final l2.d f10254h;

    /* renamed from: j  reason: collision with root package name */
    private final a f10256j;

    /* renamed from: i  reason: collision with root package name */
    private final List<k> f10255i = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private f f10257k = f.NORMAL;

    /* compiled from: Glide.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        o2.f build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [f2.h] */
    public b(Context context, y1.k kVar, a2.h hVar, z1.e eVar, z1.b bVar, p pVar, l2.d dVar, int i10, a aVar, Map<Class<?>, l<?, ?>> map, List<o2.e<Object>> list, e eVar2) {
        w1.j zVar;
        f2.g gVar;
        this.f10247a = kVar;
        this.f10248b = eVar;
        this.f10252f = bVar;
        this.f10249c = hVar;
        this.f10253g = pVar;
        this.f10254h = dVar;
        this.f10256j = aVar;
        Resources resources = context.getResources();
        i iVar = new i();
        this.f10251e = iVar;
        iVar.o(new f2.k());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 27) {
            iVar.o(new f2.p());
        }
        List<ImageHeaderParser> g10 = iVar.g();
        j2.a aVar2 = new j2.a(context, g10, eVar, bVar);
        w1.j<ParcelFileDescriptor, Bitmap> h10 = c0.h(eVar);
        m mVar = new m(iVar.g(), resources.getDisplayMetrics(), eVar, bVar);
        if (eVar2.a(c.b.class) && i11 >= 28) {
            zVar = new t();
            gVar = new f2.h();
        } else {
            f2.g gVar2 = new f2.g(mVar);
            zVar = new z(mVar, bVar);
            gVar = gVar2;
        }
        h2.d dVar2 = new h2.d(context);
        s.c cVar = new s.c(resources);
        s.d dVar3 = new s.d(resources);
        s.b bVar2 = new s.b(resources);
        s.a aVar3 = new s.a(resources);
        f2.c cVar2 = new f2.c(bVar);
        k2.a aVar4 = new k2.a();
        k2.d dVar4 = new k2.d();
        ContentResolver contentResolver = context.getContentResolver();
        iVar.c(ByteBuffer.class, new c2.c()).c(InputStream.class, new c2.t(bVar)).e("Bitmap", ByteBuffer.class, Bitmap.class, gVar).e("Bitmap", InputStream.class, Bitmap.class, zVar);
        if (ParcelFileDescriptorRewinder.c()) {
            iVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new v(mVar));
        }
        iVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, h10).e("Bitmap", AssetFileDescriptor.class, Bitmap.class, c0.c(eVar)).a(Bitmap.class, Bitmap.class, v.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new b0()).d(Bitmap.class, cVar2).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new f2.a(resources, gVar)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new f2.a(resources, zVar)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new f2.a(resources, h10)).d(BitmapDrawable.class, new f2.b(eVar, cVar2)).e("Gif", InputStream.class, j2.c.class, new j2.j(g10, aVar2, bVar)).e("Gif", ByteBuffer.class, j2.c.class, aVar2).d(j2.c.class, new j2.d()).a(v1.a.class, v1.a.class, v.a.a()).e("Bitmap", v1.a.class, Bitmap.class, new j2.h(eVar)).b(Uri.class, Drawable.class, dVar2).b(Uri.class, Bitmap.class, new x(dVar2, eVar)).p(new a.C0280a()).a(File.class, ByteBuffer.class, new d.b()).a(File.class, InputStream.class, new f.e()).b(File.class, File.class, new i2.a()).a(File.class, ParcelFileDescriptor.class, new f.b()).a(File.class, File.class, v.a.a()).p(new k.a(bVar));
        if (ParcelFileDescriptorRewinder.c()) {
            iVar.p(new ParcelFileDescriptorRewinder.a());
        }
        Class cls = Integer.TYPE;
        iVar.a(cls, InputStream.class, cVar).a(cls, ParcelFileDescriptor.class, bVar2).a(Integer.class, InputStream.class, cVar).a(Integer.class, ParcelFileDescriptor.class, bVar2).a(Integer.class, Uri.class, dVar3).a(cls, AssetFileDescriptor.class, aVar3).a(Integer.class, AssetFileDescriptor.class, aVar3).a(cls, Uri.class, dVar3).a(String.class, InputStream.class, new e.c()).a(Uri.class, InputStream.class, new e.c()).a(String.class, InputStream.class, new u.c()).a(String.class, ParcelFileDescriptor.class, new u.b()).a(String.class, AssetFileDescriptor.class, new u.a()).a(Uri.class, InputStream.class, new a.c(context.getAssets())).a(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets())).a(Uri.class, InputStream.class, new b.a(context)).a(Uri.class, InputStream.class, new c.a(context));
        if (i11 >= 29) {
            iVar.a(Uri.class, InputStream.class, new d.c(context));
            iVar.a(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        iVar.a(Uri.class, InputStream.class, new w.d(contentResolver)).a(Uri.class, ParcelFileDescriptor.class, new w.b(contentResolver)).a(Uri.class, AssetFileDescriptor.class, new w.a(contentResolver)).a(Uri.class, InputStream.class, new x.a()).a(URL.class, InputStream.class, new e.a()).a(Uri.class, File.class, new k.a(context)).a(c2.g.class, InputStream.class, new a.C0261a()).a(byte[].class, ByteBuffer.class, new b.a()).a(byte[].class, InputStream.class, new b.d()).a(Uri.class, Uri.class, v.a.a()).a(Drawable.class, Drawable.class, v.a.a()).b(Drawable.class, Drawable.class, new h2.e()).q(Bitmap.class, BitmapDrawable.class, new k2.b(resources)).q(Bitmap.class, byte[].class, aVar4).q(Drawable.class, byte[].class, new k2.c(eVar, aVar4, dVar4)).q(j2.c.class, byte[].class, dVar4);
        if (i11 >= 23) {
            w1.j<ByteBuffer, Bitmap> d10 = c0.d(eVar);
            iVar.b(ByteBuffer.class, Bitmap.class, d10);
            iVar.b(ByteBuffer.class, BitmapDrawable.class, new f2.a(resources, d10));
        }
        this.f10250d = new d(context, bVar, iVar, new p2.f(), aVar, map, list, kVar, eVar2, i10);
    }

    private static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f10246m) {
            f10246m = true;
            m(context, generatedAppGlideModule);
            f10246m = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    public static b c(Context context) {
        if (f10245l == null) {
            GeneratedAppGlideModule d10 = d(context.getApplicationContext());
            synchronized (b.class) {
                if (f10245l == null) {
                    a(context, d10);
                }
            }
        }
        return f10245l;
    }

    private static GeneratedAppGlideModule d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e8) {
            q(e8);
            return null;
        } catch (InstantiationException e10) {
            q(e10);
            return null;
        } catch (NoSuchMethodException e11) {
            q(e11);
            return null;
        } catch (InvocationTargetException e12) {
            q(e12);
            return null;
        }
    }

    private static p l(Context context) {
        s2.j.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c(context).k();
    }

    private static void m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        n(context, new c(), generatedAppGlideModule);
    }

    private static void n(Context context, c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<m2.b> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            emptyList = new m2.d(applicationContext).a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> d10 = generatedAppGlideModule.d();
            Iterator<m2.b> it = emptyList.iterator();
            while (it.hasNext()) {
                m2.b next = it.next();
                if (d10.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<m2.b> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        cVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        for (m2.b bVar : emptyList) {
            bVar.a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, cVar);
        }
        b a10 = cVar.a(applicationContext);
        for (m2.b bVar2 : emptyList) {
            try {
                bVar2.b(applicationContext, a10, a10.f10251e);
            } catch (AbstractMethodError e8) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + bVar2.getClass().getName(), e8);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, a10, a10.f10251e);
        }
        applicationContext.registerComponentCallbacks(a10);
        f10245l = a10;
    }

    private static void q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static k t(Context context) {
        return l(context).l(context);
    }

    public static k u(View view) {
        return l(view.getContext()).m(view);
    }

    public void b() {
        s2.k.a();
        this.f10249c.b();
        this.f10248b.b();
        this.f10252f.b();
    }

    public z1.b e() {
        return this.f10252f;
    }

    public z1.e f() {
        return this.f10248b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l2.d g() {
        return this.f10254h;
    }

    public Context h() {
        return this.f10250d.getBaseContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d i() {
        return this.f10250d;
    }

    public i j() {
        return this.f10251e;
    }

    public p k() {
        return this.f10253g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(k kVar) {
        synchronized (this.f10255i) {
            if (!this.f10255i.contains(kVar)) {
                this.f10255i.add(kVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        r(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p(p2.h<?> hVar) {
        synchronized (this.f10255i) {
            for (k kVar : this.f10255i) {
                if (kVar.y(hVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void r(int i10) {
        s2.k.a();
        synchronized (this.f10255i) {
            for (k kVar : this.f10255i) {
                kVar.onTrimMemory(i10);
            }
        }
        this.f10249c.a(i10);
        this.f10248b.a(i10);
        this.f10252f.a(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(k kVar) {
        synchronized (this.f10255i) {
            if (this.f10255i.contains(kVar)) {
                this.f10255i.remove(kVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }
}
