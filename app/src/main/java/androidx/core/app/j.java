package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
/* compiled from: NotificationCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j {

    /* compiled from: NotificationCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f2468a;

        /* renamed from: b  reason: collision with root package name */
        private IconCompat f2469b;

        /* renamed from: c  reason: collision with root package name */
        private final p[] f2470c;

        /* renamed from: d  reason: collision with root package name */
        private final p[] f2471d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2472e;

        /* renamed from: f  reason: collision with root package name */
        boolean f2473f;

        /* renamed from: g  reason: collision with root package name */
        private final int f2474g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f2475h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public int f2476i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f2477j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f2478k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f2479l;

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.h(null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f2478k;
        }

        public boolean b() {
            return this.f2472e;
        }

        public p[] c() {
            return this.f2471d;
        }

        public Bundle d() {
            return this.f2468a;
        }

        public IconCompat e() {
            int i10;
            if (this.f2469b == null && (i10 = this.f2476i) != 0) {
                this.f2469b = IconCompat.h(null, "", i10);
            }
            return this.f2469b;
        }

        public p[] f() {
            return this.f2470c;
        }

        public int g() {
            return this.f2474g;
        }

        public boolean h() {
            return this.f2473f;
        }

        public CharSequence i() {
            return this.f2477j;
        }

        public boolean j() {
            return this.f2479l;
        }

        public boolean k() {
            return this.f2475h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, p[] pVarArr, p[] pVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f2473f = true;
            this.f2469b = iconCompat;
            if (iconCompat != null && iconCompat.l() == 2) {
                this.f2476i = iconCompat.j();
            }
            this.f2477j = e.d(charSequence);
            this.f2478k = pendingIntent;
            this.f2468a = bundle == null ? new Bundle() : bundle;
            this.f2470c = pVarArr;
            this.f2471d = pVarArr2;
            this.f2472e = z10;
            this.f2474g = i10;
            this.f2473f = z11;
            this.f2475h = z12;
            this.f2479l = z13;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends f {

        /* renamed from: e  reason: collision with root package name */
        private IconCompat f2480e;

        /* renamed from: f  reason: collision with root package name */
        private IconCompat f2481f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f2482g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f2483h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f2484i;

        /* compiled from: NotificationCompat.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* compiled from: NotificationCompat.java */
        /* renamed from: androidx.core.app.j$b$b  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        private static class C0036b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* compiled from: NotificationCompat.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        private static class c {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override // androidx.core.app.j.f
        public void b(i iVar) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 16) {
                Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(iVar.a()).setBigContentTitle(this.f2513b);
                IconCompat iconCompat = this.f2480e;
                if (iconCompat != null) {
                    if (i10 >= 31) {
                        c.a(bigContentTitle, this.f2480e.r(iVar instanceof k ? ((k) iVar).f() : null));
                    } else if (iconCompat.l() == 1) {
                        bigContentTitle = bigContentTitle.bigPicture(this.f2480e.i());
                    }
                }
                if (this.f2482g) {
                    IconCompat iconCompat2 = this.f2481f;
                    if (iconCompat2 == null) {
                        a.a(bigContentTitle, null);
                    } else if (i10 >= 23) {
                        C0036b.a(bigContentTitle, this.f2481f.r(iVar instanceof k ? ((k) iVar).f() : null));
                    } else if (iconCompat2.l() == 1) {
                        a.a(bigContentTitle, this.f2481f.i());
                    } else {
                        a.a(bigContentTitle, null);
                    }
                }
                if (this.f2515d) {
                    a.b(bigContentTitle, this.f2514c);
                }
                if (i10 >= 31) {
                    c.c(bigContentTitle, this.f2484i);
                    c.b(bigContentTitle, this.f2483h);
                }
            }
        }

        @Override // androidx.core.app.j.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f2481f = bitmap == null ? null : IconCompat.e(bitmap);
            this.f2482g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f2480e = bitmap == null ? null : IconCompat.e(bitmap);
            return this;
        }

        public b j(CharSequence charSequence) {
            this.f2513b = e.d(charSequence);
            return this;
        }

        public b k(CharSequence charSequence) {
            this.f2514c = e.d(charSequence);
            this.f2515d = true;
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f2485e;

        @Override // androidx.core.app.j.f
        public void a(Bundle bundle) {
            super.a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f2485e);
            }
        }

        @Override // androidx.core.app.j.f
        public void b(i iVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(iVar.a()).setBigContentTitle(this.f2513b).bigText(this.f2485e);
                if (this.f2515d) {
                    bigText.setSummaryText(this.f2514c);
                }
            }
        }

        @Override // androidx.core.app.j.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f2485e = e.d(charSequence);
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        protected e f2512a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f2513b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f2514c;

        /* renamed from: d  reason: collision with root package name */
        boolean f2515d = false;

        public void a(Bundle bundle) {
            if (this.f2515d) {
                bundle.putCharSequence("android.summaryText", this.f2514c);
            }
            CharSequence charSequence = this.f2513b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c10 = c();
            if (c10 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
            }
        }

        public abstract void b(i iVar);

        protected abstract String c();

        public RemoteViews d(i iVar) {
            return null;
        }

        public RemoteViews e(i iVar) {
            return null;
        }

        public RemoteViews f(i iVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f2512a != eVar) {
                this.f2512a = eVar;
                if (eVar != null) {
                    eVar.x(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            return notification.extras;
        }
        if (i10 >= 16) {
            return l.c(notification);
        }
        return null;
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class e {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        long N;
        int O;
        int P;
        boolean Q;
        d R;
        Notification S;
        boolean T;
        Icon U;
        @Deprecated
        public ArrayList<String> V;

        /* renamed from: a  reason: collision with root package name */
        public Context f2486a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f2487b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<n> f2488c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<a> f2489d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f2490e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f2491f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f2492g;

        /* renamed from: h  reason: collision with root package name */
        PendingIntent f2493h;

        /* renamed from: i  reason: collision with root package name */
        RemoteViews f2494i;

        /* renamed from: j  reason: collision with root package name */
        Bitmap f2495j;

        /* renamed from: k  reason: collision with root package name */
        CharSequence f2496k;

        /* renamed from: l  reason: collision with root package name */
        int f2497l;

        /* renamed from: m  reason: collision with root package name */
        int f2498m;

        /* renamed from: n  reason: collision with root package name */
        boolean f2499n;

        /* renamed from: o  reason: collision with root package name */
        boolean f2500o;

        /* renamed from: p  reason: collision with root package name */
        f f2501p;

        /* renamed from: q  reason: collision with root package name */
        CharSequence f2502q;

        /* renamed from: r  reason: collision with root package name */
        CharSequence f2503r;

        /* renamed from: s  reason: collision with root package name */
        CharSequence[] f2504s;

        /* renamed from: t  reason: collision with root package name */
        int f2505t;

        /* renamed from: u  reason: collision with root package name */
        int f2506u;

        /* renamed from: v  reason: collision with root package name */
        boolean f2507v;

        /* renamed from: w  reason: collision with root package name */
        String f2508w;

        /* renamed from: x  reason: collision with root package name */
        boolean f2509x;

        /* renamed from: y  reason: collision with root package name */
        String f2510y;

        /* renamed from: z  reason: collision with root package name */
        boolean f2511z;

        public e(Context context, String str) {
            this.f2487b = new ArrayList<>();
            this.f2488c = new ArrayList<>();
            this.f2489d = new ArrayList<>();
            this.f2499n = true;
            this.f2511z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.S = notification;
            this.f2486a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.S.audioStreamType = -1;
            this.f2498m = 0;
            this.V = new ArrayList<>();
            this.Q = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap e(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f2486a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(v.b.f31623b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(v.b.f31622a);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
            return bitmap;
        }

        private void n(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.S;
                notification.flags = i10 | notification.flags;
                return;
            }
            Notification notification2 = this.S;
            notification2.flags = (~i10) & notification2.flags;
        }

        public e A(int i10) {
            this.F = i10;
            return this;
        }

        public e B(long j10) {
            this.S.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f2487b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new k(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public e f(boolean z10) {
            n(16, z10);
            return this;
        }

        public e g(String str) {
            this.K = str;
            return this;
        }

        public e h(int i10) {
            this.E = i10;
            return this;
        }

        public e i(PendingIntent pendingIntent) {
            this.f2492g = pendingIntent;
            return this;
        }

        public e j(CharSequence charSequence) {
            this.f2491f = d(charSequence);
            return this;
        }

        public e k(CharSequence charSequence) {
            this.f2490e = d(charSequence);
            return this;
        }

        public e l(int i10) {
            Notification notification = this.S;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e m(PendingIntent pendingIntent) {
            this.S.deleteIntent = pendingIntent;
            return this;
        }

        public e o(Bitmap bitmap) {
            this.f2495j = e(bitmap);
            return this;
        }

        public e p(int i10, int i11, int i12) {
            Notification notification = this.S;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e q(boolean z10) {
            this.f2511z = z10;
            return this;
        }

        public e r(int i10) {
            this.f2497l = i10;
            return this;
        }

        public e s(boolean z10) {
            n(2, z10);
            return this;
        }

        public e t(int i10) {
            this.f2498m = i10;
            return this;
        }

        public e u(boolean z10) {
            this.f2499n = z10;
            return this;
        }

        public e v(int i10) {
            this.S.icon = i10;
            return this;
        }

        public e w(Uri uri) {
            Notification notification = this.S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public e x(f fVar) {
            if (this.f2501p != fVar) {
                this.f2501p = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        public e y(CharSequence charSequence) {
            this.S.tickerText = d(charSequence);
            return this;
        }

        public e z(long[] jArr) {
            this.S.vibrate = jArr;
            return this;
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }
    }
}
