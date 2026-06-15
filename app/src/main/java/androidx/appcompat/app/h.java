package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.r;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.appcompat.widget.w;
import androidx.appcompat.widget.w0;
import androidx.appcompat.widget.y;
import androidx.core.view.a0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: AppCompatViewInflater.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?>[] f961b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f962c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f963d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f964e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f965f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f966g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    private static final androidx.collection.h<String, Constructor<? extends View>> f967h = new androidx.collection.h<>();

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f968a = new Object[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatViewInflater.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final View f969a;

        /* renamed from: b  reason: collision with root package name */
        private final String f970b;

        /* renamed from: c  reason: collision with root package name */
        private Method f971c;

        /* renamed from: d  reason: collision with root package name */
        private Context f972d;

        public a(View view, String str) {
            this.f969a = view;
            this.f970b = str;
        }

        private void a(Context context) {
            int id;
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f970b, View.class)) != null) {
                        this.f971c = method;
                        this.f972d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            if (this.f969a.getId() == -1) {
                str = "";
            } else {
                str = " with id '" + this.f969a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f970b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f969a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f971c == null) {
                a(this.f969a.getContext());
            }
            try {
                this.f971c.invoke(this.f972d, view);
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e8);
            } catch (InvocationTargetException e10) {
                throw new IllegalStateException("Could not execute method for android:onClick", e10);
            }
        }
    }

    private void a(Context context, View view, AttributeSet attributeSet) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 19 || i10 > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f963d);
        if (obtainStyledAttributes.hasValue(0)) {
            a0.r0(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f964e);
        if (obtainStyledAttributes2.hasValue(0)) {
            a0.t0(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f965f);
        if (obtainStyledAttributes3.hasValue(0)) {
            a0.E0(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || a0.P(view)) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f962c);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    private View s(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        androidx.collection.h<String, Constructor<? extends View>> hVar = f967h;
        Constructor<? extends View> constructor = hVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f961b);
            hVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f968a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f968a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f966g;
                if (i10 >= strArr.length) {
                    return null;
                }
                View s10 = s(context, str, strArr[i10]);
                if (s10 != null) {
                    return s10;
                }
                i10++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f968a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f24787v3, 0, 0);
        int resourceId = z10 ? obtainStyledAttributes.getResourceId(e.j.f24792w3, 0) : 0;
        if (z11 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(e.j.f24797x3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof i.d) && ((i.d) context).c() == resourceId) ? context : new i.d(context, resourceId) : context;
    }

    private void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected androidx.appcompat.widget.d c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    protected androidx.appcompat.widget.f d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f(context, attributeSet);
    }

    protected androidx.appcompat.widget.g e(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    protected androidx.appcompat.widget.h f(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.h(context, attributeSet);
    }

    protected androidx.appcompat.widget.l g(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.l(context, attributeSet);
    }

    protected p h(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    protected r i(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    protected s j(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    protected v k(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    protected w l(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    protected y m(Context context, AttributeSet attributeSet) {
        return new y(context, attributeSet);
    }

    protected AppCompatSpinner n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    protected c0 o(Context context, AttributeSet attributeSet) {
        return new c0(context, attributeSet);
    }

    protected e0 p(Context context, AttributeSet attributeSet) {
        return new e0(context, attributeSet);
    }

    protected View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        View l10;
        Context context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = u(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = w0.b(context2);
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c10 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c10 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c10 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c10 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c10 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c10 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c10 = '\r';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                l10 = l(context2, attributeSet);
                v(l10, str);
                break;
            case 1:
                l10 = f(context2, attributeSet);
                v(l10, str);
                break;
            case 2:
                l10 = j(context2, attributeSet);
                v(l10, str);
                break;
            case 3:
                l10 = o(context2, attributeSet);
                v(l10, str);
                break;
            case 4:
                l10 = h(context2, attributeSet);
                v(l10, str);
                break;
            case 5:
                l10 = m(context2, attributeSet);
                v(l10, str);
                break;
            case 6:
                l10 = n(context2, attributeSet);
                v(l10, str);
                break;
            case 7:
                l10 = k(context2, attributeSet);
                v(l10, str);
                break;
            case '\b':
                l10 = p(context2, attributeSet);
                v(l10, str);
                break;
            case '\t':
                l10 = i(context2, attributeSet);
                v(l10, str);
                break;
            case '\n':
                l10 = c(context2, attributeSet);
                v(l10, str);
                break;
            case 11:
                l10 = e(context2, attributeSet);
                v(l10, str);
                break;
            case '\f':
                l10 = g(context2, attributeSet);
                v(l10, str);
                break;
            case '\r':
                l10 = d(context2, attributeSet);
                v(l10, str);
                break;
            default:
                l10 = q(context2, str, attributeSet);
                break;
        }
        if (l10 == null && context != context2) {
            l10 = t(context2, str, attributeSet);
        }
        if (l10 != null) {
            b(l10, attributeSet);
            a(context2, l10, attributeSet);
        }
        return l10;
    }
}
