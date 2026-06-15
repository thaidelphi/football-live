package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class DynamiteModule {

    /* renamed from: h  reason: collision with root package name */
    private static Boolean f12801h = null;

    /* renamed from: i  reason: collision with root package name */
    private static String f12802i = null;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f12803j = false;

    /* renamed from: k  reason: collision with root package name */
    private static int f12804k = -1;

    /* renamed from: l  reason: collision with root package name */
    private static Boolean f12805l;

    /* renamed from: q  reason: collision with root package name */
    private static zzq f12810q;

    /* renamed from: r  reason: collision with root package name */
    private static zzr f12811r;

    /* renamed from: a  reason: collision with root package name */
    private final Context f12812a;

    /* renamed from: m  reason: collision with root package name */
    private static final ThreadLocal f12806m = new ThreadLocal();

    /* renamed from: n  reason: collision with root package name */
    private static final ThreadLocal f12807n = new c();

    /* renamed from: o  reason: collision with root package name */
    private static final VersionPolicy.IVersions f12808o = new d();
    @KeepForSdk

    /* renamed from: b  reason: collision with root package name */
    public static final VersionPolicy f12795b = new e();
    @KeepForSdk

    /* renamed from: c  reason: collision with root package name */
    public static final VersionPolicy f12796c = new f();
    @KeepForSdk

    /* renamed from: d  reason: collision with root package name */
    public static final VersionPolicy f12797d = new g();
    @KeepForSdk

    /* renamed from: e  reason: collision with root package name */
    public static final VersionPolicy f12798e = new h();
    @KeepForSdk

    /* renamed from: f  reason: collision with root package name */
    public static final VersionPolicy f12799f = new i();
    @KeepForSdk

    /* renamed from: g  reason: collision with root package name */
    public static final VersionPolicy f12800g = new j();

    /* renamed from: p  reason: collision with root package name */
    public static final VersionPolicy f12809p = new k();

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @DynamiteApi
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface VersionPolicy {

        /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
        @KeepForSdk
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public interface IVersions {
            int a(Context context, String str, boolean z10) throws LoadingException;

            int b(Context context, String str);
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
        @KeepForSdk
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static class SelectionResult {
            @KeepForSdk

            /* renamed from: a  reason: collision with root package name */
            public int f12813a = 0;
            @KeepForSdk

            /* renamed from: b  reason: collision with root package name */
            public int f12814b = 0;
            @KeepForSdk

            /* renamed from: c  reason: collision with root package name */
            public int f12815c = 0;
        }

        @KeepForSdk
        SelectionResult a(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.m(context);
        this.f12812a = context;
    }

    @KeepForSdk
    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!Objects.a(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e8) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e8.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static DynamiteModule e(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        DynamiteModule h10;
        Boolean bool;
        IObjectWrapper u02;
        DynamiteModule dynamiteModule;
        zzr zzrVar;
        Boolean valueOf;
        IObjectWrapper Z;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = f12806m;
            l lVar = (l) threadLocal.get();
            l lVar2 = new l(null);
            threadLocal.set(lVar2);
            ThreadLocal threadLocal2 = f12807n;
            long longValue = ((Long) threadLocal2.get()).longValue();
            try {
                threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
                VersionPolicy.SelectionResult a10 = versionPolicy.a(context, str, f12808o);
                Log.i("DynamiteModule", "Considering local module " + str + ":" + a10.f12813a + " and remote module " + str + ":" + a10.f12814b);
                int i10 = a10.f12815c;
                if (i10 != 0) {
                    if (i10 == -1) {
                        if (a10.f12813a != 0) {
                            i10 = -1;
                        }
                    }
                    if (i10 != 1 || a10.f12814b != 0) {
                        if (i10 == -1) {
                            h10 = h(applicationContext, str);
                        } else if (i10 == 1) {
                            try {
                                int i11 = a10.f12814b;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (k(context)) {
                                            bool = f12801h;
                                        } else {
                                            throw new LoadingException("Remote loading disabled", null);
                                        }
                                    }
                                    if (bool != null) {
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                            synchronized (DynamiteModule.class) {
                                                zzrVar = f12811r;
                                            }
                                            if (zzrVar != null) {
                                                l lVar3 = (l) threadLocal.get();
                                                if (lVar3 != null && lVar3.f12816a != null) {
                                                    Context applicationContext2 = context.getApplicationContext();
                                                    Cursor cursor = lVar3.f12816a;
                                                    ObjectWrapper.u0(null);
                                                    synchronized (DynamiteModule.class) {
                                                        valueOf = Boolean.valueOf(f12804k >= 2);
                                                    }
                                                    if (valueOf.booleanValue()) {
                                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                        Z = zzrVar.t0(ObjectWrapper.u0(applicationContext2), str, i11, ObjectWrapper.u0(cursor));
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                        Z = zzrVar.Z(ObjectWrapper.u0(applicationContext2), str, i11, ObjectWrapper.u0(cursor));
                                                    }
                                                    Context context2 = (Context) ObjectWrapper.t0(Z);
                                                    if (context2 != null) {
                                                        dynamiteModule = new DynamiteModule(context2);
                                                    } else {
                                                        throw new LoadingException("Failed to get module context", null);
                                                    }
                                                } else {
                                                    throw new LoadingException("No result cursor", null);
                                                }
                                            } else {
                                                throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                            }
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                            zzq l10 = l(context);
                                            if (l10 != null) {
                                                int zze = l10.zze();
                                                if (zze >= 3) {
                                                    l lVar4 = (l) threadLocal.get();
                                                    if (lVar4 != null) {
                                                        u02 = l10.v0(ObjectWrapper.u0(context), str, i11, ObjectWrapper.u0(lVar4.f12816a));
                                                    } else {
                                                        throw new LoadingException("No cached result cursor holder", null);
                                                    }
                                                } else if (zze == 2) {
                                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                    u02 = l10.w0(ObjectWrapper.u0(context), str, i11);
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                    u02 = l10.u0(ObjectWrapper.u0(context), str, i11);
                                                }
                                                Object t02 = ObjectWrapper.t0(u02);
                                                if (t02 != null) {
                                                    dynamiteModule = new DynamiteModule((Context) t02);
                                                } else {
                                                    throw new LoadingException("Failed to load remote module.", null);
                                                }
                                            } else {
                                                throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                            }
                                        }
                                        h10 = dynamiteModule;
                                    } else {
                                        throw new LoadingException("Failed to determine which loading route to use.", null);
                                    }
                                } catch (RemoteException e8) {
                                    throw new LoadingException("Failed to load remote module.", e8, null);
                                } catch (LoadingException e10) {
                                    throw e10;
                                } catch (Throwable th) {
                                    CrashUtils.a(context, th);
                                    throw new LoadingException("Failed to load remote module.", th, null);
                                }
                            } catch (LoadingException e11) {
                                Log.w("DynamiteModule", "Failed to load remote module: " + e11.getMessage());
                                int i12 = a10.f12813a;
                                if (i12 != 0 && versionPolicy.a(context, str, new m(i12, 0)).f12815c == -1) {
                                    h10 = h(applicationContext, str);
                                } else {
                                    throw new LoadingException("Remote load failed. No local fallback found.", e11, null);
                                }
                            }
                        } else {
                            throw new LoadingException("VersionPolicy returned invalid code:" + i10, null);
                        }
                        if (longValue == 0) {
                            f12807n.remove();
                        } else {
                            f12807n.set(Long.valueOf(longValue));
                        }
                        Cursor cursor2 = lVar2.f12816a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        f12806m.set(lVar);
                        return h10;
                    }
                }
                throw new LoadingException("No acceptable module " + str + " found. Local version is " + a10.f12813a + " and remote version is " + a10.f12814b + ".", null);
            } catch (Throwable th2) {
                if (longValue == 0) {
                    f12807n.remove();
                } else {
                    f12807n.set(Long.valueOf(longValue));
                }
                Cursor cursor3 = lVar2.f12816a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                f12806m.set(lVar);
                throw th2;
            }
        }
        throw new LoadingException("null application Context", null);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x01b1 -> B:128:0x01b6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x01b3 -> B:128:0x01b6). Please submit an issue!!! */
    public static int f(Context context, String str, boolean z10) {
        Field declaredField;
        Throwable th;
        RemoteException e8;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f12801h;
                Cursor cursor2 = null;
                int i10 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
                        String obj = e10.toString();
                        Log.w("DynamiteModule", "Failed to load module via V2: " + obj);
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                i(classLoader);
                            } catch (LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else if (!k(context)) {
                            return 0;
                        } else {
                            if (!f12803j) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int g10 = g(context, str, z10, true);
                                        String str2 = f12802i;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader a10 = zzb.a();
                                            if (a10 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    String str3 = f12802i;
                                                    Preconditions.m(str3);
                                                    a10 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f12802i;
                                                    Preconditions.m(str4);
                                                    a10 = new b(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            i(a10);
                                            declaredField.set(null, a10);
                                            f12801h = bool2;
                                            return g10;
                                        }
                                        return g10;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f12801h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return g(context, str, z10, false);
                    } catch (LoadingException e11) {
                        String message = e11.getMessage();
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + message);
                        return 0;
                    }
                }
                zzq l10 = l(context);
                try {
                    if (l10 != null) {
                        try {
                            int zze = l10.zze();
                            if (zze >= 3) {
                                l lVar = (l) f12806m.get();
                                if (lVar != null && (cursor = lVar.f12816a) != null) {
                                    i10 = cursor.getInt(0);
                                } else {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.t0(l10.x0(ObjectWrapper.u0(context), str, z10, ((Long) f12807n.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i11 = cursor3.getInt(0);
                                                if (i11 <= 0 || !j(cursor3)) {
                                                    cursor2 = cursor3;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i10 = i11;
                                            }
                                        } catch (RemoteException e12) {
                                            e8 = e12;
                                            cursor2 = cursor3;
                                            String message2 = e8.getMessage();
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + message2);
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i10;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                }
                            } else if (zze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i10 = l10.t0(ObjectWrapper.u0(context), str, z10);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i10 = l10.Z(ObjectWrapper.u0(context), str, z10);
                            }
                        } catch (RemoteException e13) {
                            e8 = e13;
                        }
                    }
                    return i10;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            CrashUtils.a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
        r8.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int g(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void i(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzr) {
                    zzrVar = (zzr) queryLocalInterface;
                } else {
                    zzrVar = new zzr(iBinder);
                }
            }
            f12811r = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e8) {
            throw new LoadingException("Failed to instantiate dynamite loader", e8, null);
        }
    }

    private static boolean j(Cursor cursor) {
        l lVar = (l) f12806m.get();
        if (lVar == null || lVar.f12816a != null) {
            return false;
        }
        lVar.f12816a = cursor;
        return true;
    }

    private static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f12805l)) {
            return true;
        }
        boolean z10 = false;
        if (f12805l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.h().j(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f12805l = valueOf;
            z10 = valueOf.booleanValue();
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f12803j = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    private static zzq l(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = f12810q;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    f12810q = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e8) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e8.getMessage());
            }
            return null;
        }
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public Context b() {
        return this.f12812a;
    }

    @KeepForSdk
    public IBinder d(String str) throws LoadingException {
        try {
            return (IBinder) this.f12812a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e8) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e8, null);
        }
    }
}
