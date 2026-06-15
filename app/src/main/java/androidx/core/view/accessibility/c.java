package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.f;
import com.google.android.gms.ads.AdRequest;
import com.google.protobuf.CodedOutputStream;
import com.ironsource.b9;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: AccessibilityNodeInfoCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c {

    /* renamed from: d  reason: collision with root package name */
    private static int f2824d;

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityNodeInfo f2825a;

    /* renamed from: b  reason: collision with root package name */
    public int f2826b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f2827c = -1;

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;

        /* renamed from: e  reason: collision with root package name */
        public static final a f2828e = new a(1, null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f2829f = new a(2, null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f2830g = new a(4, null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f2831h = new a(8, null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f2832i = new a(16, null);

        /* renamed from: j  reason: collision with root package name */
        public static final a f2833j = new a(32, null);

        /* renamed from: k  reason: collision with root package name */
        public static final a f2834k = new a(64, null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f2835l = new a(128, null);

        /* renamed from: m  reason: collision with root package name */
        public static final a f2836m = new a(256, (CharSequence) null, f.b.class);

        /* renamed from: n  reason: collision with root package name */
        public static final a f2837n = new a((int) AdRequest.MAX_CONTENT_URL_LENGTH, (CharSequence) null, f.b.class);

        /* renamed from: o  reason: collision with root package name */
        public static final a f2838o = new a(1024, (CharSequence) null, f.c.class);

        /* renamed from: p  reason: collision with root package name */
        public static final a f2839p = new a((int) com.ironsource.mediationsdk.metadata.a.f18931n, (CharSequence) null, f.c.class);

        /* renamed from: q  reason: collision with root package name */
        public static final a f2840q = new a(CodedOutputStream.DEFAULT_BUFFER_SIZE, null);

        /* renamed from: r  reason: collision with root package name */
        public static final a f2841r = new a(8192, null);

        /* renamed from: s  reason: collision with root package name */
        public static final a f2842s = new a(16384, null);

        /* renamed from: t  reason: collision with root package name */
        public static final a f2843t = new a(32768, null);

        /* renamed from: u  reason: collision with root package name */
        public static final a f2844u = new a(65536, null);

        /* renamed from: v  reason: collision with root package name */
        public static final a f2845v = new a(131072, (CharSequence) null, f.g.class);

        /* renamed from: w  reason: collision with root package name */
        public static final a f2846w = new a(262144, null);

        /* renamed from: x  reason: collision with root package name */
        public static final a f2847x = new a(524288, null);

        /* renamed from: y  reason: collision with root package name */
        public static final a f2848y = new a(1048576, null);

        /* renamed from: z  reason: collision with root package name */
        public static final a f2849z = new a(2097152, (CharSequence) null, f.h.class);

        /* renamed from: a  reason: collision with root package name */
        final Object f2850a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2851b;

        /* renamed from: c  reason: collision with root package name */
        private final Class<? extends f.a> f2852c;

        /* renamed from: d  reason: collision with root package name */
        protected final f f2853d;

        static {
            int i10 = Build.VERSION.SDK_INT;
            A = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            B = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, f.e.class);
            C = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            D = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            E = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            F = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            K = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            L = new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, f.C0049f.class);
            M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, f.d.class);
            N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, null, null, null);
            R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, null, null, null);
            S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, null, null, null);
            T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, null, null, null);
            U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, 16908376, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a a(CharSequence charSequence, f fVar) {
            return new a(null, this.f2851b, charSequence, fVar, this.f2852c);
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2850a).getId();
            }
            return 0;
        }

        public CharSequence c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2850a).getLabel();
            }
            return null;
        }

        public boolean d(View view, Bundle bundle) {
            f.a newInstance;
            if (this.f2853d != null) {
                f.a aVar = null;
                Class<? extends f.a> cls = this.f2852c;
                if (cls != null) {
                    try {
                        newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception e8) {
                        e = e8;
                    }
                    try {
                        newInstance.a(bundle);
                        aVar = newInstance;
                    } catch (Exception e10) {
                        e = e10;
                        aVar = newInstance;
                        Class<? extends f.a> cls2 = this.f2852c;
                        String name = cls2 == null ? "null" : cls2.getName();
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                        return this.f2853d.a(view, aVar);
                    }
                }
                return this.f2853d.a(view, aVar);
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                a aVar = (a) obj;
                Object obj2 = this.f2850a;
                return obj2 == null ? aVar.f2850a == null : obj2.equals(aVar.f2850a);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f2850a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public a(int i10, CharSequence charSequence, f fVar) {
            this(null, i10, charSequence, fVar, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i10, CharSequence charSequence, Class<? extends f.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.f2851b = i10;
            this.f2853d = fVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                this.f2850a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f2850a = obj;
            }
            this.f2852c = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final Object f2854a;

        b(Object obj) {
            this.f2854a = obj;
        }

        public static b a(int i10, int i11, boolean z10, int i12) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 21) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
            }
            if (i13 >= 19) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
            }
            return new b(null);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: androidx.core.view.accessibility.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class C0048c {

        /* renamed from: a  reason: collision with root package name */
        final Object f2855a;

        C0048c(Object obj) {
            this.f2855a = obj;
        }

        public static C0048c a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 21) {
                return new C0048c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
            }
            if (i14 >= 19) {
                return new C0048c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
            }
            return new C0048c(null);
        }
    }

    private c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2825a = accessibilityNodeInfo;
    }

    public static c L() {
        return x0(AccessibilityNodeInfo.obtain());
    }

    public static c M(View view) {
        return x0(AccessibilityNodeInfo.obtain(view));
    }

    public static c N(c cVar) {
        return x0(AccessibilityNodeInfo.obtain(cVar.f2825a));
    }

    private void Q(View view) {
        SparseArray<WeakReference<ClickableSpan>> u10 = u(view);
        if (u10 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < u10.size(); i10++) {
                if (u10.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                u10.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private void S(int i10, boolean z10) {
        Bundle r10 = r();
        if (r10 != null) {
            int i11 = r10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            r10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    private void d(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    private void f() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2825a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f2825a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f2825a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f2825a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private List<Integer> g(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f2825a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f2825a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    private static String i(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                switch (i10) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case com.ironsource.mediationsdk.metadata.a.f18931n /* 2048 */:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case CodedOutputStream.DEFAULT_BUFFER_SIZE /* 4096 */:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    default:
                        switch (i10) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i10) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (i10) {
                                            case 16908372:
                                                return "ACTION_IME_ENTER";
                                            case 16908373:
                                                return "ACTION_DRAG_START";
                                            case 16908374:
                                                return "ACTION_DRAG_DROP";
                                            case 16908375:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    private boolean k(int i10) {
        Bundle r10 = r();
        return r10 != null && (r10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> s(View view) {
        SparseArray<WeakReference<ClickableSpan>> u10 = u(view);
        if (u10 == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(v.c.I, sparseArray);
            return sparseArray;
        }
        return u10;
    }

    private SparseArray<WeakReference<ClickableSpan>> u(View view) {
        return (SparseArray) view.getTag(v.c.I);
    }

    public static c x0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    private boolean y() {
        return !g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int z(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals(sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f2824d;
        f2824d = i11 + 1;
        return i11;
    }

    public boolean A() {
        return this.f2825a.isCheckable();
    }

    public boolean B() {
        return this.f2825a.isChecked();
    }

    public boolean C() {
        return this.f2825a.isClickable();
    }

    public boolean D() {
        return this.f2825a.isEnabled();
    }

    public boolean E() {
        return this.f2825a.isFocusable();
    }

    public boolean F() {
        return this.f2825a.isFocused();
    }

    public boolean G() {
        return this.f2825a.isLongClickable();
    }

    public boolean H() {
        return this.f2825a.isPassword();
    }

    public boolean I() {
        return this.f2825a.isScrollable();
    }

    public boolean J() {
        return this.f2825a.isSelected();
    }

    public boolean K() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f2825a.isShowingHintText();
        }
        return k(4);
    }

    public boolean O(int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f2825a.performAction(i10, bundle);
        }
        return false;
    }

    public void P() {
        this.f2825a.recycle();
    }

    public void R(boolean z10) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2825a.setAccessibilityFocused(z10);
        }
    }

    @Deprecated
    public void T(Rect rect) {
        this.f2825a.setBoundsInParent(rect);
    }

    public void U(Rect rect) {
        this.f2825a.setBoundsInScreen(rect);
    }

    public void V(boolean z10) {
        this.f2825a.setCheckable(z10);
    }

    public void W(boolean z10) {
        this.f2825a.setChecked(z10);
    }

    public void X(CharSequence charSequence) {
        this.f2825a.setClassName(charSequence);
    }

    public void Y(boolean z10) {
        this.f2825a.setClickable(z10);
    }

    public void Z(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2825a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f2854a);
        }
    }

    public void a(int i10) {
        this.f2825a.addAction(i10);
    }

    public void a0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2825a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0048c) obj).f2855a);
        }
    }

    public void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2825a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2850a);
        }
    }

    public void b0(CharSequence charSequence) {
        this.f2825a.setContentDescription(charSequence);
    }

    public void c(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2825a.addChild(view, i10);
        }
    }

    public void c0(boolean z10) {
        this.f2825a.setEnabled(z10);
    }

    public void d0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2825a.setError(charSequence);
        }
    }

    public void e(CharSequence charSequence, View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 19 || i10 >= 26) {
            return;
        }
        f();
        Q(view);
        ClickableSpan[] p10 = p(charSequence);
        if (p10 == null || p10.length <= 0) {
            return;
        }
        r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", v.c.f31624a);
        SparseArray<WeakReference<ClickableSpan>> s10 = s(view);
        for (int i11 = 0; i11 < p10.length; i11++) {
            int z10 = z(p10[i11], s10);
            s10.put(z10, new WeakReference<>(p10[i11]));
            d(p10[i11], (Spanned) charSequence, z10);
        }
    }

    public void e0(boolean z10) {
        this.f2825a.setFocusable(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof c)) {
            c cVar = (c) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.f2825a;
            if (accessibilityNodeInfo == null) {
                if (cVar.f2825a != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(cVar.f2825a)) {
                return false;
            }
            return this.f2827c == cVar.f2827c && this.f2826b == cVar.f2826b;
        }
        return false;
    }

    public void f0(boolean z10) {
        this.f2825a.setFocused(z10);
    }

    public void g0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2825a.setHeading(z10);
        } else {
            S(2, z10);
        }
    }

    public List<a> h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f2825a.getActionList() : null;
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new a(actionList.get(i10)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public void h0(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f2825a.setHintText(charSequence);
        } else if (i10 >= 19) {
            this.f2825a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2825a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i0(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f2825a.setLabelFor(view);
        }
    }

    @Deprecated
    public int j() {
        return this.f2825a.getActions();
    }

    public void j0(int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2825a.setMaxTextLength(i10);
        }
    }

    public void k0(CharSequence charSequence) {
        this.f2825a.setPackageName(charSequence);
    }

    @Deprecated
    public void l(Rect rect) {
        this.f2825a.getBoundsInParent(rect);
    }

    public void l0(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f2825a.setPaneTitle(charSequence);
        } else if (i10 >= 19) {
            this.f2825a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void m(Rect rect) {
        this.f2825a.getBoundsInScreen(rect);
    }

    public void m0(View view) {
        this.f2826b = -1;
        this.f2825a.setParent(view);
    }

    public int n() {
        return this.f2825a.getChildCount();
    }

    public void n0(View view, int i10) {
        this.f2826b = i10;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2825a.setParent(view, i10);
        }
    }

    public CharSequence o() {
        return this.f2825a.getClassName();
    }

    public void o0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2825a.setScreenReaderFocusable(z10);
        } else {
            S(1, z10);
        }
    }

    public void p0(boolean z10) {
        this.f2825a.setScrollable(z10);
    }

    public CharSequence q() {
        return this.f2825a.getContentDescription();
    }

    public void q0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2825a.setShowingHintText(z10);
        } else {
            S(4, z10);
        }
    }

    public Bundle r() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f2825a.getExtras();
        }
        return new Bundle();
    }

    public void r0(View view, int i10) {
        this.f2827c = i10;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2825a.setSource(view, i10);
        }
    }

    public void s0(CharSequence charSequence) {
        if (androidx.core.os.a.b()) {
            this.f2825a.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f2825a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public CharSequence t() {
        return this.f2825a.getPackageName();
    }

    public void t0(CharSequence charSequence) {
        this.f2825a.setText(charSequence);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        l(rect);
        sb.append("; boundsInParent: " + rect);
        m(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(t());
        sb.append("; className: ");
        sb.append(o());
        sb.append("; text: ");
        sb.append(v());
        sb.append("; contentDescription: ");
        sb.append(q());
        sb.append("; viewId: ");
        sb.append(x());
        sb.append("; uniqueId: ");
        sb.append(w());
        sb.append("; checkable: ");
        sb.append(A());
        sb.append("; checked: ");
        sb.append(B());
        sb.append("; focusable: ");
        sb.append(E());
        sb.append("; focused: ");
        sb.append(F());
        sb.append("; selected: ");
        sb.append(J());
        sb.append("; clickable: ");
        sb.append(C());
        sb.append("; longClickable: ");
        sb.append(G());
        sb.append("; enabled: ");
        sb.append(D());
        sb.append("; password: ");
        sb.append(H());
        sb.append("; scrollable: " + I());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> h10 = h();
            for (int i10 = 0; i10 < h10.size(); i10++) {
                a aVar = h10.get(i10);
                String i11 = i(aVar.b());
                if (i11.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                    i11 = aVar.c().toString();
                }
                sb.append(i11);
                if (i10 != h10.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int j10 = j();
            while (j10 != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(j10);
                j10 &= ~numberOfTrailingZeros;
                sb.append(i(numberOfTrailingZeros));
                if (j10 != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append(b9.i.f16698e);
        return sb.toString();
    }

    public void u0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f2825a.setTraversalAfter(view);
        }
    }

    public CharSequence v() {
        if (y()) {
            List<Integer> g10 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> g11 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> g12 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> g13 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2825a.getText(), 0, this.f2825a.getText().length()));
            for (int i10 = 0; i10 < g10.size(); i10++) {
                spannableString.setSpan(new androidx.core.view.accessibility.a(g13.get(i10).intValue(), this, r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), g10.get(i10).intValue(), g11.get(i10).intValue(), g12.get(i10).intValue());
            }
            return spannableString;
        }
        return this.f2825a.getText();
    }

    public void v0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2825a.setVisibleToUser(z10);
        }
    }

    public String w() {
        if (androidx.core.os.a.d()) {
            return this.f2825a.getUniqueId();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f2825a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        return null;
    }

    public AccessibilityNodeInfo w0() {
        return this.f2825a;
    }

    public String x() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f2825a.getViewIdResourceName();
        }
        return null;
    }
}
