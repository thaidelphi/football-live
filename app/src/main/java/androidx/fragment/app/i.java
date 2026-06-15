package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentLayoutInflaterFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    final FragmentManager f3372a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentLayoutInflaterFactory.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f3373a;

        a(o oVar) {
            this.f3373a = oVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k10 = this.f3373a.k();
            this.f3373a.m();
            w.n((ViewGroup) k10.H.getParent(), i.this.f3372a).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(FragmentManager fragmentManager) {
        this.f3372a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        o w10;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f3372a);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.c.f25688d);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(g0.c.f25689e);
            }
            int resourceId = obtainStyledAttributes.getResourceId(g0.c.f25690f, -1);
            String string = obtainStyledAttributes.getString(g0.c.f25691g);
            obtainStyledAttributes.recycle();
            if (attributeValue == null || !g.b(context.getClassLoader(), attributeValue)) {
                return null;
            }
            int id = view != null ? view.getId() : 0;
            if (id == -1 && resourceId == -1 && string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            }
            Fragment h02 = resourceId != -1 ? this.f3372a.h0(resourceId) : null;
            if (h02 == null && string != null) {
                h02 = this.f3372a.i0(string);
            }
            if (h02 == null && id != -1) {
                h02 = this.f3372a.h0(id);
            }
            if (h02 == null) {
                h02 = this.f3372a.q0().a(context.getClassLoader(), attributeValue);
                h02.f3155n = true;
                h02.f3164w = resourceId != 0 ? resourceId : id;
                h02.f3165x = id;
                h02.f3166y = string;
                h02.f3156o = true;
                FragmentManager fragmentManager = this.f3372a;
                h02.f3160s = fragmentManager;
                h02.f3161t = fragmentManager.t0();
                h02.H0(this.f3372a.t0().f(), attributeSet, h02.f3143b);
                w10 = this.f3372a.g(h02);
                if (FragmentManager.F0(2)) {
                    Log.v("FragmentManager", "Fragment " + h02 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else if (!h02.f3156o) {
                h02.f3156o = true;
                FragmentManager fragmentManager2 = this.f3372a;
                h02.f3160s = fragmentManager2;
                h02.f3161t = fragmentManager2.t0();
                h02.H0(this.f3372a.t0().f(), attributeSet, h02.f3143b);
                w10 = this.f3372a.w(h02);
                if (FragmentManager.F0(2)) {
                    Log.v("FragmentManager", "Retained Fragment " + h02 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            h02.G = (ViewGroup) view;
            w10.m();
            w10.j();
            View view2 = h02.H;
            if (view2 != null) {
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (h02.H.getTag() == null) {
                    h02.H.setTag(string);
                }
                h02.H.addOnAttachStateChangeListener(new a(w10));
                return h02.H;
            }
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        return null;
    }
}
