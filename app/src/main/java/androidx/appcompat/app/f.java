package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.z0;
import androidx.core.content.res.h;
import androidx.core.view.a0;
import androidx.core.view.f;
import androidx.core.view.g0;
import androidx.core.view.i0;
import androidx.core.view.l0;
import androidx.lifecycle.i;
import com.google.android.gms.ads.AdRequest;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.services.core.device.MimeTypes;
import i.b;
import i.f;
import java.lang.Thread;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f extends androidx.appcompat.app.e implements e.a, LayoutInflater.Factory2 {

    /* renamed from: b0  reason: collision with root package name */
    private static final androidx.collection.h<String, Integer> f885b0 = new androidx.collection.h<>();

    /* renamed from: c0  reason: collision with root package name */
    private static final boolean f886c0;

    /* renamed from: d0  reason: collision with root package name */
    private static final int[] f887d0;

    /* renamed from: e0  reason: collision with root package name */
    private static final boolean f888e0;

    /* renamed from: f0  reason: collision with root package name */
    private static final boolean f889f0;

    /* renamed from: g0  reason: collision with root package name */
    private static boolean f890g0;
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    private boolean F;
    private v[] G;
    private v H;
    private boolean I;
    private boolean J;
    private boolean K;
    boolean L;
    private Configuration M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private r R;
    private r S;
    boolean T;
    int U;
    private final Runnable V;
    private boolean W;
    private Rect X;
    private Rect Y;
    private androidx.appcompat.app.h Z;

    /* renamed from: a0  reason: collision with root package name */
    private androidx.appcompat.app.i f891a0;

    /* renamed from: d  reason: collision with root package name */
    final Object f892d;

    /* renamed from: e  reason: collision with root package name */
    final Context f893e;

    /* renamed from: f  reason: collision with root package name */
    Window f894f;

    /* renamed from: g  reason: collision with root package name */
    private p f895g;

    /* renamed from: h  reason: collision with root package name */
    final androidx.appcompat.app.d f896h;

    /* renamed from: i  reason: collision with root package name */
    androidx.appcompat.app.a f897i;

    /* renamed from: j  reason: collision with root package name */
    MenuInflater f898j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f899k;

    /* renamed from: l  reason: collision with root package name */
    private f0 f900l;

    /* renamed from: m  reason: collision with root package name */
    private j f901m;

    /* renamed from: n  reason: collision with root package name */
    private w f902n;

    /* renamed from: o  reason: collision with root package name */
    i.b f903o;

    /* renamed from: p  reason: collision with root package name */
    ActionBarContextView f904p;

    /* renamed from: q  reason: collision with root package name */
    PopupWindow f905q;

    /* renamed from: r  reason: collision with root package name */
    Runnable f906r;

    /* renamed from: s  reason: collision with root package name */
    g0 f907s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f908t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f909u;

    /* renamed from: v  reason: collision with root package name */
    ViewGroup f910v;

    /* renamed from: w  reason: collision with root package name */
    private TextView f911w;

    /* renamed from: x  reason: collision with root package name */
    private View f912x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f913y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f914z;

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f915a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f915a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f915a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f915a.uncaughtException(thread, th);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            if ((fVar.U & 1) != 0) {
                fVar.X(0);
            }
            f fVar2 = f.this;
            if ((fVar2.U & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
                fVar2.X(108);
            }
            f fVar3 = f.this;
            fVar3.T = false;
            fVar3.U = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements androidx.core.view.u {
        c() {
        }

        @Override // androidx.core.view.u
        public l0 a(View view, l0 l0Var) {
            int k10 = l0Var.k();
            int N0 = f.this.N0(l0Var, null);
            if (k10 != N0) {
                l0Var = l0Var.o(l0Var.i(), N0, l0Var.j(), l0Var.h());
            }
            return a0.c0(view, l0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements j0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.j0.a
        public void a(Rect rect) {
            rect.top = f.this.N0(null, rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            f.this.V();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.f$f  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class RunnableC0019f implements Runnable {

        /* compiled from: AppCompatDelegateImpl.java */
        /* renamed from: androidx.appcompat.app.f$f$a */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a extends i0 {
            a() {
            }

            @Override // androidx.core.view.h0
            public void b(View view) {
                f.this.f904p.setAlpha(1.0f);
                f.this.f907s.h(null);
                f.this.f907s = null;
            }

            @Override // androidx.core.view.i0, androidx.core.view.h0
            public void c(View view) {
                f.this.f904p.setVisibility(0);
            }
        }

        RunnableC0019f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f905q.showAtLocation(fVar.f904p, 55, 0, 0);
            f.this.Y();
            if (f.this.G0()) {
                f.this.f904p.setAlpha(0.0f);
                f fVar2 = f.this;
                fVar2.f907s = a0.e(fVar2.f904p).b(1.0f);
                f.this.f907s.h(new a());
                return;
            }
            f.this.f904p.setAlpha(1.0f);
            f.this.f904p.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g extends i0 {
        g() {
        }

        @Override // androidx.core.view.h0
        public void b(View view) {
            f.this.f904p.setAlpha(1.0f);
            f.this.f907s.h(null);
            f.this.f907s = null;
        }

        @Override // androidx.core.view.i0, androidx.core.view.h0
        public void c(View view) {
            f.this.f904p.setVisibility(0);
            if (f.this.f904p.getParent() instanceof View) {
                a0.n0((View) f.this.f904p.getParent());
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class h implements androidx.appcompat.app.b {
        h() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface i {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class j implements j.a {
        j() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            f.this.O(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback i02 = f.this.i0();
            if (i02 != null) {
                i02.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class k implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private b.a f925a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a extends i0 {
            a() {
            }

            @Override // androidx.core.view.h0
            public void b(View view) {
                f.this.f904p.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.f905q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.f904p.getParent() instanceof View) {
                    a0.n0((View) f.this.f904p.getParent());
                }
                f.this.f904p.k();
                f.this.f907s.h(null);
                f fVar2 = f.this;
                fVar2.f907s = null;
                a0.n0(fVar2.f910v);
            }
        }

        public k(b.a aVar) {
            this.f925a = aVar;
        }

        @Override // i.b.a
        public boolean a(i.b bVar, MenuItem menuItem) {
            return this.f925a.a(bVar, menuItem);
        }

        @Override // i.b.a
        public void b(i.b bVar) {
            this.f925a.b(bVar);
            f fVar = f.this;
            if (fVar.f905q != null) {
                fVar.f894f.getDecorView().removeCallbacks(f.this.f906r);
            }
            f fVar2 = f.this;
            if (fVar2.f904p != null) {
                fVar2.Y();
                f fVar3 = f.this;
                fVar3.f907s = a0.e(fVar3.f904p).b(0.0f);
                f.this.f907s.h(new a());
            }
            f fVar4 = f.this;
            androidx.appcompat.app.d dVar = fVar4.f896h;
            if (dVar != null) {
                dVar.onSupportActionModeFinished(fVar4.f903o);
            }
            f fVar5 = f.this;
            fVar5.f903o = null;
            a0.n0(fVar5.f910v);
        }

        @Override // i.b.a
        public boolean c(i.b bVar, Menu menu) {
            a0.n0(f.this.f910v);
            return this.f925a.c(bVar, menu);
        }

        @Override // i.b.a
        public boolean d(i.b bVar, Menu menu) {
            return this.f925a.d(bVar, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class l {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class m {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class n {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class o {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class q extends r {

        /* renamed from: c  reason: collision with root package name */
        private final PowerManager f930c;

        q(Context context) {
            super();
            this.f930c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.f.r
        IntentFilter b() {
            if (Build.VERSION.SDK_INT >= 21) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            }
            return null;
        }

        @Override // androidx.appcompat.app.f.r
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !m.a(this.f930c)) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.f.r
        public void d() {
            f.this.I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public abstract class r {

        /* renamed from: a  reason: collision with root package name */
        private BroadcastReceiver f932a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                r.this.d();
            }
        }

        r() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f932a;
            if (broadcastReceiver != null) {
                try {
                    f.this.f893e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f932a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b10 = b();
            if (b10 == null || b10.countActions() == 0) {
                return;
            }
            if (this.f932a == null) {
                this.f932a = new a();
            }
            f.this.f893e.registerReceiver(this.f932a, b10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class s extends r {

        /* renamed from: c  reason: collision with root package name */
        private final androidx.appcompat.app.m f935c;

        s(androidx.appcompat.app.m mVar) {
            super();
            this.f935c = mVar;
        }

        @Override // androidx.appcompat.app.f.r
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.f.r
        public int c() {
            return this.f935c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.f.r
        public void d() {
            f.this.I();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class t {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class u extends ContentFrameLayout {
        public u(Context context) {
            super(context);
        }

        private boolean c(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.W(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                f.this.Q(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(f.a.b(getContext(), i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class v {

        /* renamed from: a  reason: collision with root package name */
        int f938a;

        /* renamed from: b  reason: collision with root package name */
        int f939b;

        /* renamed from: c  reason: collision with root package name */
        int f940c;

        /* renamed from: d  reason: collision with root package name */
        int f941d;

        /* renamed from: e  reason: collision with root package name */
        int f942e;

        /* renamed from: f  reason: collision with root package name */
        int f943f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f944g;

        /* renamed from: h  reason: collision with root package name */
        View f945h;

        /* renamed from: i  reason: collision with root package name */
        View f946i;

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.view.menu.e f947j;

        /* renamed from: k  reason: collision with root package name */
        androidx.appcompat.view.menu.c f948k;

        /* renamed from: l  reason: collision with root package name */
        Context f949l;

        /* renamed from: m  reason: collision with root package name */
        boolean f950m;

        /* renamed from: n  reason: collision with root package name */
        boolean f951n;

        /* renamed from: o  reason: collision with root package name */
        boolean f952o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f953p;

        /* renamed from: q  reason: collision with root package name */
        boolean f954q = false;

        /* renamed from: r  reason: collision with root package name */
        boolean f955r;

        /* renamed from: s  reason: collision with root package name */
        Bundle f956s;

        v(int i10) {
            this.f938a = i10;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f947j == null) {
                return null;
            }
            if (this.f948k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f949l, e.g.f24651j);
                this.f948k = cVar;
                cVar.d(aVar);
                this.f947j.b(this.f948k);
            }
            return this.f948k.j(this.f944g);
        }

        public boolean b() {
            if (this.f945h == null) {
                return false;
            }
            return this.f946i != null || this.f948k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f947j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.O(this.f948k);
            }
            this.f947j = eVar;
            if (eVar == null || (cVar = this.f948k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(e.a.f24540a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(e.a.F, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                newTheme.applyStyle(i11, true);
            } else {
                newTheme.applyStyle(e.i.f24675b, true);
            }
            i.d dVar = new i.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f949l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(e.j.f24799y0);
            this.f939b = obtainStyledAttributes.getResourceId(e.j.B0, 0);
            this.f943f = obtainStyledAttributes.getResourceId(e.j.A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class w implements j.a {
        w() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e D = eVar.D();
            boolean z11 = D != eVar;
            f fVar = f.this;
            if (z11) {
                eVar = D;
            }
            v b02 = fVar.b0(eVar);
            if (b02 != null) {
                if (z11) {
                    f.this.N(b02.f938a, b02, D);
                    f.this.R(b02, true);
                    return;
                }
                f.this.R(b02, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback i02;
            if (eVar == eVar.D()) {
                f fVar = f.this;
                if (!fVar.A || (i02 = fVar.i0()) == null || f.this.L) {
                    return true;
                }
                i02.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = i10 < 21;
        f886c0 = z10;
        f887d0 = new int[]{16842836};
        f888e0 = !"robolectric".equals(Build.FINGERPRINT);
        f889f0 = i10 >= 17;
        if (!z10 || f890g0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        f890g0 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    private void A0(v vVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (vVar.f952o || this.L) {
            return;
        }
        if (vVar.f938a == 0) {
            if ((this.f893e.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback i02 = i0();
        if (i02 != null && !i02.onMenuOpened(vVar.f938a, vVar.f947j)) {
            R(vVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f893e.getSystemService("window");
        if (windowManager != null && D0(vVar, keyEvent)) {
            ViewGroup viewGroup = vVar.f944g;
            if (viewGroup != null && !vVar.f954q) {
                View view = vVar.f946i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                    vVar.f951n = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i10, -2, vVar.f941d, vVar.f942e, 1002, 8519680, -3);
                    layoutParams2.gravity = vVar.f940c;
                    layoutParams2.windowAnimations = vVar.f943f;
                    windowManager.addView(vVar.f944g, layoutParams2);
                    vVar.f952o = true;
                }
            } else {
                if (viewGroup == null) {
                    if (!l0(vVar) || vVar.f944g == null) {
                        return;
                    }
                } else if (vVar.f954q && viewGroup.getChildCount() > 0) {
                    vVar.f944g.removeAllViews();
                }
                if (k0(vVar) && vVar.b()) {
                    ViewGroup.LayoutParams layoutParams3 = vVar.f945h.getLayoutParams();
                    if (layoutParams3 == null) {
                        layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                    }
                    vVar.f944g.setBackgroundResource(vVar.f939b);
                    ViewParent parent = vVar.f945h.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(vVar.f945h);
                    }
                    vVar.f944g.addView(vVar.f945h, layoutParams3);
                    if (!vVar.f945h.hasFocus()) {
                        vVar.f945h.requestFocus();
                    }
                } else {
                    vVar.f954q = true;
                    return;
                }
            }
            i10 = -2;
            vVar.f951n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i10, -2, vVar.f941d, vVar.f942e, 1002, 8519680, -3);
            layoutParams22.gravity = vVar.f940c;
            layoutParams22.windowAnimations = vVar.f943f;
            windowManager.addView(vVar.f944g, layoutParams22);
            vVar.f952o = true;
        }
    }

    private boolean C0(v vVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((vVar.f950m || D0(vVar, keyEvent)) && (eVar = vVar.f947j) != null) {
            z10 = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f900l == null) {
            R(vVar, true);
        }
        return z10;
    }

    private boolean D0(v vVar, KeyEvent keyEvent) {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        if (this.L) {
            return false;
        }
        if (vVar.f950m) {
            return true;
        }
        v vVar2 = this.H;
        if (vVar2 != null && vVar2 != vVar) {
            R(vVar2, false);
        }
        Window.Callback i02 = i0();
        if (i02 != null) {
            vVar.f946i = i02.onCreatePanelView(vVar.f938a);
        }
        int i10 = vVar.f938a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (f0Var3 = this.f900l) != null) {
            f0Var3.f();
        }
        if (vVar.f946i == null && (!z10 || !(B0() instanceof androidx.appcompat.app.k))) {
            androidx.appcompat.view.menu.e eVar = vVar.f947j;
            if (eVar == null || vVar.f955r) {
                if (eVar == null && (!m0(vVar) || vVar.f947j == null)) {
                    return false;
                }
                if (z10 && this.f900l != null) {
                    if (this.f901m == null) {
                        this.f901m = new j();
                    }
                    this.f900l.d(vVar.f947j, this.f901m);
                }
                vVar.f947j.d0();
                if (!i02.onCreatePanelMenu(vVar.f938a, vVar.f947j)) {
                    vVar.c(null);
                    if (z10 && (f0Var = this.f900l) != null) {
                        f0Var.d(null, this.f901m);
                    }
                    return false;
                }
                vVar.f955r = false;
            }
            vVar.f947j.d0();
            Bundle bundle = vVar.f956s;
            if (bundle != null) {
                vVar.f947j.P(bundle);
                vVar.f956s = null;
            }
            if (!i02.onPreparePanel(0, vVar.f946i, vVar.f947j)) {
                if (z10 && (f0Var2 = this.f900l) != null) {
                    f0Var2.d(null, this.f901m);
                }
                vVar.f947j.c0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            vVar.f953p = z11;
            vVar.f947j.setQwertyMode(z11);
            vVar.f947j.c0();
        }
        vVar.f950m = true;
        vVar.f951n = false;
        this.H = vVar;
        return true;
    }

    private void E0(boolean z10) {
        f0 f0Var = this.f900l;
        if (f0Var != null && f0Var.a() && (!ViewConfiguration.get(this.f893e).hasPermanentMenuKey() || this.f900l.g())) {
            Window.Callback i02 = i0();
            if (this.f900l.e() && z10) {
                this.f900l.b();
                if (this.L) {
                    return;
                }
                i02.onPanelClosed(108, g0(0, true).f947j);
                return;
            } else if (i02 == null || this.L) {
                return;
            } else {
                if (this.T && (this.U & 1) != 0) {
                    this.f894f.getDecorView().removeCallbacks(this.V);
                    this.V.run();
                }
                v g02 = g0(0, true);
                androidx.appcompat.view.menu.e eVar = g02.f947j;
                if (eVar == null || g02.f955r || !i02.onPreparePanel(0, g02.f946i, eVar)) {
                    return;
                }
                i02.onMenuOpened(108, g02.f947j);
                this.f900l.c();
                return;
            }
        }
        v g03 = g0(0, true);
        g03.f954q = true;
        R(g03, false);
        A0(g03, null);
    }

    private int F0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        } else {
            return i10;
        }
    }

    private boolean H0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f894f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || a0.T((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean J(boolean z10) {
        if (this.L) {
            return false;
        }
        int M = M();
        boolean L0 = L0(q0(this.f893e, M), z10);
        if (M == 0) {
            f0(this.f893e).e();
        } else {
            r rVar = this.R;
            if (rVar != null) {
                rVar.a();
            }
        }
        if (M == 3) {
            e0(this.f893e).e();
        } else {
            r rVar2 = this.S;
            if (rVar2 != null) {
                rVar2.a();
            }
        }
        return L0;
    }

    private void J0() {
        if (this.f909u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void K() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f910v.findViewById(16908290);
        View decorView = this.f894f.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f893e.obtainStyledAttributes(e.j.f24799y0);
        obtainStyledAttributes.getValue(e.j.K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(e.j.L0, contentFrameLayout.getMinWidthMinor());
        int i10 = e.j.I0;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = e.j.J0;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = e.j.G0;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = e.j.H0;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private AppCompatActivity K0() {
        for (Context context = this.f893e; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof AppCompatActivity) {
                return (AppCompatActivity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void L(Window window) {
        if (this.f894f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof p)) {
                p pVar = new p(callback);
                this.f895g = pVar;
                window.setCallback(pVar);
                z0 u10 = z0.u(this.f893e, null, f887d0);
                Drawable h10 = u10.h(0);
                if (h10 != null) {
                    window.setBackgroundDrawable(h10);
                }
                u10.w();
                this.f894f = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean L0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f893e
            r1 = 0
            android.content.res.Configuration r0 = r6.S(r0, r7, r1)
            boolean r2 = r6.o0()
            android.content.res.Configuration r3 = r6.M
            if (r3 != 0) goto L19
            android.content.Context r3 = r6.f893e
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
        L19:
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L4b
            if (r8 == 0) goto L4b
            if (r2 != 0) goto L4b
            boolean r8 = r6.J
            if (r8 == 0) goto L4b
            boolean r8 = androidx.appcompat.app.f.f888e0
            if (r8 != 0) goto L34
            boolean r8 = r6.K
            if (r8 == 0) goto L4b
        L34:
            java.lang.Object r8 = r6.f892d
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L4b
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L4b
            java.lang.Object r8 = r6.f892d
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.b.q(r8)
            r8 = r4
            goto L4c
        L4b:
            r8 = 0
        L4c:
            if (r8 != 0) goto L54
            if (r3 == r0) goto L54
            r6.M0(r0, r2, r1)
            goto L55
        L54:
            r4 = r8
        L55:
            if (r4 == 0) goto L62
            java.lang.Object r8 = r6.f892d
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto L62
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8
            r8.onNightModeChanged(r7)
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.L0(int, boolean):boolean");
    }

    private int M() {
        int i10 = this.N;
        return i10 != -100 ? i10 : androidx.appcompat.app.e.j();
    }

    private void M0(int i10, boolean z10, Configuration configuration) {
        Resources resources = this.f893e.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            androidx.appcompat.app.j.a(resources);
        }
        int i12 = this.O;
        if (i12 != 0) {
            this.f893e.setTheme(i12);
            if (i11 >= 23) {
                this.f893e.getTheme().applyStyle(this.O, true);
            }
        }
        if (z10) {
            Object obj = this.f892d;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.p) {
                    if (((androidx.lifecycle.p) activity).getLifecycle().b().b(i.b.CREATED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (!this.K || this.L) {
                } else {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    private void O0(View view) {
        int d10;
        if ((a0.N(view) & 8192) != 0) {
            d10 = androidx.core.content.a.d(this.f893e, e.c.f24568b);
        } else {
            d10 = androidx.core.content.a.d(this.f893e, e.c.f24567a);
        }
        view.setBackgroundColor(d10);
    }

    private void P() {
        r rVar = this.R;
        if (rVar != null) {
            rVar.a();
        }
        r rVar2 = this.S;
        if (rVar2 != null) {
            rVar2.a();
        }
    }

    private Configuration S(Context context, int i10, Configuration configuration) {
        int i11;
        if (i10 != 1) {
            i11 = i10 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i11 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup T() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f893e.obtainStyledAttributes(e.j.f24799y0);
        int i10 = e.j.D0;
        if (obtainStyledAttributes.hasValue(i10)) {
            if (obtainStyledAttributes.getBoolean(e.j.M0, false)) {
                A(1);
            } else if (obtainStyledAttributes.getBoolean(i10, false)) {
                A(108);
            }
            if (obtainStyledAttributes.getBoolean(e.j.E0, false)) {
                A(109);
            }
            if (obtainStyledAttributes.getBoolean(e.j.F0, false)) {
                A(10);
            }
            this.D = obtainStyledAttributes.getBoolean(e.j.f24804z0, false);
            obtainStyledAttributes.recycle();
            a0();
            this.f894f.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f893e);
            if (!this.E) {
                if (this.D) {
                    viewGroup = (ViewGroup) from.inflate(e.g.f24647f, (ViewGroup) null);
                    this.B = false;
                    this.A = false;
                } else if (this.A) {
                    TypedValue typedValue = new TypedValue();
                    this.f893e.getTheme().resolveAttribute(e.a.f24545f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new i.d(this.f893e, typedValue.resourceId);
                    } else {
                        context = this.f893e;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(e.g.f24657p, (ViewGroup) null);
                    f0 f0Var = (f0) viewGroup.findViewById(e.f.f24631p);
                    this.f900l = f0Var;
                    f0Var.setWindowCallback(i0());
                    if (this.B) {
                        this.f900l.h(109);
                    }
                    if (this.f913y) {
                        this.f900l.h(2);
                    }
                    if (this.f914z) {
                        this.f900l.h(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.C ? (ViewGroup) from.inflate(e.g.f24656o, (ViewGroup) null) : (ViewGroup) from.inflate(e.g.f24655n, (ViewGroup) null);
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    a0.C0(viewGroup, new c());
                } else if (viewGroup instanceof j0) {
                    ((j0) viewGroup).setOnFitSystemWindowsListener(new d());
                }
                if (this.f900l == null) {
                    this.f911w = (TextView) viewGroup.findViewById(e.f.M);
                }
                g1.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(e.f.f24617b);
                ViewGroup viewGroup2 = (ViewGroup) this.f894f.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f894f.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.A + ", windowActionBarOverlay: " + this.B + ", android:windowIsFloating: " + this.D + ", windowActionModeOverlay: " + this.C + ", windowNoTitle: " + this.E + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void Z() {
        if (this.f909u) {
            return;
        }
        this.f910v = T();
        CharSequence h02 = h0();
        if (!TextUtils.isEmpty(h02)) {
            f0 f0Var = this.f900l;
            if (f0Var != null) {
                f0Var.setWindowTitle(h02);
            } else if (B0() != null) {
                B0().w(h02);
            } else {
                TextView textView = this.f911w;
                if (textView != null) {
                    textView.setText(h02);
                }
            }
        }
        K();
        z0(this.f910v);
        this.f909u = true;
        v g02 = g0(0, false);
        if (this.L) {
            return;
        }
        if (g02 == null || g02.f947j == null) {
            n0(108);
        }
    }

    private void a0() {
        if (this.f894f == null) {
            Object obj = this.f892d;
            if (obj instanceof Activity) {
                L(((Activity) obj).getWindow());
            }
        }
        if (this.f894f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration c0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                n.a(configuration, configuration2, configuration3);
            } else if (!androidx.core.util.d.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                o.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            if (i14 >= 17) {
                l.b(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    private r e0(Context context) {
        if (this.S == null) {
            this.S = new q(context);
        }
        return this.S;
    }

    private r f0(Context context) {
        if (this.R == null) {
            this.R = new s(androidx.appcompat.app.m.a(context));
        }
        return this.R;
    }

    private void j0() {
        Z();
        if (this.A && this.f897i == null) {
            Object obj = this.f892d;
            if (obj instanceof Activity) {
                this.f897i = new androidx.appcompat.app.n((Activity) this.f892d, this.B);
            } else if (obj instanceof Dialog) {
                this.f897i = new androidx.appcompat.app.n((Dialog) this.f892d);
            }
            androidx.appcompat.app.a aVar = this.f897i;
            if (aVar != null) {
                aVar.r(this.W);
            }
        }
    }

    private boolean k0(v vVar) {
        View view = vVar.f946i;
        if (view != null) {
            vVar.f945h = view;
            return true;
        } else if (vVar.f947j == null) {
            return false;
        } else {
            if (this.f902n == null) {
                this.f902n = new w();
            }
            View view2 = (View) vVar.a(this.f902n);
            vVar.f945h = view2;
            return view2 != null;
        }
    }

    private boolean l0(v vVar) {
        vVar.d(d0());
        vVar.f944g = new u(vVar.f949l);
        vVar.f940c = 81;
        return true;
    }

    private boolean m0(v vVar) {
        Context context = this.f893e;
        int i10 = vVar.f938a;
        if ((i10 == 0 || i10 == 108) && this.f900l != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(e.a.f24545f, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(e.a.f24546g, typedValue, true);
            } else {
                theme.resolveAttribute(e.a.f24546g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                i.d dVar = new i.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.R(this);
        vVar.c(eVar);
        return true;
    }

    private void n0(int i10) {
        this.U = (1 << i10) | this.U;
        if (this.T) {
            return;
        }
        a0.i0(this.f894f.getDecorView(), this.V);
        this.T = true;
    }

    private boolean o0() {
        if (!this.Q && (this.f892d instanceof Activity)) {
            PackageManager packageManager = this.f893e.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f893e, this.f892d.getClass()), i10 >= 29 ? 269221888 : i10 >= 24 ? 786432 : 0);
                this.P = (activityInfo == null || (activityInfo.configChanges & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e8) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e8);
                this.P = false;
            }
        }
        this.Q = true;
        return this.P;
    }

    private boolean t0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            v g02 = g0(i10, true);
            if (g02.f952o) {
                return false;
            }
            return D0(g02, keyEvent);
        }
        return false;
    }

    private boolean w0(int i10, KeyEvent keyEvent) {
        boolean z10;
        f0 f0Var;
        if (this.f903o != null) {
            return false;
        }
        boolean z11 = true;
        v g02 = g0(i10, true);
        if (i10 == 0 && (f0Var = this.f900l) != null && f0Var.a() && !ViewConfiguration.get(this.f893e).hasPermanentMenuKey()) {
            if (!this.f900l.e()) {
                if (!this.L && D0(g02, keyEvent)) {
                    z11 = this.f900l.c();
                }
                z11 = false;
            } else {
                z11 = this.f900l.b();
            }
        } else {
            boolean z12 = g02.f952o;
            if (!z12 && !g02.f951n) {
                if (g02.f950m) {
                    if (g02.f955r) {
                        g02.f950m = false;
                        z10 = D0(g02, keyEvent);
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        A0(g02, keyEvent);
                    }
                }
                z11 = false;
            } else {
                R(g02, true);
                z11 = z12;
            }
        }
        if (z11) {
            AudioManager audioManager = (AudioManager) this.f893e.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z11;
    }

    @Override // androidx.appcompat.app.e
    public boolean A(int i10) {
        int F0 = F0(i10);
        if (this.E && F0 == 108) {
            return false;
        }
        if (this.A && F0 == 1) {
            this.A = false;
        }
        if (F0 == 1) {
            J0();
            this.E = true;
            return true;
        } else if (F0 == 2) {
            J0();
            this.f913y = true;
            return true;
        } else if (F0 == 5) {
            J0();
            this.f914z = true;
            return true;
        } else if (F0 == 10) {
            J0();
            this.C = true;
            return true;
        } else if (F0 == 108) {
            J0();
            this.A = true;
            return true;
        } else if (F0 != 109) {
            return this.f894f.requestFeature(F0);
        } else {
            J0();
            this.B = true;
            return true;
        }
    }

    @Override // androidx.appcompat.app.e
    public void B(int i10) {
        Z();
        ViewGroup viewGroup = (ViewGroup) this.f910v.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f893e).inflate(i10, viewGroup);
        this.f895g.a().onContentChanged();
    }

    final androidx.appcompat.app.a B0() {
        return this.f897i;
    }

    @Override // androidx.appcompat.app.e
    public void C(View view) {
        Z();
        ViewGroup viewGroup = (ViewGroup) this.f910v.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f895g.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void D(View view, ViewGroup.LayoutParams layoutParams) {
        Z();
        ViewGroup viewGroup = (ViewGroup) this.f910v.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f895g.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void E(Toolbar toolbar) {
        if (this.f892d instanceof Activity) {
            androidx.appcompat.app.a n10 = n();
            if (!(n10 instanceof androidx.appcompat.app.n)) {
                this.f898j = null;
                if (n10 != null) {
                    n10.n();
                }
                this.f897i = null;
                if (toolbar != null) {
                    androidx.appcompat.app.k kVar = new androidx.appcompat.app.k(toolbar, h0(), this.f895g);
                    this.f897i = kVar;
                    this.f895g.b(kVar.f984c);
                } else {
                    this.f895g.b(null);
                }
                p();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Override // androidx.appcompat.app.e
    public void F(int i10) {
        this.O = i10;
    }

    @Override // androidx.appcompat.app.e
    public final void G(CharSequence charSequence) {
        this.f899k = charSequence;
        f0 f0Var = this.f900l;
        if (f0Var != null) {
            f0Var.setWindowTitle(charSequence);
        } else if (B0() != null) {
            B0().w(charSequence);
        } else {
            TextView textView = this.f911w;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    final boolean G0() {
        ViewGroup viewGroup;
        return this.f909u && (viewGroup = this.f910v) != null && a0.U(viewGroup);
    }

    @Override // androidx.appcompat.app.e
    public i.b H(b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar != null) {
            i.b bVar = this.f903o;
            if (bVar != null) {
                bVar.c();
            }
            k kVar = new k(aVar);
            androidx.appcompat.app.a n10 = n();
            if (n10 != null) {
                i.b y10 = n10.y(kVar);
                this.f903o = y10;
                if (y10 != null && (dVar = this.f896h) != null) {
                    dVar.onSupportActionModeStarted(y10);
                }
            }
            if (this.f903o == null) {
                this.f903o = I0(kVar);
            }
            return this.f903o;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public boolean I() {
        return J(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    i.b I0(i.b.a r8) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.I0(i.b$a):i.b");
    }

    void N(int i10, v vVar, Menu menu) {
        if (menu == null) {
            if (vVar == null && i10 >= 0) {
                v[] vVarArr = this.G;
                if (i10 < vVarArr.length) {
                    vVar = vVarArr[i10];
                }
            }
            if (vVar != null) {
                menu = vVar.f947j;
            }
        }
        if ((vVar == null || vVar.f952o) && !this.L) {
            this.f895g.a().onPanelClosed(i10, menu);
        }
    }

    final int N0(l0 l0Var, Rect rect) {
        int i10;
        boolean z10;
        boolean z11;
        if (l0Var != null) {
            i10 = l0Var.k();
        } else {
            i10 = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f904p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f904p.getLayoutParams();
            if (this.f904p.isShown()) {
                if (this.X == null) {
                    this.X = new Rect();
                    this.Y = new Rect();
                }
                Rect rect2 = this.X;
                Rect rect3 = this.Y;
                if (l0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(l0Var.i(), l0Var.k(), l0Var.j(), l0Var.h());
                }
                g1.a(this.f910v, rect2, rect3);
                int i11 = rect2.top;
                int i12 = rect2.left;
                int i13 = rect2.right;
                l0 K = a0.K(this.f910v);
                int i14 = K == null ? 0 : K.i();
                int j10 = K == null ? 0 : K.j();
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z11 = true;
                }
                if (i11 > 0 && this.f912x == null) {
                    View view = new View(this.f893e);
                    this.f912x = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i14;
                    layoutParams.rightMargin = j10;
                    this.f910v.addView(this.f912x, -1, layoutParams);
                } else {
                    View view2 = this.f912x;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i15 = marginLayoutParams2.height;
                        int i16 = marginLayoutParams.topMargin;
                        if (i15 != i16 || marginLayoutParams2.leftMargin != i14 || marginLayoutParams2.rightMargin != j10) {
                            marginLayoutParams2.height = i16;
                            marginLayoutParams2.leftMargin = i14;
                            marginLayoutParams2.rightMargin = j10;
                            this.f912x.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.f912x;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    O0(this.f912x);
                }
                if (!this.C && r5) {
                    i10 = 0;
                }
                z10 = r5;
                r5 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                r5 = false;
            }
            if (r5) {
                this.f904p.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f912x;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return i10;
    }

    void O(androidx.appcompat.view.menu.e eVar) {
        if (this.F) {
            return;
        }
        this.F = true;
        this.f900l.l();
        Window.Callback i02 = i0();
        if (i02 != null && !this.L) {
            i02.onPanelClosed(108, eVar);
        }
        this.F = false;
    }

    void Q(int i10) {
        R(g0(i10, true), true);
    }

    void R(v vVar, boolean z10) {
        ViewGroup viewGroup;
        f0 f0Var;
        if (z10 && vVar.f938a == 0 && (f0Var = this.f900l) != null && f0Var.e()) {
            O(vVar.f947j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f893e.getSystemService("window");
        if (windowManager != null && vVar.f952o && (viewGroup = vVar.f944g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                N(vVar.f938a, vVar, null);
            }
        }
        vVar.f950m = false;
        vVar.f951n = false;
        vVar.f952o = false;
        vVar.f945h = null;
        vVar.f954q = true;
        if (this.H == vVar) {
            this.H = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View U(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            androidx.appcompat.app.h r0 = r11.Z
            r1 = 0
            if (r0 != 0) goto L5b
            android.content.Context r0 = r11.f893e
            int[] r2 = e.j.f24799y0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = e.j.C0
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L1d
            androidx.appcompat.app.h r0 = new androidx.appcompat.app.h
            r0.<init>()
            r11.Z = r0
            goto L5b
        L1d:
            android.content.Context r2 = r11.f893e     // Catch: java.lang.Throwable -> L38
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L38
            java.lang.Class r2 = r2.loadClass(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L38
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> L38
            androidx.appcompat.app.h r2 = (androidx.appcompat.app.h) r2     // Catch: java.lang.Throwable -> L38
            r11.Z = r2     // Catch: java.lang.Throwable -> L38
            goto L5b
        L38:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "AppCompatDelegate"
            android.util.Log.i(r3, r0, r2)
            androidx.appcompat.app.h r0 = new androidx.appcompat.app.h
            r0.<init>()
            r11.Z = r0
        L5b:
            boolean r8 = androidx.appcompat.app.f.f886c0
            r0 = 1
            if (r8 == 0) goto L8b
            androidx.appcompat.app.i r2 = r11.f891a0
            if (r2 != 0) goto L6b
            androidx.appcompat.app.i r2 = new androidx.appcompat.app.i
            r2.<init>()
            r11.f891a0 = r2
        L6b:
            androidx.appcompat.app.i r2 = r11.f891a0
            boolean r2 = r2.a(r15)
            if (r2 == 0) goto L75
            r7 = r0
            goto L8c
        L75:
            boolean r2 = r15 instanceof org.xmlpull.v1.XmlPullParser
            if (r2 == 0) goto L83
            r2 = r15
            org.xmlpull.v1.XmlPullParser r2 = (org.xmlpull.v1.XmlPullParser) r2
            int r2 = r2.getDepth()
            if (r2 <= r0) goto L8b
            goto L8a
        L83:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r0 = r11.H0(r0)
        L8a:
            r1 = r0
        L8b:
            r7 = r1
        L8c:
            androidx.appcompat.app.h r2 = r11.Z
            r9 = 1
            boolean r10 = androidx.appcompat.widget.f1.c()
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r12 = r2.r(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.U(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    void V() {
        androidx.appcompat.view.menu.e eVar;
        f0 f0Var = this.f900l;
        if (f0Var != null) {
            f0Var.l();
        }
        if (this.f905q != null) {
            this.f894f.getDecorView().removeCallbacks(this.f906r);
            if (this.f905q.isShowing()) {
                try {
                    this.f905q.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f905q = null;
        }
        Y();
        v g02 = g0(0, false);
        if (g02 == null || (eVar = g02.f947j) == null) {
            return;
        }
        eVar.close();
    }

    boolean W(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f892d;
        if (((obj instanceof f.a) || (obj instanceof androidx.appcompat.app.g)) && (decorView = this.f894f.getDecorView()) != null && androidx.core.view.f.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f895g.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? s0(keyCode, keyEvent) : v0(keyCode, keyEvent);
    }

    void X(int i10) {
        v g02;
        v g03 = g0(i10, true);
        if (g03.f947j != null) {
            Bundle bundle = new Bundle();
            g03.f947j.Q(bundle);
            if (bundle.size() > 0) {
                g03.f956s = bundle;
            }
            g03.f947j.d0();
            g03.f947j.clear();
        }
        g03.f955r = true;
        g03.f954q = true;
        if ((i10 != 108 && i10 != 0) || this.f900l == null || (g02 = g0(0, false)) == null) {
            return;
        }
        g02.f950m = false;
        D0(g02, null);
    }

    void Y() {
        g0 g0Var = this.f907s;
        if (g0Var != null) {
            g0Var.c();
        }
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        v b02;
        Window.Callback i02 = i0();
        if (i02 == null || this.L || (b02 = b0(eVar.D())) == null) {
            return false;
        }
        return i02.onMenuItemSelected(b02.f938a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        E0(true);
    }

    v b0(Menu menu) {
        v[] vVarArr = this.G;
        int length = vVarArr != null ? vVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            v vVar = vVarArr[i10];
            if (vVar != null && vVar.f947j == menu) {
                return vVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.e
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        Z();
        ((ViewGroup) this.f910v.findViewById(16908290)).addView(view, layoutParams);
        this.f895g.a().onContentChanged();
    }

    final Context d0() {
        androidx.appcompat.app.a n10 = n();
        Context j10 = n10 != null ? n10.j() : null;
        return j10 == null ? this.f893e : j10;
    }

    @Override // androidx.appcompat.app.e
    public Context f(Context context) {
        this.J = true;
        int q02 = q0(context, M());
        Configuration configuration = null;
        if (f889f0 && (context instanceof ContextThemeWrapper)) {
            try {
                t.a((ContextThemeWrapper) context, S(context, q02, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof i.d) {
            try {
                ((i.d) context).a(S(context, q02, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f888e0) {
            return super.f(context);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = l.a(context, configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = c0(configuration3, configuration4);
            }
        }
        Configuration S = S(context, q02, configuration);
        i.d dVar = new i.d(context, e.i.f24676c);
        dVar.a(S);
        boolean z10 = false;
        try {
            z10 = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z10) {
            h.g.a(dVar.getTheme());
        }
        return super.f(dVar);
    }

    protected v g0(int i10, boolean z10) {
        v[] vVarArr = this.G;
        if (vVarArr == null || vVarArr.length <= i10) {
            v[] vVarArr2 = new v[i10 + 1];
            if (vVarArr != null) {
                System.arraycopy(vVarArr, 0, vVarArr2, 0, vVarArr.length);
            }
            this.G = vVarArr2;
            vVarArr = vVarArr2;
        }
        v vVar = vVarArr[i10];
        if (vVar == null) {
            v vVar2 = new v(i10);
            vVarArr[i10] = vVar2;
            return vVar2;
        }
        return vVar;
    }

    final CharSequence h0() {
        Object obj = this.f892d;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f899k;
    }

    @Override // androidx.appcompat.app.e
    public <T extends View> T i(int i10) {
        Z();
        return (T) this.f894f.findViewById(i10);
    }

    final Window.Callback i0() {
        return this.f894f.getCallback();
    }

    @Override // androidx.appcompat.app.e
    public final androidx.appcompat.app.b k() {
        return new h();
    }

    @Override // androidx.appcompat.app.e
    public int l() {
        return this.N;
    }

    @Override // androidx.appcompat.app.e
    public MenuInflater m() {
        if (this.f898j == null) {
            j0();
            androidx.appcompat.app.a aVar = this.f897i;
            this.f898j = new i.g(aVar != null ? aVar.j() : this.f893e);
        }
        return this.f898j;
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.app.a n() {
        j0();
        return this.f897i;
    }

    @Override // androidx.appcompat.app.e
    public void o() {
        LayoutInflater from = LayoutInflater.from(this.f893e);
        if (from.getFactory() == null) {
            androidx.core.view.g.b(from, this);
        } else if (from.getFactory2() instanceof f) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return U(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.e
    public void p() {
        androidx.appcompat.app.a n10 = n();
        if (n10 == null || !n10.l()) {
            n0(0);
        }
    }

    public boolean p0() {
        return this.f908t;
    }

    @Override // androidx.appcompat.app.e
    public void q(Configuration configuration) {
        androidx.appcompat.app.a n10;
        if (this.A && this.f909u && (n10 = n()) != null) {
            n10.m(configuration);
        }
        androidx.appcompat.widget.k.b().g(this.f893e);
        this.M = new Configuration(this.f893e.getResources().getConfiguration());
        J(false);
    }

    int q0(Context context, int i10) {
        if (i10 != -100) {
            if (i10 != -1) {
                if (i10 == 0) {
                    if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                        return f0(context).c();
                    }
                    return -1;
                } else if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        return e0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            }
            return i10;
        }
        return -1;
    }

    @Override // androidx.appcompat.app.e
    public void r(Bundle bundle) {
        this.J = true;
        J(false);
        a0();
        Object obj = this.f892d;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.h.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                androidx.appcompat.app.a B0 = B0();
                if (B0 == null) {
                    this.W = true;
                } else {
                    B0.r(true);
                }
            }
            androidx.appcompat.app.e.c(this);
        }
        this.M = new Configuration(this.f893e.getResources().getConfiguration());
        this.K = true;
    }

    boolean r0() {
        i.b bVar = this.f903o;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a n10 = n();
        return n10 != null && n10.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // androidx.appcompat.app.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f892d
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.e.y(r3)
        L9:
            boolean r0 = r3.T
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f894f
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.V
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.L = r0
            int r0 = r3.N
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f892d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            androidx.collection.h<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.f.f885b0
            java.lang.Object r1 = r3.f892d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.N
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            androidx.collection.h<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.f.f885b0
            java.lang.Object r1 = r3.f892d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.f897i
            if (r0 == 0) goto L5b
            r0.n()
        L5b:
            r3.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.s():void");
    }

    boolean s0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.I = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            t0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void t(Bundle bundle) {
        Z();
    }

    @Override // androidx.appcompat.app.e
    public void u() {
        androidx.appcompat.app.a n10 = n();
        if (n10 != null) {
            n10.u(true);
        }
    }

    boolean u0(int i10, KeyEvent keyEvent) {
        androidx.appcompat.app.a n10 = n();
        if (n10 == null || !n10.o(i10, keyEvent)) {
            v vVar = this.H;
            if (vVar != null && C0(vVar, keyEvent.getKeyCode(), keyEvent, 1)) {
                v vVar2 = this.H;
                if (vVar2 != null) {
                    vVar2.f951n = true;
                }
                return true;
            }
            if (this.H == null) {
                v g02 = g0(0, true);
                D0(g02, keyEvent);
                boolean C0 = C0(g02, keyEvent.getKeyCode(), keyEvent, 1);
                g02.f950m = false;
                if (C0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.app.e
    public void v(Bundle bundle) {
    }

    boolean v0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            boolean z10 = this.I;
            this.I = false;
            v g02 = g0(0, false);
            if (g02 != null && g02.f952o) {
                if (!z10) {
                    R(g02, true);
                }
                return true;
            } else if (r0()) {
                return true;
            }
        } else if (i10 == 82) {
            w0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void w() {
        I();
    }

    @Override // androidx.appcompat.app.e
    public void x() {
        androidx.appcompat.app.a n10 = n();
        if (n10 != null) {
            n10.u(false);
        }
    }

    void x0(int i10) {
        androidx.appcompat.app.a n10;
        if (i10 != 108 || (n10 = n()) == null) {
            return;
        }
        n10.h(true);
    }

    void y0(int i10) {
        if (i10 == 108) {
            androidx.appcompat.app.a n10 = n();
            if (n10 != null) {
                n10.h(false);
            }
        } else if (i10 == 0) {
            v g02 = g0(i10, true);
            if (g02.f952o) {
                R(g02, false);
            }
        }
    }

    void z0(ViewGroup viewGroup) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private f(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        androidx.collection.h<String, Integer> hVar;
        Integer num;
        AppCompatActivity K0;
        this.f907s = null;
        this.f908t = true;
        this.N = -100;
        this.V = new b();
        this.f893e = context;
        this.f896h = dVar;
        this.f892d = obj;
        if (this.N == -100 && (obj instanceof Dialog) && (K0 = K0()) != null) {
            this.N = K0.getDelegate().l();
        }
        if (this.N == -100 && (num = (hVar = f885b0).get(obj.getClass().getName())) != null) {
            this.N = num.intValue();
            hVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            L(window);
        }
        androidx.appcompat.widget.k.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class p extends i.i {

        /* renamed from: b  reason: collision with root package name */
        private i f928b;

        p(Window.Callback callback) {
            super(callback);
        }

        void b(i iVar) {
            this.f928b = iVar;
        }

        final ActionMode c(ActionMode.Callback callback) {
            f.a aVar = new f.a(f.this.f893e, callback);
            i.b H = f.this.H(aVar);
            if (H != null) {
                return aVar.e(H);
            }
            return null;
        }

        @Override // i.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.W(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // i.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || f.this.u0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // i.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // i.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View onCreatePanelView;
            i iVar = this.f928b;
            return (iVar == null || (onCreatePanelView = iVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : onCreatePanelView;
        }

        @Override // i.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            f.this.x0(i10);
            return true;
        }

        @Override // i.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            super.onPanelClosed(i10, menu);
            f.this.y0(i10);
        }

        @Override // i.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            boolean z10 = true;
            if (eVar != null) {
                eVar.a0(true);
            }
            i iVar = this.f928b;
            if (iVar == null || !iVar.a(i10)) {
                z10 = false;
            }
            if (!z10) {
                z10 = super.onPreparePanel(i10, view, menu);
            }
            if (eVar != null) {
                eVar.a0(false);
            }
            return z10;
        }

        @Override // i.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            v g02 = f.this.g0(0, true);
            if (g02 != null && (eVar = g02.f947j) != null) {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        @Override // i.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (f.this.p0()) {
                return c(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override // i.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            if (f.this.p0() && i10 == 0) {
                return c(callback);
            }
            return super.onWindowStartingActionMode(callback, i10);
        }
    }
}
