package i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.z0;
import androidx.core.view.l;
import com.google.protobuf.CodedOutputStream;
import e.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: SupportMenuInflater.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class<?>[] f26378e;

    /* renamed from: f  reason: collision with root package name */
    static final Class<?>[] f26379f;

    /* renamed from: a  reason: collision with root package name */
    final Object[] f26380a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f26381b;

    /* renamed from: c  reason: collision with root package name */
    Context f26382c;

    /* renamed from: d  reason: collision with root package name */
    private Object f26383d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SupportMenuInflater.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?>[] f26384c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        private Object f26385a;

        /* renamed from: b  reason: collision with root package name */
        private Method f26386b;

        public a(Object obj, String str) {
            this.f26385a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f26386b = cls.getMethod(str, f26384c);
            } catch (Exception e8) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e8);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f26386b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f26386b.invoke(this.f26385a, menuItem)).booleanValue();
                }
                this.f26386b.invoke(this.f26385a, menuItem);
                return true;
            } catch (Exception e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SupportMenuInflater.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        private Menu f26387a;

        /* renamed from: b  reason: collision with root package name */
        private int f26388b;

        /* renamed from: c  reason: collision with root package name */
        private int f26389c;

        /* renamed from: d  reason: collision with root package name */
        private int f26390d;

        /* renamed from: e  reason: collision with root package name */
        private int f26391e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f26392f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f26393g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f26394h;

        /* renamed from: i  reason: collision with root package name */
        private int f26395i;

        /* renamed from: j  reason: collision with root package name */
        private int f26396j;

        /* renamed from: k  reason: collision with root package name */
        private CharSequence f26397k;

        /* renamed from: l  reason: collision with root package name */
        private CharSequence f26398l;

        /* renamed from: m  reason: collision with root package name */
        private int f26399m;

        /* renamed from: n  reason: collision with root package name */
        private char f26400n;

        /* renamed from: o  reason: collision with root package name */
        private int f26401o;

        /* renamed from: p  reason: collision with root package name */
        private char f26402p;

        /* renamed from: q  reason: collision with root package name */
        private int f26403q;

        /* renamed from: r  reason: collision with root package name */
        private int f26404r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f26405s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f26406t;

        /* renamed from: u  reason: collision with root package name */
        private boolean f26407u;

        /* renamed from: v  reason: collision with root package name */
        private int f26408v;

        /* renamed from: w  reason: collision with root package name */
        private int f26409w;

        /* renamed from: x  reason: collision with root package name */
        private String f26410x;

        /* renamed from: y  reason: collision with root package name */
        private String f26411y;

        /* renamed from: z  reason: collision with root package name */
        private String f26412z;

        public b(Menu menu) {
            this.f26387a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f26382c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e8) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e8);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f26405s).setVisible(this.f26406t).setEnabled(this.f26407u).setCheckable(this.f26404r >= 1).setTitleCondensed(this.f26398l).setIcon(this.f26399m);
            int i10 = this.f26408v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f26412z != null) {
                if (!g.this.f26382c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f26412z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f26404r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof j.c) {
                    ((j.c) menuItem).h(true);
                }
            }
            String str = this.f26410x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f26378e, g.this.f26380a));
                z10 = true;
            }
            int i11 = this.f26409w;
            if (i11 > 0) {
                if (!z10) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                l.a(menuItem, bVar);
            }
            l.c(menuItem, this.B);
            l.g(menuItem, this.C);
            l.b(menuItem, this.f26400n, this.f26401o);
            l.f(menuItem, this.f26402p, this.f26403q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                l.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                l.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f26394h = true;
            i(this.f26387a.add(this.f26388b, this.f26395i, this.f26396j, this.f26397k));
        }

        public SubMenu b() {
            this.f26394h = true;
            SubMenu addSubMenu = this.f26387a.addSubMenu(this.f26388b, this.f26395i, this.f26396j, this.f26397k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f26394h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f26382c.obtainStyledAttributes(attributeSet, j.f24750o1);
            this.f26388b = obtainStyledAttributes.getResourceId(j.f24760q1, 0);
            this.f26389c = obtainStyledAttributes.getInt(j.f24770s1, 0);
            this.f26390d = obtainStyledAttributes.getInt(j.f24775t1, 0);
            this.f26391e = obtainStyledAttributes.getInt(j.f24780u1, 0);
            this.f26392f = obtainStyledAttributes.getBoolean(j.f24765r1, true);
            this.f26393g = obtainStyledAttributes.getBoolean(j.f24755p1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            z0 u10 = z0.u(g.this.f26382c, attributeSet, j.f24785v1);
            this.f26395i = u10.n(j.f24800y1, 0);
            this.f26396j = (u10.k(j.B1, this.f26389c) & (-65536)) | (u10.k(j.C1, this.f26390d) & 65535);
            this.f26397k = u10.p(j.D1);
            this.f26398l = u10.p(j.E1);
            this.f26399m = u10.n(j.f24790w1, 0);
            this.f26400n = c(u10.o(j.F1));
            this.f26401o = u10.k(j.M1, CodedOutputStream.DEFAULT_BUFFER_SIZE);
            this.f26402p = c(u10.o(j.G1));
            this.f26403q = u10.k(j.Q1, CodedOutputStream.DEFAULT_BUFFER_SIZE);
            int i10 = j.H1;
            if (u10.s(i10)) {
                this.f26404r = u10.a(i10, false) ? 1 : 0;
            } else {
                this.f26404r = this.f26391e;
            }
            this.f26405s = u10.a(j.f24805z1, false);
            this.f26406t = u10.a(j.A1, this.f26392f);
            this.f26407u = u10.a(j.f24795x1, this.f26393g);
            this.f26408v = u10.k(j.R1, -1);
            this.f26412z = u10.o(j.I1);
            this.f26409w = u10.n(j.J1, 0);
            this.f26410x = u10.o(j.L1);
            String o10 = u10.o(j.K1);
            this.f26411y = o10;
            boolean z10 = o10 != null;
            if (z10 && this.f26409w == 0 && this.f26410x == null) {
                this.A = (androidx.core.view.b) e(o10, g.f26379f, g.this.f26381b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = u10.p(j.N1);
            this.C = u10.p(j.S1);
            int i11 = j.P1;
            if (u10.s(i11)) {
                this.E = h0.d(u10.k(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = j.O1;
            if (u10.s(i12)) {
                this.D = u10.c(i12);
            } else {
                this.D = null;
            }
            u10.w();
            this.f26394h = false;
        }

        public void h() {
            this.f26388b = 0;
            this.f26389c = 0;
            this.f26390d = 0;
            this.f26391e = 0;
            this.f26392f = true;
            this.f26393g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f26378e = clsArr;
        f26379f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f26382c = context;
        Object[] objArr = {context};
        this.f26380a = objArr;
        this.f26381b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r6 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r15 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r15 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r15 == 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r15.equals(r8) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r15.equals("group") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0.d() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        r15 = r0.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r15.a() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r15.equals("menu") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
        if (r7 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r15.equals("group") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r15.equals("item") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        if (r15.equals("menu") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r12 = this;
            i.g$b r0 = new i.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r4
            r6 = r5
            r7 = r6
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r4
            r7 = r5
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.d()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.A
            if (r15 == 0) goto L82
            boolean r15 = r15.a()
            if (r15 == 0) goto L82
            r0.b()
            goto Lb9
        L82:
            r0.a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = r3
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = r3
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.g.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    Object b() {
        if (this.f26383d == null) {
            this.f26383d = a(this.f26382c);
        }
        return this.f26383d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof w.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f26382c.getResources().getLayout(i10);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e8) {
                    throw new InflateException("Error inflating menu XML", e8);
                }
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
